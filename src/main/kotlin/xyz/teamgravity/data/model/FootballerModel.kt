package xyz.teamgravity.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FootballerModel(
    val name: String,
    val description: String,
    val imageUrl: String
)
