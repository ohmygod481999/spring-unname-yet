package org.vnu.unname.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vnu.unname.model.Exam;
import org.vnu.unname.model.User;
import org.vnu.unname.repository.ExamRepository;
import org.vnu.unname.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    // get exams paging

    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}
