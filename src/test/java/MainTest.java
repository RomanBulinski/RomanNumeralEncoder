import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Main conversion = new Main();

//    @Test
//    public void shouldConvertToRoman() {
//        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
//        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
//        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
//    }

    @Test
    public void test10(){
        assertEquals("X",conversion.solution(10));
    }

    @Test
    public void test111(){
        assertEquals("CXI",conversion.solution(111));
    }

    @Test
    public void test591(){
        assertEquals("DXCI",conversion.solution(591));
    }

    @Test
    public void test4(){
        assertEquals("IV",conversion.solution(4));
    }


}
