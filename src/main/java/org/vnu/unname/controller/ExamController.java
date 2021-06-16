package org.vnu.unname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.vnu.unname.model.Exam;
import org.vnu.unname.service.ExamService;

import java.util.List;

@RestController
public class ExamController {
    @Autowired
    private ExamService examService;

    @GetMapping("/api/exam")
    public List<Exam> getExams() {
        return examService.getExams();
    }

    @PostMapping("/api/exam")
    public Exam saveExam(@RequestBody Exam exam) {
        examService.saveExam(exam);
        return exam;
    }
}
