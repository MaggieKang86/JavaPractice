/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Ch3_4 {
    public static void main(String[] args){
    //不滿6位數前面補空白
   /* System.out.printf("%6d%n",654321);
    System.out.printf("%6d%n",54321);
    System.out.printf("%6d%n",4321);
    System.out.printf("%6d%n",321);
    System.out.printf("%6d%n",21);
    System.out.printf("%6d%n",1);*/
   
    // 不滿4位數前面補0
    String msg = "B";
    System.out.printf("%s%04d%n",msg,1);
    System.out.printf("%s%04d%n",msg,24);
    System.out.printf("%s%04d%n",msg,135);
    System.out.printf("%s%04d%n",msg,2468);
   
    //09:04
    System.out.printf("%02d:%02d%n",9,4);
    
    //取小數會自動四捨五入;自動補位時,小數點也算一位
    System.out.printf("%6.2f%n",123.456789);
    System.out.printf("%6.2f%n",12.3456789);
    System.out.printf("%6.2f%n",1.23456789);
            
    }
}
