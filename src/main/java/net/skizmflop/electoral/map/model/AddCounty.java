package net.skizmflop.electoral.map.model;

import net.skizmflop.commons.jpa.entity.State;

/**
 * <p>Thymeleaf form model for adding new counties to the database.</p>
 * @author jack
 */
public class AddCounty {
	
	private String stateId;
	private String countyName;
	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return countyName;
	}
	/**
	 * @param countyName the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
}
