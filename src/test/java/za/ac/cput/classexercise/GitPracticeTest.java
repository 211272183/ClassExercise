package za.ac.cput.classexercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nolubabalo Ndongeni 219319464
 */
class GitPracticeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void equalityTestSubtraction() {

        String num1 = "10";
        String num2 = "4";
        String num3 = "5";
        GitPractice instance = new GitPractice();
        int expResult = -4;
        int result = instance.subtraction(num1, num2, num3);
        assertEquals(expResult, result);

    }

    @Test
    public void identityTestSubtraction() {

        String num1 = "10";
        String num2 = "4";
        String num3 = "10";
        GitPractice instance = new GitPractice();
        int expResult = -4;
        int result = instance.subtraction(num1, num2, num3);
        assertSame(num3, num1);

    }

    @Test
    public void failTestSubtraction() {

        String num1 = "10";
        String num2 = "4";
        String num3 = "5";
        GitPractice instance = new GitPractice();
        int expResult = -4;
        int result = instance.subtraction(num1, num2, num3);
        fail("This test method will fail");
    }

    @Test
    @Disabled
    public void disableTestSubtraction() {

        String num1 = "10";
        String num2 = "4";
        String num3 = "10";
        GitPractice instance = new GitPractice();
        int expResult = -4;
        int result = instance.subtraction(num1, num2, num3);
        assertSame(num3, num1);
    }

    @Test
    @Timeout(100)
    public void timeoutTest()
    {
        while(true);
    }
}