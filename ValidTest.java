import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.After;

import org.junit.platform.suite.api.*;

@DisplayName("Test the isValid() and makeInvalid() functionality.")
class ValidTest {

    @Test
    @DisplayName("Is a Passport valid by default?")
    void isValidByDefault() {
        try {
            Passport p = new Passport("CodeGrade", 5, "The Netherlands");
            assertEquals(p.isValid(), true);
        } catch (Exception ex) {
            fail("The Passport object could not be instantiated, see error message:", ex);
        }
    }

    @Test
    @DisplayName("Is a Passport invalid after running makeInvalid() method?")
    void isInvalidAfterMakingInvalid() {
        try {
            Passport p = new Passport("CodeGrade", 5, "The Netherlands");
            p.makeInvalid();
            assertEquals(p.isValid(), false);
        } catch (Exception ex) {
            fail("The Passport object could not be instantiated, see error message:", ex);
        }
    }
}
