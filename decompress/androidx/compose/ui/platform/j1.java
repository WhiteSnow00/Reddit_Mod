// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.Lifecycle$State;
import mg2.a;
import androidx.lifecycle.Lifecycle;

public final class j1
{
    public static final a a(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (((Enum<Lifecycle$State>)lifecycle.b()).compareTo(Lifecycle$State.DESTROYED) > 0) {
            final i1 i1 = new i1(abstractComposeView);
            lifecycle.a((p)i1);
            return (a)new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, (o)i1);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot configure ");
        sb.append(abstractComposeView);
        sb.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        sb.append(lifecycle);
        sb.append("is already destroyed");
        throw new IllegalStateException(sb.toString().toString());
    }
}
