package av3.net.api.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_solicitante")

public class Solicitante extends Usuario {
    @OneToMany(mappedBy = "solicitante")
    private List<OrdemServico> ordens;
}
