// 
// Decompiled by Procyon v0.6.0
// 

package u6;

import tg2.c;
import kotlin.Result;
import mj2.l;
import mj2.k;
import q6.e0;

public final class g<T> implements e0
{
    public final /* synthetic */ k<T> a;
    
    public g(final l a) {
        this.a = (k<T>)a;
    }
    
    @Override
    public final void onResult(final T t) {
        if (!this.a.h()) {
            ((c)this.a).resumeWith(Result.constructor-impl((Object)t));
        }
    }
}
