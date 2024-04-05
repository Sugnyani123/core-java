
public class WithoutException {
int d=0;
try
{
	int a=45/d;//exception occured
	System.out.println("hello everyone");//will not be executed
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