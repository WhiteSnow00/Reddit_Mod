// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019" }, d2 = { "Lcom/reddit/data/model/MediaFragment;", "", "previewMediaId", "", "still", "Lcom/reddit/data/model/StillMedia;", "obfuscatedStill", "animated", "Lcom/reddit/data/model/AnimatedMedia;", "streaming", "Lcom/reddit/data/model/StreamingMedia;", "rpanVideo", "Lcom/reddit/data/model/RPANMedia;", "(Ljava/lang/String;Lcom/reddit/data/model/StillMedia;Lcom/reddit/data/model/StillMedia;Lcom/reddit/data/model/AnimatedMedia;Lcom/reddit/data/model/StreamingMedia;Lcom/reddit/data/model/RPANMedia;)V", "getAnimated", "()Lcom/reddit/data/model/AnimatedMedia;", "getObfuscatedStill", "()Lcom/reddit/data/model/StillMedia;", "getPreviewMediaId", "()Ljava/lang/String;", "getRpanVideo", "()Lcom/reddit/data/model/RPANMedia;", "getStill", "getStreaming", "()Lcom/reddit/data/model/StreamingMedia;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MediaFragment
{
    private final AnimatedMedia animated;
    private final StillMedia obfuscatedStill;
    private final String previewMediaId;
    private final RPANMedia rpanVideo;
    private final StillMedia still;
    private final StreamingMedia streaming;
    
    public MediaFragment(final String previewMediaId, final StillMedia still, @n(name = "obfuscated_still") final StillMedia obfuscatedStill, final AnimatedMedia animated, final StreamingMedia streaming, final RPANMedia rpanVideo) {
        this.previewMediaId = previewMediaId;
        this.still = still;
        this.obfuscatedStill = obfuscatedStill;
        this.animated = animated;
        this.streaming = streaming;
        this.rpanVideo = rpanVideo;
    }
    
    public final AnimatedMedia getAnimated() {
        return this.animated;
    }
    
    public final StillMedia getObfuscatedStill() {
        return this.obfuscatedStill;
    }
    
    public final String getPreviewMediaId() {
        return this.previewMediaId;
    }
    
    public final RPANMedia getRpanVideo() {
        return this.rpanVideo;
    }
    
    public final StillMedia getStill() {
        return this.still;
    }
    
    public final StreamingMedia getStreaming() {
        return this.streaming;
    }
}
