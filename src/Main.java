import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 닥터페퍼 (800원)");
        System.out.println("2. 코카콜라 (5500원)");
        System.out.println("3. 칠성사이다 (2000원)");
        System.out.println("4. 마운틴듀 (3000원)");
        System.out.println("5. 밀키스 (2110원)");

        int choice = scanner.nextInt();
        String item = "";

        switch (choice) {
            case 1:
                item = "닥터페퍼";
                break;
            case 2:
                item = "코카콜라";
                break;
            case 3:
                item = "칠성사이다";
                break;
            case 4:
                item = "마운틴듀";
                break;
            case 5:
                item = "밀키스";
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return; // 잘못선택시 아래 println 을 실행하지 않게하는 역할
        }
        System.out.println(item);
    }
}