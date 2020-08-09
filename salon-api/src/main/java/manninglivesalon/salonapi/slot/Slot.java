package manninglivesalon.salonapi.slot;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Slot {

    public Slot() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    Set<SalonServiceDetail> availableServices;


    @ManyToOne
    private SalonServiceDetail selectedService;

    String stylistName;


    LocalDateTime slotFor;

    private SlotStatus status;

    LocalDateTime lockedAt;
    LocalDateTime confirmedAt;


}

enum  SlotStatus {
    AVAILABLE,LOCKED,CONFIRMED,CANCELLED
}
