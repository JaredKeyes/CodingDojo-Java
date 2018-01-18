import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava bj = new BasicJava();
        String loop = bj.loop(255);
        String oddLoop = bj.oddLoop(255);
        String sumOf = bj.sumOf(255);
        int[] arr = {-1,-2,3,-4,-5,-10};
        String iterate = bj.iterate(arr);
        String findMax = bj.findMax(arr);
        String average = bj.average(arr);
        String oddArray = bj.oddArray(255);
        String greaterThanY = bj.greaterThanY(1, arr);
        // String square = bj.square();
        System.out.println(loop);
        System.out.println(oddLoop);
        System.out.println(sumOf);
        System.out.println(iterate);
        System.out.println(findMax);
        System.out.println(average);
        System.out.println(oddArray);
        System.out.println(greaterThanY);
        // System.out.println(square);
    }
}