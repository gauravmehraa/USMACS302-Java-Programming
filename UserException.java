class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class UserException{
	static void validate(int age) throws InvalidAgeException{
		if(age < 18) throw new InvalidAgeException("Underage");
		if(age > 90) throw new InvalidAgeException("Overage");
	}
	public static void main(String args[]){
		int age = Integer.parseInt(args[0]);
		try{
			validate(age);
		}
		catch(InvalidAgeException e){
			System.out.println(e);
		}
	}
}