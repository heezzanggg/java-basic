package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    //숫자 1 증가
    public void increment() {
        if (count > max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    // 증가한 값 반환
    public int getCount() {
        return this.count;
    }

}
