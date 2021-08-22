package org.dropProject.samples.sampleJavaAssignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeacherHiddenProject {
    @Test
    public void testFindMaxAllNegative() {
        assertEquals(-5, Main.findMax(new int[]{-7, -5, -30, -23}));
        assertEquals(-52, Main.findMax(new int[]{-74, -52, -66, -99}));


    }

}
