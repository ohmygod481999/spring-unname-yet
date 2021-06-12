package org.vnu.unname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vnu.unname.model.SampleModel;
import org.vnu.unname.repository.SampleRepository;
import org.vnu.unname.service.SampleService;

import java.util.List;

@RestController
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping("/")
    public String getSample() {
        List<SampleModel> sampleModels = sampleService.getSamples();
        StringBuilder stringBuilder = new StringBuilder();
        sampleModels.forEach(sample -> {
            stringBuilder.append(", ");
            stringBuilder.append(sample.getName());
        });
        return stringBuilder.toString();
    }
}
