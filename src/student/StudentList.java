/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ralph
 */
public class StudentList {
    public static void main(String [] args){
        Students [] studentList = new Students[3];
        studentList [0] = new Students("s1","New Yorker");
        studentList [1] = new Students ("s2","Joe Momma");
        studentList [2] = new Students ("s3","Ralph S");
        for (int i = 0; i<studentList.length; i++){
        System.out.println(studentList[i].getStudentName());
        }
    }   
}
