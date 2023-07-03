package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftynineshoudreturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));


    }

    @Test
    void sixtynineshoudreturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));


    }
}