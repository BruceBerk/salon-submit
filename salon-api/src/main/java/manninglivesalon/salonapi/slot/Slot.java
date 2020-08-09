package manninglivesalon.salonapi.slot;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date confirmed_at;

    private Date locked_at;

    private Date slot_for;

    private Integer status;

    private String stylist_name;

    // I think this will be a many-to-one annotation
    private Long selected_service_id;

}
