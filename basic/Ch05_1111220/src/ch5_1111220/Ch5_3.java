/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_1111220;

/**
 *
 * @author user
 */
public class Ch5_3 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++){
            System.out.println("Start:"+i);
            if (i == 3){
                //break; //離開迴圈
                continue; //不往下運行
            }
            System.out.println("End:"+i);
        }
        
    }
    
}
