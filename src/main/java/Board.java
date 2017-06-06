import java.util.ArrayList;
import java.util.List;


public class Board {
    private Cell[][] cells;

    public Board(){
        cells = new Cell[4][4];
        for(Integer rowAndcolumn = 1; rowAndcolumn < 4; rowAndcolumn++){
            for(Integer rowAndColumn2 = 1; rowAndColumn2 < 4; rowAndColumn2++) {
                cells[rowAndcolumn][rowAndColumn2] = new Cell(rowAndcolumn, rowAndColumn2);
            }
        }
    }

    public void init(){
        for(Integer rowAndcolumn = 1; rowAndcolumn < 4; rowAndcolumn++){
            for(Integer rowAndColumn2 = 1; rowAndColumn2 < 4; rowAndColumn2++) {
                Cell cell = cells[rowAndcolumn][rowAndColumn2];
                cell.clear();
            }
        }
    }

    public Boolean hasWon(Seed seed, Integer row, Integer column) throws Exception {
        if(checkUserInput(row, column)){
            Cell cell = cells[row][column];
            if(checkCellIfEmpty(cell)){
                cell.setContent(seed);
            }else {
                throw new Exception();
            }

        } else {
            throw new Exception();
        }

        Integer countSeed = 0;
        for(int col = 1; col < cells.length; col++){
           Cell cell = cells[row][col];
           if(cell.getContent()==seed){
               countSeed++;
           };
        }

        if(countSeed == 3){
            return true;
        } else{
            countSeed = 0;
        }

        for(int rowIndex = 1; rowIndex < cells.length; rowIndex++){
            Cell cell = cells[rowIndex][column];
            if(cell.getContent() == seed){
                countSeed++;
            };
        }

        if(countSeed == 3){
            return true;
        } else{
            countSeed = 0;
        }





    }



    private Boolean checkUserInput(Integer row, Integer column) {
        if(row < 1 || row > 3 || column < 1 || column > 3){
            return false;
        } else {
            return true;
        }
    }

    private Boolean checkCellIfEmpty(Cell cell){
        if(cell.getContent() == Seed.EMPTY){
            return true;
        } else {
            return false;
        }
    }
}
