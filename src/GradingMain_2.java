//������ �迭�� ���� ������ �� �ٸ��� �� �ڿ� ������ �Ǽ��� ������
// ������ �迭�� �� ������ ������ �־���!

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
		 System.out.println(s_grade+"��");
	}

	public static void main(String[] answer) {

		//��迭
		double answer_grade[] = {10.0, 5.6, 14.4, 7.8, 12.2, 8.0, 11.4, 10.6, 15.5, 4.5};
		
		//0�� ���� �л� �̸�
		int grade[][] = { {1,2,3,4,5},
					{1,3,2,4,3,1,4,2,2,1}, //1���л�
					{1,3,2,4,2,1,4,2,2,3}, //2���л�
					{1,4,2,4,1,1,1,2,3,1}, //3���л�
					{2,3,2,1,1,3,2,2,2,1}, //4���л�
					{1,2,2,4,4,1,4,2,4,1}  //5���л�
				};
		
		if(answer.length!=10)
			System.out.println("������ ������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է� �� �ּ���");
		
		 System.out.print("�л�"+grade[0][0]+" =\t");
		 IsGrade(0,answer,grade,answer_grade);
		 
		 System.out.print("�л�"+grade[0][1]+" =\t"); 
		 IsGrade(1,answer,grade,answer_grade);
		 
		 System.out.print("�л�"+grade[0][2]+" =\t"); 
		 IsGrade(2,answer,grade,answer_grade);
		 
		 System.out.print("�л�"+grade[0][3]+" =\t"); 
		 IsGrade(3,answer,grade,answer_grade);
		 
		 System.out.print("�л�"+grade[0][4]+" =\t"); 
		 IsGrade(4,answer,grade,answer_grade);
	}

}
