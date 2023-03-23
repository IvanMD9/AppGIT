package com.example.appgit.data.mapper

import com.example.appgit.data.local.CommitEntity
import com.example.appgit.data.model.Commit
import com.example.appgit.domain.model.CommitDomain

fun CommitEntity.toCommit() : Commit {
    return Commit(
        id = id,
        desc = desc
    )
}

fun Commit.toCommitDomain() : CommitDomain {
    return CommitDomain(
        id = id,
        desc = desc
    )
}