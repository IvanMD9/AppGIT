package com.example.appgit.domain.use_case

import com.example.appgit.domain.model.CommitDomain
import com.example.appgit.domain.repository.RepositoryGit

class GetAllCommitUseCase(
    private val repositoryGit: RepositoryGit
) {

    suspend operator fun invoke() : List<CommitDomain> {
        return repositoryGit.getAllCommit()
    }
}