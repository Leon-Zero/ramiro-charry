package portfolio.rcharry.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.rcharry.Entity.Contactos;
import portfolio.rcharry.Interface.IContactosService;
import portfolio.rcharry.Repository.ContactosRepository;

@Service
public class ContactosService implements IContactosService{
    
    @Autowired
    public ContactosRepository contactosRepo;

    @Override
    public List<Contactos> verContactos() {
        return contactosRepo.findAll();
    }

    @Override
    public void crearContactos(Contactos contactos) {
        contactosRepo.save(contactos);
    }

    @Override
    public void borrarContactos(Long id) {
        contactosRepo.deleteById(id);
    }

    @Override
    public Contactos buscarContactos(Long id) {
        return contactosRepo.findById(id).orElse(null);
    }

    @Override
    public void editarContactos(Contactos contactos) {
        contactosRepo.save(contactos);
    }

   
}
