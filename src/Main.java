public class Main {
    public static void main(String[] args) {
        String name = " Son";
        Integer backNumber = 7;

        System.out.println((name + backNumber).getClass()); // 문자열 + 숫자 = 문자열 이 되는것을 확인
        System.out.println((name + backNumber).getClass().getName()); // 뭘 의도하신거지??
        System.out.println((backNumber).getClass().getName());
        System.out.println(((Object) backNumber).getClass().getName()); // (Object) 형변환인데 뭘로 형변환 한거지?
    }
}