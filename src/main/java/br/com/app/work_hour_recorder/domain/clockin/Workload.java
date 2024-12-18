package br.com.app.work_hour_recorder.domain.clockin;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "workload", schema = "clockins")
public class Workload {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "working_hours")
  private int workingHours;

  @NotNull
  @Column(name = "allows_interval")
  private Boolean allowsInterval = false;

  @NotNull
  @Column(nullable = false)
  private Boolean status = true;

  public int returnWorkingHours() {
    return workingHours;
  }
}
