package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private int age;
	
	public UserBean() {
		this.name = "";
		this.age = 0;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isOwnerUser(String user) {
		boolean isOwner = false;
		if (user.equals("wara")) {
			isOwner = true;
		}
		return isOwner;
	}

	public boolean onlyChars(String user) {
		if (user == null) {
			return false;
		}
		int len = user.length();
		for (int i = 0; i < len; i++) {
			if ((Character.isLetter(user.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	public boolean userNoMoreThanSixChars(String user) {
		if (user.length() > 6) {
			return false;
		}
		return true;
	}
	
	public void cleanFields() {
		this.name = "";
		this.age = 0;
	}
	
	public String action() {
		if (!onlyChars(this.name)) {
			cleanFields();
			return "";
		}else {
			if (isOwnerUser(this.name)) {
				cleanFields();
				return "connect";
			} else {
				cleanFields();
				FacesMessage msg = new FacesMessage("User no valido");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				return null;
			}
		}
	}
}