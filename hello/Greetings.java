import java.util.Random;
import java.util.Scanner;
class Greetings {

    private String name;
    private String tossResponse;
    private String coint;
    Greetings() {
        hello();   
        hello2();
        tossCoin();

    }

    void hello() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hiya matey! What's your name?");
        name = sc.nextLine();
    }
    void hello2(){
        System.out.println("That's an unusual name "+name);

    }
    void tossCoin(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Anyhow, wanna play a game matey? y | n");
        tossResponse= sc.next();

        if ("y".equals(tossResponse)||"Y".equals(tossResponse)){
            System.out.println("Toss coin, ill get heads! If i win my friend ill get your soul. Else i'll give you a something special.\n type "+"\"sure\""+" || nope.");
        coint=sc.next();
            if("sure".equals(coint)){
                Random rand = new Random();
                
                int num=rand.nextInt(2);
                if(num==0){
                        System.out.println("Heads");
                        String magicWord = "\"I shall get your juicy soul!\"";

                        for (char c = 'a'; c <= 'z'; c++) {
                            System.out.println(c);  
                            
                            if(c=='c'){
                                System.out.println("Come on ");
                            }
                            if (c == 'i') {
                                System.out.println(magicWord); 
                            }
                            if(c =='s'){
                                System.out.println("Slurp*");
                            }
                        }
                    
                }
                else{
                    System.out.println("Tails.\n I shall give you. The wisdom of truth. You're goverment is only getting your money for their own good.");
                }
            }
        
        }
        else if(tossResponse.equals("n")||tossResponse.equals("N")){
            System.out.println("That's disappointing.");
        }
        else{
            System.out.println("do your kind speak some acknowledgable language?");
        }
        
        
    }

    public String getName() {
        return name;
    }

   
    
}
