package com.ckrbqja.issue.model

data class IssueRequest(
    var issue: String,
) {
    operator fun invoke() = Issue(issue = IssueType.BUG)
}

data class IssueResponse(
    var id: Long = 0,
    var issue: IssueType,
) {
    companion object {
        operator fun invoke(issue: Issue) = IssueResponse(
            id = issue.id, issue = issue.issue
        )
    }
}
