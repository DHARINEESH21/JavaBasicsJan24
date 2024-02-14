package oopsSamples;



public class MNCStudent extends Student implements AttendenceInterface, ScoreInterface {
	
		public MNCStudent(String strName) {
			name = strName;
			}
		public void goToClass() {
			System.out.println("Go to class after collecting Evals,,,");
		}
		@Override
		public int calculateScore() {
			// TODO Auto-generated method stub
			return 98;
		}
		@Override
		public int calculateAtten() {
			// TODO Auto-generated method stub
			return 89;
		}
		
	
	}
	


