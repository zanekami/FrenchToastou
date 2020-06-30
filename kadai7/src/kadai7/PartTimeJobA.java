package kadai7;

public class PartTimeJobA implements PartTimeJob {
	private int m_wage;
	private int expense;
	PartTimeJobA(){
		 this.m_wage=20000;
		 this.expense=500;
		 
	 }
	
	@Override
	public int getDailyWages() {
		// TODO Auto-generated method stub
		return m_wage+expense;
	}
public int getExpense() {
	return expense;
	
}
}
