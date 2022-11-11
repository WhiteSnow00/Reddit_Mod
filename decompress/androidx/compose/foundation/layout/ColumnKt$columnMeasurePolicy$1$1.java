// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import sg2.e;
import kotlin.Metadata;
import hg2.j;
import u2.b;
import androidx.compose.ui.unit.LayoutDirection;
import rg2.s;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ColumnKt$columnMeasurePolicy$1$1 extends Lambda implements s<Integer, int[], LayoutDirection, b, int[], j>
{
    public final /* synthetic */ a$k $verticalArrangement;
    
    public ColumnKt$columnMeasurePolicy$1$1(final a$k $verticalArrangement) {
        this.$verticalArrangement = $verticalArrangement;
        super(5);
    }
    
    public final void invoke(final int n, final int[] array, final LayoutDirection layoutDirection, final b b, final int[] array2) {
        e.f((Object)array, "size");
        e.f((Object)layoutDirection, "<anonymous parameter 2>");
        e.f((Object)b, "density");
        e.f((Object)array2, "outPosition");
        this.$verticalArrangement.b(b, n, array, array2);
    }
}
