package com.qb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qb.Dto.DonorDto;
import com.qb.service.DonorService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/donor")
public class DonorController {
	
	@Autowired
	private DonorService donorService;
	
	@PostMapping("/add")
	public ResponseEntity<DonorDto>  createDonor(@RequestBody DonorDto donarDto)
	{
			DonorDto createDonar = this.donorService.createDonar(donarDto);
			
			return  new ResponseEntity<>(createDonar, HttpStatus.CREATED);
	}
}
