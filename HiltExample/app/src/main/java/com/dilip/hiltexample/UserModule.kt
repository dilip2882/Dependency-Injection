package com.dilip.hiltexample

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class UserModule {

    @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository
}