class Sample {
	// data

	// non static -> static is possible
	// but in static -> non static is not possible
	static String name = "C-DAC";

	static void display(){
		System.out.println(name);
	}
		public static void main(String []args){

		
		// if we remove static it will show main method not found
		
		Sample s = new Sample();
		s.display();
		System.out.println(s.name);

	}
}
