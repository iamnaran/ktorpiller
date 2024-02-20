package com.delphiclab.ktorpiller.data.repo

import com.delphiclab.ktorpiller.data.model.User
import com.delphiclab.ktorpiller.data.remote.api.AuthApiService
import com.delphiclab.ktorpiller.utils.ApiResponse
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun serverLogin(username: String, password: String): Flow<ApiResponse<User>>
}

class AuthRepositoryImpl(private val authApiService: AuthApiService) : AuthRepository {
    override suspend fun serverLogin(username: String, password: String): Flow<ApiResponse<User>> {

        return authApiService.serverLoginWithFlow(username, password)
    }


}