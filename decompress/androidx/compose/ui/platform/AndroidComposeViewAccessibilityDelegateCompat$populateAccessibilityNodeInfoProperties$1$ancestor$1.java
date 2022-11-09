// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import h2.j;
import h2.k;
import a4.u1;
import ah2.f;
import kotlin.Metadata;
import androidx.compose.ui.node.LayoutNode;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "parent", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1 extends Lambda implements l<LayoutNode, Boolean>
{
    public static final AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1 INSTANCE;
    
    static {
        INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1();
    }
    
    public AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1() {
        super(1);
    }
    
    public final Boolean invoke(final LayoutNode layoutNode) {
        f.f((Object)layoutNode, "parent");
        final k x = u1.X(layoutNode);
        boolean b = true;
        if (x != null) {
            final j c = x.c();
            if (c != null && c.g) {
                return b;
            }
        }
        b = false;
        return b;
    }
}
