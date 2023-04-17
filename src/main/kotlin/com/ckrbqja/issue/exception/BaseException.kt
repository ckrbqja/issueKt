package com.ckrbqja.issue.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

sealed class ServerException(
    open var code: HttpStatus,
    override var message: String,
) : RuntimeException(message = message)

data class NotFound(
    override var code: HttpStatus = HttpStatus.NOT_FOUND,
    override var message: String = "낫"
):ServerException(code, message)

data class CREATED(
    override var code: HttpStatus = HttpStatus.CREATED,
    override var message: String = "낫"
):ServerException(code, message)