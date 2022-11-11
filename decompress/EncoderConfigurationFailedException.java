// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import android.media.MediaCodecInfo;
import rg2.l;
import kotlin.collections.b;
import android.media.MediaCodecList;
import sg2.e;
import com.reddit.video.creation.video.render.encoder.EncoderContainer;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/creation/video/render/EncoderConfigurationFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "encoderContainer", "Lcom/reddit/video/creation/video/render/encoder/EncoderContainer;", "cause", "", "(Lcom/reddit/video/creation/video/render/encoder/EncoderContainer;Ljava/lang/Throwable;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EncoderConfigurationFailedException extends Exception
{
    public static final int $stable = 0;
    
    public EncoderConfigurationFailedException(final EncoderContainer encoderContainer, final Throwable t) {
        e.f((Object)encoderContainer, "encoderContainer");
        e.f((Object)t, "cause");
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not configure encoder:\nencoder:'");
        sb.append(encoderContainer.getEncoder().getName());
        sb.append("'\nmediaFormat: '");
        sb.append(encoderContainer.getMediaFormat());
        sb.append("'\navailable codecs: ");
        final MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        e.e((Object)codecInfos, "MediaCodecList(MediaCode\u2026EGULAR_CODECS).codecInfos");
        sb.append(b.i1(codecInfos, ", ", null, null, (l)EncoderConfigurationFailedException$1.INSTANCE, 30));
        super(sb.toString(), t);
    }
}
