
package portfolio.rcharry.Security.Service;

import portfolio.rcharry.Security.Entity.Rol;
import portfolio.rcharry.Security.Enums.RolNombre;
import portfolio.rcharry.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }     
    
}
