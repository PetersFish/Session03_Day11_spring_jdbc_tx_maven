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
		System.out.println("_________运行前增强__________");
	}
	
	@Around("GenericAdvice.pc()")
	Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("--------------环绕增强前面---------------");
		Object object = point.proceed();
		System.out.println("--------------环绕增强后面---------------");
		return object;
	}
	
	@AfterReturning("GenericAdvice.pc()")
	void afterReturning() {
		System.out.println("_________运行后正常结束增强__________");
	}
	
	@AfterThrowing("GenericAdvice.pc()")
	void afterException() {
		System.out.println("===========异常处理增强===========");
	}
	
	@After("GenericAdvice.pc()")
	void after() {
		System.out.println("===========finally增强===========");
	}
	
}
