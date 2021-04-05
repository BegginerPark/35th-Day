import java.util.ArrayList;

public class Listexam {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        
        System.out.println(pitches.get(1)); // 리스트안에 2번째에 있는 값을 출력
        System.out.println(pitches.size()); // 몇개의 리스트가 존재 하는지 확인
        System.out.println(pitches.contains("142")); // 해당 문자가 포함되어 있는지 확인 True, False 로 나옴

        System.out.println(pitches.remove("129")); // 해당 문자의 값을 제거한다. 제거가 되면 True, False 로 나옴
        System.out.println(pitches.size()); // 몇개의 리스트가 존재 하는지 확인
        System.out.println(pitches.remove(0)); // 리스트안에 1번째에 있는 값을 제거
    }
}
