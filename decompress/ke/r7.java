// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

public final class r7 extends AbstractSet
{
    public final /* synthetic */ s7 f;
    
    @Override
    public final void clear() {
        this.f.clear();
    }
    
    @Override
    public final boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.f.get(entry.getKey());
        final Object value2 = entry.getValue();
        boolean b = false;
        if (value != value2) {
            if (value == null) {
                return b;
            }
            if (!value.equals(value2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final Iterator iterator() {
        return new q7(this.f);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.f.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.f.size();
    }
}
