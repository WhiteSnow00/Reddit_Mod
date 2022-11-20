// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import android.media.MediaCodec$CryptoInfo;
import java.util.concurrent.atomic.AtomicReference;
import android.os.HandlerThread;
import android.media.MediaCodec;
import java.util.ArrayDeque;

public final class e
{
    public static final ArrayDeque<a> g;
    public static final Object h;
    public final MediaCodec a;
    public final HandlerThread b;
    public d c;
    public final AtomicReference<RuntimeException> d;
    public final bd.e e;
    public boolean f;
    
    static {
        g = new ArrayDeque<a>();
        h = new Object();
    }
    
    public e(final MediaCodec a, final HandlerThread b) {
        final bd.e e = new bd.e();
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = new AtomicReference<RuntimeException>();
    }
    
    public final void a() {
        if (this.f) {
            try {
                final d c = this.c;
                c.getClass();
                c.removeCallbacksAndMessages((Object)null);
                this.e.d();
                final d c2 = this.c;
                c2.getClass();
                c2.obtainMessage(2).sendToTarget();
                this.e.a();
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(ex);
            }
        }
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public int c;
        public final MediaCodec$CryptoInfo d;
        public long e;
        public int f;
        
        public a() {
            this.d = new MediaCodec$CryptoInfo();
        }
    }
}
