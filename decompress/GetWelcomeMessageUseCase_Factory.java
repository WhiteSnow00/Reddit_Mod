// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.welcomemessage.usecase;

import m20.b;
import com.reddit.domain.modtools.welcomemessage.WelcomeMessageRepository;
import javax.inject.Provider;
import se2.d;

public final class GetWelcomeMessageUseCase_Factory implements d<GetWelcomeMessageUseCase>
{
    private final Provider<WelcomeMessageRepository> repositoryProvider;
    private final Provider<b> resourceProvider;
    
    public GetWelcomeMessageUseCase_Factory(final Provider<WelcomeMessageRepository> repositoryProvider, final Provider<b> resourceProvider) {
        this.repositoryProvider = repositoryProvider;
        this.resourceProvider = resourceProvider;
    }
    
    public static GetWelcomeMessageUseCase_Factory create(final Provider<WelcomeMessageRepository> provider, final Provider<b> provider2) {
        return new GetWelcomeMessageUseCase_Factory(provider, provider2);
    }
    
    public static GetWelcomeMessageUseCase newInstance(final WelcomeMessageRepository welcomeMessageRepository, final b b) {
        return new GetWelcomeMessageUseCase(welcomeMessageRepository, b);
    }
    
    public GetWelcomeMessageUseCase get() {
        return newInstance((WelcomeMessageRepository)this.repositoryProvider.get(), (b)this.resourceProvider.get());
    }
}
