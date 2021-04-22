package ru.geekbrains.domashnee_zadanie;

public class MyArrayDataException extends NumberFormatException {
    public int i;
    public int j;

    public MyArrayDataException(int i,int j) {
        this.i = i;
        this.j=j;
    }

    public String getMessage(int a, int b){
        System.out.printf("Illegal type in index [%d][%d]",a,b);
        return null;
    }
}
