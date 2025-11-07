package com.encapsulation.clinic;

public class DoctorProfile {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DoctorProfile [email=" + email + "]";
	}
	
	public boolean verify()
	{
		String c="@";
		if(this.getEmail().contains(c))
		{
			return true;
		}
		
		return false;

	}

	
}
