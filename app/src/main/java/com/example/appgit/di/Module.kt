package com.example.appgit.di

import com.example.appgit.data.repository.RepositoryGitImpl
import com.example.appgit.domain.repository.RepositoryGit

abstract class Module {

    abstract fun bindRepositoryGit(impl: RepositoryGitImpl): RepositoryGit
}