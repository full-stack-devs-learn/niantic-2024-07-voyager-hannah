package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {


    @Test
    public void get_possiblePoints_test() {
        //arrange
        int expectedPoints = 100;
        String expectedName = "Hannah";
        //int score = 95;
        Quiz quiz = new Quiz(expectedPoints, expectedName);

        //act
        int actualPoints = quiz.getPossiblePoints();

        //assert

        assertEquals(expectedPoints, actualPoints, "Should return the possible number of points");


    }

    @Test
    public void studentName_shouldReturn_studentName() {
        //arrange
        int expectedPoints = 100;
        String expectedName = "Pikachu";
        //int score = 95;
        Quiz quiz = new Quiz(expectedPoints, expectedName);

        //act
        String actualName = quiz.getStudentName();

        //assert
        assertEquals(expectedName, actualName, "Should return the correct score");

    }

    @Test
    public void score_shouldGet_correctScore() {
        //arrange
        int expectedPoints = 100;
        String studentName = "Charmander";
        //int score = 95;
        Quiz quiz = new Quiz(expectedPoints, studentName);
        int correctScore = 77;

        //act
        quiz.setScore(correctScore);

        // assert
        assertEquals(correctScore, quiz.getScore(), "Should return correct score");
    }

    @Test
    public void testGrade_A_ShouldReturn() {
        //arrange
        //int score = 95;
        int possiblePoints = 100;
        String studentName = "Mewtwo";
        String expectedLetterGrade = "A";
        String actualLetterGrade = "A";
        Quiz quiz = new Quiz(100, "Mewtwo");
        quiz.setScore(95);

        //act
        String letterGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedLetterGrade, actualLetterGrade, "Should return A at 90 percent");

    }
    @Test
    public void testGrade_B_ShouldReturn() {
        //arrange
        int possiblePoints = 100;
        String studentName = "Mew";
        String expectedLetterGrade = "B";
        String actualLetterGrade = "B";
        Quiz quiz = new Quiz(100, "Mew");
        quiz.setScore(80);

        //act
        String letterGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedLetterGrade, actualLetterGrade, "Should return B at 80 percent");

    }
    @Test
    public void testGrade_C_ShouldReturn() {
        //arrange
        int possiblePoints = 100;
        String studentName = "Squirtle";
        String expectedLetterGrade = "C";
        String actualLetterGrade = "C";
        Quiz quiz = new Quiz(100, "Squirtle");
        quiz.setScore(70);

        //act
        String letterGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedLetterGrade, actualLetterGrade, "Should return C at 90%");

    }
    @Test
    public void testGrade_D_ShouldReturn() {
        //arrange
        int possiblePoints = 100;
        String studentName = "Bulbasaur";
        String expectedLetterGrade = "D";
        String actualLetterGrade = "D";
        Quiz quiz = new Quiz(100, "Bulbasaur");
        quiz.setScore(60);

        //act
        String letterGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedLetterGrade, actualLetterGrade, "Should return D at 60 percent");

    }
    @Test
    public void testGrade_F_ShouldReturn() {
        //arrange
        int possiblePoints = 100;
        String studentName = "Snorlax";
        String expectedLetterGrade = "F";
        String actualLetterGrade = "F";
        Quiz quiz = new Quiz(100, "Snorlax");
        quiz.setScore(20);

        //act
        String letterGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedLetterGrade, actualLetterGrade,"Any value below 60 percent returns F");

    }
    @Test
    public void testNegative_possibleScore() {
        //arrange
        int possiblePoints = 100;
        String studentName = "Eevee";
        int expectedScore = 1;

        // act
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(-5);
        int actualScore = quiz.getScore();

        // assert
        assertEquals(expectedScore, actualScore, "The score is set to 1 when score is negative number");
    }
    @Test
    public void testNegative_possiblePoints () {
        //arrange
        int possiblePoints = -44;
        String studentName = "Charizard";
        int expectedPossiblePoints = 1;
        Quiz quiz = new Quiz(-44, "Charizard");
        quiz.setScore(70);

        //act
        int actualPossiblePoints = quiz.getPossiblePoints();

        //assert
        assertEquals(expectedPossiblePoints, actualPossiblePoints);

    }
    }
