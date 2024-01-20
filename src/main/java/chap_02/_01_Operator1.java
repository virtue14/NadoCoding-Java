package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술연산자

        // 일반연산
        System.out.println(4 + 2);  // 실행결과: 6
        System.out.println(4 - 2);  // 실행결과: 2
        System.out.println(4 * 2);  // 실행결과: 8
        System.out.println(4 / 2);  // 실행결과: 2
        System.out.println(5 / 2);  // 실행결과: 2
        System.out.println(2 / 4);  // 실행결과: 0
        System.out.println(4 % 2);  // 실행결과: 0
        System.out.println(5 % 2);  // 실행결과: 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  // 실행결과: 6
        System.out.println((2 + 2) * 2);    // 실행결과: 8
        System.out.println(2 + (2 * 2));    // // 실행결과: 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println("c = " + c); // 실행결과: 30

        c = a - b;
        System.out.println("c = " + c); // 실행결과: 10

        c = a * b;
        System.out.println("c = " + c); // 실행결과: 30

        c = a / b;
        System.out.println("c = " + c); // 실행결과: 2

        c = a % b;
        System.out.println("c = " + c); // 실행결과: 0
        
        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println("val = " + val); // 실행결과: 10
        System.out.println("++val = " + ++val); // 실행결과: 11
        System.out.println("val = " + val); // 실행결과: 11

        val = 10;
        System.out.println("val = " + val); // 실행결과: 10
        System.out.println("val++ = " + val++); // 실행결과: 10
        System.out.println("val = " + val); // 실행결과: 11

        val = 10;
        System.out.println("val = " + val); // 실행결과: 10
        System.out.println("--val = " + --val); // 실행결과: 9
        System.out.println("val = " + val); // 실행결과: 9
        
        val = 10;
        System.out.println("val = " + val); // 실행결과: 10
        System.out.println("val-- = " + val--); // 실행결과: 10
        System.out.println("val = " + val); // 실행결과: 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++);  // 대기 인원: 0
        System.out.println("대기 인원: " + waiting++);  // 대기 인원: 1
        System.out.println("대기 인원: " + waiting++);  // 대기 인원: 2
        System.out.println("총 대기 인원: " + waiting);   // 총 대기 인원: 3

    }
}
