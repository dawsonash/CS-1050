public class DistanceTraveled{
    private int speed;
    private int time;

//constructor 
    public DistanceTraveled(int speed, int time){
        this.speed = speed;
        this.time = time;
    }
//accessor getter methods
public int getSpeed(){
    return speed;
}
public int getTime(){
    return time;
}

//method to display the table with hours and distance
public void distanceTable(int speed, int time){
    for (int iterations = time; iterations > 0 ; iterations--){
    int distance = iterations * speed;
    System.out.println(iterations + " " + distance);
    }
    
} 


}