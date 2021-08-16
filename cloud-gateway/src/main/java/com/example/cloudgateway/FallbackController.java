package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@GetMapping("/orderfallback")
	public Mono<String> orderservicefallback() {
		return Mono.just("Order service is down , try again later");
	}

	@GetMapping("/paymentfallback")
	public Mono<String> paymentservicefallback() {
		return Mono.just("Payment service is down , try again later");
	}

}
