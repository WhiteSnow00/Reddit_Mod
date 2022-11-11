// 
// Decompiled by Procyon v0.6.0
// 

package b9;

import android.graphics.Bitmap;
import j8.e;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.load.DecodeFormat;
import android.os.SystemClock;
import q8.l;
import java.io.IOException;
import o8.f;
import o8.g;
import android.util.Log;
import r8.d;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import android.content.Context;
import java.nio.ByteBuffer;
import o8.h;

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
    
    public a(final Context context, final List<ImageHeaderParser> b, final d d, final r8.b b2) {
        final a.a$b g = b9.a.g;
        final a.a$a f = b9.a.f;
        this.a = context.getApplicationContext();
        this.b = b;
        this.d = f;
        this.e = new b(b2, d);
        this.c = g;
    }
    
    public static int d(final j8.c c, final int n, final int n2) {
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
            final StringBuilder j = al0.b.j("Downsampling GIF, sampleSize: ", max, ", target dimens: [", n, "x");
            j.append(n2);
            j.append("], actual dimens: [");
            j.append(c.f);
            j.append("x");
            j.append(c.g);
            j.append("]");
            Log.v("BufferGifDecoder", j.toString());
        }
        return max;
    }
    
    @Override
    public final boolean a(final Object o, final g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        if (!g.a((f<Boolean>)b9.h.b)) {
            final List<ImageHeaderParser> b = this.b;
            Enum<ImageHeaderParser.ImageType> enum1;
            if (byteBuffer == null) {
                enum1 = ImageHeaderParser.ImageType.UNKNOWN;
            }
            else {
                enum1 = com.bumptech.glide.load.d.c(b, (com.bumptech.glide.load.d.a)new com.bumptech.glide.load.b(byteBuffer));
            }
            if (enum1 == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final l b(Object o, final int n, final int n2, g g) throws IOException {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        final a.a$b c = this.c;
        synchronized (c) {
            if ((o = c.a.poll()) == null) {
                o = new j8.d();
            }
            ((j8.d)o).g(byteBuffer);
            monitorexit(c);
            try {
                final b9.d c2 = this.c(byteBuffer, n, n2, (j8.d)o, g);
                g = (g)this.c;
                synchronized (g) {
                    ((j8.d)o).b = null;
                    ((j8.d)o).c = null;
                    ((a.a$b)g).a.offer(o);
                    return (l)c2;
                }
            }
            finally {
                g = (g)this.c;
                synchronized (g) {
                    ((j8.d)o).b = null;
                    ((j8.d)o).c = null;
                    ((a.a$b)g).a.offer(o);
                }
            }
        }
    }
    
    public final b9.d c(final ByteBuffer byteBuffer, final int n, final int n2, final j8.d d, final g g) {
        final int b = k9.f.b;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            final j8.c b2 = d.b();
            if (b2.c <= 0 || b2.b != 0) {
                return null;
            }
            Bitmap$Config bitmap$Config;
            if (g.a((f<Object>)b9.h.a) == DecodeFormat.PREFER_RGB_565) {
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
            return new b9.d(new c(new c$a(new b9.f(com.bumptech.glide.c.b(this.a), e2, n, n2, w8.d.a, nextFrame))));
        }
        finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                final StringBuilder r = a.r("Decoded GIF from stream in ");
                r.append(k9.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", r.toString());
            }
        }
    }
}
