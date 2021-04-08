package homework3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class homework3 {

    public static char[][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0;1)


    public static void createField() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Enter coordinates cell: ");
            cellX = scanner.nextInt() - 1;
            cellY = scanner.nextInt() - 1;
        } while (!validCell(cellY, cellX) || !emptyCell(cellY, cellX));
        field[cellY][cellX] = human;
    }

   /* public static void turnAI() { //не дописал, увы.
        int i = 0;
        int j = 0;

        for(i =0; i<field.length; i++) {
            for(j =0; j<field.length; j++){
                if(emptyCell(i,j)){    //если клетка пустая
                    if(isCellNearZero(i, j)) {  //если рядом есть ноль
                        field[i][j] = ai;
                        break;
                    }
                    else{
                       if(i ==(field.length-1) && j == (field.length-1)){ //если прошли весь массив и метод isCellNearZero() не сработал
                           int cellX;                                     //ставим ноль рандомно
                           int cellY;
                           do {
                               cellX = random.nextInt(fieldSizeX); //[0;3)
                               cellY = random.nextInt(fieldSizeY);
                           } while (!emptyCell(cellY, cellX));
                           field[cellY][cellX] = ai;
                           }
                       }
                    }
                }
            }

        }*/
   public static void turnAI() {   // логика "глупого" ai
       int cellX;
       int cellY;

       do {
           cellX = random.nextInt(fieldSizeX); //[0;3)
           cellY = random.nextInt(fieldSizeY);
       } while (!emptyCell(cellY, cellX));
       field[cellY][cellX] = ai;
   }


    public static boolean isCellNearZero(int i, int j) { //метод, проверяющий занята ли соседняя клетка нулем
        boolean result = false;
        for (int k = Math.abs(i - 1); k < field.length && k < i + 2; k = k + 1) {
            for (int m = Math.abs(j - 1); m < field.length && m < i + 2; m = m + 1) {
                if (field[k][m] == ai) {
                    result = true;
                     break;
                }
                if (field[Math.abs(k - 1)][m] == ai)
                    break;
            }
        }
            return result;

    }

    public static boolean winGame  (char player){

       boolean checkDiagonalLeft = true;
        boolean checkDiagonalRight = true;
        for (int i = 0; i < field.length; i++){  // field.length-1 в условии цикла чтобы победа засчиталась при 4 а не 5 символах
            checkDiagonalLeft = checkDiagonalLeft && field[i][i] == player;
            checkDiagonalRight = checkDiagonalRight && field[i][field.length-1-i] == player;
        }

        boolean checkLineYWinGame;
        boolean checkLineXWinGame;
        for (int i = 0; i < field.length; i++) { // field.length-1 в условии цикла чтобы победа засчиталась при 4 а не 5 символах
            checkLineYWinGame = true;
            checkLineXWinGame = true;
            for (int j = 0; j < field.length; j++) { // field.length-1 в условии цикла чтобы победа засчиталась при 4 а не 5 символах
                checkLineYWinGame = checkLineYWinGame && field[i][j] == player;
                checkLineXWinGame = checkLineXWinGame && field[j][i] == player;
            }
            if (checkLineYWinGame || checkLineXWinGame){
                return true;
            }
        }

       return  (checkDiagonalLeft || checkDiagonalRight);

       }




    public static boolean draw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSizeX && cellY >= 0 && cellY < fieldSizeY;
    }

    public static boolean emptyCell(int cellY, int cellX) {
        return field[cellY][cellX] == empty;
    }

    public static void main(String[] args) {

//        System.out.println("Я распечатал то, чтот ты ввел в консоль = " + scanner.nextLine());

        createField();
        viewField();

        while(true) {

            turnHuman();
            viewField();

            if (winGame(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }

            turnAI();
            viewField();

            if (winGame(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }
}