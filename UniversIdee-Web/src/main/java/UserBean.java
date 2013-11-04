import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="USER")

public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UID")
	private int UID;
	public int getUID() {
		return this.UID;
	}
	public void setUID(int id) {
		this.UID = id;
	}
	
	@Column(name="FIRSTNAME")
	private String firstname;
	public String getFirstname() {
		return this.firstname;
	}
	public void setFirstname(String fname) {
		this.firstname = fname;
	}
	
	@Column(name="LASTNAME")
	private String lastname;
	public String getLastname() {
		return this.lastname;
	}
	public void setLastname(String lname) {
		this.lastname = lname;
	}
	
	@Column(name="EMAIL")
	private String email;
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="USERNAME")
	private String username;
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="PASSWORD")
	private String password;
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="SID")
	private int SID;
	public int getSID() {
		return this.SID;
	}
	public void setSID(int SID) {
		this.SID = SID;
	}
}
