package cn.peter.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect()
public class GenericAdvice {

	@Pointcut("execution(* cn.peter.service.impl.*ServiceImpl.*(..))")
	public void pc() {}
	
	@Before("GenericAdvice.pc()")
	void before() {
		System.out.println("_________����ǰ��ǿ__________");
	}
	
	@Around("GenericAdvice.pc()")
	Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("--------------������ǿǰ��---------------");
		Object object = point.proceed();
		System.out.println("--------------������ǿ����---------------");
		return object;
	}
	
	@AfterReturning("GenericAdvice.pc()")
	void afterReturning() {
		System.out.println("_________���к�����������ǿ__________");
	}
	
	@AfterThrowing("GenericAdvice.pc()")
	void afterException() {
		System.out.println("===========�쳣������ǿ===========");
	}
	
	@After("GenericAdvice.pc()")
	void after() {
		System.out.println("===========finally��ǿ===========");
	}
	
}
