import java.lang.annotation.Inherited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Funcionarios")

public class Funcionario {

@Column(name = "UserId")
private Long UserId;  

@Column(name = "IsAdmin")
private Boolean IsAdmin;

@Column(name = "Nome")
private String Nome;

@Column(Name = "Sobrenome")
private String Sobrenome;

@Column(name = "Email")
private String Email;

@Column(name = "Senha")
private String Senha;


}
