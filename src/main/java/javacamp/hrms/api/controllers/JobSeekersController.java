package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobSeekerService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.entities.concretes.JobSeeker;

@Component
@RestController
@RequestMapping("api/job_seekers")
public class JobSeekersController {
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		this.jobSeekerService=jobSeekerService;
	}
	@GetMapping("/getall")
	public  DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		
		return this.jobSeekerService.add(jobSeeker);
	}
}
