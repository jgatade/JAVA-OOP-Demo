//Programmer: Jayashree Gatade
//Date: 03/06/2013
import java.util.Scanner;



public class PetInfo {

	public static Scanner input;
	
	//Method to read no. of pets
	public static Pet[] pArray(){
		System.out.println("Enter number of pets");
		input = new Scanner(System.in);
		int arraySize = input.nextInt();
		if (arraySize < 1 || arraySize > 20){
			System.out.println("Number not valid. Enter number of pets again!");
			//arraySize = input.nextInt();
		}
		 
		Pet[] petArray = new Pet[arraySize];
	//TODO://Add statements to call the method (that reads, parses and returns the array element). 
		 // Assign the values to individual elements
		  
		 for (int i=0; i <arraySize; i++){
			
			 petArray[i] = petInfo();
		
		 }
		// sortPetArray(petArray);
		 return petArray;
	}
	
	//Method to read and parse Pet info
	public static Pet petInfo(){
		System.out.println("Enter pet info, separated by commas: ");
		input = new Scanner(System.in);
		String info = input.nextLine();
		String [] tokens;
		tokens = info.split("[,]");
		//System.out.println(tokens[0]);
		Pet petElement = null;
		if (tokens[0].equalsIgnoreCase("dog")){
			Dog thisDog = new Dog();
			thisDog.setName(tokens[1]);
			thisDog.setBirthYear(Integer.parseInt(tokens[2]));
			thisDog.setNoOfTricks(Integer.parseInt(tokens[3]));
			thisDog.setSize(tokens[4].charAt(0));
		    petElement = thisDog;
		    
		    }
		else if (tokens[0].equalsIgnoreCase("Cat")){
			Cat cuteCat;
			cuteCat = new Cat();
			cuteCat.name = tokens[1];
			cuteCat.birthYear = Integer.parseInt(tokens[2]);
			cuteCat.setIndoor(Boolean.parseBoolean(tokens[3]));
			petElement = cuteCat;			
		}
		return petElement;
	}
	
		
	
	//Method to sort the petArray by name
/*public int compareTo(Pet[] pArray) {
	for (int i = 0 ; i< pArray.length; i++){
	 if (pArray[i].getName().equals(pArray[i+1].getName())){
		 return 0;
	 }
			}
	return 0;	
}*/
public static void sortPetArray(Pet [] pArray){
	int j;
	//boolean flag= true;
	int length = pArray.length;
	Pet pTemp = null;
	
	//while(flag){
		//flag = false;
		
	for(j=1; j<length; j++)
		{
		for(int x = 0; x< (length -j); x++ )	{
		int i=0;
			i= pArray[j].name.compareToIgnoreCase(pArray[j-1].name);
			if(i < 0){
				pTemp = pArray[j-1];
				pArray[j-1]= pArray[j];
				pArray[j]=pTemp;
		}
			
		}}
 
	 }


public static void printer(Pet [] nPet){
	for(int i=0;i<nPet.length; i++){
	System.out.println(nPet[i].toString()+" ,Human Years " +nPet[i].convertYears()+" ,Life Expectancy " +nPet[i].lifeExpectancy());
}}
	

public static int countDogs(Pet[] lDogs){
		int count = 0;
		
	for (int i=0;i < lDogs.length; i++){
		if(lDogs[i] instanceof Dog){
		   char s = ((Dog)lDogs[i]).getSize();	    	
	    	if(s=='L'){
		     count = count+1;}  
	    	}
			   }
	if (count >0){
	return count;}
	else{
		return -1;
	}
		
}
	
		
		
public static void main(String[] args){

 Pet [] newPet = null;
	//pArray();
	newPet=pArray();	
	sortPetArray(newPet);
	printer(newPet);
	int ldogs = countDogs(newPet);
	if (ldogs>=0){
			System.out.println("Number of Large Dogs: " +ldogs);}
			else {
				System.out.println("No Dogs");
						}
	 		}	
}

/*Enter number of pets
8
Enter pet info, separated by commas: 
dog,Titan Great Dane,2005,5,L
Enter pet info, separated by commas: 
Dog,Tuffy Terrier,2006,4,s
Enter pet info, separated by commas: 
Cat,PURR Kitten,2001,true
Enter pet info, separated by commas: 
DOG,Bernie St. Bernard,2006,5,L
Enter pet info, separated by commas: 
Cat,Zip Cat,2005,false
Enter pet info, separated by commas: 
Cat,Amber Tabby,2000,true
Enter pet info, separated by commas: 
dog,Fetch Retriever,2007,10,L
Enter pet info, separated by commas: 
Cat,Debo Cat,2004,false
Pet: Dog, Name = Titan Great Dane, birth year = 2005, # of Tricks = 5 ,size = L ,Human Years 58 ,Life Expectancy 10
Pet: Cat, Name = PURR Kitten, birth year = 2001indoor = true ,Human Years 64 ,Life Expectancy 16
Pet: Dog, Name = Bernie St. Bernard, birth year = 2006, # of Tricks = 5 ,size = L ,Human Years 51 ,Life Expectancy 10
Pet: Dog, Name = Tuffy Terrier, birth year = 2006, # of Tricks = 4 ,size = s ,Human Years 51 ,Life Expectancy 0
Pet: Cat, Name = Amber Tabby, birth year = 2000indoor = true ,Human Years 68 ,Life Expectancy 16
Pet: Dog, Name = Fetch Retriever, birth year = 2007, # of Tricks = 10 ,size = L ,Human Years 44 ,Life Expectancy 10
Pet: Cat, Name = Debo Cat, birth year = 2004indoor = false ,Human Years 52 ,Life Expectancy 4
Pet: Cat, Name = Zip Cat, birth year = 2005indoor = false ,Human Years 48 ,Life Expectancy 4
Number of Large Dogs: 3
*/

