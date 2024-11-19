package javaDatabase;

public class Departments {
	private String id;
	private String departmentname;
	private String location;
	private Countries country;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Countries getCountry() {
		return country;
	}
	public void setCountry(Countries country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Departments [id=" + id + ", departmentname=" + departmentname + ", location=" + location + ", country="
				+ country + "]";
	}
	

}
