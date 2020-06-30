package kadai7;

 public  class PartTimeJobB implements PartTimeJob {
	 
	 private int m_wage;
		PartTimeJobB(){
			 this.m_wage=8000;
			 
			 
		 }
		
		@Override
		public int getDailyWages() {
			// TODO Auto-generated method stub
			return m_wage;
		}

	}


