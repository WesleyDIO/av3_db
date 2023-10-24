package av3.net.api.service;

import av3.net.api.model.Atendente;
import av3.net.api.repository.AtendenteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
@AllArgsConstructor
public class AtendenteService {

    private AtendenteRepository atendenteRepository;

    public Collection<Atendente> buscarTodos(){
        return atendenteRepository.findAll();
    }


    public void deletar( Integer id){
        atendenteRepository.deleteById(id);
    }


    public void salvar( Atendente atendente){
        atendenteRepository.save(atendente);
    }

    public Atendente buscarUm(Integer id) {
        return atendenteRepository.findById(id).get();
    }


}
