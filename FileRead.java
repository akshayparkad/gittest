import java.io.*;

class FileRead {
	
		public static void main(String args[]){
			
			File f = new File("D:/JavaOOP lecture notes");
			
			if(f.exists()){
				
				System.out.println("Yes files exists");
			}else{
				
				System.out.println("No");
			}
			
			if(f.isDirectory()){
				System.out.println("Files and folder Inside Are:");
				
				File fileobj [] = f.listFiles();
				
				for(File x : fileobj){
					
					if(x.isDirectory()){
						
						System.out.println(x.getName()+ "--> Directory");
					}else {
						System.out.println(x.getName()+ "--> File");

						}
				} 
				
			}
			
			else{
					
					System.out.println("It is a file");
				}
			}
			
		}