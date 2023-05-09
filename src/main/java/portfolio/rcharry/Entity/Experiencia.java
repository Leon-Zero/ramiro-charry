
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
@Table(name="experiencia")
public class Experiencia {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
     
     private Long id;
     
     
     @Column(name="nombre_empresa", length = 150)
    private String nombre_empresa;
    @Column(name="referencia", length = 150)
    private String referencia;
    @Column(name="imagen", length = 500)
    private String imagen;
    @Column(name="puesto", length = 150)
    private String puesto;
    
    
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre_empresa, String referencia, String imagen, String puesto) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.referencia = referencia;
        this.imagen = imagen;
        this.puesto = puesto;
        
    }
}
