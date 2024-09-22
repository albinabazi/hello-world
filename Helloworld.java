import java.util.Scanner;
import java.lang.Thread;

public class Helloworld{
    
    public static void main(String [] args){

        String helloWorld = "Hello world";  
        //test

        String helloWorldConvertet = helloWorld.toLowerCase();

        char startingCharacter = 97;

        String theFinalHelloWolrd = "";

        System.out.println(helloWorldConvertet.length());
        for (int i = 0; i<helloWorldConvertet.length(); i++){
            for(int j=97; j<123; j++){
                System.out.println(theFinalHelloWolrd+startingCharacter);
                if(startingCharacter == helloWorldConvertet.charAt(i)){
                    theFinalHelloWolrd = theFinalHelloWolrd + startingCharacter;
                    break;
                }
                startingCharacter++;
                if(startingCharacter > 122){
                    theFinalHelloWolrd = theFinalHelloWolrd + " ";
                }
                try{
                    Thread.sleep(150);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            startingCharacter = 97;
        }

        System.out.println("------ "+theFinalHelloWolrd+" ------");
    }
}