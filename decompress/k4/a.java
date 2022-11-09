// 
// Decompiled by Procyon v0.6.0
// 

package k4;

import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import java.util.ArrayList;
import j0.i;

public final class a
{
    public static final ThreadLocal<a> g;
    public final i<b, Long> a;
    public final ArrayList<b> b;
    public final a c;
    public d d;
    public long e;
    public boolean f;
    
    static {
        g = new ThreadLocal<a>();
    }
    
    public a() {
        this.a = (i<b, Long>)new i();
        this.b = new ArrayList<b>();
        this.c = new a();
        this.e = 0L;
        this.f = false;
    }
    
    public final class a
    {
        public final /* synthetic */ k4.a a;
    }
    
    public interface b
    {
        boolean a(final long p0);
    }
    
    public abstract static class c
    {
        public final a a;
        
        public c(final a a) {
            this.a = a;
        }
    }
    
    public static final class d extends c
    {
        public final Choreographer b;
        public final a$d$a c;
        
        public d(final a a) {
            super(a);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer$FrameCallback() {
                public final void doFrame(long uptimeMillis) {
                    final a a = d.this.a;
                    a.a.e = SystemClock.uptimeMillis();
                    final a a2 = a.a;
                    final long e = a2.e;
                    uptimeMillis = SystemClock.uptimeMillis();
                    for (int i = 0; i < a2.b.size(); ++i) {
                        final b b = a2.b.get(i);
                        if (b != null) {
                            final Long n = (Long)a2.a.getOrDefault((Object)b, (Object)null);
                            boolean b2 = false;
                            Label_0128: {
                                if (n != null) {
                                    if (n >= uptimeMillis) {
                                        b2 = false;
                                        break Label_0128;
                                    }
                                    a2.a.remove((Object)b);
                                }
                                b2 = true;
                            }
                            if (b2) {
                                b.a(e);
                            }
                        }
                    }
                    if (a2.f) {
                        int size = a2.b.size();
                        while (true) {
                            final int n2 = size - 1;
                            if (n2 < 0) {
                                break;
                            }
                            size = n2;
                            if (a2.b.get(n2) != null) {
                                continue;
                            }
                            a2.b.remove(n2);
                            size = n2;
                        }
                        a2.f = false;
                    }
                    if (a.a.b.size() > 0) {
                        final a a3 = a.a;
                        if (a3.d == null) {
                            a3.d = new d(a3.c);
                        }
                        final d d = a3.d;
                        d.b.postFrameCallback((Choreographer$FrameCallback)d.c);
                    }
                }
            };
        }
    }
}
