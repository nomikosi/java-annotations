package se;

import java.lang.annotation.Annotation;

public class Main {


    public static void main(String[]args){

        Class clazz = TestClass.class;
        Annotation[] annotations = clazz.getAnnotations();

        for(Annotation annotation:annotations){

            if(annotation instanceof Furious){
                System.out.println("Dont play with a furious class!!");
            }

        }

    }


}