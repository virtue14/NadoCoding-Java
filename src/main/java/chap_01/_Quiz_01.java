package chap_01;

/* 설명
    - 버스 번호는 "1234", "상암08"과 같은 형태
    - 남은 시간은 분 단위
    - 남은 거리는 km 단위(예: 1.5km, 0.8km)
*/
/* 실행결과
    : 상암08번 버스
      약 3분 후 도착
      남은 거리 1.2km
*/
public class _Quiz_01 {
    public static void main(String[] args) {
        String busNum = "상암08";
        int remainTime = 3;
        float remainStreet = 1.2f;

        System.out.println(busNum + "번 버스");
        System.out.println("약 " + remainTime + "분 후 도착");
        System.out.println("남은 거리 " + remainStreet + "km");
    }
}
