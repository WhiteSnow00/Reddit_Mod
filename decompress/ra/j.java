// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import com.google.android.datatransport.runtime.EventInternal$a;
import java.util.Iterator;
import la.k;
import java.io.IOException;
import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import ka.g;
import com.google.android.datatransport.runtime.EventInternal;
import ia.b;
import java.util.Objects;
import sa.i;
import java.util.ArrayList;
import ta.a$a;
import f40.z;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;
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
    public final o d;
    public final Executor e;
    public final a f;
    public final ua.a g;
    public final ua.a h;
    public final c i;
    
    @Inject
    public j(final Context a, final d b, final sa.d c, final o d, final Executor e, final a f, final ua.a g, final ua.a h, final c i) {
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
        new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.OK, 0L);
        long n2 = 0L;
    Label_0347_Outer:
        while (true) {
            Label_0757: {
                if (!(boolean)this.f.a((a$a)new z(0, (Object)this, (Object)c))) {
                    break Label_0757;
                }
                Object iterator = this.f.a((a$a)new e(0, this, c));
                if (!((Iterable)iterator).iterator().hasNext()) {
                    break;
                }
                final int n3 = 1;
                Label_0463: {
                    if (b == null) {
                        pa.a.a(c, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                        final Object b2 = new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.FATAL_ERROR, -1L);
                        break Label_0463;
                    }
                    Object b2 = new ArrayList<com.google.android.datatransport.runtime.a>();
                    Object o = ((Iterable)iterator).iterator();
                    while (((Iterator)o).hasNext()) {
                        ((ArrayList<EventInternal>)b2).add(((i)((Iterator)o).next()).a());
                    }
                    Label_0385: {
                        if (c.c() == null) {
                            break Label_0385;
                        }
                        final a f = this.f;
                        final c i = this.i;
                        Objects.requireNonNull(i);
                        final oa.a a = (oa.a)f.a((a$a)new b(i, 1));
                        o = EventInternal.builder();
                        ((com.google.android.datatransport.runtime.a.a)o).d = this.g.a();
                        ((com.google.android.datatransport.runtime.a.a)o).e = this.h.a();
                        ((EventInternal$a)o).d("GDT_CLIENT_METRICS");
                        final ha.b b3 = new ha.b("proto");
                        a.getClass();
                        final ei.d a2 = ka.g.a;
                        a2.getClass();
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                a2.a((Object)a, byteArrayOutputStream);
                                ((EventInternal$a)o).c(new ka.e(b3, byteArrayOutputStream.toByteArray()));
                                ((ArrayList<com.google.android.datatransport.runtime.a>)b2).add(b.a((EventInternal)((EventInternal$a)o).b()));
                                o = new la.a.a();
                                ((la.a.a)o).a = (Iterable<EventInternal>)b2;
                                ((la.a.a)o).b = c.c();
                                if (((la.a.a)o).a == null) {
                                    b2 = " events";
                                }
                                else {
                                    b2 = "";
                                }
                                if (!((String)b2).isEmpty()) {
                                    throw new IllegalStateException(b.l("Missing required properties:", (String)b2));
                                }
                                b2 = b.b(new la.a(((la.a.a)o).a, ((la.a.a)o).b));
                                if (((com.google.android.datatransport.runtime.backends.a)b2).a == BackendResponse$Status.TRANSIENT_ERROR) {
                                    this.f.a((a$a)new f(this, (Iterable)iterator, c, n2));
                                    this.d.a(c, n + 1, true);
                                    return;
                                }
                                this.f.a((a$a)new ra.g(0, this, iterator));
                                o = ((com.google.android.datatransport.runtime.backends.a)b2).a;
                                if (o == BackendResponse$Status.OK) {
                                    final long max = Math.max(n2, ((com.google.android.datatransport.runtime.backends.a)b2).b);
                                    int n4;
                                    if (c.c() != null) {
                                        n4 = n3;
                                    }
                                    else {
                                        n4 = 0;
                                    }
                                    n2 = max;
                                    if (n4 != 0) {
                                        this.f.a((a$a)new h(this, 0));
                                        n2 = max;
                                        continue Label_0347_Outer;
                                    }
                                    continue Label_0347_Outer;
                                }
                                else {
                                    if (o == BackendResponse$Status.INVALID_PAYLOAD) {
                                        b2 = new HashMap<Object, Object>();
                                        iterator = ((Iterable)iterator).iterator();
                                        while (((Iterator)iterator).hasNext()) {
                                            o = ((i)((Iterator)iterator).next()).a().getTransportName();
                                            if (!((HashMap)b2).containsKey(o)) {
                                                ((HashMap)b2).put(o, 1);
                                            }
                                            else {
                                                ((HashMap)b2).put(o, (int)((HashMap)b2).get(o) + 1);
                                            }
                                        }
                                        this.f.a((a$a)new z(1, (Object)this, b2));
                                        continue Label_0347_Outer;
                                    }
                                    continue Label_0347_Outer;
                                }
                                this.f.a((a$a)new ra.i(this, c, n2));
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
