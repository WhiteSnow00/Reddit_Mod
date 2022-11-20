// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.collections.b;
import sh2.j;
import sh2.d;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements l<Integer, d>
{
    public final d[] $computedResult;
    public final j $predefined;
    
    public AbstractSignatureParts$computeIndexedQualifiers$1(final j $predefined, final d[] $computedResult) {
        this.$predefined = $predefined;
        this.$computedResult = $computedResult;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke(((Number)o).intValue());
    }
    
    public final d invoke(final int n) {
        final j $predefined = this.$predefined;
        if ($predefined != null) {
            final Map a = $predefined.a;
            final d e;
            if (a != null && (e = a.get(n)) != null) {
                return e;
            }
        }
        final d[] $computedResult = this.$computedResult;
        d e;
        if (n >= 0 && n <= b.j2((Object[])$computedResult)) {
            e = $computedResult[n];
        }
        else {
            final d e2 = d.e;
            e = d.e;
        }
        return e;
    }
}
