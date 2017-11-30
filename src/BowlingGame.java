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
		if(game != null && !game.isEmpty())
			this.score = calculateScore(game);
		else
			this.score = -1;
	}
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	
	private int calculateScore(String arr)
	{	
		String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", ",").replaceAll("\\s", "").split(",");
		
		if(items.length < 20 || items.length > 22)
			return -1;
		
		String validInputFormat = arr.replaceAll("[0-9]", "");
		
		if(!(items.length==21 && validInputFormat.length()==32) && !(validInputFormat.length()==30 || validInputFormat.length()==33))
			return -1;
		
		int[] values = new int[items.length];

		for (int i = 0; i < items.length; i++) {
			try {
		        values[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {
		        return -1;
		    };
		}
		
		Frame[] frames = new Frame[11];
		
		int j = 0;
		for (int i = 0; i < 10; i++) {
				frames[i] = new Frame(values[j], values[j+1]);
				j+=2;
		}
		if(items.length == 21) {
			frames[10] = new Frame(values[20], 0);
			if(!frames[9].isSpare())
				return -1;
		}
		if(items.length == 22) {
			frames[10] = new Frame(values[20], values[21]);
			if(!frames[9].isStrike())
				return -1;
		}
		
		if(frames[9].isSpare() && items.length != 21)
			return -1;
		if(frames[9].isStrike() && items.length != 22)
			return -1;
		
		int[] total = new int[10];
		
		for (int i = 0; i < 10; i++) {
			if(!frames[i].isValid()){
				return -1;
			}
			if(frames[i].isStrike()) {
				total[i] = frames[i].getFirstThrow();
				if(!(i==9) && frames[i+1].getSecondThrow() == 0)
					total[i] += frames[i+1].getFirstThrow() + frames[i+2].getFirstThrow();
				else
					total[i] += frames[i+1].getFirstThrow()+frames[i+1].getSecondThrow();
			}
			else if(frames[i].isSpare())
				total[i] = frames[i].getFirstThrow()+frames[i].getSecondThrow()+frames[i+1].getFirstThrow();
			else 
				total[i] = frames[i].getFirstThrow()+frames[i].getSecondThrow();
		}
		
		int sum = 0;
		for (int i = 0; i < 10; i++)
			sum += total[i];
		
		return sum;
	}
	
	public int getScore() {
		return score;
	}
	
}
