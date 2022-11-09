// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import p0.a;
import zg2.p;
import p0.i0;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import j1.d;

public final class c
{
    public static final d a(final p0.c c) {
        f.f((Object)c, "insets");
        return (d)new DerivedHeightModifier((i0)c, InspectableValueKt.a, (p)WindowInsetsSizeKt$windowInsetsBottomHeight$2.INSTANCE);
    }
    
    public static final d b(final d d, final a a) {
        f.f((Object)d, "<this>");
        return d.f0((d)new DerivedHeightModifier((i0)a, InspectableValueKt.a, (p)WindowInsetsSizeKt$windowInsetsTopHeight$2.INSTANCE));
    }
}
