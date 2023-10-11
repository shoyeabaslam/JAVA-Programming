package PracticeRecursion;

public class CountGridPath {

    public static int countPath(int right, int down, int[][] grid) {
        if (right == grid[0].length - 1 && down == grid.length - 1) {
            return 1;
        }
        if (right == grid[0].length || down == grid.length) {
            return 0;
        }
        return countPath(right + 1, down, grid) + countPath(right, down + 1, grid);
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

        System.out.println(countPath(0, 0, grid));
    }
}
