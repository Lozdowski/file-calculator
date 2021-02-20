import calculator.domain.MyCalculator;
import data.InstructionsProvider;
import data.dto.InstructionsForCalculator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyCalculatorRunner {

    private static final String ANOTHER_FILE_QUESTION = "Wanna calculate another file? press ENTER or NO to exit";
    private static final String NO = "NO";

    private final MyCalculator myCalculator;
    private final InstructionsProvider objectsProvider;
    private final Scanner scanner;

    public MyCalculatorRunner() {
        this.myCalculator = new MyCalculator();
        this.scanner = new Scanner(System.in);
        this.objectsProvider = new InstructionsProvider();
    }

    public void run() {
        while (true) {
            try {
                printFilePathRequest();
                InstructionsForCalculator instructions = objectsProvider.readInstructionsForCalculatorFrom(scanner.nextLine());
                System.out.println(myCalculator.run(instructions));
                System.out.println(ANOTHER_FILE_QUESTION);
                String nox = scanner.nextLine();
                if (nox.equals(NO)) {
                    scanner.close();
                    System.exit(0);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File not found, type: NO- to EXIT PROGRAM, or ENTER to continue");
                if (scanner.nextLine().equals("NO")) {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }

    private void printFilePathRequest() {
        System.out.println("type file path of file(with filename) :");
        System.out.println("ex: C:\\Users\\pepe\\Desktop\\calc.txt");
    }
}
