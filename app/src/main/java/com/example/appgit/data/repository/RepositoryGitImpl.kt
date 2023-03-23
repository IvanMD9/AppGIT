package com.example.appgit.data.repository

import com.example.appgit.data.mapper.toCommitDomain
import com.example.appgit.data.remote.GitApi
import com.example.appgit.domain.model.CommitDomain
import com.example.appgit.domain.repository.RepositoryGit

class RepositoryGitImpl(
    private val api: GitApi
) : RepositoryGit {
    override suspend fun getAllCommit(): List<CommitDomain> {
        return api.getAllCommit().map { it.toCommitDomain() }
    }
}