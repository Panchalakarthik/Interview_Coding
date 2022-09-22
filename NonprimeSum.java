
public class NonprimeSum{

    public static void main (String []ar){
        int a[]={-4,-2};

        System.out.println(SumOfNonPrimeNumberIndexValues(a,a.length));
    }

   static int SumOfNonPrimeNumberIndexValues(int [] input1,int input2)
    {
        int k=0;
        for(int i=0;i<input2;i++)
        {  
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                
                c++;
            }
        
            if(c!=2)
            {
            k+=input1[i];
            }
        }

        return k;
        }

}
