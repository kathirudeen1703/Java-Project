package Com.Sample;

public class CustomerDetails {
    private long id;
	private String name;
	private String Address;
	private long Mobile_no;
	private String Email_id;
	private String Registration_Number;
	private String Vehicle_type;
	private String Make;
	private String Modal;
	private int tenure;
	private String price;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.Mobile_no = mobile_no;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		this.Email_id = email_id;
	}
	
	public String getRegistration_Number() {
		return Registration_Number;
	}
	public void setRegistration_Number(String registration_Number) {
		this.Registration_Number = registration_Number;
	}
	public String getVehicle_type() {
		return Vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.Vehicle_type = vehicle_type;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		this.Make = make;
	}
	public String getModal() {
		return Modal;
	}
	public void setModal(String modal) {
		this.Modal = modal;
	}
	
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public CustomerDetails(long id, String name, String address, long mobile_no, String email_id,
			String registration_Number, String vehicle_type, String make, String modal, int tenure, String price) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
		this.Mobile_no = mobile_no;
		this.Email_id = email_id;
		this.Registration_Number = registration_Number;
		this.Vehicle_type = vehicle_type;
		this.Make = make;
		this.Modal = modal;
		this.tenure = tenure;
		this.price = price;
	}
	
	
		
	
	
	
	
	
}
