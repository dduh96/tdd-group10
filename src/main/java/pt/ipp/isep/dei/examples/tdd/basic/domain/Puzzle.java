package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

public class Puzzle {
    public String printBoard(String input) throws IllegalArgumentException{
        //        //mach von Matrix zu String und gib an Main
        return null;
    }

    public String[][] setBoardValues(String input) throws IllegalArgumentException{
        String [][] futurePos = new String[0][0];
        return futurePos;
    }

    public Boolean checkInputString(String string) throws IllegalArgumentException{
        return false;
    }

    public int[] checkIfWithinBorder(String orientation, int currentRow, int currentCol, String instruction) {
        int[] futurePos = {currentRow, currentCol};
        return futurePos;
    }
}
