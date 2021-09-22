public class CountPunctuation   
{    
public static void main (String args[])   
{    
//Stores the count of punctuation marks    
int count = 0;    
String str = "He said, Let’s go out to dinner!” “He wouldn’t lie to me.Y.";    
for (int i = 0; i < str.length(); i++)   
{    
//Checks whether given character is punctuation mark    
if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
{    
count++;    
}    
}    
System.out.println("The number of punctuations exists in the string is: " +count);    
}    
}    
