public class Q70 {
    public static void main(String[] args) {
        int pp=7,qq=3,rr=7;
        pp=(rr+12)^qq;
        rr=(8+12)^pp;
        pp=(5&4)^pp;
        rr=(qq+pp)+rr;
        System.out.println(pp+qq+rr);
    }
}
