package com.ckrbqja.issue.repository

import com.ckrbqja.issue.model.Issue
import org.springframework.data.jpa.repository.JpaRepository


interface IssueRepository:JpaRepository<Issue, Long>