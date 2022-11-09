// 
// Decompiled by Procyon v0.6.0
// 

package u6;

import kotlin.Result;
import aj2.c;
import ah2.f;
import mj2.l;
import mj2.k;
import q6.e0;

public final class h<T> implements e0
{
    public final /* synthetic */ k<T> a;
    
    public h(final l a) {
        this.a = (k<T>)a;
    }
    
    @Override
    public final void onResult(final Object o) {
        final Throwable t = (Throwable)o;
        if (!this.a.h()) {
            final k<T> a = this.a;
            f.e((Object)t, "e");
            ((tg2.c)a).resumeWith(Result.constructor-impl((Object)c.G(t)));
        }
    }
}
