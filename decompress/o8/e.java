// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import java.security.MessageDigest;
import java.util.Iterator;
import q8.l;
import android.content.Context;
import java.util.Arrays;
import java.util.List;

public final class e<T> implements j<T>
{
    public final List a;
    
    @SafeVarargs
    public e(final j<T>... array) {
        if (array.length != 0) {
            this.a = Arrays.asList(array);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof e && this.a.equals(((e)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final l<T> transform(final Context context, final l<T> l, final int n, final int n2) {
        final Iterator iterator = this.a.iterator();
        l<T> i = l;
        while (iterator.hasNext()) {
            final q8.l<T> transform = ((j<T>)iterator.next()).transform(context, i, n, n2);
            if (i != null && !i.equals(l) && !i.equals(transform)) {
                i.recycle();
            }
            i = transform;
        }
        return i;
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((j<?>)iterator.next()).updateDiskCacheKey(messageDigest);
        }
    }
}
