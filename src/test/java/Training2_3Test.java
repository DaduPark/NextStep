import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Training2_3Test {

    Training2_3 cal;

    @BeforeEach
    public void setup(){
        cal = new Training2_3();
        System.out.println("start");
    }


    @Test
    public void addTest(){
        assertEquals(8 , cal.add("1,2:5"));
    }

    @Test
    public void addEmptyTest(){
        assertEquals(0 , cal.add(" "));
    }

    @Test
    public void addCustomTest(){
        assertEquals(8 , cal.add("//;\n1;2;5"));
    }

    @Test
    public void runTimeErrorTest(){
        assertThrows(RuntimeException.class,()->cal.add("1:2,-8"));
    }

    @AfterEach
    public void teardown(){
        System.out.println("after");
    }

}
