package manninglivesalon.salonapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalonApiApplicationTests {
    @Autowired
    SalonDetails salonDetails;

    @Test
    void contextLoads() {
    }

    @Test
    void salonDetailsLoad() {
        assertTrue(salonDetails.getName().equals("AR Salon and Day Spa Services"));
    }

}
