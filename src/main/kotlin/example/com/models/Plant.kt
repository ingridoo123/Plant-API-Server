package example.com.models

import kotlinx.serialization.Serializable


@Serializable
data class Plant(
    val id: Int,
    val type:String,
    val image:String,
    val description:String,
    val maintenance:String,
    val sunlight:String,
    val humidity:String,
    val wateringDays: String,
    val temperatureRange:Pair<Int,Int>,
    val repot: String,
    val fertilizer:String,
    val height: Double,
    val width: Double,
    val inHouse: String,
    val isSeasonal: Boolean
)
