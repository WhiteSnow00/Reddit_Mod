// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import al0.g7;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Collections;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.graphics.Bitmap$Config;

public final class j implements d
{
    public static final Bitmap$Config j;
    public final k a;
    public final Set<Bitmap$Config> b;
    public final j.j$a c;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    
    static {
        j = Bitmap$Config.ARGB_8888;
    }
    
    public j(final long d) {
        final m a = new m();
        final HashSet set = new HashSet((Collection<? extends E>)Arrays.asList(Bitmap$Config.values()));
        final int sdk_INT = Build$VERSION.SDK_INT;
        set.add(null);
        if (sdk_INT >= 26) {
            set.remove(Bitmap$Config.HARDWARE);
        }
        final Set<Object> unmodifiableSet = (Set<Object>)Collections.unmodifiableSet((Set<? extends Bitmap$Config>)set);
        this.d = d;
        this.a = (k)a;
        this.b = (Set<Bitmap$Config>)unmodifiableSet;
        this.c = new j.j$a();
    }
    
    public final void a() {
        final StringBuilder r = a.r("Hits=");
        r.append(this.f);
        r.append(", misses=");
        r.append(this.g);
        r.append(", puts=");
        r.append(this.h);
        r.append(", evictions=");
        r.append(this.i);
        r.append(", currentSize=");
        r.append(this.e);
        r.append(", maxSize=");
        r.append(this.d);
        r.append("\nStrategy=");
        r.append(this.a);
        Log.v("LruBitmapPool", r.toString());
    }
    
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        monitorenter(this);
        Label_0311: {
            Label_0260: {
                Object o;
                try {
                    if (Build$VERSION.SDK_INT >= 26) {
                        if (bitmap$Config == Bitmap$Config.HARDWARE) {
                            break Label_0260;
                        }
                    }
                    final k a = this.a;
                    if (bitmap$Config != null) {
                        o = bitmap$Config;
                    }
                    else {
                        o = r8.j.j;
                    }
                    o = a.get(n, n2, (Bitmap$Config)o);
                    if (o == null) {
                        if (Log.isLoggable("LruBitmapPool", 3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Missing bitmap=");
                            sb.append(this.a.logBitmap(n, n2, bitmap$Config));
                            Log.d("LruBitmapPool", sb.toString());
                        }
                        ++this.g;
                    }
                    else {
                        ++this.f;
                        this.e -= this.a.getSize((Bitmap)o);
                        this.c.getClass();
                        ((Bitmap)o).setHasAlpha(true);
                        ((Bitmap)o).setPremultiplied(true);
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Get bitmap=");
                        sb2.append(this.a.logBitmap(n, n2, bitmap$Config));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a();
                    }
                }
                finally {
                    break Label_0311;
                }
                monitorexit(this);
                return (Bitmap)o;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create a mutable Bitmap with config: ");
            final Throwable t;
            sb3.append(t);
            sb3.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb3.toString());
        }
        monitorexit(this);
    }
    
    public final void c(final long n) {
        synchronized (this) {
            while (this.e > n) {
                final Bitmap removeLast = this.a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        this.a();
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                this.e -= this.a.getSize(removeLast);
                ++this.i;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.a.logBitmap(removeLast));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.a();
                }
                removeLast.recycle();
            }
        }
    }
    
    public final void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        this.c(0L);
    }
    
    public final Bitmap get(final int n, final int n2, Bitmap$Config j) {
        final Bitmap b = this.b(n, n2, j);
        Bitmap bitmap;
        if (b != null) {
            b.eraseColor(0);
            bitmap = b;
        }
        else {
            if (j == null) {
                j = j.j;
            }
            bitmap = Bitmap.createBitmap(n, n2, j);
        }
        return bitmap;
    }
    
    public final Bitmap getDirty(final int n, final int n2, Bitmap$Config j) {
        Bitmap bitmap;
        if ((bitmap = this.b(n, n2, j)) == null) {
            if (j == null) {
                j = j.j;
            }
            bitmap = Bitmap.createBitmap(n, n2, j);
        }
        return bitmap;
    }
    
    public final void put(final Bitmap bitmap) {
        monitorenter(this);
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        Label_0311: {
            Label_0188: {
                try {
                    if (bitmap.isRecycled()) {
                        throw new IllegalStateException("Cannot pool recycled bitmap");
                    }
                    if (!bitmap.isMutable() || this.a.getSize(bitmap) > this.d || !this.b.contains(bitmap.getConfig())) {
                        break Label_0188;
                    }
                    final int size = this.a.getSize(bitmap);
                    this.a.put(bitmap);
                    this.c.getClass();
                    ++this.h;
                    this.e += size;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Put bitmap in pool=");
                        sb.append(this.a.logBitmap(bitmap));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a();
                    }
                }
                finally {
                    break Label_0311;
                }
                this.c(this.d);
                monitorexit(this);
                return;
            }
            final Bitmap bitmap2;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.a.logBitmap(bitmap2));
                sb2.append(", is mutable: ");
                sb2.append(bitmap2.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.b.contains(bitmap2.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap2.recycle();
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final void trimMemory(final int n) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            g7.v("trimMemory, level=", n, "LruBitmapPool");
        }
        if (n < 40 && n < 20) {
            if (n >= 20 || n == 15) {
                this.c(this.d / 2L);
            }
        }
        else {
            this.clearMemory();
        }
    }
}
