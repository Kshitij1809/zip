package fi.feedback.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String name;

	@Column(nullable = false, unique = true)
	String email;

	@Column(nullable = false)
	String message;

	String respone;

	@Enumerated(EnumType.STRING)
	Status status;

	LocalDate feedbackDateTime;

	LocalDate responeDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRespone() {
		return respone;
	}

	public void setRespone(String respone) {
		this.respone = respone;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getFeedbackDateTime() {
		return feedbackDateTime;
	}

	public void setFeedbackDateTime(LocalDate feedbackDateTime) {
		this.feedbackDateTime = feedbackDateTime;
	}

	public LocalDate getResponeDateTime() {
		return responeDateTime;
	}

	public void setResponeDateTime(LocalDate responeDateTime) {
		this.responeDateTime = responeDateTime;
	}

}
