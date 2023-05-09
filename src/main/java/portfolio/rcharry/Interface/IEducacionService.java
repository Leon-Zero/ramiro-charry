
package portfolio.rcharry.Interface;

import java.util.List;
import portfolio.rcharry.Entity.Educacion;

public interface IEducacionService {
    public List<Educacion> verEducacion();

    public void crearEducacion(Educacion Educacion);

    public void borrarEducacion(Long id);

    public Educacion buscarEducacion(Long id);

    public void editarEducacion(Educacion Educacion);    
}
