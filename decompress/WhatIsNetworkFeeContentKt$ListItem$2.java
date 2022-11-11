// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.info.composables;

import ia2.a;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class WhatIsNetworkFeeContentKt$ListItem$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ a $listItem;
    
    public WhatIsNetworkFeeContentKt$ListItem$2(final a $listItem, final int $$changed) {
        this.$listItem = $listItem;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        WhatIsNetworkFeeContentKt.b(this.$listItem, d, this.$$changed | 0x1);
    }
}
