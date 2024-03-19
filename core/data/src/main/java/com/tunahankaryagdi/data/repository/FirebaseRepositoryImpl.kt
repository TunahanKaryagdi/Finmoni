package com.tunahankaryagdi.data.repository

import com.tunahankaryagdi.network.firebase.firestore.FirebaseFirestoreDataSource
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor(
    private val firestoreDataSource: FirebaseFirestoreDataSource
) : FirebaseRepository {
    override suspend fun add() {
        firestoreDataSource.add()
    }
}