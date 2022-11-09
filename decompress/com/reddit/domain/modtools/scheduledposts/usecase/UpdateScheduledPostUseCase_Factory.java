// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import q20.b;
import javax.inject.Provider;
import af2.d;

public final class UpdateScheduledPostUseCase_Factory implements d<UpdateScheduledPostUseCase>
{
    private final Provider<b> resourceProvider;
    private final Provider<ScheduledPostRepository> scheduledPostRepositoryProvider;
    
    public UpdateScheduledPostUseCase_Factory(final Provider<ScheduledPostRepository> scheduledPostRepositoryProvider, final Provider<b> resourceProvider) {
        this.scheduledPostRepositoryProvider = scheduledPostRepositoryProvider;
        this.resourceProvider = resourceProvider;
    }
    
    public static UpdateScheduledPostUseCase_Factory create(final Provider<ScheduledPostRepository> provider, final Provider<b> provider2) {
        return new UpdateScheduledPostUseCase_Factory(provider, provider2);
    }
    
    public static UpdateScheduledPostUseCase newInstance(final ScheduledPostRepository scheduledPostRepository, final b b) {
        return new UpdateScheduledPostUseCase(scheduledPostRepository, b);
    }
    
    public UpdateScheduledPostUseCase get() {
        return newInstance((ScheduledPostRepository)this.scheduledPostRepositoryProvider.get(), (b)this.resourceProvider.get());
    }
}