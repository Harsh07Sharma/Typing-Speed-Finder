import java.io.IOException;
import java.util.Scanner;
public class App{

    public static void accuracy(String sentence , String newS){
        double countChars = 0;
        double totalChars = sentence.length();
        if(sentence.length() != newS.length()){
            System.out.println("Sorry The actual and new Sentence differs in length");
            return;
        }

        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == newS.charAt(i)){
                countChars++;
            }
        }
        double percentage = (countChars/totalChars) * 100;
        System.out.println("Your total calculated accuracy is : " + percentage + " %");
    }
    public static void main(String[] args) throws  IOException{
        String sentence = "Hello Everyone My name is Harsh Sharma";
        System.out.println("Welcome to my Typing Speed Finder Application");
        System.out.println("Write the following sentence as given below\n" + sentence + "\n" );
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        String newSentence = sc.nextLine();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        double seconds = totalTime/1000;
        double words = sentence.split(" ").length;
        double wordsPerMin = (words/seconds)*60;
        System.out.println("Your Words Per Minute are : " + wordsPerMin);
        System.out.println("Your total seconds are : " + seconds);

        if(sentence.equals(newSentence)){
            System.out.println("Wonderful, Your Total calculated Accuracy is 100 %");
        }
        else{
            accuracy(sentence,newSentence);
        }
    }
}