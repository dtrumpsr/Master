
public class Converter {
	
	public static Integer Convert(String s)
	{
		if(isValidNumber(s))
		{
		  return new Integer(Integer.parseInt(s));
		}
		return null;
	}
	
	 static boolean isValidNumber(String value) {
			
			for (int i = 0; i < value.length(); i++) {
			    if (!Character.isDigit(value.charAt(i))) {
				return false;
			    }
			}
			return true;
		    }

}
