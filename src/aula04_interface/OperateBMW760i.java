package aula04_interface;

public class OperateBMW760i implements OperateCar{

	@Override
	public int turn(Direction direction, int radius, int startSpeed, int endSpeed) {
		radius++;
		return 0;
	}

	@Override
	public int changeLanes(Direction direction, int startSpeed, int endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int signalTurn(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, int speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, int speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
