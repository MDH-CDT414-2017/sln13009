/*
 * A Frame - frames consists of 2 throws which can give 0-10 points.
 * This frame helper class was created to give more overview to the implementation of BowlingGame.java
 * and to provide an object with some functionality to be able to code the solution more easily.
 * 
 * @author CDT414 Student: Sebastian Lindgren, sln13009
 * @version 1.0 
 * @date 2016-11-25
 */

public class Frame {

	int firstThrow;
	int secondThrow;
	
	public Frame() {
		this.firstThrow = 0;
		this.secondThrow = 0;
	}
	
	public Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}
	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}
	public int getSecondThrow() {
		return secondThrow;
	}
	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
	public boolean isStrike() {
		return firstThrow == 10;
	}
	public boolean isSpare() {
		return ((firstThrow+secondThrow) == 10 && !isStrike());
	}
	public boolean isMiss() {
		return ((firstThrow+secondThrow) == 0);
	}

	public boolean isValid() {
		return (
				((firstThrow+secondThrow) <= 10)
				&&
				firstThrow <= 10 
				&& 
				firstThrow > -1 
				&& 
				secondThrow <= 10 
				&& 
				secondThrow > -1);
	}


}
