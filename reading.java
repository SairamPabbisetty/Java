import java.io.DataInputStream;

class Reading
{

public static void main(String[] args)
{

DataInputStream in = new DataInputStream(System.in);

int num1;
float num2;

try
{
System.out.println("Enter integer number : ");
num1 = Integer.parseInt(in.readLine());
System.out.println("Enter float number : ");
num2 = Float.valueOf(in.readLine()).floatValue();
}
catch (Except e)
{
System.out.println(num1+" "+num2);
}

}

}