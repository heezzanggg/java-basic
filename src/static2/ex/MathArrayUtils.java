package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //
        // 인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int totalSum = 0;
        for (int value : values) {
            totalSum += value;
        }
        return totalSum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
