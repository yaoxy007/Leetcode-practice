package Solution;

public class Q50_pow_x_n {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        if(n==0){
            return  1;
        }
        return fastPow(x,N);
    }

    private double fastPow(double x,long n){
        if(n==1){
            return x;
        }
        double half=fastPow(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
//    //brutal force
//    public double myPow(double x, int n) {
//        double tmp=x;
//        if(n!=0){
//            for(int i=0;i<Math.abs(n)-1;i++){
//                x=x*tmp;
//            }
//        }
//        if(n>1){
//            return x;
//        }
//        if(n<0){
//            return 1/x;
//        }
//        if(n==1){
//            return tmp;
//        }else{
//            return 1;
//        }
//    }
}
