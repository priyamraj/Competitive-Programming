import java.util.*;
public class Tester{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()){
			int el=it.next();
			System.out.println(el);
		}
	}
}