package by.cadememy.Homework4;

public class Bicycle {

	   private String model;
	   private int weight;

	   public Bicycle(String model, int weight) {
	       this.model = model;
	       this.weight = weight;
	   }

	   /**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void start() {
	       System.out.println("Поехали!");
	   }

	   public class SteeringWheel {

	       public void right() {
	           System.out.println("Руль вправо!");
	       }

	       @Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		public void left() {

	           System.out.println("Руль влево!");
	       }
	   }

	   public class Seat {

	       public void up() {

	           System.out.println("сиденье поднято выше!");
	       }

	       public void down() {

	           System.out.println("сиденье опущено ниже!");
	       }
	   }
	}
