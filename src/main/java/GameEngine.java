class GameEngine {
    int moveByPC(int matchCounter) {
        int numberOfMatchesToPull = 0;
        switch (matchCounter) {
            case (20):
            case (16):
            case (12):
            case (8):
            case (4):
                numberOfMatchesToPull = 3;
                break;
            case (15):
            case (11):
            case (7):
            case (3):
                numberOfMatchesToPull = 2;
                break;
            case (14):
            case (10):
            case (6):
            case (2):
                numberOfMatchesToPull = 1;
                break;
        }
        return numberOfMatchesToPull;
    }
}
