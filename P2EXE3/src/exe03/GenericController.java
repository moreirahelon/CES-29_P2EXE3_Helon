package exe03;

public class GenericController {
	private Student _StudentModel;
	private StudentView _StudentView;
	private Professor _ProfessorModel;
	private ProfessorView _ProfessorView;
	
	public GenericController(Student model, StudentView view) {
		this._StudentModel = model;
		this._StudentView = view;
	}

	public void setStudentName(String name) {
		_StudentModel.setName(name);
	}

	public String getStudentName() {
		return _StudentModel.getName();
	}

	public void setStudentRollNo(String rollNo) {
		_StudentModel.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return _StudentModel.getRollNo();
	}

	public void updatestudentView() {
		_StudentView.printStudentDetails(_StudentModel.getName(), _StudentModel.getRollNo());
	}
	
	/*Parte que corresponde ao professor*/
	public GenericController(Professor model, ProfessorView view) {
		this._ProfessorModel = model;
		this._ProfessorView = view;
	}

	public void setProfessorName(String name) {
		_ProfessorModel.setName(name);
	}

	public String getProfessorName() {
		return _ProfessorModel.getName();
	}

	public void setProfessorRollNo(String rollNo) {
		_ProfessorModel.setRollNo(rollNo);
	}

	public String getProfessorRollNo() {
		return _ProfessorModel.getRollNo();
	}

	public void updateprofessorView() {
		_ProfessorView.printProfessorDetails(_ProfessorModel.getName(), _ProfessorModel.getRollNo());
	}
}
