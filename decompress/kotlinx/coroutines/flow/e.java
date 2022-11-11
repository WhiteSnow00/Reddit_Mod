// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.a;
import kotlinx.coroutines.flow.internal.d;
import hg2.j;
import lg2.c;
import hj2.f;
import rg2.q;

public final class e implements hj2.e<Object>
{
    public final /* synthetic */ hj2.e f;
    public final /* synthetic */ hj2.e g;
    public final /* synthetic */ q h;
    
    public e(final hj2.e f, final hj2.e g, final q h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object a(final f<Object> f, final c<? super j> c) {
        final Object a = d.a(new hj2.e[] { this.f, this.g }, (a)FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, (q)new FlowKt__ZipKt$combine$1$1(this.h, (c)null), (f)f, (c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
