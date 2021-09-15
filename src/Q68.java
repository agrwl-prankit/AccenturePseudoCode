public class Q68 {
    public static void main(String[] args) {
        int p=3,q=5,r=10;
        if((p&q)<(5-p) || p<r){
            q=(8^10)+q;
            r=9+r;
        }
        System.out.println(p+q+r);
    }
}
