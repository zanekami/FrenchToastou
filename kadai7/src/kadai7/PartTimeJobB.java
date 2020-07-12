package kadai7;

 public  class PartTimeJobB implements PartTimeJob {
	 
	 private int m_wage;
	 private int expense;
	 //private int bonus;
		PartTimeJobB(){
			 this.m_wage=8000;
			 this.expense=300;
			// this.bonus=5000;
			 
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

