package ru.geekbrains.domashnee_zadanie;

public class Main {

    public static void main(String[] args) {

        try {
            checkArray(createArray(4));
        } catch (MySizeArrayException e) {
            e.getMessage();
        } catch (MyArrayDataException e) {
            e.getMessage(e.i, e.j);
        }

    }


    public static String[][] createArray(int a) {
        String[][] array = new String[a][a];//{{"1", "2", "9", "4"}, {"2", "2", ",", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}}
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "9";
            }
        }
        return array;
    }

    public static void checkArray(String[][] array) {
        int sum = 0;
        if (array.length != 4)
            throw new MySizeArrayException();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);

                }
            }
        }

        System.out.println("The sum of all array's indexes is " + sum);
    }
}





