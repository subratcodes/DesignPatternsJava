package com.subrat.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import com.subrat.Reflection.Constructors.Person;

public class main {
    
    public static void main(String[] args){

        String name= "Subrat";
            Person p=new Person("Subrat","104 C Arwali Apartments");
           Field[] result= p.getClass().getDeclaredFields();
            
           for(Field res:result)System.out.println(res.getName());
    }

    private static void getConstructors(Person p){

        Constructor<?>[] result=new Person().getClass().getDeclaredConstructors();

        for(Constructor<?> cs:result){
               Class<?>[] info=cs.getParameterTypes();
               Arrays.stream(info).forEach(a->{
                System.out.println(a.getName());
               });


            // System.out.println(cs.getParameterTypes());
        }

    }


    private static void  getInfo(Class<?> classInfo){

        HashSet<String> result=new HashSet<String>();

        recursionViaRefelection(classInfo, result);

        Iterator<String> iter=result.iterator();

        while (iter.hasNext()) {

            System.out.println(iter.next());
            
        }

    }



    private static void recursionViaRefelection(Class<?> classInfo, HashSet<String> set){

        Class<?>[] interfaces=classInfo.getInterfaces();
    
        for(Class<?> info:interfaces){
            if(set.contains(info.toString()))continue;
            set.add(info.toString());
            recursionViaRefelection(info,set);
        }


    }

}
