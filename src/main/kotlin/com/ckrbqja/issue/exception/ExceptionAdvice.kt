package com.ckrbqja.issue.exception

import org.springframework.http.HttpStatus
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionAdvice {

    @ExceptionHandler(ServerException::class)
    private fun handler(e: ServerException) =
        ErrorResponse.builder(e, e.code, e.message)

    @ExceptionHandler(Exception::class)
    private fun handler(e: Exception) =
        ErrorResponse.builder(e, HttpStatus.INTERNAL_SERVER_ERROR, "오류")

}