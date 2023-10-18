import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.After;

@DisplayName("Test whether Passports can be instantiated correctly.")
class PassportTest {

    @Test
    @DisplayName("Can a Passport be instantiated for CodeGrade, age 5 from The Netherlands?")
    void createPassport() {
        try {
            Passport p = new Passport("CodeGrade", 5, "The Netherlands");
            assertNotNull(p);
        } catch (Exception ex) {
            fail("The Passport object could not be instantiated, see error message:", ex);
        }
        fail("Test");
    }

    @Test
    @DisplayName("Can a Passport be instantiated for James Gosling, age 67 from Canada?")
    void createPassport2() {
        try {
            Passport p = new Passport("James Gosling", 67, "Canada");
            assertNotNull(p);
        } catch (Exception ex) {
            fail("The Passport object could not be instantiated, see error message:", ex);
        }
        fail("Test");
    }
}
