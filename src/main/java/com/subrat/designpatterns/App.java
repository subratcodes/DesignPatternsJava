package com.subrat.designpatterns;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

    try {
        checkTopics();

    } catch (Exception e) {
        
        System.out.println(e.toString());
        System.out.println(e.getCause());
    
    }

    }

    private  static void checkTopics() throws IOException{

        IOException e=new IOException("This is an exception");
    
    }
}
