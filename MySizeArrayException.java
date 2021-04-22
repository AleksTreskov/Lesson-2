package ru.geekbrains.domashnee_zadanie;

public class MySizeArrayException extends IndexOutOfBoundsException {

public String getMessage(){
    System.out.println("Array should be 4 x 4 size!");
    System.exit(0);
    return null;
}
}
