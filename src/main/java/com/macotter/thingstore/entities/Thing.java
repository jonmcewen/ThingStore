package com.macotter.thingstore.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THINGS")
public class Thing {

	@Id
	private final ThingKey thingKey = new ThingKey();

	public String getUser() {
		return thingKey.getUser();
	}

	public void setUser(String user) {
		this.thingKey.setUser(user);
	}

	public String getName() {
		return thingKey.getName();
	}

	public void setName(String name) {
		this.thingKey.setName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Thing [thingKey=" + thingKey + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((thingKey == null) ? 0 : thingKey.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thing other = (Thing) obj;
		if (thingKey == null) {
			if (other.thingKey != null)
				return false;
		} else if (!thingKey.equals(other.thingKey))
			return false;
		return true;
	}

}
