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
public class BowlingGameTest_Ultimate extends TestCase {
        
	/** test01 
	 * 	
	 *  If no game is provided, score should be -1 (error)   
	 */	     
	
	public void test1() { BowlingGame bowlingGame = new BowlingGame(""); assertEquals(-1, bowlingGame.getScore());}
	public void test2() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(81, bowlingGame.getScore());}
	public void test3() { BowlingGame bowlingGame = new BowlingGame("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(94, bowlingGame.getScore());}
	public void test4() { BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(112, bowlingGame.getScore());}
	public void test5() { BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(88, bowlingGame.getScore());}
	public void test6() { BowlingGame bowlingGame = new BowlingGame("[1,9][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(98, bowlingGame.getScore());}
	public void test7() { BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(103, bowlingGame.getScore());}
	public void test8() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]"); assertEquals(90, bowlingGame.getScore());}
	public void test9() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]"); assertEquals(93, bowlingGame.getScore());}
	public void test10() { BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]"); assertEquals(300, bowlingGame.getScore());}
	public void test11() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]"); assertEquals(92, bowlingGame.getScore());}
	public void test12() { BowlingGame bowlingGame = new BowlingGame("blablabla[1,2][7]asdf1234[]"); assertEquals(-1, bowlingGame.getScore());}
	public void test13() { BowlingGame bowlingGame = new BowlingGame("[-1,-5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(-1, bowlingGame.getScore());}
	public void test14() { BowlingGame bowlingGame = new BowlingGame("[[[1,5]][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]]"); assertEquals(-1, bowlingGame.getScore());}
	public void test15() { BowlingGame bowlingGame = new BowlingGame("[1,2][3,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test16() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6][2,6][2,6][2,6][2,6]"); assertEquals(-1, bowlingGame.getScore());}
	public void test17() { BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][2,8][10,0][10,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test18() { BowlingGame bowlingGame = new BowlingGame("[4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4]"); assertEquals(80, bowlingGame.getScore());}
	public void test19() { BowlingGame bowlingGame = new BowlingGame("2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4"); assertEquals(-1, bowlingGame.getScore());}
	public void test20() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][24]"); assertEquals(-1, bowlingGame.getScore());}
	public void test21() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test22() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][6,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test23() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][10,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test24() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test25() { BowlingGame bowlingGame = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][6,4][4,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test26() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test27() { BowlingGame bowlingGame = new BowlingGame("[2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4][2,4]"); assertEquals(-1, bowlingGame.getScore());}
	//test28() changed expected outcome from 86 to -1 since a spare should only be followed by 1 throw
	public void test28() { BowlingGame bowlingGame = new BowlingGame("[4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][6,4][4,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test29() { BowlingGame bowlingGame = new BowlingGame("[4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][4,4][10,0][4,4]"); assertEquals(90, bowlingGame.getScore());}
	public void test30() { BowlingGame bowlingGame = new BowlingGame("[7,1][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(8, bowlingGame.getScore());}
	public void test31() { BowlingGame bowlingGame = new BowlingGame("[9,1][4,4][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(22, bowlingGame.getScore());}
	//test32() changed from 36 to 26 since 10+4+4 + 4+4 = 26
	public void test32() { BowlingGame bowlingGame = new BowlingGame("[10,0][4,4][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(26, bowlingGame.getScore());}
	public void test33() { BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][4,4][0,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(50, bowlingGame.getScore());}
	public void test34() { BowlingGame bowlingGame = new BowlingGame("[10,das][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test35() { BowlingGame bowlingGame = new BowlingGame("[,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test36() { BowlingGame bowlingGame = new BowlingGame("[3,0][10,0][11,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test37() { BowlingGame bowlingGame = new BowlingGame("[3,0][10,0][11,0][10,0][5,7][10,0][10,0][10,0][10,0][10,0][10,10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test38() { BowlingGame bowlingGame = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(0, bowlingGame.getScore());}
	public void test39() { BowlingGame bowlingGame = new BowlingGame(null); assertEquals(-1, bowlingGame.getScore());}
	public void test40() { BowlingGame bowlingGame = new BowlingGame("[-2,0][0,0][-3,0][5,0][0,0][0,0][0,0][0,0][0,0][0,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test41() { BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][0,0]"); assertEquals(270, bowlingGame.getScore());}
	public void test42() { BowlingGame bowlingGame = new BowlingGame("[3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(-1, bowlingGame.getScore());}
	public void test43() { BowlingGame bowlingGame = new BowlingGame("[0,10][7,10][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(-1, bowlingGame.getScore());}
	public void test44() { BowlingGame bowlingGame = new BowlingGame("[5,1][6,1][7,j][3,6][4,4][5,3][3,3][4,5][8,1][2,6]"); assertEquals(-1, bowlingGame.getScore());}
	public void test45() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][10,2]"); assertEquals(95, bowlingGame.getScore());}
	public void test46() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][2,10]"); assertEquals(95, bowlingGame.getScore());}
	public void test47() { BowlingGame bowlingGame = new BowlingGame("[1,9][1,9][1,9][1,9][1,9][1,9][1,9][1,9][1,9][1,9][10]"); assertEquals(119, bowlingGame.getScore());}
	public void test48() { BowlingGame bowlingGame = new BowlingGame("[0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][10]"); assertEquals(110, bowlingGame.getScore());}
	public void test49() { BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test50() { BowlingGame bowlingGame = new BowlingGame("[1,30][3,6][7,2][3,6][4,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test51() { BowlingGame bowlingGame = new BowlingGame("[1,5][30,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test52() { BowlingGame bowlingGame = new BowlingGame("[1,5][9,9][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test53() { BowlingGame bowlingGame = new BowlingGame("[1,2][3,4]"); assertEquals(-1, bowlingGame.getScore());}
	public void test54() { BowlingGame bowlingGame = new BowlingGame("[10,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]"); assertEquals(-1, bowlingGame.getScore());}
	public void test55() { BowlingGame bowlingGame = new BowlingGame("[10,0][3,3][10,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test56() { BowlingGame bowlingGame = new BowlingGame("STRING"); assertEquals(-1, bowlingGame.getScore());}
	public void test57() { BowlingGame bowlingGame = new BowlingGame("[0,1]"); assertEquals(-1, bowlingGame.getScore());}
	public void test58() { BowlingGame bowlingGame = new BowlingGame("[0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1]"); assertEquals(-1, bowlingGame.getScore());}
	public void test59() { BowlingGame bowlingGame = new BowlingGame("[0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,10]"); assertEquals(-1, bowlingGame.getScore());}
	public void test60() { BowlingGame bowlingGame = new BowlingGame("[0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][10,0]"); assertEquals(-1, bowlingGame.getScore());}
	public void test61() { BowlingGame bowlingGame = new BowlingGame("[0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][0,1][1]"); assertEquals(-1, bowlingGame.getScore());}
	public void test62() { BowlingGame bowlingGame = new BowlingGame("[0,1][0,1][0,1][0,1][1][0,1][0,1][0,1][0,1][0,1]"); assertEquals(-1, bowlingGame.getScore());}	
}