package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javacamp.hrms.business.abstracts.JobSeekerService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobSeekerDao;
import javacamp.hrms.entities.concretes.JobSeeker;
import lombok.AllArgsConstructor;

@Component
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao=jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"Data başarıyla listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş arayan başarıyla eklendi");
	}
	
	
}
