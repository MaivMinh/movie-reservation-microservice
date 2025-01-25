package com.microservice.bff.response;

import java.util.Map;

public record ExceptionResponse(int status, String message, Map<String, String> errors) {
}
