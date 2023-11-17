
public class DiffernceDigit {

	public static void show(int[] a) {
		System.out.print(a[2]+""+a[3]+"/"+a[0]+""+a[1]+" ");
		System.out.println(a[4]+""+a[5]+":"+a[6]+""+a[7]+":"+a[8]+""+a[9]);
	}
	
	public static boolean isInSet(int[] digits, int cur, int input) {
		for (int i=0; i<=cur; i++)
			if (digits[i]==input)
				return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int[] digits = new int[10];
		int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
		int cur;
		int count = 0;
		
		for (int m=1; m<=12; m++) {
			p3 = m/10;
			p4 = m%10;
			
			cur=0;
			digits[cur]=p3;

			if (isInSet(digits, cur, p4))
				continue;
			else {
				cur=1;
				digits[cur] = p4;
				
				for (int d=0; d<=days[m]; d++) {
					cur = 1;
					p1 = d/10;
					p2 = d%10;
					
					if(isInSet(digits, cur, p1)) {
						d +=9;
						continue;
					}
					else {
						cur = 2;
						digits[cur] = p1;
						
						
						if(isInSet(digits, cur, p2)) {
							continue;
						}
						else {
							cur = 3;
							digits[cur] = p2;
							
							for (int h = 0; h<24; h++) {
								cur = 3;
								p5 = h/10;
								p6 = h%10;
								
								if (isInSet(digits, cur, p5)) {
									p5 +=9;
									continue;
								}
								else {
									cur = 4;
									digits[cur] = p5;
									
									if (isInSet(digits, cur, p6))
										continue;
									else {
										cur = 5;
										digits[cur] = p6;
										
										for (int min=0; min<60; min++) {
											cur = 5;
											p7 = min/10;
											p8 = min%10;
											
											if (isInSet(digits, cur, p7)) {
												min +=9;
												continue;
											}
											else {
												cur = 6;
												digits[cur] = p7;
												
												if (isInSet(digits, cur, p8))
													continue;
												else {
													cur = 7;
													digits[cur] = p8;
													
													for (int s=0; s<60; s++) {
														cur=7;
														p9 = s/10;
														p10=s%10;
														
														if (isInSet(digits, cur, p9)) {
															s +=9;
															continue;
														}
														else {
															cur = 8;
															digits[cur] = p9;
															
															if (isInSet(digits, cur, p10))
																continue;
															else {
																cur = 9;
																digits[cur] = p10;
																count++;
																show(digits);
															}
															
														}
													}
													
												}
											}
											
										}
											
								
									}
								}
							}
							
						}
						
						
						
					}
						
				}
			
				
			}
			
			
		}
		System.out.println("มีจำนวนวันทั้งสิ้น : "+count);

	}
	

}
