package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(result(args));
    }

    public static String result(String[] args) {
        if (args != null && args.length == 2 && args[0].equalsIgnoreCase("in")
                && args[1].equalsIgnoreCase("put")) {
            return "Correct args";
        } else {
            return "Incorrect args";
        }
    }
}
