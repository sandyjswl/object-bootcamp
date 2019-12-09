import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    private final Rectangle rectangleWithLength2Breadth3 = new Rectangle(2, 3);
    private final Rectangle rectangleWithLength4Breadth7 = new Rectangle(4, 7);

    @Test
    public void shouldReturnArea6ForLength2AndBreadth3() {
        assertEquals(6, rectangleWithLength2Breadth3.area());
    }

    @Test
    public void shouldReturnArea28ForLength4AndBreadth7() {
        assertEquals(28, rectangleWithLength4Breadth7.area());
    }

    @Test
    public void shouldReturnPerimeter10ForLength2AndBreadth3() {
        assertEquals(10, rectangleWithLength2Breadth3.perimeter());
    }

    @Test
    public void shouldReturnPerimeter22ForLength4Breadth7() {
        assertEquals(22, rectangleWithLength4Breadth7.perimeter());
    }

    @Test
    public void shouldReturnTrueWhenTwoRectanglesHaveSameLengthAndBreadth() {
        assertEquals(new Rectangle(4, 5),new Rectangle(4, 5));
    }

}