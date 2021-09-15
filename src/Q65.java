public class Q65 {
    public static void main(String[] args) {
        int a=5,b=5,c=5;
        for(c=5;c<=9;c++){
            b=b+5;
            if((c+b)>(b-c));
            else {
                break;
            }
            b = (a+c)+b;
        }
        System.out.println(a+b);
    }
}
