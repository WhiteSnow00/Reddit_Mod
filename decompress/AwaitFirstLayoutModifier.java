// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import a80.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import kotlin.Result;
import pg2.j;
import ah2.f;
import c2.l;
import tg2.e;
import c2.x;

public final class AwaitFirstLayoutModifier implements x
{
    public boolean f;
    public e g;
    
    @Override
    public final void C(final l l) {
        ah2.f.f((Object)l, "coordinates");
        if (!this.f) {
            this.f = true;
            final e g = this.g;
            if (g != null) {
                g.resumeWith(Result.constructor-impl((Object)j.a));
            }
            this.g = null;
        }
    }
    
    public final Object a(final c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1) {
                final AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1 awaitFirstLayoutModifier$waitForFirstLayout$1 = (AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)c;
                final int label = awaitFirstLayoutModifier$waitForFirstLayout$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    awaitFirstLayoutModifier$waitForFirstLayout$1.label = label + Integer.MIN_VALUE;
                    o = awaitFirstLayoutModifier$waitForFirstLayout$1;
                    break Label_0047;
                }
            }
            o = new AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1(this, (c)c);
        }
        final Object result = ((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final c c2 = (c)((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).L$1;
            final AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier)((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).L$0;
            aj2.c.Q0(result);
            o2 = c2;
        }
        else {
            aj2.c.Q0(result);
            if (this.f) {
                return j.a;
            }
            final e g = this.g;
            ((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).L$0 = this;
            ((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).L$1 = g;
            ((AwaitFirstLayoutModifier$waitForFirstLayout.AwaitFirstLayoutModifier$waitForFirstLayout$1)o).label = 1;
            final e g2 = new e(a.a0((c)o));
            this.g = g2;
            if (g2.a() == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = g;
        }
        if (o2 != null) {
            ((c)o2).resumeWith(Result.constructor-impl((Object)j.a));
        }
        return j.a;
    }
}
