class InvalidCustomerException extends Exception
{
	InvalidCustomerException(String msg)
	{
		super(msg);
	}
}
class ATM
{
	void verify()throws InvalidCustomerException
	{
		throw new InvalidCustomerException("Not valid");
	}
}



public class Launch14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		try
		{
		
		ATM a=new ATM();
		a.verify();
		}
		catch(InvalidCustomerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hello last");
		
	}

}
