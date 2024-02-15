package final1;

//final 필드 - 생성자 초기화
public class ConstructInit {
    //final 필드 사용할 경우 해당 필드는 생성자 통해서 한번만 초기화 가능
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
