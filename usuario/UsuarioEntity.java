package usuario;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tbl_usuario")
public class UsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false)
    private String totalRegistros;

    @Column(name = "apellido paterno", nullable = false)
    private String montoTotal;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
