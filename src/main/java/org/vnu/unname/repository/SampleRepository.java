package org.vnu.unname.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vnu.unname.model.SampleModel;

import java.util.UUID;

public interface SampleRepository extends JpaRepository<SampleModel, UUID> {
}
