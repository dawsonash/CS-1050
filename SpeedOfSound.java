public class SpeedOfSound {
    private double distance;

//constructor
public SpeedOfSound(double distance, String userInputMedium) {
    this.distance = distance;
}
//accessor 
public double getDistance(){
    return distance;
}
//mutator 
public void setDistance(double distance){
    this.distance = distance;
}

//method for air
public void SpeedInAir(double distance){
    distance = distance / 1100;
    System.out.println(distance);
}
//method for water
public void SpeedInWater(double distance){
   distance = distance / 4900;
   System.out.println(distance);
}
//method for steel
public void SpeedInSteel(double distance){
   distance = distance / 16400;
   System.out.println(distance);
}

}