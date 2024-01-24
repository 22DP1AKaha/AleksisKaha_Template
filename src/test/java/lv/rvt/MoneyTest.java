package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Money.Money;

public class MoneyTest {
    
    @Test
    public void testPlusMethod() 
    {
        Money macins1 = new Money(5,10);
        Money macins2 = new Money(5,10);

        Money result1 = macins1.plus(macins2);

        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());
        
        Money mon3 = new Money(2, 89);
        Money mon4 = new Money(3, 99);

        Money result2 = mon3.plus(mon4);
        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());        
    }

    
    
}
