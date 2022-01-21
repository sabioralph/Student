/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;
import java.util.Scanner;

/**
 *
 * @author ralph
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**char [] word = new char [7];
        word [0] = 's';
        word[1] = 't';
        word[2] = 'u';
        word[3] = 'd';
        word [4] = 'e';
        word [5] ='n';
        word [6] = 't';
        for (int i = 0 ; i<word.length; i++){
            System.out.print(word[i]+" ");
        }
        System.out.println("---------");
        for(int i = word.length-1; i>=0 ; i--){
            //reverse word 
            System.out.print(word[i]+" ");
     
     * }**/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word plss");
        String word = sc.nextLine();
        char [] myLetters = new char [word.length()];
        for (int i = 0 ; i< myLetters.length ; i++){
            myLetters[i]= word.charAt(i);
            System.out.println(myLetters[i]);
        }
        
    }
    
}
