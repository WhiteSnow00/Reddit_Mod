// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import mj2.c0;
import java.util.Iterator;
import ah2.f;
import java.util.LinkedHashMap;
import androidx.compose.ui.semantics.a;
import java.util.Map;

public final class j implements q, Iterable<Map.Entry<? extends a<?>, ?>>, bh2.a
{
    public final LinkedHashMap f;
    public boolean g;
    public boolean h;
    
    public j() {
        this.f = new LinkedHashMap();
    }
    
    public final <T> void a(final a<T> a, final T t) {
        ah2.f.f((Object)a, "key");
        this.f.put(a, t);
    }
    
    public final <T> boolean b(final a<T> a) {
        ah2.f.f((Object)a, "key");
        return this.f.containsKey(a);
    }
    
    public final <T> T c(final a<T> a) {
        ah2.f.f((Object)a, "key");
        final T value = this.f.get(a);
        if (value != null) {
            return value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Key not present: ");
        sb.append(a);
        sb.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final LinkedHashMap f = this.f;
        final j j = (j)o;
        return ah2.f.a((Object)f, (Object)j.f) && this.g == j.g && this.h == j.h;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.h) + (Boolean.hashCode(this.g) + this.f.hashCode() * 31) * 31;
    }
    
    public final Iterator<Map.Entry<a<?>, Object>> iterator() {
        return this.f.entrySet().iterator();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final boolean g = this.g;
        String s = "";
        if (g) {
            sb.append("");
            sb.append("mergeDescendants=true");
            s = ", ";
        }
        String s2 = s;
        if (this.h) {
            sb.append(s);
            sb.append("isClearingSemantics=true");
            s2 = ", ";
        }
        for (final Map.Entry<a, V> entry : this.f.entrySet()) {
            final a a = entry.getKey();
            final V value = entry.getValue();
            sb.append(s2);
            sb.append(a.a);
            sb.append(" : ");
            sb.append(value);
            s2 = ", ";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(c0.g0((Object)this));
        sb2.append("{ ");
        sb2.append((Object)sb);
        sb2.append(" }");
        return sb2.toString();
    }
}
