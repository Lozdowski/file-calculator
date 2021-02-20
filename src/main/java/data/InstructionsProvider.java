package data;

import data.dto.InstructionRow;
import data.dto.InstructionsForCalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstructionsProvider {

    public InstructionsForCalculator readInstructionsForCalculatorFrom(String filepath) throws FileNotFoundException {
        List<InstructionRow> instructionRows = getInstructionRowsFromFile(filepath);
        InstructionRow last = instructionRows.remove(instructionRows.size() - 1);
        ApplyOn applyOn = ApplyOn.of(last);
        return new InstructionsForCalculator(instructionRows, applyOn.getValue());
    }

    private List<InstructionRow> getInstructionRowsFromFile(String filepath) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File(filepath));
        List<InstructionRow> instructionRows = new ArrayList<>();
        while (fileReader.hasNextLine()) {
            instructionRows.add(InstructionRow.of(fileReader.nextLine()));
        }
        fileReader.close();
        return instructionRows;
    }
}
