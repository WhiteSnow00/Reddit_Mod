// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import java.util.Iterator;
import la.k;
import java.io.IOException;
import java.util.HashMap;
import ak0.m;
import java.io.ByteArrayOutputStream;
import ka.g;
import com.google.android.datatransport.runtime.a$a;
import ia.b;
import java.util.Objects;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.ArrayList;
import g60.c1;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import javax.inject.Inject;
import sa.c;
import ta.a;
import java.util.concurrent.Executor;
import la.d;
import android.content.Context;

public final class j
{
    public final Context a;
    public final d b;
    public final sa.d c;
    public final n d;
    public final Executor e;
    public final a f;
    public final ua.a g;
    public final ua.a h;
    public final c i;
    
    @Inject
    public j(final Context a, final d b, final sa.d c, final n d, final Executor e, final a f, final ua.a g, final ua.a h, final c i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final com.google.android.datatransport.runtime.c c, final int n) {
        final k b = this.b.b(c.b());
        new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.OK, 0L);
        long n2 = 0L;
    Label_0352_Outer:
        while (true) {
            Object a = this.f;
            final int n3 = 0;
            Label_0760: {
                if (!((a)a).a((a.a<Boolean>)new c1(0, (Object)this, (Object)c))) {
                    break Label_0760;
                }
                Object iterator = this.f.a((a.a<Iterable<?>>)new e(0, this, c));
                if (!((Iterable)iterator).iterator().hasNext()) {
                    break;
                }
                Label_0466: {
                    if (b == null) {
                        pa.a.a(c, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                        a = new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.FATAL_ERROR, -1L);
                        break Label_0466;
                    }
                    a = new ArrayList<EventInternal>();
                    Object o = ((Iterable)iterator).iterator();
                    while (((Iterator)o).hasNext()) {
                        ((ArrayList<EventInternal>)a).add(((sa.j)((Iterator)o).next()).a());
                    }
                    Label_0389: {
                        if (c.c() == null) {
                            break Label_0389;
                        }
                        final a f = this.f;
                        final c i = this.i;
                        Objects.requireNonNull(i);
                        final oa.a a2 = f.a((a.a<oa.a>)new b((Object)i, 1));
                        final EventInternal.a builder = EventInternal.builder();
                        ((a$a)builder).d = this.g.a();
                        ((a$a)builder).e = this.h.a();
                        builder.d("GDT_CLIENT_METRICS");
                        o = new ha.b("proto");
                        a2.getClass();
                        final fi.e a3 = ka.g.a;
                        a3.getClass();
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                a3.a((Object)a2, byteArrayOutputStream);
                                builder.c(new ka.e((ha.b)o, byteArrayOutputStream.toByteArray()));
                                ((ArrayList<EventInternal>)a).add((EventInternal)b.a((EventInternal)builder.b()));
                                o = new la.a.a();
                                ((la.a.a)o).a = (Iterable<EventInternal>)a;
                                ((la.a.a)o).b = c.c();
                                if (((la.a.a)o).a == null) {
                                    a = " events";
                                }
                                else {
                                    a = "";
                                }
                                if (!((String)a).isEmpty()) {
                                    throw new IllegalStateException(m.l("Missing required properties:", (String)a));
                                }
                                a = b.b(new la.a(((la.a.a)o).a, ((la.a.a)o).b));
                                if (((com.google.android.datatransport.runtime.backends.a)a).a == BackendResponse.Status.TRANSIENT_ERROR) {
                                    this.f.a((a.a<Object>)new f(this, (Iterable)iterator, c, n2));
                                    this.d.a(c, n + 1, true);
                                    return;
                                }
                                this.f.a((a.a<Object>)new ra.g(0, this, iterator));
                                o = ((com.google.android.datatransport.runtime.backends.a)a).a;
                                if (o == BackendResponse.Status.OK) {
                                    final long max = Math.max(n2, ((com.google.android.datatransport.runtime.backends.a)a).b);
                                    int n4 = n3;
                                    if (c.c() != null) {
                                        n4 = 1;
                                    }
                                    n2 = max;
                                    if (n4 != 0) {
                                        this.f.a((a.a<Object>)new m3.c(this, 3));
                                        n2 = max;
                                        continue Label_0352_Outer;
                                    }
                                    continue Label_0352_Outer;
                                }
                                else {
                                    if (o == BackendResponse.Status.INVALID_PAYLOAD) {
                                        a = new HashMap<Object, Object>();
                                        iterator = ((Iterable)iterator).iterator();
                                        while (((Iterator)iterator).hasNext()) {
                                            o = ((sa.j)((Iterator)iterator).next()).a().getTransportName();
                                            if (!((HashMap)a).containsKey(o)) {
                                                ((HashMap)a).put(o, 1);
                                            }
                                            else {
                                                ((HashMap)a).put(o, (int)((HashMap)a).get(o) + 1);
                                            }
                                        }
                                        this.f.a((a.a<Object>)new h(0, this, a));
                                        continue Label_0352_Outer;
                                    }
                                    continue Label_0352_Outer;
                                }
                                this.f.a((a.a<Object>)new i(this, n2, c));
                            }
                            catch (final IOException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
