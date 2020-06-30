package kadai7;

public class PartTimeJobA implements PartTimeJob {
	private int m_wage;
	PartTimeJobA(){
		 this.m_wage=20000;
		 
		 
	 }
	
	@Override
	public int getDailyWages() {
		// TODO Auto-generated method stub
		return m_wage;
	}

}
