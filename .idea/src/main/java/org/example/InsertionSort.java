package org.example;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {

        ArrayList<Integer> v = new ArrayList<>();
        v.add(2);
        v.add(1);
        v.add(4);
        v.add(3);
        System.out.println(v.toString());
        int tam = v.size();

        int i =0;
        int aux = 0;
        int j= 0;

        for (i =1;i < v.size(); i++ ){
            aux = (int) v.get(i);
            j = i-1;
            while((j >= 0)&& (aux < (int)v.get(j))){
                v.set(j + 1, v.get(j));
                j --;
            }
            v.set(j + 1, aux);
        }
        System.out.println(v.toString());
    }
}