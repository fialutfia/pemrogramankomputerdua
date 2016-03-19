/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramankomputer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

import java.util.Queue;
import java.util.LinkedList;

import java.util.Stack;

import java.util.Iterator;


/**
 *
 * @author Fia
 */
public class CollectionDemo {
    protected List myList;
    protected Set mySet;
    protected Map myMap;
    protected Queue myQueue;
    protected Stack myStack;
    
    
    public static void main(String[]args){
        CollectionDemo collection = new CollectionDemo();
        collection.loadDemoList();
        collection.loadDemoSet();
        collection.loadDemoMap();
        collection.loadDemoQueue();
        collection.loadDemoStack();
    }
    
    public CollectionDemo(){
        this.myList = new ArrayList();
        this.mySet = new HashSet();
        this.myMap = new HashMap();
        this.myQueue = new LinkedList();
        
    }
        
    protected void loadDemoMap(){
        p("adding element to mao");
        myMap.put("key1","element 1");
        myMap.put("key2","element 2");
        myMap.put("key3","elemen 3");
        
        String element1 = (String) myMap.get("key1");
        p("access key1");
        p(element1);
        
        p("looping the elements");
        Iterator iterator = myMap.keySet().iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            Object value = myMap.get(key);
            p((String) value);
        }
        
        p("remove element");
        myMap.remove("key1");
        
        for(Object key : myMap.keySet()){
            Object value = myMap.get(key);
            p((String)value);
        }
    }
    
    protected void loadDemoQueue(){
        p("adding element to queue");
        myQueue.add("Element1");
        myQueue.add("Element2");
        myQueue.add("Element3");
        myQueue.add("Element4");
        myQueue.add("Element5");
        
        
        Iterator iterator = myQueue.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            p(element);
        }
        
        p("First element:" + (String)myQueue.element());
        
        myQueue.remove();
        
        p("Take and remove: " + myQueue.poll());
        p("Take and remove: " + myQueue.poll());
        
        myQueue.peek();
        p("take no removal" + myQueue.peek());
        
        p("after removal");
        
        for(Object object : myQueue){
            String element = (String) object;
            p(element);
        }
    }
    
    protected void loadDemoStack()
    {
        myStack.push("-1");
        myStack.push("0");
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        
        p(myStack.peek());
        
        p(myStack.pop());
        p(myStack.pop());
        p(myStack.pop());
        
        Iterator iterator = myStack.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            p(element);
        }
        for(Object object : myStack){
            String element = (String) object;
            p(element);
        }
      }
        
        protected void loadDemoSet(){
            this.p("adding item to set");
            this.mySet.add("Laptop");
            this.mySet.add("Laptop");
            this.mySet.add("Laptop");
            this.mySet.add("Monitor");
            this.mySet.add("CPU");
            this.p("adding item to set");
            this.p("set size:" + mySet.size());
            
            mySet.remove(0);
            this.p("set size:" + mySet.size());
            mySet.remove("Laptop");
            mySet.remove("Monitor");
            this.p("set size:" + mySet.size());
            p("print set before sorting");
            
             Iterator iterator = mySet.iterator();
            while(iterator.hasNext()){
                String element = (String) iterator.next();
                p(element);
            }
            
            for(Object object : mySet){
                String element = (String) object;
                p(element);
            }
        }
            protected void loadDemoList(){
                
                this.p("adding item to list");
                this.myList.add("Laptop");
                this.myList.add("Laptop");
                this.myList.add("Laptop");
                this.myList.add("CPU");
                this.mySet.add("sukirman");
                this.p("adding item to list");
                this.p("list size:" + myList.size());
                
                myList.remove(0);
                this.p("list size:" + myList.size());
                myList.remove("Laptop");
                myList.remove("Monitor");
                this.p("list size:" + myList.size());
                p("print list");
                for(int i=0;i < myList.size();i++)
                {
                    p(myList.get(i));
                }
                
                Collections.sort(myList);
                p("After sorting");
                for(int i=0;i < myList.size();i++)
                {
                    p(myList.get(i));
                }
                
            }
            private void p(Object obj){
                System.out.println((String)obj);
            }
}

