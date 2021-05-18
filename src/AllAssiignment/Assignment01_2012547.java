package AllAssiignment;

public class Assignment01_2012547 {
    public static void main(String[] args) {

        int n=20;
        double recursion;
        double  loop;
        System.out.println("Index |     Iterative |     recursive\n");
        System.out.println("---------------------------------\n");
        for (int i=0;i<=n;i++){
         loop =LoopCalling(i);

         recursion=RecursiveCalling (i);
          printf(loop,recursion,i);

        }

    }
    public static double RecursiveCalling(int i){
        if(i<=0){
            return 0f;
        }
        else if (i==1){
            return 1;
        }
        else if(i==2){
            return 3;
            }
        else if(i>2){
            if(i%2==0){
                return (Math.sqrt(RecursiveCalling(i-1)))+(Math.pow((RecursiveCalling(i-2)),1F/(i-2)));
            }
            else
                return (Math.pow(RecursiveCalling(i-1),1.000001));


        }
        else
            return -1;



    }
    public static double LoopCalling(int n) {
        for (; ; ) {
            if (n == 0) {

                return 0;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 3;
            } else if (n > 2) {
                if (n % 2 == 0) {
                    return (Math.sqrt(LoopCalling(n - 1))) + (Math.pow((LoopCalling(n - 2)), 1F / (n - 2)));
                } else
                    return (Math.pow(LoopCalling(n - 1), 1.000001));

            } else
                return -1;
        }


    }
    public static void printf (double l,double r,int index){

        System.out.printf("%d |       %.2f|              %.2f\n",index,l,r);
    }

}
