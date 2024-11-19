package javaDatabase;

public class Countries {
	private String countryname;
	private String countryId;
	private String region;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Countries [countryname=" + countryname + ", countryId=" + countryId + ", region=" + region + "]";
	}

}
