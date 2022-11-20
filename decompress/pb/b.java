// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.a;
import sg.j;

public final class b implements j
{
    public final int f;
    
    public b(final int f) {
        this.f = f;
    }
    
    public final Object get() {
        return new HandlerThread(a.m(this.f, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
