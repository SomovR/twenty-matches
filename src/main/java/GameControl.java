class GameControl {
    private ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
    private GameEngine gameEngine = new GameEngine();
    private int numberOfMatches = 20;
    private int pulledMatches = 0;

    void gameFlow() {
        while (numberOfMatches != 1) {
            pcTurn();
            if (numberOfMatches == 1) {
                consoleInputOutput.printVictoryText();
                break;
            }
            playerTurn();
        }
    }

    private void playerTurn() {
        consoleInputOutput.printGameInfoText(numberOfMatches);
        pulledMatches = consoleInputOutput.printUserMoveText();
        if (pulledMatches < 4 && pulledMatches > 0) {
            numberOfMatches -= pulledMatches;
        } else {
            consoleInputOutput.printIncorrectMoveText();
            playerTurn();
        }
    }

    private void pcTurn() {
        consoleInputOutput.printGameInfoText(numberOfMatches);
        pulledMatches = gameEngine.moveByPC(numberOfMatches);
        numberOfMatches -= pulledMatches;
        consoleInputOutput.printPCMoveText(pulledMatches);
    }
}
