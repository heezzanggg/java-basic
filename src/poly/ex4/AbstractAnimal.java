package poly.ex4;

// 추상클래스이므로 인스턴스 생성(new) 불가
public abstract class AbstractAnimal {

    //추상메서드라서 상속받는 클래스에서 오버라이딩 필수
    public abstract void sound();

    public abstract void move();
}
