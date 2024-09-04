package DataStructure;

public class ArrayAndList {
    public static void main(String[] args) {
        //배열과 리스트
        //예제 1) 숫자의 합 구하기
        /** 강의 보기 전 **/
//        int given = 54321;
//        int answer = 0;
//
//        while(given >= 1){
//            answer += given % 10;
//            given /= 10;
//        }
//        System.out.println(answer);

        /** 강의 풀이 **/
        // 주어지는 숫자의 길이 제한이 없기 때문에 얼마나 긴 숫자가 주어질지 모른다
        // 그렇다면 int, long 불가능 -> String으로 사용하기
        // char -> int : int - '0'으로 가능
        String given = "54321";
        char[] givenArray = given.toCharArray();
        int answer = 0;

        for (char num : givenArray) {
            answer += num - '0';
        }
        System.out.println(answer);
    }
}
