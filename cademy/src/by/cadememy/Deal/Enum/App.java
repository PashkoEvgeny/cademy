package by.cadememy.Deal.Enum;


public class App {

	public static void main(String[] args) {
		System.out.println("Hello!!! Create a Deal! Go...");
		
		DealEnum dealEnum =DealEnum.d;
		
	//	for (DealEnum en: DealEnum.values()) {
	
		dealEnum.getMenu();
		
		
		switch (dealEnum) {
		case a:
			System.out.println();
			break;
		case b:
			System.out.println("Today Tuesday ");
			break;
		case c:
			System.out.println("Today Wednesday ");
			break;    
		case d:
			System.out.println(dealEnum.getMenu());
			break;  
		}
		
	}

}


