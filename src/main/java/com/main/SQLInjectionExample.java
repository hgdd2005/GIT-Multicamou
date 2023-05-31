package com.main;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();
        String query = "SELECT * FROM users WHER E username = '" + username + "'";
        // query 실행 로직
    }

    private static String getUserInput() {
        // 사용자로부터 입력 받는 로직
        return "'test's";
    }
}
