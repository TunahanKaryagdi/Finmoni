package com.tunahankaryagdi.network.firebase.firestore

import com.google.firebase.firestore.FirebaseFirestore

class FirebaseFirestoreDataSourceImpl(
    private val firebaseFirestore: FirebaseFirestore
) : FirebaseFirestoreDataSource {
    override suspend fun add() {
        firebaseFirestore.collection("add").add(hashMapOf("a" to "b"))
    }
}