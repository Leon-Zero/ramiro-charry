
package portfolio.rcharry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.rcharry.Entity.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {

}
