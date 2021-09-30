import java.util.concurrent.ThreadLocalRandom;   
public class RandomNumber
{   
public static void main(String args[])   
{   
// Generate random integers between 0 to 999   
int h = ThreadLocalRandom.current().nextInt();   
int p = ThreadLocalRandom.current().nextInt();   
// Print random integer values  
System.out.println("Randomly Generated Integer Values:");  
System.out.println(h);   
System.out.println(p);   
// Generate Random double values  
double c = ThreadLocalRandom.current().nextDouble();   
double d = ThreadLocalRandom.current().nextDouble();   
// Print random doubles   
System.out.println("Randomly Generated Double Values:");  
System.out.println(c);   
System.out.println(d);   
// Generate random boolean values  
boolean e = ThreadLocalRandom.current().nextBoolean();   
boolean f = ThreadLocalRandom.current().nextBoolean();   
// Print random Booleans   
System.out.println("Randomly Generated Boolean Values:");  
System.out.println(e);   
System.out.println(f);   
}   
}  
