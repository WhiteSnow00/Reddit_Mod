// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import android.content.Context;

public final class j implements h
{
    public j(final Context context) {
        final Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            final AccessibilityManager accessibilityManager = (AccessibilityManager)systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}
