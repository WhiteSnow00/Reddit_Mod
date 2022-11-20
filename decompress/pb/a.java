// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import cd.g$b;
import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.c$c;
import android.media.MediaCodec$OnFrameRenderedListener;

public final class a implements MediaCodec$OnFrameRenderedListener
{
    public final com.google.android.exoplayer2.mediacodec.a f;
    public final c$c g;
    
    public a(final com.google.android.exoplayer2.mediacodec.a f, final c$c g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onFrameRendered(final MediaCodec mediaCodec, final long n, final long n2) {
        final com.google.android.exoplayer2.mediacodec.a f = this.f;
        final c$c g = this.g;
        f.getClass();
        ((g$b)g).b(n);
    }
}
