package fi.feedback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.feedback.entity.Feedback;
import fi.feedback.entity.Status;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

	List<Feedback> findByStatus(Status status);

}
