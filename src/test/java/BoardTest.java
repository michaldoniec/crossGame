import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {

    @Test
    public void testIfBoardSizeNine(){
        Board board = new Board();
        for(Object cell : board.getCells()){
            System.out.println(cell.toString());
        }
        assertEquals(9, board.getCells().size());
    }
}