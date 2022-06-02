/* STUDENT ID- 991663808
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author Divyansh Thakur
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String[] sa = new String[7];// array of string for cards name
        int ia[] = new int[7];//array of integers
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.genRandomValue());
            c1.setSuits(c1.genRandomSuit());
            magicHand[i]=c1;
        }
        int c=0;
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuits() + " " + magicHand1.getValue());
            sa[c]=magicHand1.getSuits();//storing the names of cards into array of strings
            ia[c]=magicHand1.getValue();//storing the values
            c++;
        }
        System.out.println("Please choose the suit:\n1: Hearts\n2: Diamonds\n3: Spades\n4: Clubs");
        int suit = scanner.nextInt();//input
        String [] SUITS = { "hearts","diamonds","spades","clubs"};
        System.out.println("Please choose the value (1 to 12)");
        int value = scanner.nextInt();//input
        
        int count = 0;
        for (int j=0;j<7;j++) {
            if(SUITS[suit-1].equals(sa[j]) && value == ia[j])
            { 
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Great Work :)");
        }
        else
        {
            System.out.println("Sorry, no match");
        }
    }
    
}
