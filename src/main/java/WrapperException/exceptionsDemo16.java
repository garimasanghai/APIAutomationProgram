package WrapperException;

public class exceptionsDemo16 {
    public static void main(String[] args) {
        //What will be the output
        //Prog with mutiple exceptions, which will get exe first?
        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program!");
    }
}