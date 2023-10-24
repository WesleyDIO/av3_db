package av3.net.api.controller;

import av3.net.api.model.Administrador;
import av3.net.api.model.Atendente;
import av3.net.api.service.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public Administrador buscarUm(@PathVariable Integer id){
      return administradorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Administrador> buscarTodos(){
        return  administradorService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        administradorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Administrador administrador){
        System.out.print(administrador);
        administradorService.salvar(administrador);
    }

    @PutMapping
    public void atualizar(@RequestBody Administrador administrador){
        administradorService.salvar(administrador);
    }

}
