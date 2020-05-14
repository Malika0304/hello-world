import org.testng.annotations.Test;

public class Firstclass {

    @Test
    public void test0001() {
        System.out.println("This will be printed");
    }

    @Test
    public void test0002() {
        int myNumber = 5;

        System.out.println(myNumber);

    }

    @Test
    public void test0003() {

        String s1 = new String("Who let the dogs out?");

        String s2 = "Who who who who!";

        String s3 = s1 + s2;
        System.out.println(s3);
    }

    @Test
    public void test0004() {
        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);
    }

    @Test
    public void test0005() {

        
    }
}
