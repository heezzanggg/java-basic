package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
//        data1 = 20; //compile error
        //final 지역변수2
        final int dat2 = 10;
//        data2 = 20; //compile error

        method(10);
    }

    static void method(final int parameter){
//        parameter = 20; //compile error
    }
}
