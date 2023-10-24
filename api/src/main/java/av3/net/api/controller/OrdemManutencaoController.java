package av3.net.api.controller;

import av3.net.api.model.OrdemManutencao;
import av3.net.api.model.OrdemServico;
import av3.net.api.service.OrdemServicoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/ordemManutencao")
public class OrdemManutencaoController {

    private OrdemServicoService ordemServicoService;

    @GetMapping("/{id}")
    public OrdemServico buscarUm(@PathVariable Integer id){
        return ordemServicoService.buscarUm(id);
    }

    @GetMapping
    public Collection<OrdemServico> buscarTodos(){
        return ordemServicoService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        ordemServicoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemManutencao ordemServico){
        ordemServicoService.salvar(ordemServico);
    }

    @PutMapping
    public void atualizar(@RequestBody OrdemManutencao ordemServico){
        ordemServicoService.salvar(ordemServico);
    }
}
