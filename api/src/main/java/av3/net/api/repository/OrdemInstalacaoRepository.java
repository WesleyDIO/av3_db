package av3.net.api.repository;

import av3.net.api.model.OrdemInstalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemInstalacaoRepository extends JpaRepository<OrdemInstalacao,Integer> {
}
