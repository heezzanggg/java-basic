package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("AccessData.publicMethod 호출" + publicField);
    }

    void defaultMethod(){
        System.out.println("AccessData.defaultMethod 호출" + defaultField);
    }

    private void privateMethod(){
        System.out.println("AccessData.privateMethod 호출" + privateField);
    }

    public void innerAccess(){
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
