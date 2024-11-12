public class GreatestandLeast{
    private int least = Integer.MAX_VALUE;
    private int greatest = Integer.MIN_VALUE;

// created a method to call in main, where we can collect multiple inputs 
public void comparison(int inputHere){

    if (inputHere > greatest){
        greatest = inputHere;
    } if (inputHere < least){
        least = inputHere;
    }

}
//getter methods to see the greatest and least values from main
public int getGreatest(){
    return greatest;
}

public int getLeast(){
    return least;
}
    }

    



