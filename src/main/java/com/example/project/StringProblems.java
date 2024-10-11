package com.example.project;

public class StringProblems {
    // empty constructor
    public StringProblems() {}

    // Given a string, return true if it ends in "ly".
    public boolean endsLy(String x) {
        if (x.length() >= 2 && x.substring(x.length() - 2).equals("ly")) {
            return true;
        }
        return false;
    }

    // Given two strings, append them together and return the result. If the concatenation creates a double-char, omit one of the chars.
    public String conCat(String s1, String s2) {
        if (s1.length() > 0 && s2.length() > 0 && s1.substring(s1.length() - 1).equals(s2.substring(0, 1))) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }

    // Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    public String deFront(String s1) {
        if (s1.length() >= 2) {
            if (s1.startsWith("ab")) {
                return s1;
            } else if (s1.startsWith("a")) {
                return "a" + s1.substring(2);
            } else if (s1.substring(1, 2).equals("b")) {
                return s1.substring(1);
            }
        }
        return s1.length() > 2 ? s1.substring(2) : "";
    }

    // Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
    public String withoutX(String s1) {
        if (s1.length() == 0) {
            return s1;
        }
        if (s1.startsWith("x")) {
            s1 = s1.substring(1);
        }
        if (s1.endsWith("x")) {
            s1 = s1.substring(0, s1.length() - 1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both, return "FizzBuzz".
    public String fizzString(String s1) {
        if (s1.startsWith("f") && s1.endsWith("b")) {
            return "FizzBuzz";
        } else if (s1.startsWith("f")) {
            return "Fizz";
        } else if (s1.endsWith("b")) {
            return "Buzz";
        }
        return s1;
    }

    // Given an int n, return the string form of the number followed by "!". If divisible by 3, return "Fizz". If divisible by 5, return "Buzz". If both, return "FizzBuzz".
    public String fizzString2(int x) {
        if (x % 15 == 0) {
            return "FizzBuzz!";
        } else if (x % 3 == 0) {
            return "Fizz!";
        } else if (x % 5 == 0) {
            return "Buzz!";
        }
        return x + "!";
    }
}
