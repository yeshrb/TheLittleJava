package lijunjie.javaLearn.theLittleJava;

import lijunjie.javaLearn.theLittleJava.seasonings.Pepper;
import lijunjie.javaLearn.theLittleJava.seasonings.Salt;
import lijunjie.javaLearn.theLittleJava.seasonings.SeasoningD;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ljj on 2018/7/14.
 */
public class SeasoningTest {

    @Test
    public void saltType() {
       assertTrue("salt_shold_be_instance_of_Seasoning",(new Salt()) instanceof SeasoningD);
        assertTrue("salt_shold_be_instance_of_Salt",(new Salt()) instanceof Salt);
    }
    @Test
    public void pepperType() {
        assertTrue("pepper_shold_be_instance_of_Seasoning",(new Pepper()) instanceof SeasoningD);
        assertTrue("pepper_shold_be_instance_of_Pepper",(new Pepper()) instanceof Pepper);
    }


}
