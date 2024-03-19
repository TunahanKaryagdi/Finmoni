package com.tunahankaryagdi.data.di

import com.tunahankaryagdi.data.repository.FirebaseRepository
import com.tunahankaryagdi.data.repository.FirebaseRepositoryImpl
import com.tunahankaryagdi.network.firebase.firestore.FirebaseFirestoreDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideFirebaseRepository(
        firebaseFirestoreDataSource: FirebaseFirestoreDataSource
    ) : FirebaseRepository{
        return FirebaseRepositoryImpl(firebaseFirestoreDataSource)
    }
}
