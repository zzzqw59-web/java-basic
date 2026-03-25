package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);
        // 볼륨증가
        volumeUP(data);
        // 볼륨증가
        volumeUP(data);
        // 볼륨감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    public static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    public static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public static void volumeUP(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }

    public static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }

    public static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
