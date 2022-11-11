// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import su2.a;
import sg2.e;
import android.media.MediaCodec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Landroid/media/MediaCodec;", "Lhg2/j;", "cleanUp", "creation_release" }, k = 2, mv = { 1, 7, 1 })
public final class MediaCodecExtensionsKt
{
    public static final void cleanUp(final MediaCodec mediaCodec) {
        e.f((Object)mediaCodec, "<this>");
        try {
            mediaCodec.stop();
            mediaCodec.release();
        }
        catch (final IllegalStateException ex) {
            a.a.p((Throwable)ex);
        }
        mediaCodec.release();
    }
}
