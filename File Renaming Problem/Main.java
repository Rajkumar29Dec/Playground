// import the respective packages
import java.io.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
      File oldName = 
         new File("C:\\Users\\Siddharth\\Desktop\\java.txt"); 
        File newName =  
         new File("C:\\Users\\Siddharth\\Desktop\\GeeksforGeeks.txt"); 
  
        if (oldName.renameTo(newName))  
            System.out.println("Renamed successfully");         
        else 
            System.out.println("error");         
    } 
  }
