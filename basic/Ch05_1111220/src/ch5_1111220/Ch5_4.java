/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_1111220;

public class Ch5_4 {
    
    public static void main(String[] args) {
        //巢狀迴圈
        for (int i = 1; i <= 9; i++){
            for ( int x = 1; x <= 9; x++){
                System.out.printf("%d * %d = %02d ",i,x,i*x);
            }
            System.out.println();
        }
    }
}
