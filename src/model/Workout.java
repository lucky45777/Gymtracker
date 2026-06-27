public class Workout{
    private String exerciseName;
    private double weight;
    private int sets;
    private int reps;
    private String date;
    private String notes;
    public Workout(String exerciseName;double weight;int sets;int reps;String date;String notes){
        this.exerciseName = exerciseName;
        this.weight=weight;
        this.sets = sets;
        this.reps = reps;
        this.date = date;
        this.notes=notes;
    }
    public String getExerciseName(){
        return exerciseName;
    }
    public double getWeight(){
        return weight;
    }
    public int getSets(){
        return sets;
    }
    public int getReps(){
        return reps;
    }
    public String getDate(){
        return date;
    }
    public String getNotes(){
        return notes;
    }
}