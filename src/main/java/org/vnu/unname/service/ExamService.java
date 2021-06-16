package org.vnu.unname.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vnu.unname.model.Exam;
import org.vnu.unname.repository.ExamRepository;

import java.util.List;

@Service
public class ExamService {
    private ExamRepository examRepository;

    @Autowired
    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public List<Exam> getExams() {
        return this.examRepository.findAll();
    }

    // get exams paging

    public void saveExam(Exam exam) {
        this.examRepository.save(exam);
    }
}
