import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void setup(){
        bottle = new WaterBottle();
    }

    @Test
    public void getInitialVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void empty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
