package za.ac.cput.classexercise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class GitPracticeTest {
    private GitPractice ongieFirst;
    private GitPractice ongieSecond;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ongieFirst = new GitPractice();
        ongieSecond = new GitPractice();
    }

    @Test
    void addition() {
    }

    @Test
    void Equality() {
        assertNotEquals(ongieFirst, ongieSecond);
    }

    @Test
    void identity() {
        assertNotSame(ongieFirst, ongieSecond);
    }

    @Test
    void failing() {
        assertEquals(ongieFirst, ongieSecond);
    }

    @Test
    @Timeout(20)
    void timeOut() {
        assertEquals(ongieFirst.addition(19090, 8), 98237847);
    }

    @Test
    @Disabled
    void ignore() {
        assertEquals(ongieFirst.addition(190, 8), 98237847);
    }
}