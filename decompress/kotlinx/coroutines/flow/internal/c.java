// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import ej2.g;
import hg2.j;
import hj2.f;
import rg2.q;
import hj2.e;

public final class c implements e<Object>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ e g;
    public final /* synthetic */ q h;
    
    public c(final e f, final e g, final q h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object a(final f<Object> f, final lg2.c<? super j> c) {
        final Object e = ej2.g.e((p)new CombineKt$zipImpl$1$1((f)f, this.f, this.g, this.h, (lg2.c)null), (lg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return j.a;
    }
}
