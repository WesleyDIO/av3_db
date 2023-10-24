package av3.net.api.repository;

import av3.net.api.model.OrdemManutencao;
import av3.net.api.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemManutencaoRepository extends JpaRepository<OrdemManutencao,Integer> {
}
