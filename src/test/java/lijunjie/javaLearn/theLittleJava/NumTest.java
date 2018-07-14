package lijunjie.javaLearn.theLittleJava;

/**
 * Created by ljj on 2018/7/14.
 */
import lijunjie.javaLearn.theLittleJava.numbers.NumD;
import lijunjie.javaLearn.theLittleJava.numbers.OneMoreThan;
import lijunjie.javaLearn.theLittleJava.numbers.Zero;
import org.junit.Test;
import static org.junit.Assert.*;
public class NumTest {
    @Test
    public void constructs_Zero_should_be_Num(){
        assertTrue(new Zero() instanceof NumD);
    }
    @Test
    public void constructs_OneMoreThan_with_Zero_should_be_Num(){
        assertTrue(new OneMoreThan(new Zero()) instanceof NumD);

    }

}
