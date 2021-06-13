package org.vnu.unname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.vnu.unname.model.SampleModel;
import org.vnu.unname.repository.SampleRepository;

@SpringBootApplication
public class UnnameApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UnnameApplication.class, args);

		SampleRepository sampleRepository = context.getBean(SampleRepository.class);

		SampleModel sampleModel = new SampleModel();
		sampleRepository.save(sampleModel);
		System.out.println(sampleModel.getId());
	}

}
