package kadai7;

public class Student {
	private int m_goal;
	private int m_numDays;
	private int m_currentTotal;
	private PartTimeJob m_job;
	
	 public Student(PartTimeJob jb) {
			this.m_job=jb;
			this.m_goal=300000;
			this.m_numDays=4;
			this.m_currentTotal=20000;
			
		 
	 }
	 
	 public void setPartTimeJob(PartTimeJob jb) {
		 this.m_job=jb;
		
		 
	 }
	 public void working() {
		 this.m_currentTotal+=m_job.getDailyWages();
	 }
	 public int getDays() {
		 return  this.m_numDays;
	 }
	 public int getCurrentTotal() {
		 return this.m_currentTotal;
 
		
	 }
	 public boolean isAchieved() {
		 boolean achive =this.m_currentTotal>=this.m_goal;
			if(achive==true)return true;
			else return false;
			
		 
	 }
}
