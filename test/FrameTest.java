import static org.junit.Assert.*;

import org.junit.Test;

public class FrameTest {

	@Test
	public void testOpen() {
		Frame f1 = new Frame();
		f1.setFirstThrow(5);
		f1.setSecondThrow(3);
		
		assertEquals(5,f1.getFirstThrow());
		assertEquals(3,f1.getSecondThrow());
		assertEquals(false, f1.isStrike());
		assertEquals(false, f1.isSpare());
	}
	@Test
	public void testSpare() {
		Frame f1 = new Frame();
		f1.setFirstThrow(5);
		f1.setSecondThrow(5);
		
		assertEquals(5,f1.getFirstThrow());
		assertEquals(5,f1.getSecondThrow());
		assertEquals(false, f1.isStrike());
		assertEquals(true, f1.isSpare());
	}
	@Test
	public void testTrickySpare() {
		Frame f1 = new Frame();
		f1.setFirstThrow(0);
		f1.setSecondThrow(10);
		
		assertEquals(0,f1.getFirstThrow());
		assertEquals(10,f1.getSecondThrow());
		assertEquals(false, f1.isStrike());
		assertEquals(true, f1.isSpare());
	}
	@Test
	public void testStrike() {
		Frame f1 = new Frame();
		f1.setFirstThrow(10);
		f1.setSecondThrow(0);
		
		assertEquals(10,f1.getFirstThrow());
		assertEquals(0,f1.getSecondThrow());
		assertEquals(true, f1.isStrike());
		assertEquals(false, f1.isSpare());
	}
	@Test
	public void testMiss() {
		Frame f1 = new Frame();
		f1.setFirstThrow(0);
		f1.setSecondThrow(0);
		
		assertEquals(0,f1.getFirstThrow());
		assertEquals(0,f1.getSecondThrow());
		assertEquals(false, f1.isStrike());
		assertEquals(false, f1.isSpare());
	}
	@Test
	public void testValid01() {
		Frame f1 = new Frame();
		f1.setFirstThrow(-1);
		f1.setSecondThrow(5);

		assertEquals(false, f1.isValid());
	}
	@Test
	public void testValid02() {
		Frame f1 = new Frame();
		f1.setFirstThrow(5);
		f1.setSecondThrow(-1);

		assertEquals(false, f1.isValid());
	}
	@Test
	public void testValid03() {
		Frame f1 = new Frame();
		f1.setFirstThrow(11);
		f1.setSecondThrow(5);

		assertEquals(false, f1.isValid());
	}
	@Test
	public void testValid04() {
		Frame f1 = new Frame();
		f1.setFirstThrow(5);
		f1.setSecondThrow(12);

		assertEquals(false, f1.isValid());
	}
	@Test
	public void testValid05() {
		Frame f1 = new Frame();
		f1.setFirstThrow(0);
		f1.setSecondThrow(0);
		
		assertEquals(true, f1.isValid());
	}
}
