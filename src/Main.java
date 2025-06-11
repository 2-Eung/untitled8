import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in 은 콘솔에서 입력받겠다.



        //scanner.nextLine(); // 실행했더니 입력을 할수있게됐고 글씨가 써졌다. 글자색은 다르다. 이부분은 어떻게보면 출력된것은 아니다.

        String str = scanner.nextLine();
        String word = scanner.next();
        int intt = scanner.nextInt();
        double doublee = scanner.nextDouble();
        char ch = scanner.next().charAt(0);


        System.out.println("문장 : " + str);      // 문자열 전체 줄단위 입력
        System.out.println("단어 : " + word );    // 공백 전까지 문자열 한 단어 입력
        System.out.println("숫자 : " + intt);     // 정수형 입력
        System.out.println("실수 : " + doublee);  // 실수형 입력
        System.out.println("문자 : " + ch);       // 첫 번째 문자만 추출 (연산자 등)

        System.out.println("프로그램 죵료");
    }
}