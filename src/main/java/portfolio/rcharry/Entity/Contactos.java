package portfolio.rcharry.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="contactos")
public class Contactos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
     
    @Column(name="nombre", length = 150)
    private String nombre;
    @Column(name="apellido", length = 50)
    private String apellido;
    @Column(name="email", length = 250)
    private String email;
     @Column(name="telefono", length = 50)
    private String telefono;
    @Column(name="comentarios", length = 250)
    private String comentarios;
     @Column(name="creado_en", length = 250)
    private String creado_en;

    public Contactos() {
    }

    public Contactos(Long id, String nombre, String apellido, String email, String telefono, String comentarios, String creado_en) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.comentarios = comentarios;
        this.creado_en = creado_en;
    }
     
     
}
