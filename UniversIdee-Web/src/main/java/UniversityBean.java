import java.io.*;

import javax.persistence.*;

@Entity
@Table(name="UNIVERSITY")

public class UniversityBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SID")
	private int SID;
	public int getSID() {
		return this.SID;
	}
	public void setSID(int id) {
		this.SID = id;
	}
	
	@Column(name="NAME")
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="DOMAINADDRESS")
	private String domain;
	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
}
