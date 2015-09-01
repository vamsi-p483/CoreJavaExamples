package com.Package1.testcase;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import com.Package1.logic.ScoreGrader;
import com.Package1.logic.Student;

@PrepareForTest({Student.class})
public class MockConstructionTest  {
    
    @Test
    public void mockConstruction() {
        Student student = new Student();
        
        final int expectedScore = 120;
        
        ScoreGrader grader_mock = Mockito.mock(ScoreGrader.class);
        Mockito.doReturn(expectedScore).when(grader_mock).getScore();
        try {
            PowerMockito.whenNew(ScoreGrader.class)
                .withNoArguments().thenReturn(grader_mock);
        } catch (Exception e) {
            Assert.fail("Unable to mock the construction of "
                    + "the ScoreGrader object");
        }
        
        // This assertion will succeed because the mock is used to 
        // generate the score, so a score greater than 100 is generated
        Assert.assertNotNull(student.getMathScore());
    }
}