import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class wayTest {
    String [][] grid = {{"+", "+", "#", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "#", "#", "#", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}

    };
    @Test
    public void gameOfLife(){
        assertEquals("completed", conWayGameOfLife.nextGeneration(grid,10,10));


    }
}
