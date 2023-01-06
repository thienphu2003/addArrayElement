import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng");
        int input = sc.nextInt();
        int number =0;
        int index=0;
        int[] arrayInteger= new int[input];
        for(int i=0;i<input;i++)
        {
            System.out.println("Nhập phần tử thứ  "+(i+1));
            arrayInteger[i]=sc.nextInt();
        }
        for(int j=0;j<arrayInteger.length;j++)
        {
            System.out.println(arrayInteger[j]);
        }
        System.out.println("Hãy nhập số muốn thêm vào mảng");
        number=sc.nextInt();
        System.out.println("Hãy nhập vị trí muốn thêm vào mảng");
        index=sc.nextInt();
        int[] newArray = new int[arrayInteger.length+1];
        for(int i=0;i<arrayInteger.length;i++)
        {
            newArray[i]=arrayInteger[i];
        }
        for(int j=index;j<newArray.length-1;j++)
        {
            newArray[j+1]=newArray[j];
        }
        newArray[index]=number;
        System.out.println("Mảng sau khi thêm vào là :");
        for(int i=0;i<newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }
    }
}
