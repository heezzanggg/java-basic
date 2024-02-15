package static2;

//import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println();
        DecoData.staticCall(data1);

        System.out.println();
        DecoData data3 = new DecoData();
        data3.staticCall(); //정적메소드를 인스턴스를 통해 접근하는것을 지양
        DecoData.staticCall(); //정적메소드를 클래스를 통해 접근하는것을 지향

    }
}
