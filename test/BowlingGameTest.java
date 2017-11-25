/** BowlingGameTest 
 *
 * @author CDT414 Student:
 * @version 1.0 
 * @date 2016-11-24
 */
import junit.framework.TestCase;

/** BowlingGame Score calculator test cases 
 *  
 */	 
public class BowlingGameTest extends TestCase {
        
	/** test01 
	 * 	
	 *  If no game is provided, score should be -1 (error)   
	 */	     
	public void test01NoGame() {
        BowlingGame bowlingGame = new BowlingGame("");
        assertEquals(-1, bowlingGame.getScore());
    }	
	public void test02ShortGame() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1]");
        assertEquals(-1, bowlingGame.getScore());
    }	
	public void test03LongGame() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][4,6][8,2][2,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
	public void test04InvalidNumbersHigh() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][13,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
	public void test05InvalidNumbersNegative() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][-3,2][3,6][-4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
	public void test06InvalidNumbersMoreThan10ptsTotalIn1Frame() {
        BowlingGame bowlingGame = new BowlingGame("[6,5][10,2][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
	public void test07InvalidNumbersMoreThan10ptsTotalIn1Frame() {
        BowlingGame bowlingGame = new BowlingGame("[6,5][0,11][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
}