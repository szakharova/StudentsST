package org.itstep;

public class WorkWithGroup {

	public static void main(String[] args) {
		GroupOfStudents group = new GroupOfStudents();
		group.setName("ST20");

		for (int i = 0; i < 15; i++) { // ������ �� 15 �������
			Student student = new Student(("ignatenko" + (i + 1)), ("myPass" + (i + 1)), "Alex", "Kiev");//������� ��������
			if (i > 8) {
				student = new Student(("ignatenko" + (i + 1)), ("myPass" + (i + 1)), "Alex", "Ternopil");// �����
																											// 8
			// ��� group.setCity("Ternopil")																								// ��������
																										// ������
																											// �����
			}

			group.addStudentToGroup(student); // ���������� ������ ��������

		}
		System.out.println("My best group is " + group.getName());
		System.out.println("List if students: ");

		if (!group.getStudents().isEmpty()) { // ������ ������, � ! �������� ��������
			for (Student student : group.getStudents()) {
				
				switch(student.getCity()){
				case "Kiev"://�������� �� �����
			
					break;//����� ��������
				case "Ternopil":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());
					break;
				case "Kharkiv":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());
					break;
				case "Chernivtsi":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());
					break;
				default:
					System.out.println("I don't know where I from....");
					break;
					
				}
				
				if (student.getCity().equals("Kiev")) {
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());

				}
				if (student.getCity().contains("Tern")) {
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());

				} else {
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
							+ student.getCity());
					// System.out.println("hashCode for student " +
					// student.hashCode());
					// System.out.println("hashCode for student's pass " +
					// student.getPass().hashCode());

				}
			}

		}

		for (Student student : group.getStudents()) {

			if (student.getCity().equals("Kiev")) { // equals full word("Kiev")
													// or contains with part of
													// word ("Ki")
				// System.out.println("Login: " + student.getLogin() + " Name: "
				// + student.getName() + " I'm from "
				// + student.getCity());
				// System.out.println("hashCode for student " +
				// student.hashCode());
				// System.out.println("hashCode for student's pass " +
				// student.getPass().hashCode());

			} else {
				System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " I'm from "
						+ student.getCity());
				// System.out.println("hashCode for student " +
				// student.hashCode());
				// System.out.println("hashCode for student's pass " +
				// student.getPass().hashCode());

			}
		}
	}
}
