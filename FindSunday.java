import java.util.Scanner;
public class FindSunday {
    public static int func(String day){
        if(day.equals("Monday")){
            return 6;
        }
        else if(day.equals("Tuesday")){ 
            return 5;
        }
        else if(day.equals("Wednesday")){ 
            return 4;
        }
        else if(day.equals("Thursday")){ 
            return 3;
        }
        else if(day.equals("Tuesday")){ 
            return 5;
        }
        else if(day.equals("Tuesday")){ 
            return 5;
        }
        else if(day.equals("Friday")){ 
            return 2;
        }
        else if(day.equals("Saturday")){ 
            return 1;
        }
        else if(day.equals("Sunday")){ 
            return 0;
        }
        else{
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.next();
        int date=sc.nextInt();
        int d=func(day);
        int count_sunday=0;
        for(int i=1;i<=date;i++){
            if(d%7==0){
                count_sunday++;
            }
            d++;
        }
        System.out.println(count_sunday);        
    }
}
