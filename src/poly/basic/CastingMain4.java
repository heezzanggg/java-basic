package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; //다운캐스팅
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent(); // => 부모타입으로 객체 생성했으므로, 메모리상에 자식 타입이 존재하지 않음. 따라서 다운 캐스팅 불가
        Child child2 = (Child) parent2; //런타임 오류 -ClassCastException
        child2.childMethod(); //실행불가
    }
}
