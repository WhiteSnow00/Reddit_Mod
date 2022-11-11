// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.usecases.trim;

import android.util.Size;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.reddit.video.creation.video.trim.videoResampler.VideoEditor;
import ff2.b0;
import android.content.Context;
import javax.inject.Provider;

public final class VideoTrimmerUseCaseFactory
{
    private final Provider<Context> contextProvider;
    private final Provider<b0> executionSchedulerProvider;
    private final Provider<VideoEditor> videoEditorProvider;
    
    @Inject
    public VideoTrimmerUseCaseFactory(@Named("IO_SCHEDULER") final Provider<b0> provider, final Provider<VideoEditor> provider2, @Named("APP_CONTEXT") final Provider<Context> provider3) {
        this.executionSchedulerProvider = checkNotNull(provider, 1);
        this.videoEditorProvider = checkNotNull(provider2, 2);
        this.contextProvider = checkNotNull(provider3, 3);
    }
    
    private static <T> T checkNotNull(final T t, final int n) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(d.h("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", n));
    }
    
    public VideoTrimmerUseCase create(final List<AdjustableClip> list, final Size size) {
        return new VideoTrimmerUseCase((b0)checkNotNull(this.executionSchedulerProvider.get(), 1), (VideoEditor)checkNotNull(this.videoEditorProvider.get(), 2), (Context)checkNotNull(this.contextProvider.get(), 3), (List)checkNotNull(list, 4), (Size)checkNotNull(size, 5));
    }
}
