package by.cadememy.Homework4;

public class AppBicycle {

	public static void main(String[] args) {

		Bicycle bike = new Bicycle("aist", 25);

		bike.start();
		bike.new Seat().down();
		bike.new SteeringWheel().right();

		Bicycle.SteeringWheel bs = bike.new SteeringWheel();
		bs.left();

		Bicycle.Seat bs1 = bike.new Seat();
		bs1.down();
		bs1.up();
	}

}
