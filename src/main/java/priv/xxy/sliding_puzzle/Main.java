package priv.xxy.sliding_puzzle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Grid grid = new Grid(4);
        grid.setDefault();
        grid.display();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Directions(w,a,s,d):");
            String direction = input.nextLine();
            switch (direction) {
                case "w" -> grid.moveUp();
                case "s" -> grid.moveDown();
                case "a" -> grid.moveLeft();
                case "d" -> grid.moveRight();
                default -> {
                    System.out.println("Invalid input.");
                    continue;
                }
            }
            grid.display();
        }
    }
}
