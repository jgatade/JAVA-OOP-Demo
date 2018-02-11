//Programmer: Jayashree Gatade
//Date: 03/06/2013
public class Cat extends Pet {

	
	private boolean indoor = true;
	
	
	public Cat(String name, int birthYear, boolean indore){
		super(name, birthYear);
	    indoor = indore;
	  }
	
	public Cat(){
			}
	
	public boolean getIndoor(){
	  return indoor;
	}
	
	public void setIndoor(boolean isIndoor){
		indoor = isIndoor;
	}
	
	@Override
	public int convertYears() {
		calcAge();
		int convAge = 0;
		if (age == 1){
			convAge = 15;}
		else if (age ==2){
			convAge = 24;}
		else if (age >2){
			convAge = 24;
			for (int i= 3; i <= age; i++){
				 convAge = convAge +4;
			}
		 		}
		
		return convAge;
	}

	@Override
	public int lifeExpectancy() {
		if (indoor == true){
			return 16;}
		else {
				return 4;
			}
		
	}

	public String toString(){
		
		 String className = (this.getClass().getSimpleName());
		 return("Pet: " +className+ ", Name = " +name+ ", birth year = " + birthYear+ "indoor = "+indoor);
		
	}
}
	


