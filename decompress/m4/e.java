// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import w3.l;
import android.content.pm.PackageManager$NameNotFoundException;
import java.nio.MappedByteBuffer;
import android.graphics.Typeface;
import q3.q;
import w3.m;
import q3.i;
import mj2.c0;
import android.os.HandlerThread;
import android.os.Handler;
import w3.f;
import android.content.Context;

public final class e extends a$c
{
    public static final e$a b;
    
    static {
        b = new e$a();
    }
    
    public e(final Context context, final f f) {
        super(new b(context, f));
    }
    
    public static final class b implements a$f
    {
        public final Context a;
        public final f b;
        public final e$a c;
        public final Object d;
        public Handler e;
        public HandlerThread f;
        public a$g g;
        
        public b(final Context context, final f b) {
            final e$a b2 = e.b;
            this.d = new Object();
            c0.s((Object)context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = b;
            this.c = b2;
        }
        
        public final void a() {
            this.g = null;
            synchronized (this.d) {
                this.e.removeCallbacks((Runnable)null);
                final HandlerThread f = this.f;
                if (f != null) {
                    f.quit();
                }
                this.e = null;
                this.f = null;
            }
        }
        
        public final void b() {
            if (this.g == null) {
                return;
            }
            try {
                final m d = this.d();
                final int e = d.e;
                if (e == 2) {
                    synchronized (this.d) {
                        monitorexit(this.d);
                    }
                }
                if (e != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchFonts result is not OK. (");
                    sb.append(e);
                    sb.append(")");
                    throw new RuntimeException(sb.toString());
                }
                final e$a c = this.c;
                final Context a = this.a;
                c.getClass();
                final Typeface b = i.a.b(a, new m[] { d }, 0);
                final MappedByteBuffer e2 = q.e(this.a, d.a);
                if (e2 == null) {
                    throw new RuntimeException("Unable to open file.");
                }
                this.g.a(h.a(b, e2));
                this.a();
            }
            finally {
                final Throwable t;
                ((a$b)((a.a.a$a$a)this.g).a).a.d(t);
                this.a();
            }
        }
        
        public final void c(final a.a.a$a$a a$g) {
            synchronized (this.d) {
                if (this.e == null) {
                    ((Thread)(this.f = new HandlerThread("emojiCompat", 10))).start();
                    this.e = new Handler(this.f.getLooper());
                }
                this.e.post((Runnable)new m4.f(this, a$g));
            }
        }
        
        public final m d() {
            try {
                final e$a c = this.c;
                final Context a = this.a;
                final f b = this.b;
                c.getClass();
                final l a2 = w3.e.a(a, b);
                if (a2.a != 0) {
                    throw new RuntimeException(d.l(a.k("fetchFonts failed ("), a2.a, ")"));
                }
                final m[] b2 = a2.b;
                if (b2 != null && b2.length != 0) {
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                throw new RuntimeException("provider not found", (Throwable)ex);
            }
        }
    }
}
