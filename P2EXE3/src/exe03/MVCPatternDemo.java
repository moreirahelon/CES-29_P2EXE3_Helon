package exe03;
import java.lang.reflect.*;

public class MVCPatternDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// fetch student and professor record based on his roll no from the database
		Student studentmodel = retriveStudentFromDatabase();
		Professor professormodel = retriveProfessorFromDatabase();

		// Create a view : to write student details on console
		StudentView studentview = new StudentView();
		ProfessorView professorview = new ProfessorView();
		
		GenericController controller1 = new GenericController(studentmodel, studentview);
		GenericController controller2 = new GenericController(professormodel, professorview);
		
		controller1.updatestudentView();
		controller2.updateprofessorView();
		// update model data
		
		Class reflectController1 = GenericController.class;
		
		Method[] classMethods = reflectController1.getMethods();
		for(Method method : classMethods){
			if(method.getName().startsWith("setStudent")){
				controller1.setStudentName("John");
			}
			if(method.getName().startsWith("updatestudent")){
				controller1.updatestudentView();
			}
		}
		
		Class reflectController2 = GenericController.class;
		
		Method[] classMethods2 = reflectController2.getMethods();
		for(Method method : classMethods2){
			if(method.getName().startsWith("setProfessor")){
				controller1.setProfessorName("ProfessorBarretao!!");
			}
			if(method.getName().startsWith("updateprofessor")){
				controller1.updateprofessorView();
			}
		}
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

	private static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Barretao");
		professor.setRollNo("100");
		return professor;
	}
}
