// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.util.RandomAccess;
import okio.ByteString;
import ig2.a;

public final class w extends a<ByteString> implements RandomAccess
{
    public final ByteString[] f;
    public final int[] g;
    
    public w(final ByteString[] f, final int[] g) {
        this.f = f;
        this.g = g;
    }
    
    public final int a() {
        return this.f.length;
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof ByteString && super.contains((Object)o);
    }
    
    public final Object get(final int n) {
        return this.f[n];
    }
    
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof ByteString)) {
            return -1;
        }
        return super.indexOf((Object)o);
    }
    
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof ByteString)) {
            return -1;
        }
        return super.lastIndexOf((Object)o);
    }
}
