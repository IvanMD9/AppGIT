package com.example.appgit.data.local

interface Dao {

    suspend fun getAllCommit() : List<CommitEntity>
}