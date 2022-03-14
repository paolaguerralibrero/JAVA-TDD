import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void setUp(){
        printer = new Printer();

    }

    @Test
    public void print(){
        printer.print(2,1);
        assertEquals(8, printer.getSheets());
    }
    @Test
    public void printShouldNotRunIfThereIsNotEnoughPaper(){
        printer.print(10,4);
        assertEquals(10, printer.getSheets());
    }
    @Test
    public void printShouldReduceTonerBy1ForEachPagePrinted(){
        printer.print(2,1);
        assertEquals(98, printer.getToner());

    }



}