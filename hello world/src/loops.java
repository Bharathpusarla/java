
public class loops {
	public static void main(String[] args) {
		int i;
		int sum =0,count=0;
		for(i=0;i<100;i++) {
			if ((i%3 == 0 )&&(i%5 ==  0)){
				sum=sum+i;
				count++;}
			if (count ==6) {
				break;
			}
		}
		System.out.println(sum);
		}
	}

