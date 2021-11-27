import java.util.*;
public class MainActivity{
	public static void main(String []args){
		StringTokenizer notes=new StringTokenizer("Sergi\n0.5\nJose\n2.4\nErnest\n4.7\nSoraya\n5.3");
		while(notes.hasMoreTokens()){
		System.out.println("Alumne:"+notes.nextToken()+" Nota:"+notes.nextToken());
		}
	}
}

