package day29_Methods;

public class VoidMethodsPractice_3_3 {

    public static void main(String[] args) {

        eligibleToVote("USA", 45, false);

    }


    public static void eligibleToVote (String citizenShip, int age, boolean isAlive){
        if(citizenShip.equalsIgnoreCase("USA")){

            if(isAlive){
                if(age >=18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.err.println("You must be at least 18 years of age to vote");
                }
            }else{
                System.err.println("You must come back to life in order to vote");
            }

        }else{
            System.err.println("You must be a citizen to vote");
        }
    }
}
