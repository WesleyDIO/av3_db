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
@Table(name = "tb_ordemInstalacao")
public class OrdemInstalacao extends OrdemServico {

    private String dataInstalacao;
    private String cliente;
}
