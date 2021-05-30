package javacamp.hrms.business.abstracts;

import java.util.List;


import org.springframework.stereotype.Service;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobPosition;
@Service
public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobposition);
}
