package practice.reverseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] lines = line.split(" ");
        ReverseArray.reverse(lines);
        System.out.println(Arrays.toString(lines));
    }
}
