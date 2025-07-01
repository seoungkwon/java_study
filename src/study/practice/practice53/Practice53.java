package study.practice.practice53;

import java.util.List;

public class Practice53 {

	public static void main(String[] args) {

		
		StudentScoreDAO ssDAO = new StudentScoreDAO();
		
		List<StudentScoreDTO> ssList = ssDAO.findStudentScoreListByDeptno(201);
		
		for(StudentScoreDTO ss : ssList) {
			System.out.println(ss);
		}
		
	}

}