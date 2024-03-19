package com.tunahankaryagdi.network.di

import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.tunahankaryagdi.network.firebase.firestore.FirebaseFirestoreDataSource
import com.tunahankaryagdi.network.firebase.firestore.FirebaseFirestoreDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule{

    @Singleton
    @Provides
    fun provideFirebaseFirestoreDataSource(
        firebaseFirestore: FirebaseFirestore
    ) : FirebaseFirestoreDataSource {
        return FirebaseFirestoreDataSourceImpl(firebaseFirestore)
    }
}