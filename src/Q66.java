public class Q66 {
    public static void main(String[] args) {
        int pp=9,qq=8,rr=8;
        for(rr=2; rr<=6;rr++){
            pp=rr+rr;
            if((pp&rr)<(qq-pp)){
                pp=(qq+10)+qq;
            }
            else {
                qq=(qq+1)+pp;
                rr=(2+3)+qq;
            }
        }
        System.out.println(pp+qq);
    }
}
