import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
//______________________________________________Employee

//making 3 instances of unique employees
Employee Sarah = new Employee("Sarah", 12994, "Human Resources", "Director");
Employee John = new Employee("John", 12933, "Engineer", "Junior");
Employee Sean = new Employee("Sean", 1, "Executive", "CEO");

//calling the method i made in the employee class to display the attributes for each instance
Sean.getEmployeeInfo();
Sarah.getEmployeeInfo();
John.getEmployeeInfo();

//______________________________________________Temperature

//getting temp from user and assigning it to ftemp variable
System.out.println("Enter your temperature in degrees Fahrenheit: ");
Scanner scanner = new Scanner(System.in);
double ftemp = scanner.nextDouble();

//creating an instance of Temperature class, using our passing in ftemp variable for parameters
Temperature zz = new Temperature(ftemp);

//prints the get method I made in the class file
System.out.println(zz.getFahrenheit() + "Fahrenheit");
System.out.println(zz.getCelsius()+ "Celsius");
System.out.println(zz.getKelvin() + "Kelvin");


//_______________________________________________Speed of Sound
//gets input from user, stores it in mediumInstance variable
Scanner userInputMedium = new Scanner(System.in);
System.out.println("Please type in your medium: air, water, or steel.");
String mediumInstance = userInputMedium.nextLine();

//gets input from user, stores it in distanceInstance
Scanner distance = new Scanner(System.in);
System.out.println("Type your distance: "); 
double distanceInstance = distance.nextDouble();

//creates an instance of our SpeedOfSound class, passing in the user-made variables as parameters
SpeedOfSound s1 = new SpeedOfSound(distanceInstance, mediumInstance);

//checks what medium was entered, completes a specific method from the class file depending on medium input
if (mediumInstance.equalsIgnoreCase("air")){
    s1.SpeedInAir(distanceInstance);

 } else if (mediumInstance.equalsIgnoreCase("water")){
    s1.SpeedInWater(distanceInstance);

 } else if (mediumInstance.equalsIgnoreCase("steel")){
    s1.SpeedInSteel(distanceInstance);

 }else {
    System.out.println("Please enter one of the specified mediums.");
 }
//_________________________________________________Book Club Points 
//gets an input from the user, store it in booksPurchasedInstance
Scanner booksPurchased = new Scanner(System.in);
System.out.println("Enter the amount of books you've purchased this month (Only 1 to 4): ");
int booksPurchasedInstance = booksPurchased.nextInt();

//creates an instance of the BookClubPoints, passing in the user created variable as parameters
BookClubPoints b1 = new BookClubPoints(booksPurchasedInstance);

//calls the method made in the class file
b1.pointCalculator(booksPurchasedInstance);

//_________________________________________________Distance Traveled
//gets the user input, assign it to speed variable
Scanner scanner1 = new Scanner(System.in);
System.out.println("Enter the speed you traveled: ");
int speed = scanner1.nextInt();

//gets user input, assign it to time variable
Scanner scanner2 = new Scanner (System.in);
System.out.println("Enter the time you've traveled, in hours: ");
int time = scanner2.nextInt();

//creates an instance of the DistanceTraveled, passing in user-gathered parameters
DistanceTraveled DTInstance = new DistanceTraveled(speed, time);

//calls a method from the DistanceTraveled class, based on this instance
DTInstance.distanceTable(speed, time);

//________________________________________________Greatest & Least of these
//gets user input for inputHere variable
Scanner scanner3 = new Scanner (System.in);
System.out.println("Enter a value (or -99 to stop): ");
int inputHere = scanner3.nextInt();

//creates an instance of the GreatestandLeast class based on the new inputHere value
GreatestandLeast GandLInstance = new GreatestandLeast();
//calls the method made in the GreatestandLeast class so it will run at least once
GandLInstance.comparison(inputHere);
//while loop so the process repeats until the user inputs -99
while (inputHere != -99){
System.out.println("Enter a value (or -99 to stop): ");
inputHere = scanner3.nextInt();
GandLInstance.comparison(inputHere);
}
System.out.println("The greatest value: " + GandLInstance.getGreatest());
System.out.println("The lowest value: " + GandLInstance.getLeast());
    }
}
