package aula04_interface;

public interface OperateCar {
	   // Constantes, se houver
	   //...
	   // Assinatura dos métodos
	   int turn(Direction direction, int radius, int startSpeed, int endSpeed);
	   int changeLanes(Direction direction, int startSpeed, int endSpeed);
	   int signalTurn(Direction direction, boolean signalOn);
	   int getRadarFront(double distanceToCar, int speedOfCar);
	   int getRadarRear(double distanceToCar, int speedOfCar);
	}

