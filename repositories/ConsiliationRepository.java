import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsiliationRepository extends JpaRepository<UsuarioEntity, UUID> {

}
