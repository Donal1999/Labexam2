import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class patientTest {
    Patient myPat;

    @BeforeEach
    void setup() {
        myPat = new Patient();
    }

    @Test
    void nameAddSuccess() {
        assertEquals("name added", myPat.nameAdd("john"));
    }

    @Test
    void nameAddFail(){
        assertThrows()
    }

    @Test
    void famNameAddSuccess(){
        assertEquals("family name added", myPat.famNameAdd("Murphy"));
    }
    @Test
    void famNameAddFail(){
        Exception exmessage = assertThrows(IllegalAccessException.class, () ->)
    }
    @Test
    void numberAddSuccess(){
        assertsEquals("");
    }
}