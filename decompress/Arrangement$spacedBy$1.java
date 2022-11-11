// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import j1.a$a;
import sg2.e;
import kotlin.Metadata;
import androidx.compose.ui.unit.LayoutDirection;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class Arrangement$spacedBy$1 extends Lambda implements p<Integer, LayoutDirection, Integer>
{
    public static final Arrangement$spacedBy$1 INSTANCE;
    
    static {
        INSTANCE = new Arrangement$spacedBy$1();
    }
    
    public Arrangement$spacedBy$1() {
        super(2);
    }
    
    public final Integer invoke(final int n, final LayoutDirection layoutDirection) {
        e.f((Object)layoutDirection, "layoutDirection");
        return a$a.m.a(0, n, layoutDirection);
    }
}
