package beans;

import java.io.Serializable;
import java.util.Date;

/**
 * Servlet implementation class User
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String loginid;
	private String password;
	private String name;
	private String  Branch;
	private String Position;
	private Date insertDate;
	private Date updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getloginid() {
		return loginid;
	}

	public void setloginid(String loginid) {
		this.loginid = loginid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String Branch) {
		this.Branch = Branch;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String Position) {
		this.Position = Position;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
