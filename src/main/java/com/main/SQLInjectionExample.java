package com.main;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();

        String query = "SE LECT * FR OM u  ser s W HER E userna me = '" + username + "'";

        String query = "SE LECT * FR OM u sers  WHER E use rna " +
                " me = '" + username + "'";

        // query 실행 로직
    }

    private static String getUserInput() {
        // 사용자로부터 입력 받는 로직
        return "'test's";
    }
}
