package br.com.app.work_hour_recorder.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "user_permission", schema = "users")
public class UserPermission {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull
  @Column(length = 14, nullable = false)
  private String description;

  @NotNull
  @Column(name = "can_create_user", nullable = false)
  private Boolean canCreateUser = false;

  @NotNull
  @Column(nullable = false)
  private Boolean status;
}
