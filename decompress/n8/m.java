// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import android.os.Message;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import ml0.a;
import android.os.Handler$Callback;
import android.os.Looper;
import com.bumptech.glide.c;
import android.graphics.Bitmap;
import r8.d;
import com.bumptech.glide.j;
import java.util.ArrayList;
import android.os.Handler;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import o8.f;

public final class m
{
    public static final f<WebpFrameCacheStrategy> r;
    public final i a;
    public final Handler b;
    public final ArrayList c;
    public final j d;
    public final r8.d e;
    public boolean f;
    public boolean g;
    public com.bumptech.glide.i<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public o8.j<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;
    
    static {
        r = f.a(WebpFrameCacheStrategy.c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");
    }
    
    public m(final com.bumptech.glide.c c, final i a, final int n, final int n2, final w8.d m, final Bitmap l) {
        final r8.d f = c.f;
        final j e = com.bumptech.glide.c.e(c.h.getBaseContext());
        final com.bumptech.glide.i apply = com.bumptech.glide.c.e(c.h.getBaseContext()).asBitmap().apply(((g9.a)((g9.a)((g9.a)g9.f.diskCacheStrategyOf((q8.f)q8.f.b)).useAnimationPool(true)).skipMemoryCache(true)).override(n, n2));
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.d = e;
        final Handler b = new Handler(Looper.getMainLooper(), (Handler$Callback)new c());
        this.e = f;
        this.b = b;
        this.h = (com.bumptech.glide.i<Bitmap>)apply;
        this.a = a;
        ml0.a.l((Object)m);
        this.m = (o8.j<Bitmap>)m;
        this.l = l;
        this.h = (com.bumptech.glide.i<Bitmap>)this.h.apply(((g9.a)new g9.f()).transform((o8.j)m));
        this.o = k9.j.d(l);
        this.p = l.getWidth();
        this.q = l.getHeight();
    }
    
    public final void a() {
        if (this.f) {
            if (!this.g) {
                final a n = this.n;
                if (n != null) {
                    this.n = null;
                    this.b(n);
                    return;
                }
                boolean b = true;
                this.g = true;
                final int e = this.a.e();
                final long uptimeMillis = SystemClock.uptimeMillis();
                final long n2 = e;
                this.a.a();
                final int d = this.a.d;
                this.k = new a(this.b, d, uptimeMillis + n2);
                final i a = this.a;
                final WebpFrameCacheStrategy k = a.k;
                final g9.f signature = g9.f.signatureOf((o8.d)new d(d, new j9.d(a)));
                if (k.a != WebpFrameCacheStrategy.CacheControl.CACHE_NONE) {
                    b = false;
                }
                this.h.apply((g9.a)((g9.a)signature).skipMemoryCache(b)).load((Object)this.a).into((h9.j)this.k);
            }
        }
    }
    
    public final void b(final a a) {
        this.g = false;
        if (this.j) {
            this.b.obtainMessage(2, (Object)a).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = a;
            return;
        }
        if (a.l != null) {
            final Bitmap l = this.l;
            if (l != null) {
                this.e.put(l);
                this.l = null;
            }
            final a i = this.i;
            this.i = a;
            int size = this.c.size();
            while (--size >= 0) {
                ((b)this.c.get(size)).a();
            }
            if (i != null) {
                this.b.obtainMessage(2, (Object)i).sendToTarget();
            }
        }
        this.a();
    }
    
    public static final class a extends h9.c<Bitmap>
    {
        public final Handler i;
        public final int j;
        public final long k;
        public Bitmap l;
        
        public a(final Handler i, final int j, final long k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        public final void d(final Object o, final i9.d d) {
            this.l = (Bitmap)o;
            this.i.sendMessageAtTime(this.i.obtainMessage(1, (Object)this), this.k);
        }
        
        public final void e(final Drawable drawable) {
            this.l = null;
        }
    }
    
    public interface b
    {
        void a();
    }
    
    public final class c implements Handler$Callback
    {
        public final boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 1) {
                n8.m.this.b((a)message.obj);
                return true;
            }
            if (what == 2) {
                n8.m.this.d.clear((h9.j<?>)message.obj);
            }
            return false;
        }
    }
    
    public static final class d implements o8.d
    {
        public final o8.d a;
        public final int b;
        
        public d(final int b, final j9.d a) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof d;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final d d = (d)o;
                b3 = b2;
                if (this.a.equals(d.a)) {
                    b3 = b2;
                    if (this.b == d.b) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final void updateDiskCacheKey(final MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.b).array());
            this.a.updateDiskCacheKey(messageDigest);
        }
    }
}
