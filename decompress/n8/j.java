// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import a81.e;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import android.os.SystemClock;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.DecodeFormat;
import o8.g;
import java.util.concurrent.locks.Lock;
import java.io.Serializable;
import android.util.Log;
import android.graphics.Rect;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import x8.v;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import ml0.a;
import java.io.IOException;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a$b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import r8.b;
import android.util.DisplayMetrics;
import r8.d;
import java.util.ArrayDeque;
import o8.f;

public final class j
{
    public static final f<Boolean> e;
    public static final j$a f;
    public static final ArrayDeque g;
    public final d a;
    public final DisplayMetrics b;
    public final b c;
    public final List<ImageHeaderParser> d;
    
    static {
        e = o8.f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");
        f = new a$b() {
            public final void a() {
            }
            
            public final void b(final d d, final Bitmap bitmap) throws IOException {
            }
        };
        final char[] a = k9.j.a;
        g = new ArrayDeque(0);
    }
    
    public j(final List<ImageHeaderParser> d, final DisplayMetrics b, final d a, final b c) {
        this.d = d;
        ml0.a.l((Object)b);
        this.b = b;
        ml0.a.l((Object)a);
        this.a = a;
        ml0.a.l((Object)c);
        this.c = c;
    }
    
    public static Bitmap c(final InputStream inputStream, final BitmapFactory$Options bitmapFactory$Options, final j$a a$b, final d d) throws IOException {
        if (bitmapFactory$Options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        }
        else {
            a$b.getClass();
        }
        final int outWidth = bitmapFactory$Options.outWidth;
        final int outHeight = bitmapFactory$Options.outHeight;
        Serializable s = bitmapFactory$Options.outMimeType;
        final Lock d2 = v.d;
        d2.lock();
        try {
            final Bitmap decodeStream = WebpBitmapFactory.decodeStream(inputStream, null, bitmapFactory$Options);
            d2.unlock();
            if (bitmapFactory$Options.inJustDecodeBounds) {
                inputStream.reset();
            }
            return decodeStream;
        }
        catch (final IllegalArgumentException ex) {
            s = e(ex, outWidth, outHeight, (String)s, bitmapFactory$Options);
            if (Log.isLoggable("WebpDownsampler", 3)) {
                Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", (Throwable)s);
            }
            if (bitmapFactory$Options.inBitmap != null) {
                final InputStream inputStream2 = inputStream;
                inputStream2.reset();
                final d d3 = d;
                final BitmapFactory$Options bitmapFactory$Options2 = bitmapFactory$Options;
                final Bitmap bitmap = bitmapFactory$Options2.inBitmap;
                d3.put(bitmap);
                final BitmapFactory$Options bitmapFactory$Options3 = bitmapFactory$Options;
                final Bitmap bitmap2 = null;
                bitmapFactory$Options3.inBitmap = bitmap2;
                final InputStream inputStream3 = inputStream;
                final BitmapFactory$Options bitmapFactory$Options4 = bitmapFactory$Options;
                final a$b a$b2 = (a$b)a$b;
                final d d4 = d;
                final Bitmap bitmap3 = c(inputStream3, bitmapFactory$Options4, a$b2, d4);
                final Lock lock = v.d;
                lock.unlock();
                return bitmap3;
            }
            throw s;
        }
        try {
            final InputStream inputStream2 = inputStream;
            inputStream2.reset();
            final d d3 = d;
            final BitmapFactory$Options bitmapFactory$Options2 = bitmapFactory$Options;
            final Bitmap bitmap = bitmapFactory$Options2.inBitmap;
            d3.put(bitmap);
            final BitmapFactory$Options bitmapFactory$Options3 = bitmapFactory$Options;
            final Bitmap bitmap2 = null;
            bitmapFactory$Options3.inBitmap = bitmap2;
            final InputStream inputStream3 = inputStream;
            final BitmapFactory$Options bitmapFactory$Options4 = bitmapFactory$Options;
            final a$b a$b2 = (a$b)a$b;
            final d d4 = d;
            final Bitmap bitmap3 = c(inputStream3, bitmapFactory$Options4, a$b2, d4);
            final Lock lock = v.d;
            lock.unlock();
            return bitmap3;
        }
        catch (final IOException ex2) {}
        v.d.unlock();
    }
    
    public static String d(final Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        final StringBuilder r = a.r(" (");
        r.append(bitmap.getAllocationByteCount());
        r.append(")");
        final String string = r.toString();
        final StringBuilder r2 = a.r("[");
        r2.append(bitmap.getWidth());
        r2.append("x");
        r2.append(bitmap.getHeight());
        r2.append("] ");
        r2.append(bitmap.getConfig());
        r2.append(string);
        return r2.toString();
    }
    
    public static IOException e(final IllegalArgumentException ex, final int n, final int n2, final String s, final BitmapFactory$Options bitmapFactory$Options) {
        final StringBuilder j = al0.b.j("Exception decoding bitmap, outWidth: ", n, ", outHeight: ", n2, ", outMimeType: ");
        j.append(s);
        j.append(", inBitmap: ");
        j.append(d(bitmapFactory$Options.inBitmap));
        return new IOException(j.toString(), ex);
    }
    
    public static void f(final BitmapFactory$Options bitmapFactory$Options) {
        bitmapFactory$Options.inTempStorage = null;
        bitmapFactory$Options.inDither = false;
        bitmapFactory$Options.inScaled = false;
        bitmapFactory$Options.inSampleSize = 1;
        bitmapFactory$Options.inPreferredConfig = null;
        bitmapFactory$Options.inJustDecodeBounds = false;
        bitmapFactory$Options.inDensity = 0;
        bitmapFactory$Options.inTargetDensity = 0;
        bitmapFactory$Options.outWidth = 0;
        bitmapFactory$Options.outHeight = 0;
        bitmapFactory$Options.outMimeType = null;
        bitmapFactory$Options.inBitmap = null;
        bitmapFactory$Options.inMutable = true;
    }
    
    public final x8.d a(InputStream g, final int n, final int n2, final g g2) throws IOException {
        final a$b f = (a$b)j.f;
        ml0.a.i(g.markSupported(), "You must provide an InputStream that supports mark()");
        final byte[] inTempStorage = (byte[])this.c.b((Class)byte[].class, 65536);
        synchronized (j.class) {
            final ArrayDeque g3 = j.g;
            synchronized (g3) {
                final BitmapFactory$Options bitmapFactory$Options = g3.poll();
                monitorexit(g3);
                BitmapFactory$Options bitmapFactory$Options2 = bitmapFactory$Options;
                if (bitmapFactory$Options == null) {
                    bitmapFactory$Options2 = new BitmapFactory$Options();
                    f(bitmapFactory$Options2);
                }
                monitorexit(j.class);
                bitmapFactory$Options2.inTempStorage = inTempStorage;
                final DecodeFormat decodeFormat = g2.a((f<DecodeFormat>)com.bumptech.glide.load.resource.bitmap.a.f);
                final DownsampleStrategy downsampleStrategy = g2.a((f<DownsampleStrategy>)com.bumptech.glide.load.resource.bitmap.a.h);
                final boolean booleanValue = g2.a((f<Boolean>)com.bumptech.glide.load.resource.bitmap.a.i);
                final f j = com.bumptech.glide.load.resource.bitmap.a.j;
                if (g2.a((f<Object>)j) != null) {
                    g2.a((f<Boolean>)j).booleanValue();
                }
                try {
                    final x8.d b = x8.d.b(this.a, this.b(g, bitmapFactory$Options2, downsampleStrategy, decodeFormat, n, n2, booleanValue, f));
                    f(bitmapFactory$Options2);
                    synchronized (g3) {
                        g3.offer(bitmapFactory$Options2);
                        monitorexit(g3);
                        this.c.put((Object)inTempStorage);
                        return b;
                    }
                }
                finally {
                    f(bitmapFactory$Options2);
                    g = (InputStream)n8.j.g;
                    synchronized (g) {
                        ((ArrayDeque<BitmapFactory$Options>)g).offer(bitmapFactory$Options2);
                        monitorexit(g);
                        this.c.put((Object)inTempStorage);
                    }
                }
            }
        }
    }
    
    public final Bitmap b(final InputStream inputStream, final BitmapFactory$Options bitmapFactory$Options, final DownsampleStrategy downsampleStrategy, final DecodeFormat decodeFormat, final int n, final int n2, final boolean b, final j$a a$b) throws IOException {
        final int b2 = k9.f.b;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final d a = this.a;
        bitmapFactory$Options.inJustDecodeBounds = true;
        c(inputStream, bitmapFactory$Options, a$b, a);
        bitmapFactory$Options.inJustDecodeBounds = false;
        final int outWidth = bitmapFactory$Options.outWidth;
        final int outHeight = bitmapFactory$Options.outHeight;
        final String outMimeType = bitmapFactory$Options.outMimeType;
        final int a2 = com.bumptech.glide.load.d.a(this.c, inputStream, this.d);
        final int f = v.f(a2);
        int n3;
        if (n == Integer.MIN_VALUE) {
            n3 = outWidth;
        }
        else {
            n3 = n;
        }
        int round;
        if (n2 == Integer.MIN_VALUE) {
            round = outHeight;
        }
        else {
            round = n2;
        }
        final ImageHeaderParser.ImageType b3 = com.bumptech.glide.load.d.b(this.c, inputStream, this.d);
        final d a3 = this.a;
        final float n4 = 1.0f;
        if (outWidth > 0) {
            if (outHeight > 0) {
                float n5;
                if (f != 90 && f != 270) {
                    n5 = downsampleStrategy.b(outWidth, outHeight, n3, round);
                }
                else {
                    n5 = downsampleStrategy.b(outHeight, outWidth, n3, round);
                }
                if (n5 <= 0.0f) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot scale with factor: ");
                    sb.append(n5);
                    sb.append(" from: ");
                    sb.append(downsampleStrategy);
                    sb.append(", source: [");
                    d.z(sb, outWidth, "x", outHeight, "], target: [");
                    sb.append(n3);
                    sb.append("x");
                    sb.append(round);
                    sb.append("]");
                    throw new IllegalArgumentException(sb.toString());
                }
                final DownsampleStrategy.SampleSizeRounding a4 = downsampleStrategy.a(outWidth, outHeight, n3, round);
                if (a4 == null) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                final float n6 = (float)outWidth;
                final int n7 = (int)(n5 * n6 + 0.5);
                final float n8 = (float)outHeight;
                final int n9 = (int)(n5 * n8 + 0.5);
                final int n10 = outWidth / n7;
                final int n11 = outHeight / n9;
                final DownsampleStrategy.SampleSizeRounding memory = DownsampleStrategy.SampleSizeRounding.MEMORY;
                int n12;
                if (a4 == memory) {
                    n12 = Math.max(n10, n11);
                }
                else {
                    n12 = Math.min(n10, n11);
                }
                int max;
                final int n13 = max = Math.max(1, Integer.highestOneBit(n12));
                if (a4 == memory) {
                    max = n13;
                    if (n13 < 1.0f / n5) {
                        max = n13 << 1;
                    }
                }
                bitmapFactory$Options.inSampleSize = max;
                int n18;
                int n19;
                if (b3 == ImageHeaderParser.ImageType.JPEG) {
                    final float n14 = (float)Math.min(max, 8);
                    final int n15 = (int)Math.ceil(n6 / n14);
                    final int n16 = (int)Math.ceil(n8 / n14);
                    final int n17 = max / 8;
                    n18 = n16;
                    n19 = n15;
                    if (n17 > 0) {
                        n19 = n15 / n17;
                        n18 = n16 / n17;
                    }
                }
                else if (b3 != ImageHeaderParser.ImageType.PNG && b3 != ImageHeaderParser.ImageType.PNG_A) {
                    if (b3 != ImageHeaderParser.ImageType.WEBP && b3 != ImageHeaderParser.ImageType.WEBP_A) {
                        if (outWidth % max == 0 && outHeight % max == 0) {
                            n19 = outWidth / max;
                            n18 = outHeight / max;
                        }
                        else {
                            bitmapFactory$Options.inJustDecodeBounds = true;
                            c(inputStream, bitmapFactory$Options, a$b, a3);
                            bitmapFactory$Options.inJustDecodeBounds = false;
                            n19 = bitmapFactory$Options.outWidth;
                            n18 = bitmapFactory$Options.outHeight;
                        }
                    }
                    else {
                        final float n20 = (float)max;
                        n19 = Math.round(n6 / n20);
                        n18 = Math.round(n8 / n20);
                    }
                }
                else {
                    final float n21 = (float)max;
                    n19 = (int)Math.floor(n6 / n21);
                    n18 = (int)Math.floor(n8 / n21);
                }
                final int n22 = n3;
                final double n23 = downsampleStrategy.b(n19, n18, n22, round);
                final int n24 = (int)(1.0E9 * n23 + 0.5);
                final int inTargetDensity = (int)(n23 / (n24 / 1.0E9f) * n24 + 0.5);
                bitmapFactory$Options.inTargetDensity = inTargetDensity;
                bitmapFactory$Options.inDensity = 1000000000;
                if (inTargetDensity > 0 && inTargetDensity != 1000000000) {
                    bitmapFactory$Options.inScaled = true;
                }
                else {
                    bitmapFactory$Options.inTargetDensity = 0;
                    bitmapFactory$Options.inDensity = 0;
                }
                final String s = "WebpDownsampler";
                if (Log.isLoggable(s, 2)) {
                    final String s2 = "x";
                    final StringBuilder j = al0.b.j("Calculate scaling, source: [", outWidth, s2, outHeight, "], target: [");
                    d.z(j, n22, s2, round, "], power of two scaled: [");
                    d.z(j, n19, s2, n18, "], exact scale factor: ");
                    j.append(n5);
                    j.append(", power of 2 sample size: ");
                    j.append(max);
                    j.append(", adjusted scale factor: ");
                    j.append(n23);
                    j.append(", target density: ");
                    j.append(bitmapFactory$Options.inTargetDensity);
                    j.append(", density: ");
                    j.append(bitmapFactory$Options.inDensity);
                    Log.v(s, j.toString());
                }
            }
        }
        if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
            final String s3 = "WebpDownsampler";
            boolean hasAlpha;
            try {
                hasAlpha = com.bumptech.glide.load.d.b(this.c, inputStream, this.d).hasAlpha();
            }
            catch (final IOException ex) {
                if (Log.isLoggable(s3, 3)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb2.append(decodeFormat);
                    Log.d(s3, sb2.toString(), (Throwable)ex);
                }
                hasAlpha = false;
            }
            Bitmap$Config inPreferredConfig;
            if (hasAlpha) {
                inPreferredConfig = Bitmap$Config.ARGB_8888;
            }
            else {
                inPreferredConfig = Bitmap$Config.RGB_565;
            }
            bitmapFactory$Options.inPreferredConfig = inPreferredConfig;
            if (inPreferredConfig == Bitmap$Config.RGB_565 || inPreferredConfig == Bitmap$Config.ARGB_4444 || inPreferredConfig == Bitmap$Config.ALPHA_8) {
                bitmapFactory$Options.inDither = true;
            }
        }
        else {
            bitmapFactory$Options.inPreferredConfig = Bitmap$Config.ARGB_8888;
        }
        final String s4 = "WebpDownsampler";
        boolean b4 = true;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int inSampleSize = bitmapFactory$Options.inSampleSize;
        int round2;
        if (b) {
            round2 = n3;
        }
        else {
            final int inTargetDensity2 = bitmapFactory$Options.inTargetDensity;
            Label_1199: {
                if (inTargetDensity2 > 0) {
                    final int inDensity = bitmapFactory$Options.inDensity;
                    if (inDensity > 0 && inTargetDensity2 != inDensity) {
                        break Label_1199;
                    }
                }
                b4 = false;
            }
            float n25 = n4;
            if (b4) {
                n25 = inTargetDensity2 / (float)bitmapFactory$Options.inDensity;
            }
            final float n26 = (float)outWidth;
            final float n27 = (float)inSampleSize;
            final int n28 = (int)Math.ceil(n26 / n27);
            final int n29 = (int)Math.ceil(outHeight / n27);
            round2 = Math.round(n28 * n25);
            round = Math.round(n29 * n25);
            if (Log.isLoggable(s4, 2)) {
                final StringBuilder i = al0.b.j("Calculated target [", round2, "x", round, "] for source [");
                d.z(i, outWidth, "x", outHeight, "], sampleSize: ");
                i.append(inSampleSize);
                i.append(", targetDensity: ");
                i.append(bitmapFactory$Options.inTargetDensity);
                i.append(", density: ");
                i.append(bitmapFactory$Options.inDensity);
                i.append(", density multiplier: ");
                i.append(n25);
                Log.v(s4, i.toString());
            }
        }
        if (round2 > 0 && round > 0) {
            final d a5 = this.a;
            if (sdk_INT < 26 || bitmapFactory$Options.inPreferredConfig != Bitmap$Config.HARDWARE) {
                bitmapFactory$Options.inBitmap = a5.getDirty(round2, round, bitmapFactory$Options.inPreferredConfig);
            }
        }
        final Bitmap c = c(inputStream, bitmapFactory$Options, a$b, this.a);
        a$b.getClass();
        if (Log.isLoggable(s4, 2)) {
            final StringBuilder r = a.r("Decoded ");
            r.append(d(c));
            r.append(" from [");
            r.append(outWidth);
            r.append("x");
            r.append(outHeight);
            a81.e.A(r, "] ", outMimeType, " with inBitmap ");
            r.append(d(bitmapFactory$Options.inBitmap));
            r.append(" for [");
            r.append(n);
            r.append("x");
            r.append(n2);
            r.append("], sample size: ");
            r.append(bitmapFactory$Options.inSampleSize);
            r.append(", density: ");
            r.append(bitmapFactory$Options.inDensity);
            r.append(", target density: ");
            r.append(bitmapFactory$Options.inTargetDensity);
            r.append(", thread: ");
            r.append(Thread.currentThread().getName());
            r.append(", duration: ");
            r.append(k9.f.a(elapsedRealtimeNanos));
            Log.v(s4, r.toString());
        }
        Bitmap h = null;
        if (c != null) {
            c.setDensity(this.b.densityDpi);
            final Bitmap bitmap = h = v.h(this.a, c, a2);
            if (!c.equals(bitmap)) {
                this.a.put(c);
                h = bitmap;
            }
        }
        return h;
    }
}
