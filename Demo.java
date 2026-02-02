
public class Demo {
    public static void main(String[] args) {
       int[] a = {10,2,15,30,22,5,7};
       int even = 0,odd = 0;
       for(int i = 0;i<a.length;i++){
        if(a[i] % 2==0)
            even++;                                                                                               
        else
            odd++;
        
       }
       System.out.println("Even count :"+even);

       System.out.println("Odd count :"+odd);

       
    }
}
