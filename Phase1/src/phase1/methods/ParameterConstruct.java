package phase1.methods;

public class ParameterConstruct{  
    int id;  
    String name;  
    
   public ParameterConstruct(){ 
    	System.out.println("inside");
    	
        }  
     
    public ParameterConstruct(int i,String n){
	    id = i;  
	    name = n;  
    }  
 
    public void display()
    {
    	System.out.println(id+" "+name);
    }  
    
   
    public static void main(String args[]){  
    	 
    ParameterConstruct s1 = new ParameterConstruct(999,"abc");  
    ParameterConstruct s2 = new ParameterConstruct(121,"xyz");  
    

    s1.display();  
    s2.display();  
   }  
}  