package com.sopra.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Component
//@Aspect
@Slf4j
public class TrazaMetodos {
	
//	@Pointcut("execution(* * com.sopra.spring..*.*(..))")
//	public void todosLosMetodosDeTodasLasClasesDeSpringRepositories() {}
	
	@Before("execution(* com.sopra.spring..*.*(..))")
	public void trazaMetodo(JoinPoint joinPoint) {
		log.info("Antes de ejecutar {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
	}
	
}
