public class Q63 {
    public static void main(String[] args) {
        int a=8,b=8,c=7;
        for(c=5; c<10; c++){
            b = (b+c)+c;
            b=2+b;
        }
        for(c=4; c<7; c++){
            b = 4+a;
        }
        System.out.println(a+b);
    }
}
