// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import sg2.e;
import j1.a$c;
import kotlin.Metadata;
import androidx.compose.ui.unit.LayoutDirection;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "size", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class Arrangement$spacedBy$3 extends Lambda implements p<Integer, LayoutDirection, Integer>
{
    public final /* synthetic */ a$c $alignment;
    
    public Arrangement$spacedBy$3(final a$c $alignment) {
        this.$alignment = $alignment;
        super(2);
    }
    
    public final Integer invoke(final int n, final LayoutDirection layoutDirection) {
        e.f((Object)layoutDirection, "<anonymous parameter 1>");
        return this.$alignment.a(0, n);
    }
}
