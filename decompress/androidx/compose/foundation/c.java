// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import zg2.a;
import z0.d;
import android.view.ViewConfiguration;

public final class c
{
    public static final long a;
    
    static {
        a = ViewConfiguration.getTapTimeout();
    }
    
    public static final a a(final d d) {
        d.A(-1990508712);
        final Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View)d.t(AndroidCompositionLocals_androidKt.f));
        d.I();
        return (a)clickable_androidKt$isComposeRootInScrollableContainer$1;
    }
}
