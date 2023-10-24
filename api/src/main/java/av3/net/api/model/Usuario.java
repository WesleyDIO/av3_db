package av3.net.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   protected Integer cpf;
   @Column(name = "username", unique = true, nullable = false)
   protected String nome;

   private static List<Usuario> usuarios = new LinkedList<>();

}
