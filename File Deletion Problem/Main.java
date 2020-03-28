// import the respective packages
import java.io.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
     File file = new File("C:\\Users\\Mayank\\Desktop\\1.txt"); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("File was not deleted"); 
        } 
  }
}