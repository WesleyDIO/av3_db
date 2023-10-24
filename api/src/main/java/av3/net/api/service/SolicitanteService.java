package av3.net.api.service;

import av3.net.api.model.Solicitante;
import av3.net.api.repository.SolicitanteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class SolicitanteService {

    private SolicitanteRepository solicitanteRepository;

    public Collection<Solicitante> buscarTodos(){
        return solicitanteRepository.findAll();
    }


    public void deletar( Integer id){
        solicitanteRepository.deleteById(id);
    }


    public void salvar( Solicitante solicitante){
        solicitanteRepository.save(solicitante);
    }

    public Solicitante buscarUm(Integer id) {
        return solicitanteRepository.findById(id).get();
    }

}
