package com.akash.task2;

class Patient {
	private String id;
	private String name;
	private int age;
	private String address;
	private String phone;

	public Patient(String id, String name, int age, String address, String phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Patient{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + ", address='" + address
				+ '\'' + ", phone='" + phone + '\'' + '}';
	}
}
