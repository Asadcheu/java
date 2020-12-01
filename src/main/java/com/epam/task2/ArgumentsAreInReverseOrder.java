package com.epam.task2;

class ArgumentsAreInReverseOrder {

    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) System.out.print(args[i] + ' ');
    }
}
