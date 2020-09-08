/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise7;
import java.util.ArrayList;
import java.util.Scanner;        
import java.util.Collections;
import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
       
        student s[]=new student[20];
        int i;
        ArrayList studentList=new ArrayList<>();
       
        for (i=0;i<20;i++){
            System.out.println("Enter student"+(i+1)+"details");
            s[i]=new student(); 
            studentList.add(s[i]);
        }
        Collections.sort(studentList, new rollnoSort());
        
        System.out.println(studentList);
    }
   
}


class student{
    String name;
    int rollno;
    int cgpa;
   
    
    public student() {
        System.out.println("\nEnter NAME ROLLNO CGPA");
        Scanner obj=new Scanner(System.in);
        name =obj.next();
        rollno =obj.nextInt() ;
        cgpa = obj.nextInt();
    }

    @Override
    public String toString() {
        return  "rollno=" + rollno + " name=" + name + " cgpa=" + cgpa ;
    }
   
   
}


class rollnoSort implements Comparator<student>{
   
    public int compare(student s1,student s2){
     return s1.rollno-s2.rollno;   
    }
   
}

    

