package com.example.appgit.data.local

import com.example.appgit.data.model.Commit

interface GitApi {

    suspend fun getAllCommit() : List<Commit>
}