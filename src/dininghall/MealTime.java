package dininghall;

import java.util.Collection;

import org.json.simple.JSONObject;

class MealTime {
	private String name;
	private Collection<Kitchen> kitchens;

	MealTime(String n, Collection<Kitchen> kits) {
		this.name = n;
		this.kitchens = kits;
	}

	JSONObject toJSON() {
		return null;
	}
}
