package com.codealpha;

public class App {
    public String getGreeting() {
        return "Hello from CodeAlpha DevOps Gradle Build!";
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("Build Verification Check (5 + 7): " + app.addNumbers(5, 7));
    }
}
