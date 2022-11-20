// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import ng2.e;
import kotlin.Metadata;
import cg2.j;
import u2.b;
import androidx.compose.ui.unit.LayoutDirection;
import mg2.s;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RowKt$rowMeasurePolicy$1$1 extends Lambda implements s<Integer, int[], LayoutDirection, b, int[], j>
{
    public final a$d $horizontalArrangement;
    
    public RowKt$rowMeasurePolicy$1$1(final a$d $horizontalArrangement) {
        this.$horizontalArrangement = $horizontalArrangement;
        super(5);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        this.invoke(((Number)o).intValue(), (int[])o2, (LayoutDirection)o3, (b)o4, (int[])o5);
        return j.a;
    }
    
    public final void invoke(final int n, final int[] array, final LayoutDirection layoutDirection, final b b, final int[] array2) {
        e.f((Object)array, "size");
        e.f((Object)layoutDirection, "layoutDirection");
        e.f((Object)b, "density");
        e.f((Object)array2, "outPosition");
        this.$horizontalArrangement.c(n, array, layoutDirection, b, array2);
    }
}
