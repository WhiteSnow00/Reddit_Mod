// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import android.graphics.Bitmap;
import k8.e;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.load.DecodeFormat;
import android.os.SystemClock;
import l9.f;
import com.bumptech.glide.load.d$a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import r8.l;
import p8.g;
import ak0.m;
import android.util.Log;
import s8.d;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import android.content.Context;
import java.nio.ByteBuffer;
import p8.h;

public final class a implements h<ByteBuffer, c>
{
    public static final a.a$a f;
    public static final a.a$b g;
    public final Context a;
    public final List<ImageHeaderParser> b;
    public final a.a$b c;
    public final a.a$a d;
    public final b e;
    
    static {
        f = new a.a$a();
        g = new a.a$b();
    }
    
    public a(final Context context, final List<ImageHeaderParser> b, final d d, final s8.b b2) {
        final a.a$b g = c9.a.g;
        final a.a$a f = c9.a.f;
        this.a = context.getApplicationContext();
        this.b = b;
        this.d = f;
        this.e = new b(b2, d);
        this.c = g;
    }
    
    public static int d(final k8.c c, final int n, final int n2) {
        final int min = Math.min(c.g / n2, c.f / n);
        int highestOneBit;
        if (min == 0) {
            highestOneBit = 0;
        }
        else {
            highestOneBit = Integer.highestOneBit(min);
        }
        final int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            final StringBuilder r = m.r("Downsampling GIF, sampleSize: ", max, ", target dimens: [", n, "x");
            r.append(n2);
            r.append("], actual dimens: [");
            r.append(c.f);
            r.append("x");
            r.append(c.g);
            r.append("]");
            Log.v("BufferGifDecoder", r.toString());
        }
        return max;
    }
    
    @Override
    public final l a(Object o, final int n, final int n2, g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        final a.a$b c = this.c;
        synchronized (c) {
            if ((o = c.a.poll()) == null) {
                o = new k8.d();
            }
            ((k8.d)o).g(byteBuffer);
            monitorexit(c);
            try {
                final c9.d c2 = this.c(byteBuffer, n, n2, (k8.d)o, g);
                g = (g)this.c;
                synchronized (g) {
                    ((k8.d)o).b = null;
                    ((k8.d)o).c = null;
                    ((a.a$b)g).a.offer(o);
                    return (l)c2;
                }
            }
            finally {
                g = (g)this.c;
                synchronized (g) {
                    ((k8.d)o).b = null;
                    ((k8.d)o).c = null;
                    ((a.a$b)g).a.offer(o);
                }
            }
        }
    }
    
    @Override
    public final boolean b(final Object o, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        if (!(boolean)g.a(c9.h.b)) {
            final List<ImageHeaderParser> b = this.b;
            ImageHeaderParser$ImageType imageHeaderParser$ImageType;
            if (byteBuffer == null) {
                imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
            }
            else {
                imageHeaderParser$ImageType = com.bumptech.glide.load.d.c((List)b, (d$a)new com.bumptech.glide.load.b(byteBuffer));
            }
            if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
    
    public final c9.d c(final ByteBuffer byteBuffer, final int n, final int n2, final k8.d d, final g g) {
        final int b = l9.f.b;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            final k8.c b2 = d.b();
            if (b2.c <= 0 || b2.b != 0) {
                return null;
            }
            Bitmap$Config bitmap$Config;
            if (g.a(c9.h.a) == DecodeFormat.PREFER_RGB_565) {
                bitmap$Config = Bitmap$Config.RGB_565;
            }
            else {
                bitmap$Config = Bitmap$Config.ARGB_8888;
            }
            final int d2 = d(b2, n, n2);
            final a.a$a d3 = this.d;
            final b e = this.e;
            d3.getClass();
            final e e2 = new e(e, b2, byteBuffer, d2);
            e2.g(bitmap$Config);
            e2.a();
            final Bitmap nextFrame = e2.getNextFrame();
            if (nextFrame == null) {
                return null;
            }
            return new c9.d(new c(new c$a(new c9.f(com.bumptech.glide.c.b(this.a), e2, n, n2, x8.d.a, nextFrame))));
        }
        finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                final StringBuilder k = a.k("Decoded GIF from stream in ");
                k.append(l9.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", k.toString());
            }
        }
    }
}
