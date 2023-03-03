public class School{
	private Person[] persons = new Person[2000];
	public School(){
		
	}
	
	public void addTeacher(String name, String lastName, int age, char sex, String sub1, String sub2){
		for(int i=0; i<persons.length; i++){
			if(persons[i]==null){
				Person person = new Teacher(name, lastName, age, sex, sub1, sub2);
				persons[i]=person;
				return;
			}	
		}
	}
	public void addStudent(String name, String lastName, int age, char sex, String favGame){
		for(int i=0; i<persons.length; i++){
			if(persons[i]==null){
				Person person = new Student(name, lastName, age, sex, favGame);
				persons[i]=person;
				return;
			}		
		}
	}
	public void getPersons(){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null){
				System.out.println(persons[i]);
			}			
		}
	}
	public void getTeachers(){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null && persons[i] instanceof Teacher){
				System.out.println(persons[i]);
			}			
		}
	}
	public void getStudents(){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null && persons[i] instanceof Student){
				System.out.println(persons[i]);
			}			
		}
	}
	public void getFirstPersBySex(char sex){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null && persons[i].sex== sex){
				System.out.println( persons[i]);
				return;
			}			
		}
	}
	public void getFirstPersByLastname(String lastname){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null && persons[i].lastName.equals(lastname)){
				System.out.println( persons[i]);
				return;
			}			
		}
	}
	public void getFirstPersByBeginningOfLastName(String beginningOfLN){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null && persons[i].lastName.substring(0, beginningOfLN.length()).equals(beginningOfLN)){
				System.out.println( persons[i]);
				return;
			}			
		}
	}
	public void getFirstTeacher(){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Teacher){
				System.out.println( persons[i]);
				return;
			}
		}
	}
	public void getFirstTeacherWithSubject(String subject){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Teacher){
				if(subject.equals(((Teacher)persons[i]).getSub1()) ||subject.equals(((Teacher)persons[i]).getSub2())){
					System.out.println(persons[i]);
					return;
				}	
			}
		}
	}
	public void getFirstStudent(){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Student){
				System.out.println( persons[i]);
				return;
			}
		}
	}
	public void getFirstStudentOlderThan(int age){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Student){
				if(age>=persons[i].age){
					System.out.println( persons[i]);
					return;
				}
			}
		}
	}
	public void getFirstStudentBySex(char sex){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Student){
				if(sex == persons[i].getSex()){
					System.out.println( persons[i]);
					return;
				}
			}
		}
	}
	public void getFirstTeacherByLastname(String lastname){
		for(int i=0; i < persons.length; i++){
			if(persons[i]!=null &&  persons[i] instanceof Student){
				if(lastname == persons[i].getLastName()){
					System.out.println( persons[i]);
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		School s = new School();
		s.addTeacher("Alex" , "schmidtberger", 100 , (char)100, null, "Physik");
		s.addStudent("t", "w", 11, (char)100, "g");
		//s.getPersons();
		s.getFirstTeacherWithSubject("Mathe");
		//s.getFirstStudent();
		//s.getFirstTeacher();
	}
}
