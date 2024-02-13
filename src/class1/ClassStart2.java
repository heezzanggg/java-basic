package class1;

import java.util.Arrays;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentName = {"학생1", "학생2", "학생3", "  학생4"};
        int[] studentAge = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 80, 60};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + studentAge[i] + " 성적:" + studentGrade[i]);
        }
    }
}
