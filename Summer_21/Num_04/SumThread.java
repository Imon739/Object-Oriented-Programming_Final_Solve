package Num_04;


public class SumThread extends Thread{
    int[]arr;
    int leftIndex,RightIndex,Sum=0;
    SumThread(int[] arr,int leftIndex,int rightIndex){
        this.arr=arr;
        this.leftIndex=leftIndex;
        this.RightIndex=rightIndex;
    }
    public void run(){

        for(int i=leftIndex;i<=RightIndex;i++)
            Sum+=arr[i];
    }
}
