package com.ratmirdudin.tests_hw3.controller;

import com.google.inject.AbstractModule;

public final class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LibraryFactory.class).asEagerSingleton();
    }
}
