package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "Trip")
@Table(name = "trips")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String destination;
    private LocalDateTime startsAt;
    private LocalDateTime endsAt;
    private boolean isConfirmed;
    private String ownerName;
    private String ownerEmail;
}
