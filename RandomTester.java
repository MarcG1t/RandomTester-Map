import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private int x;
    private Random generator;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        generator = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void printOneRandom()
    {
        System.out.println(generator.nextInt(100));
    }
    public void printMultiRandom(int howMany){
        int count = 0;
        while(count < howMany){
            System.out.println(generator.nextInt(100));
            count++;
        }
    }
    public int throwDice(){
        int random = generator.nextInt(6);
        return random+1;
    }
    // question 6 and 7
    public String getResponse(){
        Random random = new Random();
        ArrayList<String> responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        int index = generator.nextInt(responses.size());
        return responses.get(index);
    }
    //question 8
    public int getUpToMax(int max){
        int random = generator.nextInt(max);
        return random+1;
    }
    // Question 9
    public int getInRange(int min, int max) 
    {
        int random = generator.nextInt(max-min+1);
        return random+min;
    }
}