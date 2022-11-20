// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import cg2.j;
import mg2.l;

public final class BackwardsCompatNodeKt
{
    public static final BackwardsCompatNodeKt$a a;
    public static final l<BackwardsCompatNode, j> b;
    public static final l<BackwardsCompatNode, j> c;
    public static final l<BackwardsCompatNode, j> d;
    
    static {
        a = new BackwardsCompatNodeKt$a();
        b = (l)BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;
        c = (l)BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;
        d = (l)BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1.INSTANCE;
    }
}
