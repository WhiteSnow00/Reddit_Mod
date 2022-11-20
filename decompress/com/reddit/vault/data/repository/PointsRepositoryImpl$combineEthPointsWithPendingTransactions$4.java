// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import ng2.e;
import kotlin.Metadata;
import r82.i0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lr82/i0;", "it", "", "invoke", "(Lr82/i0;)Ljava/lang/Boolean;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class PointsRepositoryImpl$combineEthPointsWithPendingTransactions$4 extends Lambda implements l<i0, Boolean>
{
    public static final PointsRepositoryImpl$combineEthPointsWithPendingTransactions$4 INSTANCE;
    
    static {
        INSTANCE = new PointsRepositoryImpl$combineEthPointsWithPendingTransactions$4();
    }
    
    public PointsRepositoryImpl$combineEthPointsWithPendingTransactions$4() {
        super(1);
    }
    
    public final Boolean invoke(final i0 i0) {
        e.f((Object)i0, "it");
        return i0.h == null && i0.i == null;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((i0)o);
    }
}
