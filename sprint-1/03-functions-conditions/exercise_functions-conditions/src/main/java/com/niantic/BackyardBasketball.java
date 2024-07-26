 package com.niantic;

public class BackyardBasketball {
    /*
     * Teams that play in the backyard league want to be able
     * to calculate their winning percentage.
     *
     * Each team knows how many games they have won and how many
     * games they have lost. When they call this function they
     * will provide their wins and losses.
     *
     * You need to perform the calculation and return their
     * winning percentage as a whole number.
     *
     * Example:
     * If a team has won 7 games and lost 3 games their winning
     * percentage is 70%.
     *
     * calculateWinningPercentage(7, 3) -> 70
     * calculateWinningPercentage(5, 5) -> 50
     * calculateWinningPercentage(5, 10) -> 33
     *
     */
    public int calculateWinningPercentage(int gamesWon, int gamesLost) {
        int totalgames = gamesWon + gamesLost;
        int winningPercentage = gamesWon * 100 / totalgames;
        return winningPercentage;

    }


    /*
     * The calculatePointsScored function should calculate
     * the number of points a player scored in a game.
     *
     * shotPercentage = the percent of shots made
     * shotsTaken = the number of shots the player took
     * isThree = if true, the player shot a 3 pointer otherwise a 2
     *
     * calculatePointsScored(70, 10, false) -> 14
     * calculatePointsScored(70, 10, true) -> 21
     * calculatePointsScored(67, 15, false) -> 20
     *
     */
    public int calculatePointsScored(int shotPercentage, int shotsTaken, boolean isThree)
    {
        double shotPercen= shotPercentage/100.0;
        double shotssMade = shotPercen * shotsTaken;
        if (isThree == true) {

            return(int) shotssMade* 3;
        }
        else {
            return(int) shotssMade * 2;
        }

    }

    /*
     The calculatePointsScored function should calculate
     * the number of points a player scored in a game.
     *
     * shotPercentage = the percent of shots made
     * shotsTaken = the number of shots the player took
     * isThree = if true, the player shot a 3 pointer otherwise a 2
     *
     * calculatePointsScored(70, 10, false) -> 14
     * calculatePointsScored(70, 10, true) -> 21
     * calculatePointsScored(67, 15, false) -> 20
     *
     * calculateShotsRequired(50, 10, false) -> 10
     *
     * calculateShotsRequired(50, 10, true) -> 8
     * calculateShotsRequired(75, 15, true) -> 7
     * calculateShotsRequired(80, 18, true) -> 8
     * calculateShotsRequired(67, 24, false) -> 18     *
     *
     */

    public int calculateShotsRequired(int shotPercentage, int desiredScore, boolean isThree)
    {
        double madeBaskets;
        double requiredShots;
        if (isThree) {
            madeBaskets = desiredScore / 3.0;
        } else {
            madeBaskets = desiredScore / 2.0;
        }

        madeBaskets = Math.ceil(madeBaskets);

        requiredShots = (madeBaskets * 100.0) / shotPercentage;

        return (int) Math.ceil(requiredShots);
    }
}




