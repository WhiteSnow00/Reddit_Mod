// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.language.usecase;

import m20.b;
import com.reddit.domain.modtools.language.LanguageRepository;
import javax.inject.Provider;
import se2.d;

public final class LoadActiveLanguagesUseCase_Factory implements d<LoadActiveLanguagesUseCase>
{
    private final Provider<LanguageRepository> languageRepositoryProvider;
    private final Provider<b> resourceProvider;
    
    public LoadActiveLanguagesUseCase_Factory(final Provider<LanguageRepository> languageRepositoryProvider, final Provider<b> resourceProvider) {
        this.languageRepositoryProvider = languageRepositoryProvider;
        this.resourceProvider = resourceProvider;
    }
    
    public static LoadActiveLanguagesUseCase_Factory create(final Provider<LanguageRepository> provider, final Provider<b> provider2) {
        return new LoadActiveLanguagesUseCase_Factory(provider, provider2);
    }
    
    public static LoadActiveLanguagesUseCase newInstance(final LanguageRepository languageRepository, final b b) {
        return new LoadActiveLanguagesUseCase(languageRepository, b);
    }
    
    public LoadActiveLanguagesUseCase get() {
        return newInstance((LanguageRepository)this.languageRepositoryProvider.get(), (b)this.resourceProvider.get());
    }
}
