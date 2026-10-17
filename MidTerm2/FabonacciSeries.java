public class FabonacciSeries{
    //using for loop
    public int series(){
        int n=1;
        int sum=0;
        int m=0;
        int result=0;
        System.out.println(m+" "+n);

    for(int i=n;i<=8;i++){
       sum=m+n;
     // System.out.println(sum); 
      m=n;
      n=sum;
    }
    return result=sum;
    }

    public static void main(String[] args) {
        FabonacciSeries fs = new FabonacciSeries();
        System.out.println(fs.series());
    }
}