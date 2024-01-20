package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());    // 대문자 변환
        System.out.println(s.toLowerCase());    // 소문자 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("Java")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java"));  // 위치정보(7)
        System.out.println(s.indexOf("C#"));    // 포함되어 있지 않기 때문에 -1 출력
        System.out.println(s.indexOf("and"));   // 처음 일치하는 위치정보(12)
        System.out.println(s.lastIndexOf("and"));   // 마지막으로 일치하는 위치정보(23)
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true(아니면 false)
        System.out.println(s.endsWith("I like")); // 이 문자열로 끝니면 false(아니면 true)


    }
}
