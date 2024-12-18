package br.com.app.work_hour_recorder.domain.clockin;

import br.com.app.work_hour_recorder.domain.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import lombok.Data;

@Data
@Table(name = "user_clock_in", schema = "clockins")
public class UserClockIn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull private LocalDate date;

  @NotNull private Boolean overtime = false;

  @Column(name = "overtime_avaliable")
  private LocalTime overtimeAvaliable;

  @OneToOne
  @NotNull
  @JoinColumn(name = "user_id")
  private User userId;

  @OneToOne
  @JoinColumn(name = "workload_id")
  private Workload workload;

  @OneToMany(mappedBy = "userClockIn")
  private List<ClockIn> clockIns;

  public int returnWorkload() {
    return workload.returnWorkingHours();
  }
}
