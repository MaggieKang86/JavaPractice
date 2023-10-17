package com.bjpowernode.pk3;

public sealed class Shape permits Circle, Square, Rectangle{

    private Integer width;
    private Integer height;

    public void draw() {
        System.out.println("畫一個圖形 Shape");
    }


}
