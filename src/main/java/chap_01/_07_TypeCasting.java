package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
    /* 필기
        형변환(TypeCasting)
          - 정수형에서 실수형으로
          - 실수형에서 정수형으로
    */
        /* int to float, double */
        int score = 93;
        System.out.println(score);  // 실행결과: 93
        System.out.println((float) score);  // 실행결과: 93.0
        System.out.println((double) score); // 실행결과: 93.0

        /* float, double to int */
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f);  // 실행결과: 93
        System.out.println((int) score_d);  // 실행결과: 98

        /* 정수 + 실수 연산 */
        score = 93 + (int) 98.8;    // 93 + 98
        System.out.println(score);  // 실행결과: 191

        score_d = 93 + 98.8;    // 93.0 + 98.8
        System.out.println(score_d);    // 실행결과: 191.8

        /* 변수의 형변환된 데이터 집어 넣기 */
        double convertedScoreDouble = score;
        System.out.println("convertedScoreDouble = " + convertedScoreDouble);
        /* 설명
            자동형변환: int -> long -> float -> double
        */

        int convertedScoreInt = (int) score;
        /* 설명
            수동형변환: double -> float -> long -> int
        */

        /* 숫자를 문자열로 */
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println("s1 = " + s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println("s2 = " + s2);

        /* 문자열을 숫자로 */
        int i = Integer.parseInt("93");
        System.out.println("i = " + i);

        double d = Double.parseDouble("98.8");
        System.out.println("d = " + d);

//        int error = Integer.parseInt("자바");
//        System.out.println(error);
    }
}
