// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.compose.ui.unit.LayoutDirection;
import ah2.f;
import p0.z;
import kotlin.Metadata;
import java.util.List;
import u2.a;
import u2.b;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements p<b, a, List<Integer>>
{
    public final /* synthetic */ r0.b $columns;
    public final /* synthetic */ z $contentPadding;
    public final /* synthetic */ androidx.compose.foundation.layout.a.d $horizontalArrangement;
    
    public LazyGridDslKt$rememberColumnWidthSums$1$1(final z $contentPadding, final r0.b $columns, final androidx.compose.foundation.layout.a.d $horizontalArrangement) {
        this.$contentPadding = $contentPadding;
        this.$columns = $columns;
        this.$horizontalArrangement = $horizontalArrangement;
        super(2);
    }
    
    public final List<Integer> invoke-0kLqBqw(final b b, final long n) {
        f.f((Object)b, "$this$null");
        final int h = a.h(n);
        final int n2 = 1;
        if (h != Integer.MAX_VALUE) {
            final z $contentPadding = this.$contentPadding;
            final LayoutDirection ltr = LayoutDirection.Ltr;
            final ArrayList i2 = CollectionsKt___CollectionsKt.i2((Collection)this.$columns.a(b, a.h(n) - b.s0(at1.a.L(this.$contentPadding, ltr) + at1.a.M($contentPadding, ltr)), b.s0(this.$horizontalArrangement.a())));
            for (int size = i2.size(), j = n2; j < size; ++j) {
                i2.set(j, ((Number)i2.get(j - 1)).intValue() + ((Number)i2.get(j)).intValue());
            }
            return i2;
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
