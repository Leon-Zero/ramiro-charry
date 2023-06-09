
package portfolio.rcharry.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails{
    
    private final String nombre;
    private final String nombreUsuario;
    private final String email;
    private final String password;
    private final Collection <? extends GrantedAuthority> authorities;
    
        // constructor


    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    // funcion para obtener las autoridades y los valores 

    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority> authorities =
        usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name() ))
        .collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(),
        usuario.getEmail(), usuario.getPassword(), authorities);        
    }    
  
    
        // metodos getter 


    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    
        //metodos abstractos de userdetails

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
