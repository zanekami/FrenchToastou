package kadai7;

 public  class PartTimeJobB implements PartTimeJob {
	 
	 private int m_wage;
	 private int expense;
		PartTimeJobB(){
			 this.m_wage=8000;
			 this.expense=300;
			 
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


