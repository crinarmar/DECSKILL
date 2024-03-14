package com.inditex.service.loggin;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NegativeIdLoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(NegativeIdLoggingAspect.class);

	@Pointcut("execution(* com.inditex.service.use_case.SearchPrices.searchsearchPrices(..)) && args(productId)")
	public void negativeIdPointcut(Long id) {
	}

	@AfterThrowing(pointcut = "negativeIdPointcut(id)", throwing = "ex")
	public void logNegativeId(Long productId, Exception ex) {
		if ((productId != null) && (productId < 0)) {
			LOGGER.error("Se intentó buscar una producto con ID negativo: {}", productId);
		}
	}
}
