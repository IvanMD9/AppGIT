package com.example.appgit.data.mapper

import com.example.appgit.data.local.CommitEntity
import com.example.appgit.data.model.Commit

fun CommitEntity.toCommit() : Commit {
    return Commit(
        id = id,
        desc = desc
    )
}