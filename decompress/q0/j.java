// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.d;
import mg2.r;
import mg2.l;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;

public final class j implements LazyLayoutIntervalContent
{
    public final l<Integer, Object> a;
    public final l<Integer, Object> b;
    public final r<e, Integer, d, Integer, cg2.j> c;
    
    public j(final l a, final l b, final ComposableLambdaImpl c) {
        ng2.e.f((Object)b, "type");
        ng2.e.f((Object)c, "item");
        this.a = (l<Integer, Object>)a;
        this.b = (l<Integer, Object>)b;
        this.c = (r<e, Integer, d, Integer, cg2.j>)c;
    }
    
    public final l<Integer, Object> getKey() {
        return this.a;
    }
    
    public final l<Integer, Object> getType() {
        return this.b;
    }
}
