//Programmer: Jayashree Gatade
//Date: 03/06/2013
import java.util.Calendar;
import java.util.GregorianCalendar;


public abstract class Pet {
   protected String name = "No Name";
 protected int birthYear=2000;	
 GregorianCalendar calendar = new GregorianCalendar();
 int year = calendar.get(Calendar.YEAR); 
 int age;
   
   public Pet(String nm){
	   if (nm != "Null"){
	       name = nm;}
	   else{
		   name = "No Name";	   
	   }
   }

   public Pet(int byr){
	 if (byr >1900 && byr<= year)  {
	   birthYear = byr;}
	 else{
		 birthYear=2000;
	 }}
	 
   public Pet(String pName, int bYear){	 
	 
   }
   
   public Pet(){
   }

   public String getName(){
    return name;
   }
   
   public int getBirthYear(){
	   return birthYear;
   }
 
   public void setBirthYear(int bYear){
	   birthYear = bYear;
	   
	   }
   
   public void setName(String nm){
	   name = nm;
   }
  
   public int calcAge(){
	   age = year - birthYear;
	   return age;
   }
   
   public abstract int convertYears();
   public abstract int lifeExpectancy();
 
   public String toString(){
	   String className = (this.getClass().getSimpleName());
	   return( className+ "Pet :  name=" +name+ ", birth year=" + birthYear);
   }
}
