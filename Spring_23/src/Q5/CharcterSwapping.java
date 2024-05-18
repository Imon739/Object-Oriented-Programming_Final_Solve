package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class CharcterSwapping {
    public static void main(String[] args) {
        ArrayList<Character>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        if(s.length()>=3)
            list.set(2,'z');
        for(char x:list)
            System.out.println(x);
    }
}
