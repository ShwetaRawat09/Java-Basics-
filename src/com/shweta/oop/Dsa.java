package com.shweta.oop;

public class Dsa{

    int[] maxMinValueArray(int nums[]){

        if (nums.length == 0) {
            return new int[]{};
        }

        int min = nums[0];
        int max = nums[0];


        for(int i = 1; i < nums.length; i++){
                if(nums[i] < min) min = nums[i];
                if(nums[i] > max) max = nums[i]; }
            return new int[]{max, min};
        }


    public static void main(String args[]){


        Dsa d1 = new Dsa();
        int nums[] = {1,3,5,2,7};
        //maxMin
        int arr[] = d1.maxMinValueArray(nums);
        for(int i : arr){
            System.out.println(i);
        }
        //maxMin

    }

}
