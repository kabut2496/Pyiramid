/**
 * Karl Butler
 * 4/2/2020
 * wordPyramid
 * this program creates a word Pyramid
 */
package wordpyramid;
import javax.swing.JOptionPane;


/**
 *
 * @author Karl Butler
 */
public class WordPyramid {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //geting teh word they want to pirimidize
        String inPut = JOptionPane.showInputDialog("Enter a word");
        pyramid(inPut);
    }
    
    public static void pyramid (String word){
        //declaring variables
        int wLength;
       
       String  nWord="";
       wLength=word.length();
        //cuting down the word
        System.out.println(word);
        if(wLength==2 || wLength ==1){
            System.out.println(nWord);
           
        }else {
         nWord=word.substring(1, wLength-1);
            
        
         pyramid(nWord);
        }
    }
}
