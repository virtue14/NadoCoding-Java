package chap_02;

/* 설명
    - 키가 120cm 이상인 경우에만 탑승 가능
    - 상항 연산자 이용

*/
/* 실행결과
    : 키가 115cm 이므로 탑승 불가능합니다.(값이 115인 경우)
      키가 121cm 이므로 탑승 가능합니다.(값이 121인 경우)
*/
public class _Quiz_02 {
    public static void main(String[] args) {

        int limitHeight = 120;
        int height = 121;

        String result = (limitHeight <= height) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println(result);
        System.out.println("키가 " + height + "cm 이므로 " + result);


    }
}
