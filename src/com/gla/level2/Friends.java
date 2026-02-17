package com.gla.classesAndobjects.level02;
import java.util.Scanner;
class Friends{
    public static int findYoungest(int[]a){
        int m=0;
        for(int i=1;i<3;i++)if(a[i]<a[m])m=i;
        return m;
    }
    public static int findTallest(int[]h){
        int m=0;
        for(int i=1;i<3;i++)if(h[i]>h[m])m=i;
        return m;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]names={"Amar","Akbar","Anthony"};
        int[]age=new int[3];
        int[]height=new int[3];
        for(int i=0;i<3;i++)
            age[i]=sc.nextInt();
        for(int i=0;i<3;i++)
            height[i]=sc.nextInt();
        System.out.println("Youngest "+names[findYoungest(age)]);
        System.out.println("Tallest "+names[findTallest(height)]);
    }
}

