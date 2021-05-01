package pt.ipp.isep.dei.examples.tdd.basic.ui;

import pt.ipp.isep.dei.examples.tdd.basic.domain.Calculator;
import pt.ipp.isep.dei.examples.tdd.basic.domain.Puzzle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 4));

        Puzzle puzzle = new Puzzle();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter your puzzle instructions without delimiters (r,f,p): \n(q) for quit");
            String input = scan.next();
            if(input.toLowerCase().equals("q")) break;

            System.out.println(puzzle.printBoard(input));

        }
    }
}
