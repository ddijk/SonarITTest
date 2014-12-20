
import com.mycompany.sonarittest.Calculator;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dick
 */
public class CalculatorIT {
    
    
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        
        Assert.assertEquals("Subtracting failed",3, calc.subtract(7,4));
    }
    
    
}
