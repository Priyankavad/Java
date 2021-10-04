public class ObjectComparisonExample  
{  
public static void main(String[] args)   
{  
//creating constructor of the Double class   
Double h = new Double(123.45555);  
//creating constructor of the Long class   
Long p = new Long(9887544);  
//invoking the equals() method   
System.out.println("Objects are not equal, hence it returns " + h.equals(p));  
System.out.println("Objects are equal, hence it returns " + h.equals(123.45555));  
}  
} 
