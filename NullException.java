
public class NullException{

	public static void main(String[] args) {
		
		String a = null;
		
		try{
			
			if(a.equals("abc"))
				System.out.println(a);
			
		}
		catch(Exception e){
			
			System.out.println(e);
			
		}

	}

}
