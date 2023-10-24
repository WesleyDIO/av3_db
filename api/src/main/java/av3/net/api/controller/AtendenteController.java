package av3.net.api.controller;

import av3.net.api.model.Administrador;
import av3.net.api.model.Atendente;
import av3.net.api.service.AdministradorService;
import av3.net.api.service.AtendenteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/atendente")
public class AtendenteController {

    private AtendenteService atendenteService;

    @GetMapping("/{id}")
    public Atendente buscarUm(@PathVariable Integer id){
        return atendenteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Atendente> buscarTodos(){
        return  atendenteService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        atendenteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }

    @PutMapping
    public void atualizar(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }
}
