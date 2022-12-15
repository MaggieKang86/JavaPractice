/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maggie
 */
public class Ch4_6 {
    
    public static void main(String[] args) {
        //0-2低量級
        //3-5中量級
        //6-7高量級
        //8-10過量級
        //11+危險級
        int uva = 9;
        /*if (uva >= 0 && uva <= 2){
            System.out.println("低量級");
        }else if(uva >=3 && uva <=5){
            System.out.println("中量級");
        }else if(uva >=6 && uva <=7){
            System.out.println("高量級");
        }else if(uva >=8 && uva <=10){
            System.out.println("過量級");
        }else if(uva >=11){
            System.out.println("危險級");
        }*/
        
        if (uva <= 2){
            System.out.println("低量級");
        }else if(uva <=5){
            System.out.println("中量級");
        }else if(uva <=7){
            System.out.println("高量級");
        }else if(uva <=10){
            System.out.println("過量級");
        }else if(uva >=11){
            System.out.println("危險級");
        }
        
        
    }
    
}
