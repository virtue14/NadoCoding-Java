package chap_04;

/* 설명
    # 조건
        - 주차요금은 시간당 4000원(일일 최대 요금은 300000원)
        - 경차 또는 장애인 차량은 최종 요금에서 50% 할인(장애인 차량 기준: 직접 운전 또는 탑승 모두 포함)
    # 주차요금 예시
        - 일반 차량 5시간 주차 시 20000원
        - 경차 5시간 주차 시 10000원
        - 장애인 차량 10시간 주차 시 150000원

*/


public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;   // 주차 시간
        boolean isSmallCar = true; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000;  // 시간당 4000원

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee /= 2;   // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");


    }

}
