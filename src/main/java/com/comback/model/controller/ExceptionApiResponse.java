package com.comback.model.controller;

public record ExceptionApiResponse<T,U> (T message, String errorCode, U response) {

}
