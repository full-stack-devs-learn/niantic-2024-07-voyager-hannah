package com.niantic.exercises;

import com.niantic.models.TestScore;

import java.util.ArrayList;

public class TestScores {
    /*
    1.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a test - return all scores for the
        requested tests.
     */
    public ArrayList<TestScore> getScoresByTest(ArrayList<TestScore> testScores, String testName) {
        ArrayList<TestScore> result = new ArrayList<>();

        for (TestScore testScore : testScores)
            if (testScore.getTestName().equals(testName)) {
                result.add(testScore);

            }


        return result;

    }

    /*
    2.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a student - return all scores for the
        requested student.
     */
    public ArrayList<TestScore> getScoresByStudent(ArrayList<TestScore> testScores, String student) {
        ArrayList<TestScore> result = new ArrayList<>();

        for (TestScore testScore : testScores) {
            if (testScore.getStudentName().equals(student)) {
                result.add(testScore);
            }
        }
        return result;
    }

    /*
    3.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score.
     */
    public int getHighestScore(ArrayList<TestScore> testScores) {
        int maxScore = Integer.MIN_VALUE;

        for (TestScore testScore : testScores) {
            if (testScore.getScore() > maxScore) {
                maxScore = testScore.getScore();

            }
        }
        return maxScore;
    }

    /*
    4.  An ArrayLlo;lhfist of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getLowestScore(ArrayList<TestScore> testScores) {
        int minScore = Integer.MAX_VALUE;
        for (TestScore testScore : testScores) {
            if (testScore.getScore() < minScore) {
                minScore = testScore.getScore();

            }
        }
        return minScore;
    }

    /*
    5.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getAverageScore(ArrayList<TestScore> testScores) {
        ArrayList<TestScore> lowestScore = new ArrayList<>();

        int lowest = 0;
        for (TestScore testScore : testScores) {
            lowest += testScore.getScore();
        }
        return lowest / testScores.size();
    }

    /*
    6.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified test name.
     */
    public int getHighestScoreByTest(ArrayList<TestScore> testScores, String testName) {
        int highest = Integer.MIN_VALUE;
        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equals(testName)) {
                highest = Math.max(highest, testScore.getScore());

            }
        }

        return highest;
    }

    /*
    7.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified test name.
     */
    public int getLowestScoreByTest(ArrayList<TestScore> testScores, String testName) {
        int lowest = Integer.MAX_VALUE;
        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equals(testName)) {
                lowest = Math.min(lowest, testScore.getScore());
            }
        }
        return lowest;
    }

    /*
    8.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified test name.
     */
    public int getAverageScoreByTest(ArrayList<TestScore> testScores, String testName) {
        int totalScore = 0;
        int numberOfScores = 0;
        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equals(testName)) {
                totalScore += testScore.getScore();
                numberOfScores++;
            }
        }
        return totalScore / numberOfScores;
    }

    /*
    9.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified student.
     */
    public int getHighestScoreByStudent(ArrayList<TestScore> testScores, String student) {
        int highestScore = -1;
        for (TestScore testScore : testScores) {
            if (testScore.getStudentName().equals(student)) {
                if (testScore.getScore() > highestScore) {
                    highestScore = testScore.getScore();
                }
            }
        }
        return highestScore;
    }

    /*
    10.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified student.
     */
    public int getLowestScoreByStudent(ArrayList<TestScore> testScores, String student) {

        int lowest = Integer.MAX_VALUE;

        for (TestScore testScore : testScores) {
            if (testScore.getStudentName().equals(student)) {
                if (testScore.getScore() < lowest) {
                    lowest = testScore.getScore();
                }
            }
        }
            return lowest;
        }

    /*
    11.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified student.
     */
        public int getAverageScoreByStudent(ArrayList<TestScore> testScores, String student) {
            int totalScore = 0;
            int numberOfScores = 0;
            for (TestScore testScore : testScores) {
                if (testScore.getStudentName().equals(student)) {
                    totalScore += testScore.getScore();
                    numberOfScores++;
                }
            }
            return totalScore / numberOfScores;

        }


    }
