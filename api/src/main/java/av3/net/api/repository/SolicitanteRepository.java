package av3.net.api.repository;

import av3.net.api.model.Solicitante;
import av3.net.api.model.Usuario;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer> {
}
