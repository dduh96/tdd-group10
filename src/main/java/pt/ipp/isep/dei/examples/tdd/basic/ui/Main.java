package pt.ipp.isep.dei.examples.tdd.basic.ui;

import pt.ipp.isep.dei.examples.tdd.basic.domain.Calculator;
import pt.ipp.isep.dei.examples.tdd.basic.domain.Puzzle;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 4));

        Puzzle puzzle = new Puzzle();
        System.out.printf(puzzle.printBoard(""));
        //todo: SOUTen
        //todo: wenn drawBoard returns Excep -> Error message print
    }
}
