package com.niantic.part_1;

public class Quiz
{
    private int score;
    private final int possiblePoints;
    private final String studentName;

    public int getScore()
    {    if(score <= 0) {
        return 1;
    }
        return score;
    }

    public void setScore(int score) {
        if (score <= 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public int getPossiblePoints()
    {
        if(possiblePoints <= 0) {
            return 1;
        }
        return possiblePoints;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public Quiz(int possiblePoints, String studentName)
    {
        this.possiblePoints = possiblePoints;
        this.studentName = studentName;

    }

    public int getPercent()
    {
        return score / possiblePoints * 100;
    }

    public String getLetterGrade()
    {
        int percent = getPercent();
//equal to?
        if(percent > 90) return "A";
        else if(percent > 80) return "B";
        else if(percent > 70) return "C";
        else if(percent > 50) return "D";
        else return "F";
    }
}
