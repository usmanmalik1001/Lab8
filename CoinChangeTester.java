/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javaapplication1.JavaApplication1;

/**
 *
 * @author test1
 */
public class CoinChangeTester {
    
    @Test
    public void hello() 
    {
        assertEquals(JavaApplication1.greedy(30), 6);
        assertEquals(JavaApplication1.dynamic(30), 3);
    }
}
