// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.crowdcontrol.usecase;

import com.reddit.domain.modtools.crowdcontrol.AdjustCrowdControlRepository;
import javax.inject.Provider;
import se2.d;

public final class UpdateCrowdControlLevelUseCaseImpl_Factory implements d<UpdateCrowdControlLevelUseCaseImpl>
{
    private final Provider<AdjustCrowdControlRepository> adjustCrowdControlRepositoryProvider;
    
    public UpdateCrowdControlLevelUseCaseImpl_Factory(final Provider<AdjustCrowdControlRepository> adjustCrowdControlRepositoryProvider) {
        this.adjustCrowdControlRepositoryProvider = adjustCrowdControlRepositoryProvider;
    }
    
    public static UpdateCrowdControlLevelUseCaseImpl_Factory create(final Provider<AdjustCrowdControlRepository> provider) {
        return new UpdateCrowdControlLevelUseCaseImpl_Factory(provider);
    }
    
    public static UpdateCrowdControlLevelUseCaseImpl newInstance(final AdjustCrowdControlRepository adjustCrowdControlRepository) {
        return new UpdateCrowdControlLevelUseCaseImpl(adjustCrowdControlRepository);
    }
    
    public UpdateCrowdControlLevelUseCaseImpl get() {
        return newInstance((AdjustCrowdControlRepository)this.adjustCrowdControlRepositoryProvider.get());
    }
}
