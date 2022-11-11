// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import sg2.e;
import kotlin.Metadata;
import z1.o;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ScrollableKt$pointerScrollable$2 extends Lambda implements l<o, Boolean>
{
    public static final ScrollableKt$pointerScrollable$2 INSTANCE;
    
    static {
        INSTANCE = new ScrollableKt$pointerScrollable$2();
    }
    
    public ScrollableKt$pointerScrollable$2() {
        super(1);
    }
    
    public final Boolean invoke(final o o) {
        e.f((Object)o, "down");
        return o.h == 2 ^ true;
    }
}
