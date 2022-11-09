// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import p8.i;
import java.util.Collection;
import android.util.Log;
import java.io.IOException;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.DecodeJob$d;
import java.util.ArrayList;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.DecodeJob;
import p8.j;
import com.bumptech.glide.load.engine.DecodeJob$a;
import v8.n;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.Registry$NoResultEncoderAvailableException;
import android.content.Context;
import com.bumptech.glide.load.DataSource;
import ng.f0;
import com.bumptech.glide.load.engine.DecodeJob$c;
import p8.g;
import m9.a;
import d9.c;
import p8.h;
import java.util.List;

public final class e<DataType, ResourceType, Transcode>
{
    public final Class<DataType> a;
    public final List<? extends h<DataType, ResourceType>> b;
    public final c<ResourceType, Transcode> c;
    public final z3.e<List<Throwable>> d;
    public final String e;
    
    public e(final Class a, final Class clazz, final Class clazz2, final List b, final c c, final a.c d) {
        this.a = a;
        this.b = b;
        this.c = (c<ResourceType, Transcode>)c;
        this.d = d;
        final StringBuilder k = a.k("Failed DecodePath{");
        k.append(a.getSimpleName());
        k.append("->");
        k.append(clazz.getSimpleName());
        k.append("->");
        k.append(clazz2.getSimpleName());
        k.append("}");
        this.e = k.toString();
    }
    
    public final l a(int i, int size, final g g, final com.bumptech.glide.load.data.e e, final DecodeJob$c decodeJob$c) throws GlideException {
        final List<Throwable> a = this.d.a();
        f0.a2(a);
        Object e2 = a;
        try {
            final l<ResourceType> b = this.b((com.bumptech.glide.load.data.e<DataType>)e, i, size, g, (List<Throwable>)e2);
            this.d.b((List<Throwable>)e2);
            final DecodeJob b2 = decodeJob$c.b;
            final DataSource a2 = decodeJob$c.a;
            b2.getClass();
            final Class<?> class1 = b.get().getClass();
            final DataSource resource_DISK_CACHE = DataSource.RESOURCE_DISK_CACHE;
            e2 = null;
            j e3;
            l<ResourceType> transform;
            if (a2 != resource_DISK_CACHE) {
                e3 = b2.f.e((Class)class1);
                transform = e3.transform((Context)b2.m, (l)b, b2.q, b2.r);
            }
            else {
                transform = b;
                e3 = null;
            }
            if (!b.equals(transform)) {
                b.recycle();
            }
            if (b2.f.c.b.d.a((Class)transform.getResourceClass()) != null) {
                i = 1;
            }
            else {
                i = 0;
            }
            Object a3;
            if (i != 0) {
                a3 = b2.f.c.b.d.a((Class)transform.getResourceClass());
                if (a3 == null) {
                    throw new Registry$NoResultEncoderAvailableException((Class)transform.getResourceClass());
                }
                e2 = ((i)a3).e(b2.t);
            }
            else {
                final EncodeStrategy none = EncodeStrategy.NONE;
                a3 = e2;
                e2 = none;
            }
            final d f = b2.f;
            final p8.d c = b2.C;
            final ArrayList b3 = f.b();
            while (true) {
                k<ResourceType> c2;
                StringBuilder sb;
                p8.d a4;
                DecodeJob$d k;
                for (size = b3.size(), i = 0; i < size; ++i) {
                    if (((n.a)b3.get(i)).a.equals(c)) {
                        i = 1;
                        c2 = (k<ResourceType>)transform;
                        if (b2.s.d((boolean)((i ^ 0x1) != 0x0), a2, (EncodeStrategy)e2)) {
                            if (a3 == null) {
                                throw new Registry$NoResultEncoderAvailableException((Class)transform.get().getClass());
                            }
                            i = DecodeJob$a.c[((Enum)e2).ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    sb = new StringBuilder();
                                    sb.append("Unknown strategy: ");
                                    sb.append(e2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                a4 = new m(b2.f.c.a, b2.C, b2.n, b2.q, b2.r, (j<?>)e3, class1, b2.t);
                            }
                            else {
                                a4 = new r8.c(b2.C, b2.n);
                            }
                            c2 = r8.k.j.a();
                            f0.a2(c2);
                            c2.i = false;
                            c2.h = true;
                            c2.g = transform;
                            k = b2.k;
                            k.a = a4;
                            k.b = (i)a3;
                            k.c = c2;
                        }
                        return this.c.d((l)c2, g);
                    }
                }
                i = 0;
                continue;
            }
        }
        finally {
            this.d.b((List<Throwable>)e2);
        }
    }
    
    public final l<ResourceType> b(final com.bumptech.glide.load.data.e<DataType> e, final int n, final int n2, final g g, final List<Throwable> list) throws GlideException {
        final int size = this.b.size();
        Throwable t = null;
        int n3 = 0;
        Object a;
        while (true) {
            a = t;
            if (n3 >= size) {
                break;
            }
            final h h = (h)this.b.get(n3);
            a = t;
            Label_0164: {
                try {
                    if (h.b(e.a(), g)) {
                        a = h.a(e.a(), n, n2, g);
                    }
                    break Label_0164;
                }
                catch (final OutOfMemoryError a) {}
                catch (final RuntimeException a) {}
                catch (final IOException ex) {}
                if (Log.isLoggable("DecodePath", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(h);
                    Log.v("DecodePath", sb.toString(), (Throwable)a);
                }
                list.add((OutOfMemoryError)a);
                a = t;
            }
            if (a != null) {
                break;
            }
            ++n3;
            t = (Throwable)a;
        }
        if (a != null) {
            return (l<ResourceType>)a;
        }
        throw new GlideException(this.e, (List)new ArrayList(list));
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DecodePath{ dataClass=");
        k.append(this.a);
        k.append(", decoders=");
        k.append(this.b);
        k.append(", transcoder=");
        k.append(this.c);
        k.append('}');
        return k.toString();
    }
}
