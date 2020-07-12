package kadai7;

public class PartTimeJobA implements PartTimeJob {
	private int m_wage;
	private int expense;
	//private int bonus;
	PartTimeJobA(){
		 this.m_wage=20000;
		 this.expense=500;
		// this.bonus=10000;
		 
	 }
	
	@Override
	public int getDailyWages() {
		// TODO Auto-generated method stub
		 return m_wage+expense;
		
	}
public int getExpense() {
	return expense;
	
}
//public int getBonus() {
	//return bonus;
//}

}
