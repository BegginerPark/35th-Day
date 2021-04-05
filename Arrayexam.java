public class Arrayexam {
    public static void main(String[] args){
        // String[] weeks = new String[7];
        // weeks[0] = "월";
        // weeks[1] = "화";
        // weeks[2] = "수";
        // weeks[3] = "목";
        // weeks[4] = "금";
        // weeks[5] = "토";
        // weeks[6] = "일";

        String[] weeks = {"월","화","수","목","금","토","일"};
        System.out.println(weeks[3]); // 원하는 요일 배출
        for (int i =0; i<weeks.length; i++) {
            System.out.println(weeks[i]); // 요일들을 각각 나눈다.
        }
    }
}
