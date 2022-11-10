import java.util.*;

class MyArrayList
 {  
        public static void main(String[] args){
			
			List <String> list = new ArrayList<String>(); 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of an input");
			
			int size = sc.nextInt();
			
			String [] arr = new String[size];
			
			for(int i=0;i<size;i++)
			{
			    arr[i]=sc.next();
            }
            /*for(String s : arr)
            {
                System.out.println(s);
            }*/
			
        
		
           // l.add(arr[i]);
			
            //String array[] = new String[l.size()];
			
			for(int i =0; i<arr.length; i++){  
			
              list.add(arr[i]);
			  
            } 
			
			
            for(String k: list)  
            { 
                System.out.println(k); 
            } 
        }
}