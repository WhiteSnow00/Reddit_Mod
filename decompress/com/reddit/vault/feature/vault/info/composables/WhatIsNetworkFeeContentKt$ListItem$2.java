// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.info.composables;

import ca2.a;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class WhatIsNetworkFeeContentKt$ListItem$2 extends Lambda implements p<d, Integer, j>
{
    public final int $$changed;
    public final a $listItem;
    
    public WhatIsNetworkFeeContentKt$ListItem$2(final a $listItem, final int $$changed) {
        this.$listItem = $listItem;
        this.$$changed = $$changed;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, final int n) {
        WhatIsNetworkFeeContentKt.b(this.$listItem, d, this.$$changed | 0x1);
    }
}
