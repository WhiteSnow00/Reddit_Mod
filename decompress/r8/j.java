// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import com.bumptech.glide.load.engine.GlideException;
import ng.f0;
import com.bumptech.glide.load.engine.DecodeJob$c;
import p8.g;
import m9.a;
import java.util.List;
import z3.e;

public final class j<Data, ResourceType, Transcode>
{
    public final e<List<Throwable>> a;
    public final List<? extends r8.e<Data, ResourceType, Transcode>> b;
    public final String c;
    
    public j(final Class clazz, final Class clazz2, final Class clazz3, final List b, final a.c a) {
        this.a = a;
        if (!b.isEmpty()) {
            this.b = b;
            final StringBuilder k = a.k("Failed LoadPath{");
            k.append(clazz.getSimpleName());
            k.append("->");
            k.append(clazz2.getSimpleName());
            k.append("->");
            k.append(clazz3.getSimpleName());
            k.append("}");
            this.c = k.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
    
    public final l a(final int n, final int n2, g g, final com.bumptech.glide.load.data.e e, final DecodeJob$c decodeJob$c) throws GlideException {
        List list = null;
        Label_0175: {
            Object a;
            while (true) {
                Object o = this.a.a();
                f0.a2(o);
                list = (List)o;
                while (true) {
                    int n3 = 0;
                    Label_0104: {
                        try {
                            final int size = this.b.size();
                            n3 = 0;
                            o = null;
                            a = o;
                            if (n3 < size) {
                                final Object o2;
                                a = (o2 = (r8.e)this.b.get(n3));
                                final int n4 = n;
                                final int n5 = n2;
                                final g g2 = g;
                                final com.bumptech.glide.load.data.e e2 = e;
                                final DecodeJob$c decodeJob$c2 = decodeJob$c;
                                a = ((r8.e)o2).a(n4, n5, g2, e2, decodeJob$c2);
                                o = a;
                                break Label_0104;
                            }
                            break;
                        }
                        finally {
                            final g g3;
                            g = g3;
                            break Label_0175;
                        }
                        try {
                            final Object o2 = a;
                            final int n4 = n;
                            final int n5 = n2;
                            final g g2 = g;
                            final com.bumptech.glide.load.data.e e2 = e;
                            final DecodeJob$c decodeJob$c2 = decodeJob$c;
                            a = (o = ((r8.e)o2).a(n4, n5, g2, e2, decodeJob$c2));
                        }
                        catch (final GlideException a) {
                            list.add(a);
                        }
                    }
                    if (o != null) {
                        a = o;
                        break;
                    }
                    ++n3;
                    continue;
                }
            }
            if (a != null) {
                this.a.b(list);
                return (l)a;
            }
            throw new GlideException(this.c, (List)new ArrayList(list));
        }
        this.a.b(list);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LoadPath{decodePaths=");
        k.append(Arrays.toString(this.b.toArray()));
        k.append('}');
        return k.toString();
    }
}
