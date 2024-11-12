
public class BookClubPoints{
    private int points;
int booksPurchased;

//constructor
public BookClubPoints(int booksPurchased){
    this.booksPurchased = booksPurchased;
}
//accessor 
public int getPoints(){
    return points;
}
public int getBooksPurchsed(){
    return booksPurchased;
}
// methods into a switch statement to calculate how many points 
public void pointCalculator(int booksPurchased){
switch (booksPurchased) {
    case 0 -> {
        points = 0;
        System.out.println(points + "points");
            }
    case 1 -> {
        points = 5;
        System.out.println(points + "points");
            }
    case 2 -> {
        points = 15;
        System.out.println(points + "points");
            }
    case 3 -> {
        points = 30;
        System.out.println(points + "points");
            }
    case 4 -> {
        points = 60;
        System.out.println(points + "points");
            }
    default -> System.out.println("Enter a value 1-4");
}
}
}