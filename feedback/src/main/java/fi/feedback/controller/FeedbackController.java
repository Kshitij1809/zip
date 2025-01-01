package fi.feedback.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fi.feedback.entity.Feedback;
import fi.feedback.entity.Status;
import fi.feedback.service.FeedbackService;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {

	@Autowired
	FeedbackService service;

	@PostMapping("/add")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		return service.createFeedback(feedback);
	}

	@PutMapping("/update/{id}")
	public Feedback updateFeedback(@PathVariable int id,@RequestParam String respone,@RequestParam LocalDate responeDateTime,@RequestParam Status status) {
		return service.updateFeedback(id, respone, responeDateTime, status);
	}

	@GetMapping("/getAll")
	public List<Feedback> getAllPendingFeedbacks() {
		return service.getAllPendingFeedbacks();
	}

	@GetMapping("/{id}")
	public Feedback getFeedbackById(@PathVariable int id) {
		return service.getFeedbackById(id);
	}

}
