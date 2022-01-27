package lc;
import org.junit.Test;

import static org.junit.Assert.*;

public class lc_207_course_scheduleTest {

    lc_207_course_schedule tester = new lc_207_course_schedule();


    @Test
    public void testJunit_1() {
        lc_207_course_schedule tester = new lc_207_course_schedule();
        int num = 10;
        assertFalse("this is a test", tester.testJunit(num));

    }


    @Test
    public void testJunit_2() {
        lc_207_course_schedule tester = new lc_207_course_schedule();
        int num = 2;
        assertTrue("this is a test", tester.testJunit(num));

    }
}