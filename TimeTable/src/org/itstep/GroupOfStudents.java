package org.itstep;

import java.util.ArrayList;

public class GroupOfStudents {
	private String name;
	private ArrayList<Student> students = new ArrayList<>();//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudentToGroup(Student student) {
		this.students.add(student);
	}

}
