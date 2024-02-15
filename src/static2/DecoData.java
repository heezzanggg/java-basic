package static2;

public class DecoData {

    private int instanceValue; //인스턴스(instance) 변수 =>객체 생성(new) 이후에 접근가능함
    private static int staticValue; //정적(static) 변수 => 메모리영역 중 메서드영역에 들어감. 객체생성되지 않아도 접근 가능

    public static void staticCall() {
//        instanceValue++; //static 메소드에서는 인스턴스변수 접근 불가
//        instanceMethod();//static 메소드에서는 인스턴스메소드 접근 불가
        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data){
        //static 메소드이지만 참조값이 있으므로 인스턴스 변수, 인스턴스 메소드 접근 가능
        data.instanceValue ++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
