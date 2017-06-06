import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CellTest {

    @Test
    public void testIfIllegalArgumentExceptionIsThrowsIfRowAndColumnAbove3(){
        assertThrows(IllegalArgumentException.class, () -> new Cell(4,4));
    }

    @Test
    public void testIfIllegalArgumentExceptionIsThrowsIFRowAndColumnBelow1(){
        assertThrows(IllegalArgumentException.class, () -> new Cell(0,0));
    }

    @Test
    public void testIfCellContentIsDefaultEmpty(){
        Cell cell = new Cell(1,1);
        assertEquals(Seed.EMPTY, cell.getContent());
    }
    @Test
    public void testIfSetCellContentChanging(){
        Cell cell = new Cell(1,1);
        cell.setContent(Seed.CROSS);
        assertEquals(Seed.CROSS, cell.getContent());
    }

    @Test
    public void testIfClearChangeContentToEmpty(){
        Cell cell = new Cell(1,1);
        cell.setContent(Seed.CROSS);
        cell.clear();
        assertEquals(Seed.EMPTY, cell.getContent());
    }

}
