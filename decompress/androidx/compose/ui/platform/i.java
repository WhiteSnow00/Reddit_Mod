// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import a4.s;
import sg2.e;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;

public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    public final void a(final AccessibilityNodeInfo accessibilityNodeInfo, final List<String> list) {
        e.f((Object)accessibilityNodeInfo, "node");
        e.f((Object)list, "data");
        s.k(accessibilityNodeInfo, (List)list);
    }
}
