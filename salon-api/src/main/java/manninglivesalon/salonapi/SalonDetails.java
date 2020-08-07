package manninglivesalon.salonapi;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SalonDetails {

    @Value("${salon.name}")
    private String name;

    @Value("${salon.address}")
    private String address;

    @Value("${salon.city}")
    private String city;

    @Value("${salon.state}")
    private String state;

    @Value("${salon.zipcode}")
    private String zipcode;

    @Value("${salon.phone}")
    private String phone;

}
