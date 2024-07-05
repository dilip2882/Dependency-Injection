package com.dilip.daggerexample

import java.lang.annotation.Documented
import javax.inject.Scope

@Scope
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope