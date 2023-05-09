
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
@Table(name="educacion")
public class Educacion {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
     
     private Long id;
     
     
     @Column(name="institucion", length = 150)
    private String institucion;
    @Column(name="descripcion", length = 150)
    private String descripcion;
    @Column(name="imagen", length = 250)
    private String imagen;
    
    
    public Educacion() {
    }

    public Educacion(Long id, String institucion, String descripcion, String imagen) {
        this.id = id;
        this.institucion = institucion;
        this.descripcion = descripcion;
        this.imagen = imagen;
        
    }
}
