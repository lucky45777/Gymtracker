package main;
import java.util.*;
import model.User;
import model.Workout;
class Main{
    public static void addWorkout(ArrayList<Workout> workouts, Scanner input){
            input.nextLine();

            System.out.print("Exercise name: ");
            String exercise = input.nextLine();
            System.out.print("Weight: ");
            double weight = input.nextDouble();
            System.out.print("Sets: ");
            int sets = input.nextInt();
            System.out.print("Reps: ");
            int reps = input.nextInt();
            input.nextLine();
            System.out.println("Date");
            String date=input.nextLine();
            System.out.print("Notes: ");
            String notes = input.nextLine();
            Workout workout = new Workout(exercise, weight, sets, reps, date, notes);
            workouts.add(workout);
        }
    public static void viewWorkout(ArrayList<Workout> workouts, Scanner input){
        System.out.println("-------------------------------------------------");
        System.out.println("              Workout history                     ");
        System.out.println("-------------------------------------------------");
        for(Workout workout:workouts){
            System.out.println("Exercise : " + workout.getExerciseName());
            System.out.println("Weight : " + workout.getWeight());
            System.out.println("Sets : " + workout.getSets());
            System.out.println("Reps : " + workout.getReps());
            System.out.println("Date : " + workout.getDate());
            System.out.println("Notes : " + workout.getNotes());
            }            
    }
    public static void editWorkout(ArrayList<Workout> workouts, Scanner input){
        int i=1;
        for(Workout workout: workouts){
            System.out.println(i+". "+workout.getExerciseName());
            i++;
        }
        System.out.println("Enter Exercise Number to edit");
        int workoutchoice = input.nextInt();
        workoutchoice--;
        Workout workout = workouts.get(workoutchoice);
        System.out.println("1. "+workout.getExerciseName());
        System.out.println("2. "+workout.getWeight());
        System.out.println("3. "+workout.getSets());
        System.out.println("4. "+workout.getReps());
        System.out.println("5. "+workout.getDate());
        System.out.println("6. "+workout.getNotes());
        System.out.println("Enter which one to edit:");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter new Exercise name: ");
                String newName=input.nextLine();
                workout.setExerciseName(newName);
            case 2:
                System.out.println("Enter new weight: ");
                double newWeight=input.nextDouble();
                workout.setWeight(newWeight);
            case 3:
                System.out.println("Enter new number of sets: ");
                int newSets=input.nextInt();
                workout.setSets(newSets);
            case 4:
                System.out.println("Enter new number of reps: ");
                int newReps=input.nextInt();
                workout.setReps(newReps);
            case 5:
                System.out.println("Enter new Date: ");
                String newDate=input.nextLine();
                workout.setDate(newDate);
            case 6:
                System.out.println("Enter new Notes: ");
                String newNotes=input.nextLine();
                workout.setNotes(newNotes);
        }
        
    }
    public static void deleteWorkout(ArrayList<Workout> workouts, Scanner input){
        int i=1;
        for(Workout workout: workouts){
            System.out.println(i+". "+workout.getExerciseName());
            i++;
        }
        System.out.println("Enter Exercise Number to ");
        int index=input.nextInt();
        index--;
        workouts.remove(index);
        System.out.println("workout removed successfully");
    }
    public static void searchWorkout(ArrayList<Workout> workouts,Scanner input){

    }
    public static void main(String[] args){
        int entry;
        ArrayList<User> users= new ArrayList<>();
        ArrayList<Workout> workouts = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("-------------------------------------------------");
            System.out.println("                GYM TRACKER                 " );
            System.out.println("-------------------------------------------------");
            System.out.println("1. Add workout");
            System.out.println("2. View workout");
            System.out.println("3. Edit Workout");
            System.out.println("4. Delete Workout");
            System.out.println("5. Search Workout");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            entry=input.nextInt();
            switch(entry){
                case 1 -> addWorkout(workouts, input);
                case 2 -> viewWorkout(workouts, input);
                case 3 -> editWorkout(workouts,input);
                case 4 -> deleteWorkout(workouts, input);
                case 5 -> searchWorkout(workouts,input);
                case 6 -> System.out.println("Thank you for using Gym Tracker buddy Goodbye!");
                default -> System.out.println("enter correct number");
            }
        }while(entry!=6);
        input.close();
        
    }
}