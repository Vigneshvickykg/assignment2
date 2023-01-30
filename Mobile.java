

package week1.day2;

public class Mobile {
	
	public void mobileSpecification() {
		String mobileBrandName= "realme 5s";
		char mobileLogo= 'R';
		short noOfMobilePiece= 8;
		int modelNumber= 3060;
		long mobileImeiNumber= 46553287808868L;
		float mobilePrice= 12000F;
		boolean isDamaged= false;
		byte mobileRam= 8;
		short mobileStorage= 132;
		   
		
	             System.out.println("mobile brand name is"+mobileBrandName);
	             System.out.println("mobile logo is"+mobileLogo);
	             System.out.println("no of mobile piece is"+noOfMobilePiece);
	             System.out.println("mobile model number is"+modelNumber);
	             System.out.println("mobile imei number is"+mobileImeiNumber);
	             System.out.println("mobile price is"+mobilePrice);
	             System.out.println("mobile is damaged"+isDamaged);
	             System.out.println("mobile ram is"+mobileRam);
	             System.out.println("mobile storage is"+mobileStorage);
	 	
	}
	public static void main(String[] args) {
		Mobile b=new Mobile();
		b.mobileSpecification();
		
	}


}
