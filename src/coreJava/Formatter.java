package coreJava;

public class Formatter {
    public String formatString(String s){
       return  s.replaceAll("[^a-zA-Z0-9^]","");

    }

}
