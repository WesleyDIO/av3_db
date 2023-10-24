package av3.net.api.service;

import av3.net.api.model.OrdemServico;
import av3.net.api.repository.OrdemServicoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class OrdemServicoService {

    private OrdemServicoRepository ordemServicoRepository;

    public Collection<OrdemServico> buscarTodos(){
        return ordemServicoRepository.findAll();
    }


    public void deletar( Integer id){
        ordemServicoRepository.deleteById(id);
    }


    public void salvar( OrdemServico ordemManutencao){
        ordemServicoRepository.save(ordemManutencao);
    }

    public OrdemServico buscarUm(Integer id) {
        return ordemServicoRepository.findById(id).get();
    }
}
