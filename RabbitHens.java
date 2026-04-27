import java.util.Scanner;
public class RabbitHens{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int legs=sc.nextInt();
        int heads=sc.nextInt();
        int rabbits=legs/2-heads;
        int hens=heads-rabbits;
        if(rabbits<0 ||hens<0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Rabbits: "+rabbits+ " Hens: "+hens);
        }
    }
}