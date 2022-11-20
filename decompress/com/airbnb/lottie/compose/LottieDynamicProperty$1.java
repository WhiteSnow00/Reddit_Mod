// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.compose;

import ng2.e;
import kotlin.Metadata;
import c7.b;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "T", "Lc7/b;", "it", "invoke", "(Lc7/b;)Ljava/lang/Object;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LottieDynamicProperty$1 extends Lambda implements l<b<Object>, Object>
{
    public final Object $value;
    
    public LottieDynamicProperty$1(final Object $value) {
        this.$value = $value;
        super(1);
    }
    
    public final Object invoke(final b<Object> b) {
        e.f((Object)b, "it");
        return this.$value;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((b<Object>)o);
    }
}
