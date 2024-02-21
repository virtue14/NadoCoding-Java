package chap_07.camera;

/* 설명: 자식 클래스 */
public class FactoryCam extends Camera {

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
}
