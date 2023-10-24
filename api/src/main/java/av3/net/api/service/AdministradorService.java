package av3.net.api.service;

import av3.net.api.model.Administrador;
import av3.net.api.repository.AdministradorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AdministradorService {

    private AdministradorRepository administradorRepository;

    public Collection<Administrador> buscarTodos(){
        return administradorRepository.findAll();
    }


    public void deletar( Integer id){
        administradorRepository.deleteById(id);
    }


    public void salvar( Administrador administrador){
        administradorRepository.save(administrador);
    }

    public Administrador buscarUm(Integer id) {
        return administradorRepository.findById(id).get();
    }



}
