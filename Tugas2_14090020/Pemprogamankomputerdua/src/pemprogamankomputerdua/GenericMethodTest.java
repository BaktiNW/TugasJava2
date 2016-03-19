/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemprogamankomputerdua;

import java.util.ArrayList;

/**
 *
 * @author Bakti Nw
 */
public class GenericMethodTest {
    public static<E> void ArrayToArrayList(E[] arrayKu, ArrayList<E> listKu){
        for(E ea : arrayKu) listKu.add(ea); //loop array add it one by one to list
    }
    
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        Integer[] intArray = {55,66}; //autobox
        ArrayToArrayList(intArray, lst);
        GenericMethodTest.<Integer>ArrayToArrayList(intArray,lst);
        for(Integer i : lst) System.out.println(i);
        
        String[] strArray = {"one", "two", "three"};
        //GenericMethodTest.<Integer>ArrayToArrayList(strArray,lst); //error data type we defined is as Integer above
        ArrayList<String> lst2 = new ArrayList<String>();
        GenericMethodTest.<String>ArrayToArrayList(strArray,lst2);
        for(String s : lst2) System.out.println(s);
     }
}
