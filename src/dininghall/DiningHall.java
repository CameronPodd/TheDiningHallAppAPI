package dininghall;

import java.time.LocalDate;
import java.util.Collection;

import org.json.simple.JSONObject;

public class DiningHall {
	private Collection<MealTime> mtimes;
	private LocalDate date;
	private String name;

	public DiningHall(String n, LocalDate d) {
		this.name = n;
		this.date = d;
		this.mtimes = getMealTimes(this.name, this.date);
	}

	public JSONObject toJSON() {
		return null;
	}

	private Collection<MealTime> getMealTimes(String name, LocalDate date) {
		return null;
	}

	public static void main(String[] args) {
		DiningHall d = new DiningHall(null, null);
		System.out.println("Works");
	}
}