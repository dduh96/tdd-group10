package pt.ipp.isep.dei.examples.tdd.basic.domain;


import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;

public class Puzzle {
    public String printBoard(String input) throws IllegalArgumentException {
        //mach von Matrix zu String und gib an Main
        String output = "";

        String[][] board = setBoardValues(input);
        for (int m = 0; m < 6; m++) {
            output+= "|";
            for (int n = 0; n < 6; n++) {
                output+=" "+board[m][n]+" ";
            }
            output += "|\n";
        }

        return output;
    }

    public String[][] setBoardValues(String input) throws IllegalArgumentException {
        if (input == null) throw new IllegalArgumentException("Input empty");
        String[][] board = new String[6][6];

        for(String[] row: board)
            Arrays.fill(row, "-");
        /*for (int m = 0; m < 6; m++) {
            for (int n = 0; n < 6; n++) {
                board[m][n] = "-";
            }
        }*/

        String[] inputArray = input.split("");
        String[] orientations = {"e","n","w","s"};
        int currentRow = 0;
        int currentCol = 0;

        for (String s : inputArray) {
            String instruction = s.toLowerCase();
            if (checkInputString(instruction)) {
                switch (instruction) {
                    case "r":
                        Collections.rotate(Arrays.asList(orientations),1);
                        break;
                    case "f":
                        int[] posNew = checkIfWithinBorder(orientations[0], currentRow, currentCol, instruction);
                        if (posNew == null){
                            System.out.println("Impermissible Move!");
                            return board;
                        }
                        currentRow = posNew[0];
                        currentCol = posNew[1];
                        break;
                    case "p":
                        board[currentRow][currentCol] = "X";
                        break;
                }
            }else{
                System.out.println("Impermissible Input!");
                return board;
            }
        }

        return board;
    }

    public boolean checkInputString(String inputChar)  {
        if (inputChar == null) return false;
        return inputChar.toLowerCase().equals("r") || inputChar.toLowerCase().equals("f") || inputChar.toLowerCase().equals("p");
    }

    public int[] checkIfWithinBorder(String orientation, int currentRow, int currentCol, String instruction) {
        if (orientation == null || instruction == null) return null;
        int[] futurePos = {currentRow, currentCol};

        if (instruction.toLowerCase().equals("f")) {
            if (currentCol > 5 || currentRow > 5)
                return null;
            switch (orientation.toLowerCase()) {
                case "n":
                    futurePos[0] = currentRow - 1;
                    break;
                case "e":
                    futurePos[1] = currentCol + 1;
                    break;
                case "s":
                    futurePos[0] = currentRow + 1;
                    break;
                case "w":
                    futurePos[1] = currentCol - 1;
                    break;
            }
        }
        if (futurePos[0] > 5 || futurePos[0] < 0 || futurePos[1] > 5 || futurePos[1] < 0)
            return null;

        return futurePos;
    }
}
