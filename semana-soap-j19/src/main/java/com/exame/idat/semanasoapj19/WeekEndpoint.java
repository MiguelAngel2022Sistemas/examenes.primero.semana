package com.exame.idat.semanasoapj19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetWeekRequest;
import io.spring.guides.gs_producing_web_service.GetWeekResponse;


@Endpoint


public class WeekEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private WeeksRepository weeksRepository;

	@Autowired
	public WeekEndpoint(WeeksRepository weeksRepository) {
		this.weeksRepository = weeksRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetWeekRequest")
	@ResponsePayload
	public GetWeekResponse getWeek(@RequestPayload GetWeekRequest request) {
		GetWeekResponse response = new GetWeekResponse();
		response.setWeek(weeksRepository.findWeek(request.getName()));

		return response;
	}
}