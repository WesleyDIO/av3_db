package av3.net.api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_atendente")

public class Atendente extends Usuario {
    @ManyToOne
    private Administrador chefe;
    @JsonIgnore
    @OneToMany(mappedBy = "responsavel")
    private List<OrdemServico> ordens;
}
