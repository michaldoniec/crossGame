/**
 * Created by KBorowska on 05.06.2017.
 */
public class Cell {
    private Integer row;
    private Integer col;
    private Seed content;

    public Cell(Integer row, Integer col) {
        this.setRow(row);
        this.setCol(col);
        this.setContent(Seed.EMPTY);
    }

    public void setRow(Integer row){
        if(row > 3 || row < 1) throw new IllegalArgumentException("Row must be between 1-3.");
        this.row = row;
    }

    public void setCol(Integer col){
        if(col > 3 || row < 1) throw new IllegalArgumentException("Col must be equal between 1-3.");
        this.col = col;
    }

    public void setContent(Seed seed){
        this.content = seed;
    }

    public Seed getContent() {
        return content;
    }
    public void clear(){
        this.setContent(Seed.EMPTY);
    }

    public String toString(){
        return String.format("Coll: %d Row: %d",this.col, this.row);
    }
}
