// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ah2.f;
import m5.b;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements a<j>
{
    public final /* synthetic */ b $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;
    
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(final boolean $registered, final b $androidxRegistry, final String $key) {
        this.$registered = $registered;
        this.$androidxRegistry = $androidxRegistry;
        this.$key = $key;
        super(0);
    }
    
    public final void invoke() {
        if (this.$registered) {
            final b $androidxRegistry = this.$androidxRegistry;
            final String $key = this.$key;
            $androidxRegistry.getClass();
            f.f((Object)$key, "key");
            $androidxRegistry.a.c($key);
        }
    }
}
