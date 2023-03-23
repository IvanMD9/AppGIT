package com.example.appgit.data.mapper

import com.example.appgit.data.local.CommitEntity
import com.example.appgit.data.model.Commit
import com.example.appgit.domain.model.CommitDomain

fun CommitEntity.toCommitApiModel() : Commit {
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

fun CommitDomain.toCommitApi() : Commit {
    return Commit(
        id = id,
        desc = desc
    )
}