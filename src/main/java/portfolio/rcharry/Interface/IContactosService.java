
package portfolio.rcharry.Interface;

import java.util.List;
import portfolio.rcharry.Entity.Contactos;

public interface IContactosService {
    public List<Contactos> verContactos();

    public void crearContactos(Contactos contactos);

    public void borrarContactos(Long id);

    public Contactos buscarContactos(Long id);

    public void editarContactos(Contactos contactos);    
}
