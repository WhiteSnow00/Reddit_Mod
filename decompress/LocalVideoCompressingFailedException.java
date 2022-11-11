// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/reddit/video/creation/video/render/LocalVideoCompressingFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LocalVideoCompressingFailedException extends Exception
{
    public static final int $stable = 0;
    
    public LocalVideoCompressingFailedException() {
        super("Video compression failed");
    }
}
