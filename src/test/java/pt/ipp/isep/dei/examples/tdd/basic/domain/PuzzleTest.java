package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PuzzleTest {

    /**
     * checkInputStringCaseOne: string only contains frp
     */
    @Test
    @Disabled
    public void checkInputStringCaseOne() {
        Puzzle puzzle = new Puzzle();

        String input = "ffrffprf";
        boolean actual = puzzle.checkInputString(input);
        boolean expected = true;

        assertEquals(expected, actual);

    }

    /**
     * checkInputStringCaseTwo: string contains characters other than frp
     */
    @Test
    public void checkInputStringCaseTwo() {
        Puzzle puzzle = new Puzzle();

        String input = "ffrX f.fprcv f";
        boolean actual = puzzle.checkInputString(input);
        boolean expected = false;

        assertEquals(expected, actual);

    }

    /**
     * checkInputStringCaseThree: string is null
     */
    @Test
    @Disabled
    public void checkInputStringCaseThree() {

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            String input = null;
            new Puzzle().checkInputString(input);
        });
    }


    /**
     * checkIfWithinBorderCaseOne: orientation is null, instruction is null
     */
    @Test
    public void checkIfWithinBorderCaseOne() {
        Puzzle puzzle = new Puzzle();

        String orientation = null;
        String instruction = null;
        int row = 0;
        int col = 0;
        int[] actual = puzzle.checkIfWithinBorder(orientation, row, col, instruction);
        int[] expected = null;

        assertEquals(expected, actual);

    }

    /**
     * checkIfWithinBorderCaseTwo: position (row, col) is outside the borders of the board
     */
    @Test
    public void checkIfWithinBorderCaseTwo() {
        Puzzle puzzle = new Puzzle();

        String orientation = "n";
        String instruction = "r";
        int row = 7;
        int col = 7;
        int[] actual = puzzle.checkIfWithinBorder(orientation, row, col, instruction);
        int[] expected = null;

        assertEquals(expected, actual);

    }

    /**
     * checkIfWithinBorderCaseThree: movement is possible (within the border)
     */
    @Test
    public void checkIfWithinBorderCaseThree() {
        Puzzle puzzle = new Puzzle();

        String orientation = "n";
        String instruction = "f";
        int row = 4;
        int col = 4;
        int[] actual = puzzle.checkIfWithinBorder(orientation, row, col, instruction);
        int[] expected = {3, 4};

        assertArrayEquals(expected, actual);

    }

    /**
     * checkIfWithinBorderCaseFour: movement is not possible
     */
    @Test
    public void checkIfWithinBorderCaseFour() {
        Puzzle puzzle = new Puzzle();

        String orientation = "s";
        String instruction = "f";
        int row = 5;
        int col = 4;
        int[] actual = puzzle.checkIfWithinBorder(orientation, row, col, instruction);
        int[] expected = null;

        assertEquals(expected, actual);

    }
    /*
     *//**
     * printBoardCaseOne: Translates correctly
     *//*
    @Test
    public static void printBoardCaseOne(){
        Puzzle puzzle = new Puzzle();

        String [][] input = new String[][]{
                {"-","-","X","X","-","-"},
                {"-","X","X","X","X","-"},
                {"X","X","X","X","X","X"},
                {"-","X","X","X","X","-"},
                {"-","X","-","-","X","-"},
                {"-","X","-","-","X","-"}
        };
        String expected = "| - - X X - - |\n " +
                "| - X X X X - |\n" +
                "| X X X X X X |\n" +
                "| - X X X X - |\n" +
                "| - X - - X - |\n" +
                "| - X - - X - |\n";

        int[] actual = puzzle.printBoard(input);


        assertEquals(expected, actual);

    }*/

}
