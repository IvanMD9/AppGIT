package com.example.appgit.data.remote

import com.example.appgit.data.model.Commit

interface GitApi {

    suspend fun getAllCommit() : List<Commit>
}