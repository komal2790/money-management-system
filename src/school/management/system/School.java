package school.management.system;
import java.util.*;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	public School(List<Teacher> teachers ,List<Student> students) {
		this.teachers=teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;

	}
}
