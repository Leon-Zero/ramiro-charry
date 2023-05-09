package portfolio.rcharry.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.rcharry.Entity.Educacion;
import portfolio.rcharry.Interface.IEducacionService;
import portfolio.rcharry.Repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educacionRepo;

    @Override
    public List<Educacion> verEducacion() {
        return educacionRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

   
}
