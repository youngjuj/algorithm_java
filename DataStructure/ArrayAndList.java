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
//        String given = "54321";
//        char[] givenArray = given.toCharArray();
//        int answer = 0;
//
//        for (char num : givenArray) {
//            answer += num - '0';
//        }
//        System.out.println(answer);

        //예제 2) 평균 구하기
        /** 강의 보기 전 **/
        String input = "3 40 80 60";
        String[] inputArray = input.split(" ");
        long answer = 0;
        long max = 0;

        for(int i = 0; i < inputArray.length; i++){
            int num = Integer.parseInt(inputArray[i]);
            if(i > 0) {
                max = max < num ? num : max;
                answer += num;
            }
        }

        System.out.printf("%.2f", (float)answer * 100 / max / (inputArray.length -1));

        /** 강의 풀이**/
        // step1) 문제 분석하기
        // 최고 점수를 기준으로 전체 점수를 다시 계산해야 하므로 모든 정수를 입력받은 후에 최고점을 별도로 저장
        // 제시한 한 과목의 점수를 계산하는 식은 총합과 관련된 식으로 변환할 수 있다. -> 한 번에 변환한 점수의 평균 구하기(점수의 총합 SUM 활용)

    }
}
