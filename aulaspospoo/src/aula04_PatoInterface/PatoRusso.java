package aula04_PatoInterface;

public class PatoRusso extends Pato implements Voador{
	@Override
	public void grasnar() {
		//Grasna em Russo de forma roca;
	}
	
	@Override
	public void nadar() {
		//Nada de costas
	}
	
	@Override
	public void voar() {
		// TODO Auto-generated method stub
	}
	
	public void status() {
		if (getVivo() == 1) {
			System.out.println("Está vivo!");
		}
	}

}