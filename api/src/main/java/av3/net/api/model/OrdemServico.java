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
    protected Integer num;
    protected String descricao;
    protected String status;
    @ManyToOne
    protected Solicitante solicitante;
    @ManyToOne
    protected Atendente responsavel;
}
