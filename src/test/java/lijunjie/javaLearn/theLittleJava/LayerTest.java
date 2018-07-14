package lijunjie.javaLearn.theLittleJava;

/**
 * Created by ljj on 2018/7/14.
 */

import lijunjie.javaLearn.theLittleJava.layers.Base;
import lijunjie.javaLearn.theLittleJava.layers.LayerD;
import lijunjie.javaLearn.theLittleJava.numbers.Zero;
import org.junit.Test;
import static org.junit.Assert.*;
public class LayerTest {
    @Test
    public void construct_Base_with_Zero_should_be_Layer_also_be_object(){
        Object o = new Base(new Zero());
        assertTrue(o instanceof LayerD);
        assertTrue(o instanceof Object);
    }
}
