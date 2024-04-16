
public class WithoutException {
int d=0;
try
{
	int d=0;
	try
	{
		int a=42/d;
	}
catch(ArrayIndexOutOfBoundsException ob)
{
	System.out.println("Exception is caught"+ob)
}

catch(NullPointterException ob)//exception is handled
{
	System.out.println("excetion is caught"+ob);
}
System.out.println("now it will be printed");


}

}