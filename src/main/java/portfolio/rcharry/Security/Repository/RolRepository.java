
package portfolio.rcharry.Security.Repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.rcharry.Security.Entity.Rol;
import portfolio.rcharry.Security.Enums.RolNombre;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
        Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
