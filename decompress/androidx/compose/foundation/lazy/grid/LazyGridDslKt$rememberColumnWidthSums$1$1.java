// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.compose.ui.unit.LayoutDirection;
import ng2.e;
import androidx.compose.foundation.layout.a$d;
import p0.z;
import kotlin.Metadata;
import java.util.List;
import u2.a;
import u2.b;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements p<b, a, List<Integer>>
{
    public final r0.b $columns;
    public final z $contentPadding;
    public final a$d $horizontalArrangement;
    
    public LazyGridDslKt$rememberColumnWidthSums$1$1(final z $contentPadding, final r0.b $columns, final a$d $horizontalArrangement) {
        this.$contentPadding = $contentPadding;
        this.$columns = $columns;
        this.$horizontalArrangement = $horizontalArrangement;
        super(2);
    }
    
    public Object invoke(final Object o, final Object o2) {
        return this.invoke-0kLqBqw((b)o, ((a)o2).a);
    }
    
    public final List<Integer> invoke-0kLqBqw(final b b, final long n) {
        e.f((Object)b, "$this$null");
        final int h = a.h(n);
        final int n2 = 1;
        if (h != Integer.MAX_VALUE) {
            final z $contentPadding = this.$contentPadding;
            final LayoutDirection ltr = LayoutDirection.Ltr;
            final ArrayList j5 = CollectionsKt___CollectionsKt.J5((Collection)this.$columns.a(b, a.h(n) - b.w0(vl.a.f1(this.$contentPadding, ltr) + vl.a.g1($contentPadding, ltr)), b.w0(this.$horizontalArrangement.a())));
            for (int size = j5.size(), i = n2; i < size; ++i) {
                j5.set(i, ((Number)j5.get(i - 1)).intValue() + ((Number)j5.get(i)).intValue());
            }
            return j5;
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
