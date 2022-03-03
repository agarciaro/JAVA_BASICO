package com.sopra.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.sopra.spring.annotation.LogueaTiempo;

import lombok.extern.slf4j.Slf4j;

@Component
//@Scope("prototype")
@ConditionalOnProperty(name = "sopra.logueatiempo.enabled", havingValue = "true")
@Aspect
@Slf4j
public class TiempoEjecucion {
	
//	public Long inicio = 0L;
//	public Integer num = new Random().nextInt();
	
	@Around("@annotation(com.sopra.spring.annotation.LogueaTiempo)")
	public void logueaTiempoDeMetodo(ProceedingJoinPoint joinPoint) throws Throwable {
		Long inicio = System.currentTimeMillis();
		try {
			joinPoint.proceed();
		}finally {
			Long tiempoEjecucion = System.currentTimeMillis() - inicio;
			LogueaTiempo anotacion = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(LogueaTiempo.class);
			if(tiempoEjecucion > anotacion.maxTiempo()) {
				log.warn("Tiempo ejecución SUPERADO por el método [{}.{}]:{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), tiempoEjecucion);
			}else {
				log.debug("Tiempo ejecución método [{}.{}]: {}ms", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), tiempoEjecucion);
			}

		}

	}
	
//	@Before("@annotation(com.sopra.spring.annotation.LogueaTiempo)")
//	public void capturaTiempoDeMetodoAntes() {
//		inicio = System.currentTimeMillis();
//		log.info("NUM:{}", num);
//	}
//	
//	@After("@annotation(com.sopra.spring.annotation.LogueaTiempo)")
//	public void logueaTiempoDeMetodoDespues(JoinPoint joinPoint) {
//		Long tiempoEjecucion = System.currentTimeMillis() - inicio;
//		LogueaTiempo anotacion = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(LogueaTiempo.class);
//		if(tiempoEjecucion > anotacion.maxTiempo()) {
//			log.warn("Tiempo ejecución SUPERADO por el método [{}.{}]:{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), tiempoEjecucion);
//		}else {
//			log.debug("Tiempo ejecución método [{}.{}]: {}ms", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), tiempoEjecucion);
//		}
//	}
	
}
