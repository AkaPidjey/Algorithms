package InputAndOutput;

import InputAndOutput.NumberOrString;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOrStringTest {
    @Test
    public void primer1() {
        String value1 = "строка1";
        boolean expect1 = false;
        boolean result1 = NumberOrString.isDigit(value1);
        assertEquals(result1, expect1);
    }
    @Test
    public void primer2() {
        String value2 = "";
        boolean expect2 = false;
        boolean result2 = NumberOrString.isDigit(value2);
        assertEquals(result2, expect2);
    }
    @Test
    public void primer3() {
        String value3 = " ";
        boolean expect3 = false;
        boolean result3 = NumberOrString.isDigit(value3);
        assertEquals(result3,expect3);
    }
    @Test
    public void primer4() {
        String value4 = "0";
        boolean expect4 = true;
        boolean result4 = NumberOrString.isDigit(value4);
        assertEquals(result4,expect4);
    }
    @Test
    public void primer5() {
        String value5 = "123";
        boolean expect5 = true;
        boolean result5 = NumberOrString.isDigit(value5);
        assertEquals(result5,expect5);
    }
    @Test
    public void primer6() {
        String value6 = "-13";
        boolean expect6 = true;
        boolean result6 = NumberOrString.isDigit(value6);
        assertEquals(result6,expect6);
    }
    @Test
    public void primer7() {
        String value7 = "3.14ghg";
        boolean expect7 = false;
        boolean result7 = NumberOrString.isDigit(value7);
        assertEquals(result7,expect7);
    }

}
