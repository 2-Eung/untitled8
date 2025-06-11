import java.util.Scanner;

public class Main {
    public static void run() {

        Scanner scanner = new Scanner(System.in);

        String item ="";
        int price = 0;

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 멜론소다 (1,000원)");
        System.out.println("2. 마운틴듀 (2,000원)");
        System.out.println("3. 스프라이트 (2,300원)");
        System.out.println("4. 콘트라베이스 (2,500원)");
        System.out.println("5. 씨그램 (800원)");

        System.out.print("뽑을 음료 번호를 입력하세요 : ");
        boolean bol = false;
        do {
            int inputint = scanner.nextInt();
            switch (inputint) {
                case 1 : item = "멜론소다"; price = 1000; bol = true; break;
                case 2 : item = "마운틴듀"; price = 2000; bol = true; break;
                case 3 : item = "스프라이트"; price = 2300; bol = true; break;
                case 4 : item = "콘트라베이스"; price = 2500; bol = true; break;
                case 5 : item = "씨그램"; price = 800; bol = true; break;
                default: System.out.print("다시 입력하세요 : ");
            }
        } while (bol == false);

        System.out.println("선택하신 음료는 " + item + "입니다. 금액을 넣어주세요 (정수) : ");
        boolean boll = false;
        do {
            int inputMoney = scanner.nextInt();
            int res = inputMoney - price;

            if (inputMoney == price) {
                System.out.println(item + " 가 나왔습니다. 음료를 확인해 주세요");
                boll = true;
            } else if (inputMoney > price) {
                System.out.println(item + " 가 나왔습니다. 음료와 잔돈을 확인해주세요" + res + " 원");
                boll = true;
            } else {
                System.out.println("금액이 부족합니다. 금액을 더 넣어주세요. 부족한 금액 : " + (-res));
                price = price - inputMoney;
            }
        } while (boll == false);
    }
    public static void main(String[] args) {
        run();

    }
}