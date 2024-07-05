package com.dilip.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ApplicationScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount : Int) : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService() : NotificationService {
        return EmailService()
    }
}