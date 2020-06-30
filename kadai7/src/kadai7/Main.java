package kadai7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeJobA jobA=new PartTimeJobA();
		PartTimeJobB jobB=new PartTimeJobB();
		Student s=new Student(jobA);
		
		
		int workedDays=0;
		boolean isChanged=false;
		
		for(int i=0;i<100;i++) {
			s.working();
			workedDays= i+1;
			System.out.println("働いた日数"+workedDays+":現在の貯金額:" +s.getCurrentTotal());
			System.out.println("貯金額に含まれる交通費:"+s.transpotation());
			if(s.isAchieved()==true)
				break;
			if(s.getDays()==i+1) {
				s.setPartTimeJob(jobB);
				System.out.println("バイト変更");
					
			}
				
		}
		System.out.println("目標金額までにかかった日数:"+workedDays);
		System.out.println("最終的な貯金額:"+s.getCurrentTotal()+"JPY");
		

	}

}
