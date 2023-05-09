
package portfolio.rcharry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.rcharry.Entity.Contactos;

@Repository
public interface ContactosRepository extends JpaRepository <Contactos, Long> {

}
