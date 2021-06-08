package priv.xxy.sliding_puzzle;

import java.util.Arrays;

class Grid {
    private final int size;
    private int[] position;
    private int[][] grid;

    public Grid(int size) throws Exception {
        if (size <= 0) {
            throw new Exception("The size of grid can't be less than or equal to 0.");
        }
        this.size = size;
        this.position = new int[]{size - 1, size - 1};
        this.grid = new int[this.size][this.size];
    }

    private int getX() {
        return this.position[1];
    }

    private int getY() {
        return this.position[0];
    }

    private void setX(int x) {
        this.position[1] = x;
    }

    private void setY(int y) {
        this.position[0] = y;
    }

    public void display() {
        for (int[] i : this.grid) {
            System.out.println(Arrays.toString(i));
        }
    }

    public void setDefault() {
        int counter = 1;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                grid[y][x] = counter;
                counter++;
            }
        }
        grid[this.getY()][this.getX()] = 0;
    }

    public void moveUp() {
        if (this.getY() == size - 1) {
            return;
        }
        grid[this.getY()][this.getX()] = grid[this.getY() + 1][this.getX()];
        grid[this.getY() + 1][this.getX()] = 0;
        this.setY(this.getY() + 1);
    }

    public void moveDown() {
        if (this.getY() == 0) {
            return;
        }
        grid[this.getY()][this.getX()] = grid[this.getY() - 1][this.getX()];
        grid[this.getY() - 1][this.getX()] = 0;
        this.setY(this.getY() - 1);
    }

    public void moveLeft() {
        if (this.getX() == size - 1) {
            return;
        }
        grid[this.getY()][this.getX()] = grid[this.getY()][this.getX() + 1];
        grid[this.getY()][this.getX() + 1] = 0;
        this.setX(this.getX() + 1);
    }

    public void moveRight() {
        if (this.getX() == 0) {
            return;
        }
        grid[this.getY()][this.getX()] = grid[this.getY()][this.getX() - 1];
        grid[this.getY()][this.getX() - 1] = 0;
        this.setX(this.getX() - 1);
    }
}
