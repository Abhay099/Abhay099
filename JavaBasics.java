import java.util.*;
public class JavaBasics{

  public static int Factorial(int n){
    int f = 1;
    for (int i=1;i<=n;i++ ){
        f = f*i; 
      }
        return f;

  }

  public  static int binCoff( int n , int r){
    int fact_n= Factorial(n);
    int fact_r= Factorial(r);
    int fact_nmr= Factorial(n-r);

    int binCoff = fact_n/(fact_r*fact_nmr);

    return binCoff;


  }

  public static void main (String args[] ){
     
    // int n = 4 ; 
    // Factorial(n);

    System.out.print(binCoff(5, 2));
     
    
    }
}


    