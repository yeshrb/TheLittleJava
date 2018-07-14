package lijunjie.javaLearn.theLittleJava;

import lijunjie.javaLearn.theLittleJava.points.CartesianPt;
import lijunjie.javaLearn.theLittleJava.points.ManhattanPt;
import lijunjie.javaLearn.theLittleJava.points.PointD;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ljj on 2018/7/14.
 */
public class PointTest {
    @Test
    public void test_create_point(){

        PointD p1 = new CartesianPt(2,3);
        PointD p2 = new ManhattanPt(2,3);
        assertTrue(p1 instanceof CartesianPt);
        assertTrue(p2 instanceof ManhattanPt);

    }
}
