package com.ckrbqja.issue.model

enum class IssueType(value: String) {
    BUG("bug"), FIX("fix");

    companion object {
        operator fun invoke(name: String): IssueType =
            IssueType.valueOf(name.uppercase())
    }
}
