package chap_05;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 설명
    # 조건
        - 신발 사이즈는 250부터 295까지 5단위로 증가
        - 신발 사이즈 수는 총 10가지
    # 주차요금 예시
        사이즈 250(재고 있음)
        사이즈 255(재고 있음)
        사이즈 260(재고 있음)
        ...
        사이즈 290(재고 있음)
        사이즈 295(재고 있음)
*/
public class _Quiz_05 {
    public static void main(String[] args) {

        int[] sizeArray = new int[10];

        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + "(재고 있음)");
        }

    }
}
