package com.agusibrahim.firebcrud;

public class User
{
	private String nama;
	private int gender;
	private String alamat;
	
	public User(){
	}
	public User(String nama, int gender, String alamat) {
		this.nama = nama;
		this.gender = gender;
		this.alamat = alamat;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getGender() {
		return gender;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getAlamat() {
		return alamat;
	}
	
}
