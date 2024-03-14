package com.inditex.service.loggin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

	@Around("execution(* com.inditex.service..*(..)))")
	public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		final StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();

		LOGGER.info(String.format("Tiempo de ejecución  del método %s.%s :: %s ms.", methodSignature.getDeclaringType().getSimpleName(),
				methodSignature.getName(), stopWatch.getTotalTimeMillis()));

		return result;
	}
}
