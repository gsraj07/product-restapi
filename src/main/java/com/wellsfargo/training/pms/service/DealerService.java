package com.wellsfargo.training.pms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.training.pms.model.Dealer;
import com.wellsfargo.training.pms.repository.DealerRepository;

@Service
public class DealerService {
	
	@Autowired
	private DealerRepository drepo;
	
	public Dealer registerDealer(Dealer d) {
		return drepo.save(d);
	}
	
	public Optional<Dealer> loginDealer(String email) {

		return drepo.findByEmail(email); 
	}
}
