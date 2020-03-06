/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author DIVYA SRI
 */
import java.util.*;
public class main {
	
public static void main(String[] args) {
	Customlist<String> l=new Customlist<String>();
	try (Scanner s = new Scanner(System.in)) {
		boolean flag=true;
		while(flag)
		{
		System.out.println("Enter your choice:\n1-add\n2-print\n3-remove\n4-fetch\n5-getsize\n6-exit");
		int i=s.nextInt();
		if(i==6) 
		{
			flag=false;
		}
		else {
		switch(i) 
		{
		case 1:System.out.println("Enter element to add");
				String p=s.next();
				l.add(p);
				break;
		case 2:System.out.println("Display elements:");
				l.print();
				break;
		case 3:System.out.println("Enter ele index to remove");
				int z=s.nextInt();
				String a=l.remove(z);
				System.out.println("Element removed="+a);
				break;
		case 4:System.out.println("Enter ele index to fetch");
				int x=s.nextInt();
				String m=l.get(x);
				System.out.println("Element fetched:"+m);
				break;
		case 5:System.out.println("The size of custom list:");
			   System.out.println("Size ="+l.size());
			   break;
		
		}
		}	
		
		}
	}
}
}
