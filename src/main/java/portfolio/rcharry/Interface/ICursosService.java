
package portfolio.rcharry.Interface;

import java.util.List;
import portfolio.rcharry.Entity.Cursos;

public interface ICursosService {
    public List<Cursos> verCursos();

    public void crearCursos(Cursos Cursos);

    public void borrarCursos(Long id);

    public Cursos buscarCursos(Long id);

    public void editarCursos(Cursos Cursos);    
}
