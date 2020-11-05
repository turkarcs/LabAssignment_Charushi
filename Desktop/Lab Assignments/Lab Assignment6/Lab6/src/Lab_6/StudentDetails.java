package Lab_6;
/*
 * @author:Charushi
 * Date:05-11-2020
 * desc:Write a function which accepts the marks of students as a Hashmap and 
 * return the details of the students eligible for the medals along with type of medal. 
 * */
import java.util.*;
public class StudentDetails {

	public static void main(String[] args) {
		Map<Integer,Integer> student=new HashMap<>();
		student.put(101, 88);
		student.put(102, 99);
		student.put(103, 77);
		Map<Integer,String> medalDetails=getStudents(student);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		Map<Integer,String> medalDetails=new HashMap<>();
		for(Map.Entry<Integer, Integer> entry:student.entrySet()) {
			if(entry.getValue()>90) {
				medalDetails.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>80 && entry.getValue()<90) {
				medalDetails.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>70 && entry.getValue()<80) {
				medalDetails.put(entry.getKey(),"Bronze");
			}
			
		}
		return medalDetails;
	}

}
			