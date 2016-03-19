/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramankomputerdua;

import java.util.Arrays;

/**
 *
 * @author Bakti
 */
public class GenericArrayListTranslated {
    private int size;
    private Object[]elements;
    
    public GenericArrayListTranslated(){
    elements = new Object[3];
    size=0;
}
    public void add(Object element){
        if(size<elements.length){
            elements[size]=element;
        }else{
            
            System.out.println("Allocating new size of array");
            Object[]temp = Arrays.copyOf(elements,elements.length + 3);
            elements = temp;
            elements[size] = element;
            System.out.println("Size: "+elements.length);
        }
        ++size;
    }
    public Object get(int index){
        if(index>=size)
            throw new IndexOutOfBoundsException("index: "+ index+", size: "+size);
        return(Object)elements[index];
    }
    
    public int size(){
        return size;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
