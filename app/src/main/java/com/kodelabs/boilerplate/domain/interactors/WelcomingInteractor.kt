package com.kodelabs.boilerplate.domain.interactors

import com.kodelabs.boilerplate.domain.interactors.base.Interactor

interface WelcomingInteractor : Interactor {

    interface Callback {

        fun onMessageRetrieved(message: String)

        fun onRetrievalFailed(error: String)
    }
}