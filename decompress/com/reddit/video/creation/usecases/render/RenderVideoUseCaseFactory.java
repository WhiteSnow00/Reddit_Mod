// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.usecases.render;

import javax.inject.Inject;
import javax.inject.Named;
import com.reddit.video.creation.video.VideoRenderApi;
import java.io.File;
import com.reddit.video.creation.eventbus.EventBus;
import com.reddit.video.creation.api.configuration.CreationConfiguration;
import android.content.Context;
import javax.inject.Provider;

public final class RenderVideoUseCaseFactory
{
    private final Provider<Context> applicationContextProvider;
    private final Provider<CreationConfiguration> creationConfigurationProvider;
    private final Provider<EventBus> eventBusProvider;
    private final Provider<File> renderDirProvider;
    private final Provider<VideoRenderApi> videoRenderApiProvider;
    
    @Inject
    public RenderVideoUseCaseFactory(final Provider<VideoRenderApi> provider, @Named("RENDER_VIDEO_DIR") final Provider<File> provider2, @Named("APP_CONTEXT") final Provider<Context> provider3, final Provider<EventBus> provider4, final Provider<CreationConfiguration> provider5) {
        this.videoRenderApiProvider = checkNotNull(provider, 1);
        this.renderDirProvider = checkNotNull(provider2, 2);
        this.applicationContextProvider = checkNotNull(provider3, 3);
        this.eventBusProvider = checkNotNull(provider4, 4);
        this.creationConfigurationProvider = checkNotNull(provider5, 5);
    }
    
    private static <T> T checkNotNull(final T t, final int n) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(d.h("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", n));
    }
    
    public RenderVideoUseCase create(final RenderingConfig renderingConfig, final String s) {
        return new RenderVideoUseCase((VideoRenderApi)checkNotNull(this.videoRenderApiProvider.get(), 1), (File)checkNotNull(this.renderDirProvider.get(), 2), (Context)checkNotNull(this.applicationContextProvider.get(), 3), (EventBus)checkNotNull(this.eventBusProvider.get(), 4), (CreationConfiguration)checkNotNull(this.creationConfigurationProvider.get(), 5), (RenderingConfig)checkNotNull(renderingConfig, 6), (String)checkNotNull(s, 7));
    }
}
