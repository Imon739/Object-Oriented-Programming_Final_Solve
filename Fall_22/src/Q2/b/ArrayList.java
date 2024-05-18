package Q2.b;

import java.util.Arrays;
import java.util.Collections;

public class ArrayList {
    int []arr;

    public static void main(String[] args) {
        ArrayList array=new ArrayList();
        try{
            array.arr= new int[]{1, 2, 30,5};
            System.out.println(array.search(5));
        }catch (ArrayNotInitializeException e){
            System.out.println(e.getMessage());
        }catch (ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Last line");
    }
    public boolean search(int element) throws ArrayNotInitializeException,ElementNotFoundException{
        // implement the code here
        if(arr==null)
            throw new ArrayNotInitializeException();
        for(int i = 0; i< arr.length; i++){
            // implement the code here
            if(element==arr[i])
                return true;
        }
        throw new ElementNotFoundException();
        // implement the code here
    }
}
class ElementNotFoundException extends Exception{
    ElementNotFoundException(){
        super("Your element can't be found");
    }
}
class ArrayNotInitializeException extends Exception{
    ArrayNotInitializeException(){
        super("The Array is not initialized");
    }
}
