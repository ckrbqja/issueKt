package com.ckrbqja.issue.service

import com.ckrbqja.issue.model.IssueRequest
import com.ckrbqja.issue.model.IssueResponse
import com.ckrbqja.issue.repository.IssueRepository
import org.springframework.stereotype.Service

@Service
class IssueService(private var issueRep: IssueRepository) {

    fun create(req: IssueRequest): IssueResponse = IssueResponse(issueRep.save(req()))

}
