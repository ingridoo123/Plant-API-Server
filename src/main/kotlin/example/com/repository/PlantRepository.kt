package example.com.repository

import example.com.models.ApiResponse
import example.com.models.Plant


interface PlantRepository {

    val plants: Map<Int, List<Plant>>

    val page1: List<Plant>
    val page2: List<Plant>
    val page3: List<Plant>
    val page4: List<Plant>
    val page5: List<Plant>
    val page6: List<Plant>
    val page7: List<Plant>
    val page8: List<Plant>
    val page9: List<Plant>
    val page10: List<Plant>
    val page11: List<Plant>


    suspend fun getAllPlants(page: Int = 1): ApiResponse
    suspend fun searchPlants(name: String?): ApiResponse
}