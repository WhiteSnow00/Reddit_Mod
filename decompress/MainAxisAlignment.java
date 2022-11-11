// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.a;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "Landroidx/compose/foundation/layout/a$k;", "arrangement", "Landroidx/compose/foundation/layout/a$k;", "getArrangement$flowlayout_release", "()Landroidx/compose/foundation/layout/a$k;", "<init>", "(Ljava/lang/String;ILandroidx/compose/foundation/layout/a$k;)V", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release" }, k = 1, mv = { 1, 7, 1 })
public enum MainAxisAlignment
{
    Center((a.k)a.e), 
    End((a.k)a.d), 
    SpaceAround((a.k)a.h), 
    SpaceBetween((a.k)a.g), 
    SpaceEvenly((a.k)a.f), 
    Start((a.k)a.c);
    
    private final a.k arrangement;
    
    private MainAxisAlignment(final a.k arrangement) {
        this.arrangement = arrangement;
    }
    
    public final a.k getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}
