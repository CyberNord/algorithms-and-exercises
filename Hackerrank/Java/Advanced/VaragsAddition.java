package Hackerrank.Java.Advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Add{

    private int sum;
    ArrayList<Integer> arr;

    Add(){
        this.sum = 0;
        this.arr = new ArrayList<>();
    }

    public void add(int ...adds){
        for (int x : adds){
            arr.add(x);
            sum += x;
        }
        print();
        sum = 0;
        arr = new ArrayList<>();
    }

    private void print(){
        StringBuilder sb = new StringBuilder();
        for (Integer i : arr){
            sb.append(i);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("=");
        sb.append(sum);
        System.out.println(sb.toString());
    }

}
//.


public class VaragsAddition {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
