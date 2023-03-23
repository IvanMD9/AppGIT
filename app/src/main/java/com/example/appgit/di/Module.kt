package com.example.appgit.di

import com.example.appgit.data.remote.GitApi
import com.example.appgit.data.repository.RepositoryGitImpl
import com.example.appgit.domain.repository.RepositoryGit

class Module {

    fun provideRepositoryGit(api: GitApi) : RepositoryGit {
        return RepositoryGitImpl(api)
    }
}