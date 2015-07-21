import java.util.*;



 public class ListOfNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(9);
		list.add(2);
		
		System.out.println(list);
		
		
		ListIterator<Integer> iter = list.listIterator();
		
		while (iter.hasNext()) {
			int tmp = iter.next();
			if(iter.hasNext()){
				iter.remove();
				tmp += iter.next();
				iter.set(tmp);
			}
		}
		System.out.println(list);
		
	}
}
