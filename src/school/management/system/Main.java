package school.management.system;
import java.util.*;

public class Main {
	public static void main(String args[]){
		Teacher vandana=new Teacher(1,"Vandana Sharma", 5000);
		Teacher komal=new Teacher(2,"Komal Sharma", 5000);
		Teacher naina=new Teacher(3,"Naina Choudhary", 5000);
		Teacher shruti=new Teacher(4,"Shruti Sharma", 5000);

		List<Teacher>  Tlist=new ArrayList<>();
		Tlist.add(vandana);
		Tlist.add(komal);
		Tlist.add(naina);
		Tlist.add(shruti);

		Student saloni=new Student(1,"Saloni Kashyap", 1);
		Student namita=new Student(2,"Namita Mahajan", 3);
		Student kashish=new Student(3,"Kashish Kakkar", 4);
		Student mehak=new Student(4,"Mehak Sharma", 7);
		Student priya=new Student(5,"Priya", 8);

		List<Student> Slist=new ArrayList<>();
		Slist.add(saloni);
		Slist.add(namita);
		Slist.add(kashish);
		Slist.add(mehak);
		Slist.add(priya);

		School Hkmv=new School(Tlist, Slist);

		saloni.payFees(15000);
		namita.payFees(20000);
		System.out.println("HKMV has earned Rs. "+ Hkmv.getTotalMoneyEarned ());

		System.out.println("--paying salaries--");
		vandana.receiveSalary(vandana.getSalary());
		komal.receiveSalary(komal.getSalary());
		shruti.receiveSalary(shruti.getSalary());
		naina.receiveSalary(naina.getSalary());
		System.out.println("Hkmv has paid salaries to all teachers and now money left with" +
				"Hkmv is: "+ Hkmv.getTotalMoneyEarned());

		System.out.println(saloni);


	}
}
