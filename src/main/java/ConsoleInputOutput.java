import java.util.Scanner;

class ConsoleInputOutput {
    private Scanner scanner = new Scanner(System.in);

    void printGameInfoText(int matchCounter) {
        System.out.println("На столе осталось " + matchCounter + " спичек");
    }

    int printUserMoveText() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
        return scanner.nextInt();
    }

    void printIncorrectMoveText() {
        System.out.println("Некорректное количество спичек!");
    }

    void printPCMoveText(int matchCounter) {
        System.out.println(" - Количество выбранных компьютером спичек: " + matchCounter);
    }

    void printVictoryText() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
