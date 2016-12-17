package com.meizu.scorpio;

/**
 * Created by 张宏南 on 2016-11-25.
 * Project GSLBHttpCode
 * Package jetty
 */
public class Sample1 {
    public static void main(String[] args) {
        //时间和流量分配
        int a=5; //时间分钟
        int b=2;//流量分配
        double c=33.33;
        System.out.println("时间："+a*0+"  ---  "+a*1+"  ---  "+a*2+"  ---  "+a*3+"  ---  "+a*4+"  ---  "+a*5+"  ---  "+a*6+"  ---  "+a*7+"  ---  "+a*8);
        System.out.println("流量："+"--"+(c+b*1)+"---"+(c+b*2)+"----"+(c+b*3)+"---"+(c+b*4)+"---"+(c+b*5)+"---"+(c+b*6)+"---"+(c+b*7)+"---"+(c+b*8)+"---"+(c+b*9)+"---");
    }
}
