class Temperature{
	// Covert a temp from celcius to fahrenheit using the formula F = (C*9/5)+32

	public static void main (String [] args){

	float C = Float.parseFloat(args[0]);

	System.out.println("Celcius to Fahrenheit Temperature is : " +((C*9/5)+32));
	} 
}