package test;

import domain.Exercise;
public class TestResult {
    public static void main(String[] args) {
        byte N = 5;
        byte M = 5;
        System.out.println("Вы ввели N = " + N + ", M = " + M + "\nПолученый массив:\n"+Exercise.Calculate(N, M));
    }
}
