package com.example.appgit.di

import com.example.appgit.data.repository.RepositoryGitImpl
import com.example.appgit.domain.repository.RepositoryGit

interface Module {

    fun bindRepositoryGit(impl: RepositoryGitImpl): RepositoryGit
}