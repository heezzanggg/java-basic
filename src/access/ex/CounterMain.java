package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        //최대값 지정하고 최대갑 까지만 값이 증가함
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);

    }
}
