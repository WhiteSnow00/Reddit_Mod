// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import xd0.g0;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import m20.b;
import a20.a;
import javax.inject.Provider;
import se2.d;

public final class CreateScheduledPostUseCase_Factory implements d<CreateScheduledPostUseCase>
{
    private final Provider<a> dispatcherProvider;
    private final Provider<b> resourceProvider;
    private final Provider<ScheduledPostRepository> scheduledPostRepositoryProvider;
    private final Provider<g0> subredditRepositoryProvider;
    
    public CreateScheduledPostUseCase_Factory(final Provider<g0> subredditRepositoryProvider, final Provider<ScheduledPostRepository> scheduledPostRepositoryProvider, final Provider<b> resourceProvider, final Provider<a> dispatcherProvider) {
        this.subredditRepositoryProvider = subredditRepositoryProvider;
        this.scheduledPostRepositoryProvider = scheduledPostRepositoryProvider;
        this.resourceProvider = resourceProvider;
        this.dispatcherProvider = dispatcherProvider;
    }
    
    public static CreateScheduledPostUseCase_Factory create(final Provider<g0> provider, final Provider<ScheduledPostRepository> provider2, final Provider<b> provider3, final Provider<a> provider4) {
        return new CreateScheduledPostUseCase_Factory(provider, provider2, provider3, provider4);
    }
    
    public static CreateScheduledPostUseCase newInstance(final g0 g0, final ScheduledPostRepository scheduledPostRepository, final b b, final a a) {
        return new CreateScheduledPostUseCase(g0, scheduledPostRepository, b, a);
    }
    
    public CreateScheduledPostUseCase get() {
        return newInstance((g0)this.subredditRepositoryProvider.get(), (ScheduledPostRepository)this.scheduledPostRepositoryProvider.get(), (b)this.resourceProvider.get(), (a)this.dispatcherProvider.get());
    }
}
