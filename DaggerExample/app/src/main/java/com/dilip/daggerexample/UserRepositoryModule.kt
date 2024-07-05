package com.dilip.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @Singleton
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}