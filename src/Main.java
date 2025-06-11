import java.util.Scanner;

public class Main {

    static final String soda = "소다";
    static final String mountainDew = "마운틴듀";
    static final String sprite = "스프라이트";
    static final String contraBase = "콘트라베이스";
    static final String seeGram = "씨그램";

    static final int soda_price = 1000;
    static final int mountainDew_price = 2000;
    static final int sprite_price = 2300;
    static final int contraBase_price = 2500;
    static final int seeGram_price = 800;

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        String item ="";
        int price = 0;

        System.out.printf("=== 자판기 메뉴 ===\n");
        System.out.printf("1. %s (%d원)\n", soda, soda_price);
        System.out.printf("2. %s (%d원)\n", mountainDew, mountainDew_price);
        System.out.printf("3. %s (%d원)\n", sprite, sprite_price);
        System.out.printf("4. %s (%d원)\n", contraBase, contraBase_price);
        System.out.printf("5. %s (%d원)\n", seeGram, seeGram_price);

        System.out.print("뽑을 음료 번호를 입력하세요 : ");
        boolean bol = false;
        do {
            int inputint = scanner.nextInt();
            switch (inputint) {
                case 1 : item = soda; price = soda_price; bol = true; break;
                case 2 : item = mountainDew; price = mountainDew_price; bol = true; break;
                case 3 : item = sprite; price = sprite_price; bol = true; break;
                case 4 : item = contraBase; price = contraBase_price; bol = true; break;
                case 5 : item = seeGram; price = seeGram_price; bol = true; break;
                default: System.out.print("다시 입력하세요 : ");
            }
        } while (bol == false);

        System.out.printf("선택하신 음료 %s의 가격은 %d원 입니다. 금액을 넣어주세요 : ", item, price);
        boolean boll = false;
        do {
            int inputMoney = scanner.nextInt();
            int res = inputMoney - price;

            if (inputMoney == price) {
                System.out.println(item + " (이)가 나왔습니다. 음료를 확인해 주세요");
                boll = true;
            } else if (inputMoney > price) {
                System.out.println(item + " (이)가 나왔습니다. 음료와 잔돈을 확인해주세요 " + res + " 원");
                boll = true;
            } else {
                System.out.printf("금액이 부족합니다. 부족한 금액 : %d원. 금액을 더 넣어주세요 : " , -res);
                price = price - inputMoney;
            }
        } while (boll == false);
    }
    public static void main(String[] args) {
        run();
    }
}