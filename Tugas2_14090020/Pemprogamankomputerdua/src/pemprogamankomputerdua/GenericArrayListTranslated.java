/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemprogamankomputerdua;

import java.util.Arrays;

/**
 *
 * @author Bakti Nw
 */
public class GenericArrayListTranslated {
    private int size;
    private Object[] elements;
    
    public GenericArrayListTranslated(){ //constructor
        elements = new Object[3]; //allocate initial capacity of 3
        size = 0;
    }
    
    public void add(Object element){
        if(size < elements.length){
            elements[size] = element;
        } else {
            //allocae large array and add the element
            System.out.print("Alocate new size of array");
            Object[] temp = Arrays.copyOf(elements, elements.length+3);
            elements = temp;
            elements[size] = element;
            System.out.println("Size : "+elements.length);
        }
        ++size;
    }
    
    public Object get(int index){
        if(index>=size)
            throw new IndexOutOfBoundsException("index : "+index + ", Size : " + size);
        return(Object)elements[index];
    }
    
    public int size(){
        return size;
    }
}
