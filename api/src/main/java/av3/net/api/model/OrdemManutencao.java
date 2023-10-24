package av3.net.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_ordemManutencao")
public class OrdemManutencao extends OrdemServico{

    private String dataManutencao;
    private String equipamento;


}
