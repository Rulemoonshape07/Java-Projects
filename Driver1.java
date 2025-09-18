public class Driver1{

	public static void main(String[] args){ //Starting point or class

		DAC.welcomeDac();
		DBDA.welcomeDbda();
	}
}

	//BL

class DAC{ // Static : non static cannot be reffered as a static context
	// static non static cannot run hand in hand "error"
static	void welcomeDac(){
		System.out.println("Welcome DAC to Java");
	}

}
class DBDA{
static 	void welcomeDbda(){
		System.out.println("Welcome DBDA to Java");
	}
}

