import java.util.*;
class Prime
{

public static void main(String[] args)
{

int i = 0, j = 0;
String prime = "";

Scanner sc = new Scanner(System.in);

System.out.println("Enter the starting range : ");
int start = sc.nextInt();
System.out.println("Enter the ending range : ");
int end = sc.nextInt();

for(i = start; i <= end; i++)
{
int count=0;
for(j = i; j >= 1; j--)
{
if(i%j==0)
{
count = count + 1;
}
}
if(count==2)
{
prime = prime + i + " ";
}
}
System.out.println("Prime numbers from "+start+" to "+end+" are : ");
System.out.println(prime);
}
}