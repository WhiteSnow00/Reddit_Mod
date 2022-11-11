// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.usecases.render;

import javax.inject.Inject;
import com.reddit.video.creation.video.merge.Mp4Merger;
import javax.inject.Provider;

public final class RenderAudioUseCaseFactory
{
    private final Provider<Mp4Merger> mp4MergerProvider;
    
    @Inject
    public RenderAudioUseCaseFactory(final Provider<Mp4Merger> provider) {
        this.mp4MergerProvider = checkNotNull(provider, 1);
    }
    
    private static <T> T checkNotNull(final T t, final int n) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(d.h("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", n));
    }
    
    public RenderAudioUseCase create(final RenderingConfig renderingConfig) {
        return new RenderAudioUseCase((Mp4Merger)checkNotNull(this.mp4MergerProvider.get(), 1), (RenderingConfig)checkNotNull(renderingConfig, 2));
    }
}
