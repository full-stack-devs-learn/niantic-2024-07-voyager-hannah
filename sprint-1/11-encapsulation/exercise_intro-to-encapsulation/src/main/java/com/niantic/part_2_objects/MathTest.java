package com.niantic.part_2_objects;

public class MathTest {
    private int Score;
    private int PossibleMarks;
    private int EarnedMarks;


    public MathTest() {
    }


    public MathTest(int Score, int PossibleMarks, int EarnedMarks) {
        this.Score = Score;
        this.PossibleMarks = PossibleMarks;
        this.EarnedMarks = EarnedMarks;

    }

    ///SCORE
    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    //EARNED
    public int getEarnedMarks() {
        return EarnedMarks;
    }

    public void setEarnedMarks(int EarnedMarks) {
        this.EarnedMarks = EarnedMarks;
    }

    //POSSIBLE
    public int getPossibleMarks() {
        return PossibleMarks;
    }

    public void setPossibleMarks(int PossibleMarks) {
        this.PossibleMarks = PossibleMarks;
    }

    //PERCENT
    public double getPercent() {
        if (PossibleMarks <= 0) {
            return 0;
        }

        return ((double) EarnedMarks / PossibleMarks) * 100;
    }

}












