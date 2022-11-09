// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import a40.f;
import java.util.Map;

public final class p7 implements Entry, Comparable
{
    public final Comparable f;
    public Object g;
    public final /* synthetic */ s7 h;
    
    public p7(final s7 h, final Comparable f, final Object g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(Object value) {
        if (value == this) {
            return true;
        }
        if (!(value instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)value;
        final Comparable f = this.f;
        final Object key = entry.getKey();
        boolean equals;
        if (f == null) {
            equals = (key == null);
        }
        else {
            equals = f.equals(key);
        }
        if (equals) {
            final Object g = this.g;
            value = entry.getValue();
            boolean equals2;
            if (g == null) {
                equals2 = (value == null);
            }
            else {
                equals2 = g.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Object getValue() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final Comparable f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final Object g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final Object setValue(final Object g) {
        final s7 h = this.h;
        final int l = s7.l;
        h.h();
        final Object g2 = this.g;
        this.g = g;
        return g2;
    }
    
    @Override
    public final String toString() {
        return a40.f.n(String.valueOf(this.f), "=", String.valueOf(this.g));
    }
}
