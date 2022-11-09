// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import mj2.g;
import mj2.r1;
import mj2.z0$b;
import mj2.z0;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$b;
import mj2.z$a;
import tg2.a;
import mj2.z;
import rj2.f;
import androidx.compose.ui.text.font.b;

public final class j
{
    public static final j$a c;
    public final b a;
    public f b;
    
    static {
        c = new z() {
            public final void y(final CoroutineContext coroutineContext, final Throwable t) {
            }
        };
    }
    
    public j(final b a) {
        final EmptyCoroutineContext instance = EmptyCoroutineContext.INSTANCE;
        ah2.f.f((Object)a, "asyncTypefaceCache");
        ah2.f.f((Object)instance, "injectedContext");
        this.a = a;
        final z c = (z)j.c;
        c.getClass();
        this.b = g.a(CoroutineContext$DefaultImpls.a((CoroutineContext)c, (CoroutineContext)instance).plus((CoroutineContext)new r1((z0)((CoroutineContext)instance).get((CoroutineContext$b)z0$b.f))));
    }
}
