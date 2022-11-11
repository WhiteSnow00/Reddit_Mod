// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import sg2.e;
import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;

public final class z0
{
    public final SemanticsNode a;
    public final Rect b;
    
    public z0(final SemanticsNode a, final Rect b) {
        e.f((Object)a, "semanticsNode");
        this.a = a;
        this.b = b;
    }
}
