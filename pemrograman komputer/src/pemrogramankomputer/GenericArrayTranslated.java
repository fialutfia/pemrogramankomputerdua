package pemrogramankomputer;


import java.util.Arrays;


public class GenericArrayListTranslated {
    private int size;
    private Object[] elements;
    
    public GenericArrayListTranslated(){
        elements = new Object[3];
        size = 0;
    }
    
    public void add(Object element){
        if(size < elements.length){
            elements[size]= element;
        } else {
            
            System.out.println("Alocatig new size of array");
            Object[]temp = Arrays.copyOf(elements, elements.length + 3);
            elements = temp;
            elements[size]= element;
            System.out.println("size:" + elements.length);
           }
           ++size;   
         }
    public Object get(int index){
        if(index >= size)
            throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
           return (Object)elements[index];
    }
    public int size(){
        return size;
    }
}
