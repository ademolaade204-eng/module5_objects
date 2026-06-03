import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class programmerTest {
    @Test
    public void testBatteryDecreasesWhenwritingCode() throws BatteryExhaustedException{
        JavaStudent tester = new JavaStudent("Tester",  "Java");
        tester.writeCode();
        assertEquals(85, tester.getBatteryLife());
    }

}