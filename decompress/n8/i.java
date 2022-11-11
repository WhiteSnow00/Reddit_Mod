// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import com.bumptech.glide.integration.webp.WebpFrame;
import al0.g7;
import android.util.DisplayMetrics;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import j8.c;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.util.Log;
import b9.b;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import android.graphics.Paint;
import j8.a$a;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import j8.a;

public final class i implements a
{
    public ByteBuffer a;
    public WebpImage b;
    public final a$a c;
    public int d;
    public final int[] e;
    public final m8.a[] f;
    public int g;
    public int h;
    public int i;
    public final Paint j;
    public WebpFrameCacheStrategy k;
    public Bitmap$Config l;
    public final h m;
    
    public i(final b c, final WebpImage b, final ByteBuffer byteBuffer, int highestOneBit, final WebpFrameCacheStrategy k) {
        this.d = -1;
        this.l = Bitmap$Config.ARGB_8888;
        this.c = (a$a)c;
        this.b = b;
        this.e = b.getFrameDurations();
        this.f = new m8.a[b.getFrameCount()];
        for (int i = 0; i < this.b.getFrameCount(); ++i) {
            this.f[i] = this.b.getFrameInfo(i);
            if (Log.isLoggable("WebpDecoder", 3)) {
                final StringBuilder r = a.r("mFrameInfos: ");
                r.append(this.f[i].toString());
                Log.d("WebpDecoder", r.toString());
            }
        }
        this.k = k;
        final Paint j = new Paint();
        (this.j = j).setColor(0);
        j.setStyle(Paint$Style.FILL);
        j.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        int n;
        if (this.k.a == WebpFrameCacheStrategy.CacheControl.CACHE_ALL) {
            n = b.getFrameCount();
        }
        else {
            n = Math.max(5, 0);
        }
        this.m = new h(this, n);
        new c();
        if (highestOneBit > 0) {
            highestOneBit = Integer.highestOneBit(highestOneBit);
            (this.a = byteBuffer.asReadOnlyBuffer()).position(0);
            this.g = highestOneBit;
            this.i = this.b.getWidth() / highestOneBit;
            this.h = this.b.getHeight() / highestOneBit;
            return;
        }
        throw new IllegalArgumentException(d.h("Sample size must be >=0, not: ", highestOneBit));
    }
    
    public final void a() {
        this.d = (this.d + 1) % this.b.getFrameCount();
    }
    
    public final int b() {
        return this.d;
    }
    
    public final int c() {
        return this.b.getSizeInBytes();
    }
    
    public final void clear() {
        this.b.dispose();
        this.b = null;
        this.m.evictAll();
        this.a = null;
    }
    
    public final int d() {
        return this.b.getFrameCount();
    }
    
    public final int e() {
        final int[] e = this.e;
        if (e.length != 0) {
            final int d = this.d;
            if (d >= 0) {
                int n;
                if (d >= 0 && d < e.length) {
                    n = e[d];
                }
                else {
                    n = -1;
                }
                return n;
            }
        }
        return 0;
    }
    
    public final void f(final Canvas canvas, final m8.a a) {
        final int b = a.b;
        final int g = this.g;
        final float n = (float)(b / g);
        final int c = a.c;
        canvas.drawRect(n, (float)(c / g), (float)((b + a.d) / g), (float)((c + a.e) / g), this.j);
    }
    
    public final boolean g(final m8.a a) {
        return a.b == 0 && a.c == 0 && a.d == this.b.getWidth() && a.e == this.b.getHeight();
    }
    
    public final ByteBuffer getData() {
        return this.a;
    }
    
    public final Bitmap getNextFrame() {
        final int d = this.d;
        final Bitmap b = this.c.b(this.i, this.h, Bitmap$Config.ARGB_8888);
        b.eraseColor(0);
        b.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        final Canvas canvas = new Canvas(b);
        canvas.drawColor(0, PorterDuff$Mode.SRC);
        if (this.k.a != WebpFrameCacheStrategy.CacheControl.CACHE_NONE) {
            final Bitmap bitmap = (Bitmap)this.m.get((Object)d);
            if (bitmap != null) {
                if (Log.isLoggable("WebpDecoder", 3)) {
                    g7.v("hit frame bitmap from memory cache, frameNumber=", d, "WebpDecoder");
                }
                bitmap.setDensity(canvas.getDensity());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
                return b;
            }
        }
        int i = 0;
        Label_0281: {
            if (!this.h(d)) {
                i = d - 1;
                while (i >= 0) {
                    final m8.a a = this.f[i];
                    if (!a.h || !this.g(a)) {
                        final Bitmap bitmap2 = (Bitmap)this.m.get((Object)i);
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.setDensity(canvas.getDensity());
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint)null);
                            if (a.h) {
                                this.f(canvas, a);
                            }
                        }
                        else {
                            if (this.h(i)) {
                                break Label_0281;
                            }
                            --i;
                            continue;
                        }
                    }
                    ++i;
                    break Label_0281;
                }
                i = 0;
            }
            else {
                i = d;
            }
        }
        int j = i;
        if (Log.isLoggable("WebpDecoder", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("frameNumber=");
            sb.append(d);
            sb.append(", nextIndex=");
            sb.append(i);
            Log.d("WebpDecoder", sb.toString());
            j = i;
        }
        while (j < d) {
            final m8.a a2 = this.f[j];
            if (!a2.g) {
                this.f(canvas, a2);
            }
            this.i(canvas, j);
            if (Log.isLoggable("WebpDecoder", 3)) {
                final StringBuilder k = al0.b.i("renderFrame, index=", j, ", blend=");
                k.append(a2.g);
                k.append(", dispose=");
                k.append(a2.h);
                Log.d("WebpDecoder", k.toString());
            }
            if (a2.h) {
                this.f(canvas, a2);
            }
            ++j;
        }
        final m8.a a3 = this.f[d];
        if (!a3.g) {
            this.f(canvas, a3);
        }
        this.i(canvas, d);
        if (Log.isLoggable("WebpDecoder", 3)) {
            final StringBuilder l = al0.b.i("renderFrame, index=", d, ", blend=");
            l.append(a3.g);
            l.append(", dispose=");
            l.append(a3.h);
            Log.d("WebpDecoder", l.toString());
        }
        this.m.remove((Object)d);
        final Bitmap b2 = this.c.b(b.getWidth(), b.getHeight(), b.getConfig());
        b2.eraseColor(0);
        b2.setDensity(b.getDensity());
        final Canvas canvas2 = new Canvas(b2);
        canvas2.drawColor(0, PorterDuff$Mode.SRC);
        canvas2.drawBitmap(b, 0.0f, 0.0f, (Paint)null);
        this.m.put((Object)d, (Object)b2);
        return b;
    }
    
    public final boolean h(final int n) {
        boolean b = true;
        if (n == 0) {
            return true;
        }
        final m8.a[] f = this.f;
        final m8.a a = f[n];
        final m8.a a2 = f[n - 1];
        if (!a.g && this.g(a)) {
            return true;
        }
        if (!a2.h || !this.g(a2)) {
            b = false;
        }
        return b;
    }
    
    public final void i(final Canvas canvas, final int n) {
        final m8.a a = this.f[n];
        final int d = a.d;
        final int g = this.g;
        final int n2 = d / g;
        final int n3 = a.e / g;
        final int n4 = a.b / g;
        final int n5 = a.c / g;
        final WebpFrame frame = this.b.getFrame(n);
        try {
            try {
                final Bitmap b = this.c.b(n2, n3, this.l);
                b.eraseColor(0);
                b.setDensity(canvas.getDensity());
                frame.renderFrame(n2, n3, b);
                canvas.drawBitmap(b, (float)n4, (float)n5, (Paint)null);
                this.c.c(b);
            }
            finally {}
        }
        catch (final IllegalStateException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Rendering of frame failed. Frame number: ");
            sb.append(n);
            Log.e("WebpDecoder", sb.toString());
        }
        frame.dispose();
        return;
        frame.dispose();
    }
}
