package com.ckrbqja.issue.controller

import com.ckrbqja.issue.model.IssueRequest
import com.ckrbqja.issue.model.IssueResponse
import com.ckrbqja.issue.service.IssueService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class IssueController(
    private val issueService: IssueService,
) {

    @PostMapping("/")
    fun create(@RequestBody issueReq: IssueRequest): IssueResponse {
        val create = issueService.create(issueReq)
        println(create)
        return create;
    }

}