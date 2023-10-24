package av3.net.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_ordemServico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class OrdemServico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer num;
    private String descricao;
    private String status;
    @ManyToOne
    private Solicitante solicitante;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Atendente responsavel;
}
