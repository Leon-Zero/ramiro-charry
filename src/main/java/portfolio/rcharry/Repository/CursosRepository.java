
package portfolio.rcharry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.rcharry.Entity.Cursos;

@Repository
public interface CursosRepository extends JpaRepository <Cursos, Long> {

}
