// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import kotlin.collections.CollectionsKt___CollectionsKt;
import al0.f0;
import lg.e0;
import java.util.HashMap;
import qj2.i$a;
import qj2.h;
import kotlin.collections.EmptyList;
import java.util.Arrays;
import pj2.b;
import java.util.Set;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.c;
import hg2.f;
import java.util.Map;
import java.lang.annotation.Annotation;
import java.util.List;
import sj2.z;
import sj2.l;
import qj2.e;

public final class PluginGeneratedSerialDescriptor implements e, l
{
    public final String a;
    public final z<?> b;
    public final int c;
    public int d;
    public final String[] e;
    public final List<Annotation>[] f;
    public final boolean[] g;
    public Map<String, Integer> h;
    public final f i;
    public final f j;
    public final f k;
    
    public PluginGeneratedSerialDescriptor(final String a, final z<?> b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = -1;
        final String[] e = new String[c];
        for (int i = 0; i < c; ++i) {
            e[i] = "[UNINITIALIZED]";
        }
        this.e = e;
        c = this.c;
        this.f = new List[c];
        this.g = new boolean[c];
        this.h = kotlin.collections.c.V0();
        final LazyThreadSafetyMode publication = LazyThreadSafetyMode.PUBLICATION;
        this.i = kotlin.a.a(publication, (rg2.a)new PluginGeneratedSerialDescriptor$childSerializers$2(this));
        this.j = kotlin.a.a(publication, (rg2.a)new PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(this));
        this.k = kotlin.a.a(publication, (rg2.a)new PluginGeneratedSerialDescriptor$_hashCode$2(this));
    }
    
    public final Set<String> a() {
        return this.h.keySet();
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    @Override
    public final int c(final String s) {
        sg2.e.f((Object)s, "name");
        final Integer n = this.h.get(s);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = -3;
        }
        return intValue;
    }
    
    @Override
    public final e d(final int n) {
        return ((b[])this.i.getValue())[n].getDescriptor();
    }
    
    @Override
    public final int e() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = false;
        if (this != o) {
            if (!(o instanceof PluginGeneratedSerialDescriptor)) {
                return b;
            }
            final String a = this.a;
            final e e = (e)o;
            if (!sg2.e.a((Object)a, (Object)e.h())) {
                return b;
            }
            if (!Arrays.equals(this.j.getValue(), ((PluginGeneratedSerialDescriptor)o).j.getValue())) {
                return b;
            }
            if (this.c != e.e()) {
                return b;
            }
            for (int c = this.c, i = 0; i < c; ++i) {
                if (!sg2.e.a((Object)this.d(i).h(), (Object)e.d(i).h())) {
                    return b;
                }
                if (!sg2.e.a((Object)this.d(i).getKind(), (Object)e.d(i).getKind())) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final String f(final int n) {
        return this.e[n];
    }
    
    @Override
    public final List<Annotation> g(final int n) {
        Object instance;
        if ((instance = this.f[n]) == null) {
            instance = EmptyList.INSTANCE;
        }
        return (List<Annotation>)instance;
    }
    
    @Override
    public final List<Annotation> getAnnotations() {
        return (List<Annotation>)EmptyList.INSTANCE;
    }
    
    @Override
    public final h getKind() {
        return (h)i$a.a;
    }
    
    @Override
    public final String h() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.k.getValue().intValue();
    }
    
    @Override
    public final boolean i(final int n) {
        return this.g[n];
    }
    
    @Override
    public final boolean isInline() {
        return false;
    }
    
    public final void j(final String s, final boolean b) {
        final String[] e = this.e;
        final int d = this.d + 1;
        e[this.d = d] = s;
        this.g[d] = b;
        this.f[d] = null;
        if (d == this.c - 1) {
            final HashMap h = new HashMap();
            for (int length = this.e.length, i = 0; i < length; ++i) {
                h.put(this.e[i], i);
            }
            this.h = h;
        }
    }
    
    @Override
    public final String toString() {
        return CollectionsKt___CollectionsKt.I3((Iterable)e0.v0(0, this.c), (CharSequence)", ", f0.n(new StringBuilder(), this.a, '('), ")", (rg2.l)new PluginGeneratedSerialDescriptor$toString$1(this), 24);
    }
}
