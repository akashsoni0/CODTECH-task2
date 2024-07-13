package com.akash.task2;

import java.util.Date;

class Appointment {
	private String patientId;
	private String doctorId;
	private Date appointmentDate;

	public Appointment(String patientId, String doctorId, Date appointmentDate) {
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Appointment{" + "patientId='" + patientId + '\'' + ", doctorId='" + doctorId + '\''
				+ ", appointmentDate=" + appointmentDate + '}';
	}
}
