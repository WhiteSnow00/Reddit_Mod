// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import od.g0;
import java.io.InterruptedIOException;
import java.io.Closeable;
import pc2.c;
import oc2.g;
import java.util.List;
import nc2.e;
import nc2.b;
import pc2.a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.io.IOException;
import sc2.f;
import java.util.concurrent.TimeUnit;
import pc2.i;

public final class v implements d
{
    public final u f;
    public final i g;
    public final v$a h;
    public n i;
    public final w j;
    public final boolean k;
    public boolean l;
    
    public v(final u f, final w j, final boolean k) {
        this.f = f;
        this.j = j;
        this.k = k;
        this.g = new i(f);
        ((xc2.u)(this.h = new v$a(this))).g((long)f.A, TimeUnit.MILLISECONDS);
    }
    
    public final a0 b() throws IOException {
        synchronized (this) {
            if (!this.l) {
                this.l = true;
                monitorexit(this);
                this.g.c = sc2.f.a.j();
                ((xc2.c)this.h).j();
                this.i.getClass();
                try {
                    l l = this.f.f;
                    synchronized (l) {
                        l.f.add(this);
                        monitorexit(l);
                        final a0 c = this.c();
                        l = this.f.f;
                        final ArrayDeque f = l.f;
                        synchronized (l) {
                            if (f.remove(this)) {
                                monitorexit(l);
                                l.d();
                                return c;
                            }
                            throw new AssertionError((Object)"Call wasn't in-flight!");
                        }
                    }
                }
                catch (final IOException ex) {}
                finally {
                    final l f2 = this.f.f;
                    final ArrayDeque f3 = f2.f;
                    synchronized (f2) {
                        if (!f3.remove(this)) {
                            throw new AssertionError((Object)"Call wasn't in-flight!");
                        }
                        monitorexit(f2);
                        f2.d();
                    }
                }
            }
            throw new IllegalStateException("Already Executed");
        }
    }
    
    public final a0 c() throws IOException {
        final ArrayList list = new ArrayList();
        list.addAll(this.f.j);
        list.add(this.g);
        list.add(new a(this.f.n));
        this.f.getClass();
        list.add(new nc2.b((e)null));
        list.add(new oc2.a(this.f));
        if (!this.k) {
            list.addAll(this.f.k);
        }
        list.add(new pc2.b(this.k));
        final w j = this.j;
        final n i = this.i;
        final u f = this.f;
        final a0 a = new pc2.f((List)list, (g)null, (c)null, (oc2.d)null, 0, j, (d)this, i, f.B, f.C, f.D).a(j, (g)null, (c)null, (oc2.d)null);
        if (!this.g.d) {
            return a;
        }
        mc2.a.e((Closeable)a);
        throw new IOException("Canceled");
    }
    
    public final void cancel() {
        final i g = this.g;
        g.d = true;
        final g b = g.b;
        if (b != null) {
            synchronized (b.d) {
                b.m = true;
                final c n = b.n;
                final oc2.d j = b.j;
                monitorexit(b.d);
                if (n != null) {
                    n.cancel();
                }
                else if (j != null) {
                    mc2.a.f(j.d);
                }
            }
        }
    }
    
    public final Object clone() throws CloneNotSupportedException {
        final u f = this.f;
        final v v = new v(f, this.j, this.k);
        v.i = ((o)f.l).a;
        return v;
    }
    
    public final IOException d(final IOException ex) {
        if (!((xc2.c)this.h).m()) {
            return ex;
        }
        final InterruptedIOException ex2 = new InterruptedIOException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    public final String e() {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (this.g.d) {
            s = "canceled ";
        }
        else {
            s = "";
        }
        sb.append(s);
        String s2;
        if (this.k) {
            s2 = "web socket";
        }
        else {
            s2 = "call";
        }
        sb.append(s2);
        sb.append(" to ");
        sb.append(this.j.a.n());
        return sb.toString();
    }
    
    public final class b extends g0
    {
        public final lc2.e h;
        
        public b(final wc2.b h) {
            super("OkHttp %s", new Object[] { v.this.j.a.n() });
            this.h = (lc2.e)h;
        }
        
        @Override
        public final void a() {
            while (true) {
                ((xc2.c)v.this.h).j();
                boolean b = false;
            Block_11_Outer:
                while (true) {
                    try {
                        final a0 c = v.this.c();
                        b = true;
                        try {
                            ((wc2.b)this.h).a(v.this, c);
                            final u f = v.this.f;
                        }
                        catch (final IOException ex) {}
                        finally {
                            b = true;
                        }
                    }
                    catch (final IOException ex2) {
                        b = false;
                    }
                    try {
                        v.this.cancel();
                        final IOException ex2;
                        if (!b) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("canceled due to ");
                            sb.append(ex2);
                            ((wc2.b)this.h).b.c(new IOException(sb.toString()), null);
                        }
                        throw ex2;
                        while (true) {
                            final f a = f.a;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Callback failure for ");
                            sb2.append(v.this.e());
                            final IOException d;
                            a.l(4, sb2.toString(), (Throwable)d);
                            continue Block_11_Outer;
                            ((u)ex2).f.c(this);
                            return;
                            Label_0193: {
                                v.this.i.getClass();
                            }
                            ((wc2.b)this.h).b.c(d, null);
                            continue Block_11_Outer;
                            d = v.this.d(ex2);
                            iftrue(Label_0193:)(!b);
                            continue;
                        }
                    }
                    finally {
                        v.this.f.f.c(this);
                    }
                    break;
                }
            }
        }
    }
}
