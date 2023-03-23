package com.example.appgit.domain.repository

import com.example.appgit.domain.model.CommitDomain

interface RepositoryGit {

    suspend fun getAllCommit() : List<CommitDomain>
}