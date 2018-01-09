package cn.peter.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public interface IAccountService {

	//в╙ук
	@Transactional(propagation=Propagation.REQUIRED,transactionManager="tm1")
	int transfer(Integer from, Integer to, Double amount);
}
