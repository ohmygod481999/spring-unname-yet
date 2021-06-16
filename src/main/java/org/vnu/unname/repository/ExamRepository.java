package org.vnu.unname.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vnu.unname.model.Exam;

import java.util.UUID;

public interface ExamRepository extends JpaRepository<Exam, UUID> {
}
