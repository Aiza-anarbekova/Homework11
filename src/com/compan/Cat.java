package com.compan;

public class Cat {
  private String name;
  private   int age;
  private String color;

    Cat(){

    }
    Cat(String name,int age,String color){
       this.name=name;
       this.age=age;
       this.color=color;

    }
     String getName(){
       return name;
     }
     int getAge(){
       return age;
     }
     String getColor(){
        return color;
     }

    }

