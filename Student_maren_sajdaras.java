/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student_maren_sajdaras;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.ArrayList;

import java.util.*;

import javax.swing.*;


public class Student_maren_sajdaras {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String sentinel_value = "Maren";
        
        ArrayList <String> items = new ArrayList <String> ();
        
        //String counter = " ";
        
        boolean counter = false;
        
        JFrame f;
        
        while(counter == false){
           System.out.println("Enter the name you want \"Maren\" if you want to finish: " );
           // String name=JOptionPane.showInputDialog(f,"Enter Name");
           f = new JFrame();
           String a = JOptionPane.showInputDialog(f,"Enter: ");
           
           
           if(a.equals(sentinel_value)){
               System.out.println("You finished");
               counter = true;
               break;
           }
           
           
           items.add(a);
           System.out.println(a);
           System.out.println(counter);
           
           
           
           
        };
        
        
        for (int i = 0; i < items.size(); i++){
            //System.out.println(items.get(i)+" ");
            JOptionPane.showMessageDialog( null, items.get(i)+" " );
        }
        
        
        
        
        
        
       
        
        
        
        
    }
}


