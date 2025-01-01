package fi.feedback.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fi.feedback.entity.Feedback;
import fi.feedback.entity.Status;
import fi.feedback.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository repository;

	public Feedback createFeedback(Feedback feedback) {
		feedback.setFeedbackDateTime(LocalDate.now());
		feedback.setStatus(Status.PENDING);
		return repository.save(feedback);
	}

	public Feedback updateFeedback(int id, String respone, LocalDate responeDateTime, Status status) {
		Feedback feedback = repository.findById(id).get();
		feedback.setResponeDateTime(responeDateTime);
		feedback.setRespone(respone);
		feedback.setStatus(status);
		return repository.save(feedback);
	}

	public List<Feedback> getAllPendingFeedbacks() {
		return repository.findByStatus(Status.PENDING);
	}

	public Feedback getFeedbackById(int id) {
		return repository.findById(id).get();
	}
}
