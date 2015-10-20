package com.jose.advancedStudents;

public class TestModel {

	public static void main(String[] args) {
		TestScoresModel model = new TestScoresModel();
		System.out.println(model);
		
		System.out.println(model.size());
		System.out.println(model.currentPosition());
		System.out.println(model.currentStudent());
		
		for(int i = 1; i <= 3; i++) {
			Student s = new Student("S" + i);
			model.add(s);
		}
		System.out.println(model);
		
		System.out.println(model.first());
		
		System.out.println(model.next());
		System.out.println(model.previous());
		
		System.out.println(model.last());
		System.out.println(model.next());
		
		System.out.println(model.size());
		System.out.println(model.currentPosition());
		System.out.println(model.currentStudent());
		
		int[] grades = {99, 98, 77};
		Student newStudent = new Student("Beth", grades);
		model.replace(newStudent);
		System.out.println(model);
		
		for(int i = 6; i < 13; i++) {
			Student s = new Student("S" + i);
			System.out.println(model.add(s));
		}
		
	}
	
}
