public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        String run = fb.fizzBuzz(3);
        String run1 = fb.fizzBuzz(5);
        String run2 = fb.fizzBuzz(15);
        String run3 = fb.fizzBuzz(2);
        System.out.println(run);
        System.out.println(run1);
        System.out.println(run2);
        System.out.println(run3);
    }
}