package br.com.app.work_hour_recorder.domain.clockin;

import jakarta.persistence.*;
import java.time.LocalTime;
import lombok.Data;

@Data
@Table(name = "clock_in", schema = "clockins")
public class ClockIn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "clock_in_time")
  private LocalTime clockInTime;

  @Column(name = "clock_out_time")
  private LocalTime clockOutTime;

  @ManyToOne
  @JoinColumn(name = "user_clock_in_id")
  private UserClockIn userClockIn;
}
