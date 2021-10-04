public class DifferentOperation
{
    public static void main(String [] args)//this is main function
    {
        int a=-5,b=8,c=6;
        int d=55,e=9;
        int g=20,h=-3,i=5;
        int k=5,l=15,m=3,n=2;
        int firstOperation=a+b*c;
        int secondOperation=(d+e)%e;
        int thirdOperation=g+h*i/b;
        int forthOperation=k+l/m*n-b%m;
        System.out.println("First  Operation (-5+8*6)      =  "+firstOperation);
        System.out.println("Second Operation ((55+9)%9)    =  "+secondOperation);
        System.out.println("Third  Operation (20+(-3*5/8)) =  "+thirdOperation);
        System.out.println("Forth  Operation (5+15/3*2-8%3)=  "+forthOperation);
        /*
         This is one other way to perform same operations as above

        System.out.println("First  operation is   :"+(-5+8*6));
        System.out.println("Second operation is   :"+(55+9)%9);
        System.out.println("Third  operation is   :"+(20+(-3*5/8)));
        System.out.println("Fourth operation is   :"+(5+15/3*2-8%3));

         */

    }

}
