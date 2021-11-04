package xyz.teamgravity.data.module

import kotlinx.serialization.Serializable

@Serializable
data class FootballerModel(
    val name: String,
    val description: String,
    val imageUrl: String
)
