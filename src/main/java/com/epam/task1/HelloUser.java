package com.epam.task1;

class HelloUser {

    public static void main(String[] args) {
        StringBuilder userName = new StringBuilder();
        for (String arg: args) {
            userName.append(arg).append(" "); }
        System.out.println("Hello, " + userName + "!");
    }
}