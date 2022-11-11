// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.decoder;

import java.io.IOException;
import android.os.Build;
import sg2.e;
import android.media.MediaCodec;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\b" }, d2 = { "Lcom/reddit/video/creation/video/render/decoder/DecoderFactory;", "", "()V", "createDecoder", "Landroid/media/MediaCodec;", "mime", "", "getDecoderForAllOtherDevices", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DecoderFactory
{
    public static final int $stable = 0;
    public static final DecoderFactory INSTANCE;
    
    static {
        INSTANCE = new DecoderFactory();
    }
    
    private DecoderFactory() {
    }
    
    public static final MediaCodec createDecoder(final String s) throws IOException {
        e.f((Object)s, "mime");
        final String model = Build.MODEL;
        if (model != null) {
            final int hashCode = model.hashCode();
            if (hashCode != 63391983) {
                if (hashCode != 63414086) {
                    if (hashCode != 2078826757) {
                        return DecoderFactory.INSTANCE.getDecoderForAllOtherDevices(s);
                    }
                    if (!model.equals("GT-I9500")) {
                        return DecoderFactory.INSTANCE.getDecoderForAllOtherDevices(s);
                    }
                }
                else if (!model.equals("C2104")) {
                    return DecoderFactory.INSTANCE.getDecoderForAllOtherDevices(s);
                }
            }
            else if (!model.equals("C1904")) {
                return DecoderFactory.INSTANCE.getDecoderForAllOtherDevices(s);
            }
            final MediaCodec mediaCodec = MediaCodec.createByCodecName("OMX.google.h264.decoder");
            e.e((Object)mediaCodec, "createByCodecName(\"OMX.google.h264.decoder\")");
            return mediaCodec;
        }
        return DecoderFactory.INSTANCE.getDecoderForAllOtherDevices(s);
    }
    
    private final MediaCodec getDecoderForAllOtherDevices(final String s) {
        final MediaCodec decoderByType = MediaCodec.createDecoderByType(s);
        e.e((Object)decoderByType, "createDecoderByType(mime)");
        return decoderByType;
    }
}
