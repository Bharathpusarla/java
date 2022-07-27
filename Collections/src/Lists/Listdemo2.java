package Lists;

import java.util.ArrayList;

public class Listdemo2 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=0;i<=100; i+=10) {
		list.add(i);
	}
	System.out.println(list);
	list.add(20);
	System.out.println(list);
	list.add(4,22);
	System.out.println(list);
	list.set(4,40);
	System.out.println(list);
	
}
}
