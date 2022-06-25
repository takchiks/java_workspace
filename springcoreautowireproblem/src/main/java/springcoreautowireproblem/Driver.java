package springcoreautowireproblem;

public class Driver {
	private int licenseNo;
	private String driverName;
	
	
	
	public Driver(int licenseNo, String driverName) {
		super();
		this.licenseNo = licenseNo;
		this.driverName = driverName;
	}
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "Driver [licenseNo=" + licenseNo + ", driverName=" + driverName + "]";
	}
	
	
}
