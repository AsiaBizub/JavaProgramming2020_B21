package day29_Methods;

public class ReverseString {

    public static void main(String[] args) {

        reverse("Cybertek");

    }

        // Cybertek = ketrebyC
        public static void reverse (String word){
            String result = "";

            for ( int i = word.length()-1; i >=0; i--){// when you reverse a word, you go backwards, therefore we are using a decrement
              result +=   word.charAt(i); // addition assignment operator is used to concate the word.charAt to result.
            }
            System.out.println(result);

        }


    }