package 디버깅;

import java.util.Scanner;

public class DebuggingEx01 {
    public static void main(String[] args) {
        //TODO배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오
        Scanner sc = new Scanner(System.in);

        //오류3. 잘못된 변수사용
        int testcase = sc.nextInt();
        //오류1. 변수 초기화 오류
        int answer = 0;
        //오류4. 자료형 범위 오류 -> 자료형은 처음부터 int가 아닌 long형으로 선언하자!
        int A[] = new int[100001];
        int S[] = new int[100001];

        //오류2. 반복문에서의 인덱스 범위 지정 오류
        for(int i = 1; i < 10000; i++){
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i - 1] + A[i];

        }

        for (int t = 1; t < testcase; t++) {
            int query = sc.nextInt();

            for (int i = 0; i < query; i++){
                int start = sc.nextInt();
                int end = sc.nextInt();

                answer += S[end] - S[start - 1];
                System.out.println(testcase + " " + answer);
            }

        }

    }
}
