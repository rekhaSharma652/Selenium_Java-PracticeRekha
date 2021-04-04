
import java.util.*;  
	public class Treeset{  
	public static void main(String args[]){  
	//Creating and adding elements  
	TreeSet<String> set=new TreeSet<String>();  
	set.add("Tavi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Sjay");  
	//traversing elements  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}
	
	
	 
}
