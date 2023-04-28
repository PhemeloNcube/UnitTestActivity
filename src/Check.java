/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Check {
    public boolean checkString (String  myString)
    {
     if(myString.contains("!") && myString.length()<=4)   
     {
        return true; 
     }
     else 
     {
         return false;
     }
     
    }
    public int sum(int a, int b)
     {
        //int sum = a+ b;
        
        //return sum;
        return (a + b);
     }
}
