import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story introduction
        System.out.println("One day, Afzal was given a task by his friend Maria. She asked him to create a matrix for a school project.");
        System.out.println("Afzal, being the math enthusiast, decided to take on the challenge and write a program to input the matrix.");
        System.out.println("Let's help Afzal create the matrix!");

        // Input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();

        // Matrix creation prompt
        System.out.println("Enter the elements of the matrix (" + row + " x " + column + "):");
        int[][] arr2d = new int[row][column];

        // Populate the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2d[i][j] = scanner.nextInt();
            }
        }

        // Story continuation
        System.out.println("Afzal carefully entered all the values. Now, let's display the matrix to check if everything is correct!");

        // Print the matrix
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        // Ending the story
        System.out.println("Maria looked at the matrix and smiled. 'Great job, Afzal! You did it perfectly!'");
        scanner.close();
    }
}
