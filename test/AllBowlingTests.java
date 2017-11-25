import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BowlingGameTest.class, FrameTest.class, givenBowlingExamples.class })
public class AllBowlingTests {

}
