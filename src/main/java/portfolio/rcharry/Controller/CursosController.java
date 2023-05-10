
package portfolio.rcharry.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.rcharry.Entity.Cursos;
import portfolio.rcharry.Service.CursosService;

@RestController
@CrossOrigin(origins = "https://rcharry-portfolio.web.app" )

public class CursosController {
    
    @Autowired
    private CursosService cursosServ;
    
    @GetMapping("/cursos")
    @ResponseBody
    public List<Cursos>VerCursos(){
        return cursosServ.verCursos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/cursos")
    public void agregarCursos(@RequestBody Cursos cursos){
        cursosServ.crearCursos(cursos);
    }
    
    @GetMapping("/cursos/{id}")
    @ResponseBody
    public Cursos selectCursos(@PathVariable Long id){
        return cursosServ.buscarCursos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/cursos/{id}")
    public void borrarCursos(@PathVariable Long id){
        cursosServ.borrarCursos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/cursos/{id}")
    public void editarCursos(@PathVariable Long id, @RequestBody Cursos cursos){
        cursosServ.editarCursos(cursos);
    }
    
}
    
    
    

