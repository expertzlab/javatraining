package com.expertzlab.javatraining.objects;


import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by gireeshbabu on 28/07/17.
 */
public class User {

    private String name;
    private int age;

    public User(String n, int a){
        name = n;
        age = a;
    }

    public void printUser(){
        System.out.println("Name = "+name+" age = "+age);
    }

    /*
    @Override
    public int hashCode() {
       HashCodeBuilder builder = new HashCodeBuilder();
       return builder.append(name).append(age).hashCode();
    }
    */
}

