/** BowlingGame Score calculator 
 *
 * @author CDT414 Student: Sebastian Lindgren, sln13009
 * @version 1.0 
 * @date 2016-11-24
 */
public class BowlingGame {

	/** BowlingGame Score calculator constructor which require string as input 
	 * @param game Expected format "[n,n][n,n]..[n,n]"
	 * 
	 */	 
	
	int score;
	
	public BowlingGame(String game)
	{	
		this.score = calculateScore(game);
	}
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	
	private int calculateScore(String arr)
	{	
		
		String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", ",").replaceAll("\\s", "").split(",");
		
		int[] frames = new int[items.length];

		for (int i = 0; i < items.length; i++) {
			try {
		        frames[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {
		        return -1;
		    };
		}
		
		int sum = 0;
		for (int i = 0; i < items.length; i++) {
			sum = sum + frames[i];
		}
		
		return sum;
	}
	
	public int getScore() {
		return score;
	}
	
}
