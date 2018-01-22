import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>(); 
	Goat x = new Goat();
	Bees w = new Bees();
	Jackals y = new Jackals();
	Parrot z = new Parrot();
	
	farm.add(x);
	farm.add(w);
	farm.add(y);
	farm.add(z);
	for(int i = 0; i < farm.size(); i++) {
		Animal a = farm.get(i);
		a.makeNoise();	
	}
	}
	Farm(){
	
	}
}
