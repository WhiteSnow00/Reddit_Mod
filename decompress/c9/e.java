// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import android.content.ContextWrapper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Handler$Callback;
import android.os.Looper;
import h9.f;
import com.bumptech.glide.b;
import p8.j;
import android.graphics.Bitmap;
import com.bumptech.glide.h;
import s8.d;
import com.bumptech.glide.i;
import java.util.ArrayList;
import android.os.Handler;
import k8.a;

public final class e
{
    public final a a;
    public final Handler b;
    public final ArrayList c;
    public final i d;
    public final d e;
    public boolean f;
    public boolean g;
    public h<Bitmap> h;
    public e$a i;
    public boolean j;
    public e$a k;
    public Bitmap l;
    public j<Bitmap> m;
    public e$a n;
    public int o;
    public int p;
    public int q;
    
    public e(final com.bumptech.glide.b b, final k8.e a, final int n, final int n2, final x8.d d, final Bitmap bitmap) {
        final d f = b.f;
        final i e = com.bumptech.glide.b.e(((ContextWrapper)b.h).getBaseContext());
        final h<Bitmap> apply = com.bumptech.glide.b.e(((ContextWrapper)b.h).getBaseContext()).asBitmap().apply((h9.a<?>)((h9.a)((h9.a)((h9.a)h9.f.diskCacheStrategyOf((r8.f)r8.f.b)).useAnimationPool(true)).skipMemoryCache(true)).override(n, n2));
        this.c = new ArrayList();
        this.d = e;
        final Handler b2 = new Handler(Looper.getMainLooper(), (Handler$Callback)new c());
        this.e = f;
        this.b = b2;
        this.h = apply;
        this.a = (a)a;
        this.c(d, bitmap);
    }
    
    public final void a() {
        if (this.f) {
            if (!this.g) {
                final e$a n = this.n;
                if (n != null) {
                    this.n = null;
                    this.b(n);
                    return;
                }
                this.g = true;
                final int e = this.a.e();
                final long uptimeMillis = SystemClock.uptimeMillis();
                final long n2 = e;
                this.a.a();
                this.k = new e$a(this.b, this.a.b(), uptimeMillis + n2);
                this.h.apply((h9.a<?>)h9.f.signatureOf((p8.d)new k9.d(Math.random()))).load(this.a).into((i9.j)this.k);
            }
        }
    }
    
    public final void b(final e$a e$a) {
        this.g = false;
        if (this.j) {
            this.b.obtainMessage(2, (Object)e$a).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = e$a;
            return;
        }
        if (e$a.l != null) {
            final Bitmap l = this.l;
            if (l != null) {
                this.e.put(l);
                this.l = null;
            }
            final e$a i = this.i;
            this.i = e$a;
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
    
    public final void c(final j<Bitmap> m, final Bitmap l) {
        ah0.b.F((Object)m);
        this.m = m;
        ah0.b.F((Object)l);
        this.l = l;
        this.h = this.h.apply((h9.a<?>)((h9.a)new f()).transform((j)m));
        this.o = l9.j.d(l);
        this.p = l.getWidth();
        this.q = l.getHeight();
    }
    
    public interface b
    {
        void a();
    }
    
    public final class c implements Handler$Callback
    {
        public final e f;
        
        public c(final e f) {
            this.f = f;
        }
        
        public final boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 1) {
                this.f.b((e$a)message.obj);
                return true;
            }
            if (what == 2) {
                this.f.d.clear((i9.j<?>)message.obj);
            }
            return false;
        }
    }
}
