package by.cadememy.Deal.Enum;

public enum DealEnum {

		a ("1"),
		b ("2"), 
		c ("3"),
		d ("Select on option!\na: add Product\nb: delete Product\nc: print Bill");
		
		private String menu;
		
		DealEnum(String menu) {
			this.menu=menu;
		}

		public String getMenu() {
			return menu;
		}

		public void setMenu(String menu) {
			this.menu = menu;
		}

	}

