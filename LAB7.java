import java.awt.List;
import java.io.*;
import java.util.ArrayList;

class Playlist implements Serializable{
	private String song;
	private String singer;
	private int duration;
	
	Playlist(String song, String singer,int duration){
		this.song=song;
		this.singer=singer;
		this.duration=duration;
	}
	public String getsongname(){
		return song;
	}
	public String toString(){
		return "Song = "+" "+song+","+" "+"Singer = "+" "+singer+","+"  "+"Duration = "+" "+duration;
	}
}

public class LAB7 {
	static ArrayList<Playlist> arr=new ArrayList<Playlist>();
//	public	static	void	deserialize(String dir) throws	IOException,	ClassNotFoundException {
//		ObjectInputStream	in	=	null;	
//		try	{	
//			in	=		new	ObjectInputStream	(new FileInputStream(dir));	
//			Playlist	s1	=	(Playlist)	in.readObject();	
//			System.out.println(s1);
//		}	finally	{	
//			in.close();	
//		}	
//	}

//	public static void show(String dir, int num){
//		ObjectInputStream	in	=	null;	
//		try	{	
//			in	=		new	ObjectInputStream	(new FileInputStream(dir));	
//			Playlist	s1	=	(Playlist)	in.readObject();
//			System.out.println("svbdib");
//			System.out.println(s1);
////            if(num==1){
////            	System.out.println(object2.size());
////            }else{
////            	System.out.println("employee details "+" "+s1);
////            }
//        }
//        catch(Exception e){
//        	System.out.println(0);
//        }
////		finally	{	
////			in.close();	
////		}
//	}
	public static void serialize(String dir) throws IOException{
		ObjectOutputStream out = null;	
		try	{	
			out	=	new	ObjectOutputStream	(new FileOutputStream(dir));	
			int i=0;
			while(i<arr.size()){
				out.writeObject(arr.get(i));
				i++;
			}
			}finally	{	
			out.close();	
			}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
    	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    	int choice=0;
    	
    	outer:
    	while(choice!=6){
    		 ArrayList<String> textFiles = new ArrayList<String>();
    		 File dir = new File("./src");
    		 for (File file : dir.listFiles()) {
    			 if (file.getName().endsWith((".txt"))) {
    		    	textFiles.add(file.getName());
    		    	System.out.println(file.getName());
    		    }
    		 }  
    		System.out.println("Enter the name of Playlist");
    		String s=b.readLine();
    		System.out.print("Number of songs in the playlist :- ");
    		System.out.println(arr.size());
    		
    		do{
    			
    			System.out.println("1). Add");
    			System.out.println("2). Delete");
    			System.out.println("3). Search");
    			System.out.println("4). Show");
    			System.out.println("5). Back to menu");
    			System.out.println("6). Exit");
    			choice=Integer.parseInt(b.readLine());
    			switch(choice){
    			case 1:
    				String s1=b.readLine();
    				String s2=b.readLine();
    				int s3=Integer.parseInt(b.readLine());
    				Playlist p1=new Playlist(s1,s2,s3);
//    				ObjectOutputStream out = null;	
//    				try	{	
//    					out	=	new	ObjectOutputStream	(new FileOutputStream("./src/"+s+".txt"));	
//    					out.writeObject(p1);	
//    				}	finally	{	
//    					out.close();	
//    				}
    				arr.add(p1);
    				System.out.println("Number of songs after addition---> "+arr.size());
    				break;
    			case 2:
    				System.out.print("Enter song  name to be deleted :- ");
    				String so=b.readLine();
    				int i=0,flag=0;
    				while(i<arr.size()){
    					if(so.equals(arr.get(i).getsongname())){
    						arr.remove(i);
    						flag=1;
    						break;
    					}i++;
    				}
    				if(flag==0){
    					System.out.println("Error: No such song in playlist");
    				}else{
        				System.out.println("Number of songs after deletion---> "+arr.size());
    				}
    				break;
    			case 3:
    				System.out.print("Enter song  name to be deleted :- ");
    				String so1=b.readLine();
    				int i1=0,flag1=0;
    				while(i1<arr.size()){
    					if(so1.equals(arr.get(i1).getsongname())){
    						System.out.println(arr.get(i1));
    						flag=1;
    						break;
    					}i1++;
    				}
    				if(flag1==0){
    					System.out.println("Error: No such song in playlist");
    				}
    				break;
    			case 4:
    				int j=0;
    				if(arr.size()==0){
        				System.out.println("No Song Exist");
    					break;
    				}
    				while(j<arr.size()){
    						System.out.println(arr.get(j));
    						j++;
    				}
    					
    				break;
    			
//    			default :
//    					System.out.println("Invalid grade");
    			case 5:
    				serialize("./src/"+s+".txt");
    				continue outer;
    			case 6:
    				System.exit(0);
    			}
    		}while(choice!=6);
    	}
	}

	
}
