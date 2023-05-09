
package portfolio.rcharry.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;





@Getter @Setter
@Entity
@Table(name="cursos")
public class Cursos {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
     
     private Long id;
     
     
     @Column(name="institucion", length = 150)
    private String institucion;
    @Column(name="nombre_curso", length = 150)
    private String nombre_curso;
    @Column(name="imagen", length = 250)
    private String imagen;
    
    
    public Cursos() {
    }

    public Cursos(Long id, String institucion, String nombre_curso, String imagen) {
        this.id = id;
        this.institucion = institucion;
        this.nombre_curso = nombre_curso;
        this.imagen = imagen;
        
    }
}
