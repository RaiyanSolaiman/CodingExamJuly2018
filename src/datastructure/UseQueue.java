package datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue
{

	public static void main(String[] args)
	{
		System.out.println("This is peek" +
				"");

		Queue<Integer> qp = new LinkedList<>();
		qp.add(50);
		qp.add(100);
		qp.add(25);

		Integer h = qp.peek();
		System.out.println(h);

		h = qp.peek();
		System.out.println(h);

		System.out.println(qp);


		System.out.println("This is Poll" +
				"");
		Queue<Integer> qu = new LinkedList<>();
		qu.add(50);
		qu.add(100);
		qu.add(25);

		Integer f = qu.poll();
		System.out.println(f);

		f = qu.poll();
		System.out.println(f);

		System.out.println(qu);

		System.out.println("this is poll 2" +
				"");
		Queue<Integer> qi = new LinkedList<>();
		qi.add(50);
		qi.add(100);

		Integer x = qi.poll();
		System.out.println(x);

		x = qi.poll();
		System.out.println(x);

		x = qi.poll();
		System.out.println(x);

		System.out.println(qi);


		System.out.println("This is remove" +
				"");
		Queue<Integer> qa = new LinkedList<>();
		qa.add(50);
		qa.add(100);

		Integer s = qa.remove();
		System.out.println(s);

		s = qa.remove();
		System.out.println(s);

		s = qa.remove();
		System.out.println(s);

		System.out.println(qi);


		System.out.println("This is peek on empty queue" +
				"");
		Queue<Integer> ql = new LinkedList<>();
		System.out.println(ql.peek());


		System.out.println("Same as above but using element" +
				"");
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.element());
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

}
