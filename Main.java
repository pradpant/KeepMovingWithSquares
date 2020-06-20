import java.io.*;
import java.util.*;
import java.lang.Math;
//Miss You NanaJi :(
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt(); //1
        int chk=-1;
        int[] ar;
        int g=0;
        for(int i=0;i<x;i++)
        {
            int n= sc.nextInt();//4
            {
             //String[] s=new Sting[n];
                for(int j=0;j<n;j++)
                {
                    ar=new int[n];
                    ar[j]= Integer.parseInt(sc.next());
                    int f=(int)Math.sqrt(ar[j]);
                    {
                   // System.out.println(f);
                    if(f*f==ar[j])
                        {}
                    else
                        chk=0;
                    }
                }
                if(chk==0)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            //continue;
            }
        }
    }
}