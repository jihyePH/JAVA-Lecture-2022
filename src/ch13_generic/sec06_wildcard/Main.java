package ch13_generic.sec06_wildcard;

import java.util.Arrays;

public class Main {
	//person,Worker,Student,HighStudent모두수강가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"수강생: "+Arrays.toString(course.getStudents()));
	}
	// Student,HightStudent만 수강 가능
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+"수강생: "+Arrays.toString(course.getStudents()));
	}
	//Person,Worker만 수강 가능
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"수강생: "+Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Student> studentCourse = new Course<>("일반인 과정", 5);
		studentCourse.add(new Person("일반인"));
		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
	}

}
