package br.com.app.work_hour_recorder.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Table(name = "user", schema = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(length = 100, nullable = false)
  @NotNull
  private String name;

  @CPF
  @Column(length = 11, nullable = false)
  @NotNull
  private String cpf;

  @NotNull private Boolean status = true;

  @NotNull
  @Column(length = 30)
  private String password;

  @NotNull private UserPermission permissionId;
}
