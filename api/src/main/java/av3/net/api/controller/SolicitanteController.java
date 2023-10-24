package av3.net.api.controller;

import av3.net.api.model.Atendente;
import av3.net.api.model.Solicitante;
import av3.net.api.service.AtendenteService;
import av3.net.api.service.SolicitanteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/solicitante")
public class SolicitanteController {

    private SolicitanteService solicitanteService;

    @GetMapping("/{id}")
    public Solicitante buscarUm(@PathVariable Integer id){
        return solicitanteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Solicitante> buscarTodos(){
        return  solicitanteService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        solicitanteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }

    @PutMapping
    public void atualizar(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }
}
