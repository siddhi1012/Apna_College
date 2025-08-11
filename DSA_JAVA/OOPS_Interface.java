public class OOPS_Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    } 
}

interface ChessPlayer{
    // by default public,abstract and only define not implemented
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal-by 1 step");
    }
} 

