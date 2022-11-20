// 
// Decompiled by Procyon v0.6.0
// 

package gg2;

import kotlin.coroutines.CoroutineContext;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003" }, d2 = { "Lgg2/c;", "T", "", "kotlin-stdlib" }, k = 1, mv = { 1, 7, 1 })
public interface c<T>
{
    CoroutineContext getContext();
    
    void resumeWith(final Object p0);
}
