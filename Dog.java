//Programmer: Jayashree Gatade
//Date: 03/06/2013
public class Dog extends Pet{

	private int noOfTricks = 0;
    private char size = 's';
 
    public Dog(String name, int birthYear, int noTricks, char dSize){
        super(name, birthYear);
    	setNoOfTricks(noTricks);
    	size = dSize;
}
   public Dog(){
	      }

   public int getNoTricks(){
	   return noOfTricks;
   }

   public char getSize(){
	   return size;
   }
    
   
   public void setNoTricks(int noTricks){
	   noOfTricks = noTricks;
   }
   
   public void setSize(char setSize){
	   size = setSize;
   }
    @Override
	public int convertYears() {
		calcAge();
		int convAge = 9;
		if (age == 1){
			convAge = 9;}
		else if (age >1){
			 for (int i = 2; i <= age; i++){
				 convAge = convAge+7;
			 }
			 }
		return convAge;
		
	}

	@Override
	public int lifeExpectancy() {
	int lifeExp = 0;
	switch(size){
	case 'S': lifeExp = 16;
	case 'M':lifeExp = 12;
	case 'L': lifeExp = 10;
	}
		return lifeExp;
	}
	public int getNoOfTricks() {
		return noOfTricks;
	}
	public void setNoOfTricks(int noOfTricks) {
		this.noOfTricks = noOfTricks;
	}
	
	public String toString(){
		
		 String className = (this.getClass().getSimpleName());
		 return( "Pet: " +className+ ", Name = " +name+ ", birth year = " + birthYear+ ", # of Tricks = "+noOfTricks+" ,size = " +size);
		}

	}


