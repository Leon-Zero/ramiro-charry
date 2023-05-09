package portfolio.rcharry.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.rcharry.Entity.Experiencia;
import portfolio.rcharry.Interface.IExperienciaService;
import portfolio.rcharry.Repository.ExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

   
}
