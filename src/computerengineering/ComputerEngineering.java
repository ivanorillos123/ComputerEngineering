/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerengineering;

/**
 *
 * @author WS15
 */

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Marco Marvin L. Rado
 */
public class ComputerEngineering 
{
    @Test
    public void addingTwoNumbers()
    {
        ComputerEngineeringPro.add(1,1);
    }
    
    @Test
    public void addingTwoNumbersWithSumEquals2()
    {
        Assert.assertEquals(2, ComputerEngineeringPro.add(1,1));
    }
    
    @Test
    public void addingTwoNumbersWithSumEquals3()
    {
        Assert.assertEquals(3, ComputerEngineeringPro.add(2,1));
    }
}

