package com.delphiclab.ktorpiller.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delphiclab.ktorpiller.utils.AppLog
import com.iamnaran.beetle.presentation.data.repo.AuthRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainViewModel(private val authRepository: AuthRepository) : ViewModel() {


    public fun doApiRequest() {
        AppLog.showLog("Api Requesting..")
        viewModelScope.launch {
            authRepository.serverLogin("kminchelle", "0lelplR")
                .catch {
                    AppLog.showLog("Called Error Catch")
                }
                .collectLatest {
                    AppLog.showLog("Called Success")

                }

        }

    }

}