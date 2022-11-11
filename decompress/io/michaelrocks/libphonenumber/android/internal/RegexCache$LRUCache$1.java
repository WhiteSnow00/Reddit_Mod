// 
// Decompiled by Procyon v0.6.0
// 

package io.michaelrocks.libphonenumber.android.internal;

import java.util.Map;
import java.util.LinkedHashMap;

class RegexCache$LRUCache$1 extends LinkedHashMap<Object, Object>
{
    public final /* synthetic */ a.a this$0;
    
    public RegexCache$LRUCache$1(final a.a this$0, final int n, final float n2, final boolean b) {
        this.this$0 = this$0;
        super(n, n2, b);
    }
    
    public boolean removeEldestEntry(final Map.Entry<Object, Object> entry) {
        return this.size() > this.this$0.a;
    }
}
