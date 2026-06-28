package main;
import java.util.*;
import model.User;
class Main{
    public static void main(String[] args){
        int entry;
        ArrayList<User> users= new ArrayList<>();
        ArrayList<Workout> workouts = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("-------------------------------------------------");
            System.out.println("                GYM TRACKER                 " );
            System.out.println("-------------------------------------------------");
            System.out.println("1. login");
            System.out.println("2. register");
            System.out.println("3. help");
            System.out.println("4. exit");
            System.out.println("Enter your choice: ");
            entry=input.nextInt();
            switch(entry){
                case 1 -> System.out.println("login succesfull");
                case 2 -> System.out.println("register succesfull");
                case 3 -> System.out.println("help succesfull");
                case 4 -> System.out.println("exit succesfull");
                default -> System.out.println("enter correct number");
            }
        }while(entry!=4);
        input.close();
        users.add(new User("Lucky", "1234"));
        users.add(new User("rocky", "1434"));
        for(User user:users){
            System.out.println(user.getUsername());
        }
        workouts.add(new Workout("Bench press",60,3,10,"27-06-2026","felt strong"));
        workouts.add(new Workout("Smith squat",80,3,10,"27-06-2026","strong"));
        workouts.add(new Workout("Lat Pull downs",30,3,13,"27-06-2026","good"));
        System.out.println("-------------------------------------------------");
        System.out.println("              Workout history                     ");
        System.out.println("-------------------------------------------------");
        for(Workout workout:workouts){
            System.out.println("Exercise : " + workout.getExercise);
            System.out.println("Weight : " + workout.getWeight);
            System.out.println("Sets : " + workout.getSets);
            System.out.println("Reps : " + workout.getReps);
            System.out.println("Date : " + workout.getDate);
            System.out.println("Notes : " + workout.getNotes);
            
        }
    }
}