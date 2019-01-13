import java.util.List;

public abstract class Animal {
	
	private boolean alive;
	
	private Field field;
	
	private Location location;
	
	public Animal(Field field, Location location) {
		alive = true;
		this.field = field;
		setLocation(location);
	}
	
	abstract public void act(List<Animal> newAnimals);
	
	protected boolean isAlive() {
		return alive;
	}
	
	protected void setDead() {
		alive = false;
		if(location != null) {
			field.clear(location);
			location = null;
			field = null;
		}
	}
	
	protected Location getLocation() {
		return location;
	}
	
	protected void setLocation(Location newLocation) {
		if(location != null) {
			field.clear(location);
			field.place(this, newLocation);
		}
	}
	
	protected Field getField(){
		return field;
	}
}
