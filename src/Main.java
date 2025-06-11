import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static String showLivePrintDouble(String liveInput, double liveDouble ){ // 입력한 숫자를 계산식 화면에 등록
        liveInput = liveInput + " " + liveDouble;                                   // displayPrint 안에 넣으려 하니까 Double 받을때랑 char 받을때 어케 나눠야 할지 몰라서 밖으로 뺌
        return liveInput;
   }
    public static String showLivePrintChar(String liveInput, char liveChar ){   // 입력한 연산자를 계산식 화면에 등록
        liveInput = liveInput + " " + liveChar;
        return liveInput;
    }
    public static void displayPrint (String liveInput) {                        // 계산식 화면 출력
        int blank = 12;                                                         // 공백수 늘려서 입력한 값을 화면 밖으로 지워버림
        for (int i = 0; i<blank; i++){System.out.println();}
        System.out.println(liveInput);
    }
    public static double inputNumber(String liveInput, char beforeChar) {      // 숫자 잘못입력하고면 오류코드 뜨는거 말고 다시 입력은 어떻게 할까
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();                            // 변수 a를 두지않고 scanner.next().charAt(0) 을 바로 조건식에 대입하면 왜 안될까????
        if (beforeChar == '/' && a == 0){                           // 새로운 숫자를 입력할때 이전 연산자가 / 라면 0 을 받아서는 안된다.
            displayPrint(liveInput);                                // 0 을 받았다면 이전식 까먹지 않게 다시 알려준 다음에 경고문 출력
            System.out.println("0 이 아닌 수로 다시 입력하세요.");
            return inputNumber(liveInput,beforeChar);               // 다시 입력하라고 함수 재실행하게 만들어줌
        }
        return a;
    }
    public static char inputChar(String liveInput) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);                          // 변수 a를 두지않고 scanner.next().charAt(0) 을 바로 조건식에 대입하면 왜 안될까????
        if (a == '+' || a == '-' || a == '*' || a == '/') {         // 연산자 '문자' 를 입력받았을때 통과~
            return a;
        } else if (a == '=') {                                      // = 도 받아도 되니 통과~ (근데 위에거랑 합쳐도 될거같다)
            return a;
        } else {                                                              // 연산자가 아닌 '문자' 를 입력받았을때 다시 받으라고한다
            displayPrint(liveInput);                                          // if 문 빠져나와 return 으로가서 스스로를 재 실행
            System.out.println("+, -, *, /, = 중 하나로 다시 입력하세요.");
        }
        return inputChar(liveInput);                                  // else 에 return 하고 여기에 return 0; 하면 왜안될까??
    }
    public static double Calculating (double liveRes, double newDouble, char liveChar) { // 계산역할 그러나 입력된 순서대로밖에 계산 못한다
        switch (liveChar){
            case '+' : return liveRes + newDouble;
            case '-' : return liveRes - newDouble;
            case '*' : return liveRes * newDouble;
            case '/' : return liveRes / newDouble;
        }                                                       // 메인함수에서 이 함수 위에 현재 연산자가 = 이면 종료하는게 있어서 = 는 없어도 된다.
        return 0;                                               // 또 이 케이스들이 아닌값은 입력 못받게 해놓아서 default 도 필요없다.
    }


    public static void main(String[] args) {
        String liveInput = "";                                  // 화면에 출력되는 문자열 (누적 계산식) (showLivePrintDouble() 에 문자열 형식의 liveRes를 넣으면 그때그때 계산값이 출력됨)
        char liveChar = '\0';                                   // 현재 입력된 연산자 ( +일때 더하고 -일때 빼고 =일때 출력 구분역할 )
        double liveDouble = 0;                                  // 현재 입력된 숫자
        double liveRes = 0;                                     // 현재까지 계산된 값 ( liveInput 에 표기되는걸 계산한 값 )
        double newDouble = 0;                                   // 새로 계산할 숫자

        liveDouble = inputNumber(liveInput,liveChar);           // 첫 입력하는 숫자
        liveRes = liveDouble;                                   // 현재 입력된 숫자는 첫입력된 숫자 하나
        liveInput = showLivePrintDouble(liveInput,liveDouble);  // 현재 화면에 출력할 숫자는 첫 입력된 숫자 하나
        displayPrint(liveInput);                                // 화면 출력~

        while (true) {
            liveChar = inputChar(liveInput);                    // 연산자를 받아온다
            liveInput = showLivePrintChar(liveInput,liveChar);  // 받은 연산자를 화면에 띄운다
            displayPrint(liveInput);                            // 화면 출력~
            if(liveChar=='='){                                  // = 을 입력하면 계산기 종료
                System.out.println(liveRes);
                break;
            }
            newDouble = inputNumber(liveInput,liveChar);        // = 가 아니라면 연산자 이므로 새로운 숫자를 받는다
            liveInput = showLivePrintDouble(liveInput,newDouble);// 새로운 숫자도 화면에 띄운다
            displayPrint(liveInput);                             // 화면 출력~
            liveRes = Calculating(liveRes, newDouble, liveChar);  // 현재까지 계산된 값과 새로받은 숫자를 현재입력된 연산자로 계산 후 루프
        }


    }
}