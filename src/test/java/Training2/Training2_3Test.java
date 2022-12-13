package Training2;

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
    public void addTest_콤마테스트(){
        assertEquals(8 , cal.add("1,2:5"));
        assertEquals(9 , cal.add("1,2,6"));
        assertEquals(9 , cal.add("1:2:6"));

    }

    @Test
    public void addEmptyTest(){
        assertEquals(0 , cal.add(" "));
        assertEquals(0 , cal.add(null));
    }

    @Test
    public void addOneNumTest(){
        assertEquals(1 , cal.add("1"));
    }

    @Test
    public void addCustomTest(){
        assertEquals(8 , cal.add("//;\n1;2;5"));
        assertEquals(9 , cal.add("//;\n2;2;5"));

    }

    @Test
    public void runTimeErrorTest(){

        assertThrows(RuntimeException.class,()->cal.add("1:2,-8"));
        assertThrows(RuntimeException.class,()->cal.add("-1"));
        assertThrows(RuntimeException.class,()->cal.add("1,2,-1"));


    }

    @AfterEach
    public void teardown(){
        System.out.println("after");
    }

}
