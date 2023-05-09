
package portfolio.rcharry.Interface;

import java.util.List;
import portfolio.rcharry.Entity.Experiencia;

public interface IExperienciaService {
    public List<Experiencia> verExperiencia();

    public void crearExperiencia(Experiencia Experiencia);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);

    public void editarExperiencia(Experiencia Experiencia);    
}
