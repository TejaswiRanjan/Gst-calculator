import java.util.Scanner;
public class Gst{
    public static void main(String []args){

        System.out.println("Welcome to GST calculator Project ");

        Scanner scan = new Scanner(System.in);

        System.out.print("enter the Numbers of product : ");

        int size = scan.nextInt();
        float arr[] = new float[size];

        for(int i = 0;i<size;i++){
            System.out.print("enter the price of " +(i+1) +" product : ");

            arr[i] = scan.nextFloat();
        }
        for(int i = 0;i<size;i++){
            System.out.print("Original price of the"+(0+i)+ "product : "+arr[i]);
            System.out.println();
        }
        for(int i = 0;i<size;i++){
            System.out.print("Gst of the "+(i+1)+" product : "+(arr[i]*0.18));
            System.out.println();
        }
        for(int i = 0;i<size;i++){
            System.out.print("Price of the "+(i+1)+" product With GST : " +((arr[i]*0.18)+(arr[i])));
            System.out.println();
        }

        float total = 0;
        for(int i = 0;i<size;i++){
            total = total + arr[i];
        }

        System.out.print("The total price of the product with out GST : "+total);
        System.out.println();
        System.out.print("The total  GST : "+(total*0.18));
        System.out.println();
        System.out.print("The total price of the product With GST : "+((total*0.18)+(total)));

        System.out.println();
        System.out.println("Thank You ");
    }

    
}