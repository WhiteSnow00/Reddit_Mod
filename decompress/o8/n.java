// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import android.content.ContextWrapper;
import android.os.Message;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy$CacheControl;
import android.os.SystemClock;
import ng.f0;
import android.os.Handler$Callback;
import android.os.Looper;
import h9.a;
import com.bumptech.glide.c;
import android.graphics.Bitmap;
import s8.d;
import com.bumptech.glide.j;
import java.util.ArrayList;
import android.os.Handler;
import com.bumptech.glide.integration.webp.decoder.WebpFrameCacheStrategy;
import p8.f;

public final class n
{
    public static final f<WebpFrameCacheStrategy> r;
    public final i a;
    public final Handler b;
    public final ArrayList c;
    public final j d;
    public final d e;
    public boolean f;
    public boolean g;
    public com.bumptech.glide.i<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public p8.j<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;
    
    static {
        r = f.a(WebpFrameCacheStrategy.c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");
    }
    
    public n(final com.bumptech.glide.c c, final i a, final int n, final int n2, final x8.d m, final Bitmap l) {
        final d f = c.f;
        final j e = com.bumptech.glide.c.e(((ContextWrapper)c.h).getBaseContext());
        final com.bumptech.glide.i apply = com.bumptech.glide.c.e(((ContextWrapper)c.h).getBaseContext()).asBitmap().apply(h9.f.diskCacheStrategyOf(r8.f.b).useAnimationPool(true).skipMemoryCache(true).override(n, n2));
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.d = e;
        final Handler b = new Handler(Looper.getMainLooper(), (Handler$Callback)new c());
        this.e = f;
        this.b = b;
        this.h = (com.bumptech.glide.i<Bitmap>)apply;
        this.a = a;
        f0.a2(m);
        this.m = (p8.j<Bitmap>)m;
        this.l = l;
        this.h = (com.bumptech.glide.i<Bitmap>)this.h.apply(new h9.f().transform((p8.j)m));
        this.o = l9.j.d(l);
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
                final h9.f signature = h9.f.signatureOf((p8.d)new n.n$d(d, new k9.d(a)));
                if (k.a != WebpFrameCacheStrategy$CacheControl.CACHE_NONE) {
                    b = false;
                }
                this.h.apply((h9.a)signature.skipMemoryCache(b)).load((Object)this.a).into((i9.j)this.k);
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
    
    public static final class a extends i9.c<Bitmap>
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
        
        public final void c(final Drawable drawable) {
            this.l = null;
        }
        
        public final void d(final Object o, final j9.d d) {
            this.l = (Bitmap)o;
            this.i.sendMessageAtTime(this.i.obtainMessage(1, (Object)this), this.k);
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
                o8.n.this.b((a)message.obj);
                return true;
            }
            if (what == 2) {
                o8.n.this.d.clear((i9.j)message.obj);
            }
            return false;
        }
    }
}
