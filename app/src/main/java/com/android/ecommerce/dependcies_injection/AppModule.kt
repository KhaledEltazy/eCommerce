package com.android.ecommerce.dependcies_injection

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //using authentication feature of firebase
    @Provides
    @Singleton
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()


}