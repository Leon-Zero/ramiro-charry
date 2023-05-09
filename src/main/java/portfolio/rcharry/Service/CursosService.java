package portfolio.rcharry.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.rcharry.Entity.Cursos;
import portfolio.rcharry.Interface.ICursosService;
import portfolio.rcharry.Repository.CursosRepository;

@Service
public class CursosService implements ICursosService{
    
    @Autowired
    public CursosRepository cursosRepo;

    @Override
    public List<Cursos> verCursos() {
        return cursosRepo.findAll();
    }

    @Override
    public void crearCursos(Cursos cursos) {
        cursosRepo.save(cursos);
    }

    @Override
    public void borrarCursos(Long id) {
        cursosRepo.deleteById(id);
    }

    @Override
    public Cursos buscarCursos(Long id) {
        return cursosRepo.findById(id).orElse(null);
    }

    @Override
    public void editarCursos(Cursos cursos) {
        cursosRepo.save(cursos);
    }

   
}
