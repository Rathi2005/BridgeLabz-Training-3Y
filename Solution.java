import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) {
        int arr[] = {10, 25, -12, -6, 20, 20};
        int secMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]>secMax && arr[i]<max) secMax=arr[i];
        }
        System.out.println(secMax);
    }
}