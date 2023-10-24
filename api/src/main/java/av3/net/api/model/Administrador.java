package av3.net.api.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_administrador")
@ToString(callSuper = true)
public class Administrador extends Usuario {
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Atendente> atendentes;
}
