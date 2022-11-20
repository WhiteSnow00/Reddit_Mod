// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import j1.d;
import cg2.j;
import mg2.l;

public final class InspectableValueKt
{
    public static final l<o0, j> a;
    public static boolean b;
    
    static {
        a = (l)InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    }
    
    public static final d a(final d d, final l<? super o0, j> l, final d d2) {
        e.f((Object)d, "<this>");
        e.f((Object)l, "inspectorInfo");
        e.f((Object)d2, "wrapped");
        final n0 n0 = new n0(l);
        return d.l0((d)n0).l0(d2).l0((d)n0.g);
    }
}
