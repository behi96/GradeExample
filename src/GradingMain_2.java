//더블형 배열을 만들어서 점수는 다 다르게 한 뒤에 정답이 실수로 나오게
// 더블형 배열에 각 문제의 점수를 넣어줌!

public class GradingMain_2 {
	
	static void IsGrade(int sn, String answer[], int grade[][], double answer_grade[]){
		float s_grade=0;
		sn++; //1

		for(int i=1; i<=answer.length; i++){
			if(Float.parseFloat(answer[i-1]) == grade[sn][i-1]){
				System.out.print("O\t");
				s_grade+=answer_grade[i-1];
			}
			else System.out.print("X\t");
		 }
		 System.out.println(s_grade+"점");
	}

	public static void main(String[] answer) {

		//답배열
		double answer_grade[] = {10.0, 5.6, 14.4, 7.8, 12.2, 8.0, 11.4, 10.6, 15.5, 4.5};
		
		//0번 방은 학생 이름
		int grade[][] = { {1,2,3,4,5},
					{1,3,2,4,3,1,4,2,2,1}, //1번학생
					{1,3,2,4,2,1,4,2,2,3}, //2번학생
					{1,4,2,4,1,1,1,2,3,1}, //3번학생
					{2,3,2,1,1,3,2,2,2,1}, //4번학생
					{1,2,2,4,4,1,4,2,4,1}  //5번학생
				};
		
		if(answer.length!=10)
			System.out.println("정답의 개수가 올바르지 않습니다. 다시 입력 해 주세요");
		
		 System.out.print("학생"+grade[0][0]+" =\t");
		 IsGrade(0,answer,grade,answer_grade);
		 
		 System.out.print("학생"+grade[0][1]+" =\t"); 
		 IsGrade(1,answer,grade,answer_grade);
		 
		 System.out.print("학생"+grade[0][2]+" =\t"); 
		 IsGrade(2,answer,grade,answer_grade);
		 
		 System.out.print("학생"+grade[0][3]+" =\t"); 
		 IsGrade(3,answer,grade,answer_grade);
		 
		 System.out.print("학생"+grade[0][4]+" =\t"); 
		 IsGrade(4,answer,grade,answer_grade);
	}

}
