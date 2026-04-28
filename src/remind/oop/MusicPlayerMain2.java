package remind.oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data.volume++;
        data.volume--;

        if (data.isOn) {
            System.out.println("볼륨: " + data.volume);
        } else {
            System.out.println("음악플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
