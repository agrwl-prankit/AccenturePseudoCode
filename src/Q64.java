public class Q64 {
    public static void main(String[] args) {
        int p=0,q=8,r=5;
        for(r=4; r<=6; r++){
            if((r+p)<(q-r)){
                break;
            }
            q=(p+q)+r;
            p=q+p;
        }
        System.out.println(p+q);
    }
}
