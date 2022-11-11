// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import sg2.e;
import java.util.Map;

public class a<K, V> implements Entry<K, V>, tg2.a
{
    public final K f;
    public final V g;
    
    public a(final K f, final V g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        Map.Entry<Object, V> entry;
        if (o instanceof Entry) {
            entry = (Map.Entry<Object, V>)o;
        }
        else {
            entry = null;
        }
        boolean b2;
        final boolean b = b2 = false;
        if (entry != null) {
            b2 = b;
            if (e.a(entry.getKey(), (Object)this.f)) {
                b2 = b;
                if (e.a((Object)entry.getValue(), this.getValue())) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public final K getKey() {
        return this.f;
    }
    
    @Override
    public V getValue() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final K f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object value = this.getValue();
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public V setValue(final V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('=');
        sb.append(this.getValue());
        return sb.toString();
    }
}
