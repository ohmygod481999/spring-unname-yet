package org.vnu.unname.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vnu.unname.model.SampleModel;
import org.vnu.unname.repository.SampleRepository;

import java.util.List;

@Service
public class SampleService {
    private final SampleRepository sampleRepository;

    @Autowired
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<SampleModel> getSamples() {
        return sampleRepository.findAll();
    }
}
