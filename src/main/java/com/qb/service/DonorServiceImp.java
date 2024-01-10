package com.qb.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qb.Dto.DonorDto;
import com.qb.entity.Donor;
import com.qb.repo.DonorRepo;


@Service
public class DonorServiceImp implements DonorService{

	@Autowired
	DonorRepo donorRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public DonorDto createDonar(DonorDto donarDto) {
		
		Donor donor = this.modelMapper.map(donarDto,Donor.class);
		
		Donor saveDonar = this.donorRepo.save(donor);
		
		return this.modelMapper.map(saveDonar, DonorDto.class);
	}


}
