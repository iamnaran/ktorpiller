package com.delphiclab.ktorpiller.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("id")
    val id: Long,
    @SerialName("username")
    val username: String,

    )
