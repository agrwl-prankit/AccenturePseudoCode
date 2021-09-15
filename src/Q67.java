public class Q67 {
    public static void main(String[] args) {
        int a=0,b=5,c=4;
        for(c=2;c<=5;c++){
            a=a+a;
            if((a+c)<(c-a)){
                b=c+b;
                a=7+a;
            }
            else break;
            a=(7+1)+c;
        }
        System.out.println(a+c);
    }
}
