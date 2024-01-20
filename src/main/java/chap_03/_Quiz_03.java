package chap_03;

/* 설명
    # 참고
        - 주민등록번호는 13자리의 숫자로 구성
        - 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        - 입력 데이터는 -을 포함한 14자리의 문자열 형태
    # 예시
        - "901231-1234567"인 경우 901231-1까지 출력
        - "030708-4567890"인 경우 030708-4까지 출력

*/

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8));

        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2));


    }
}
