// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.widget.PopupWindow;

public final class i
{
    public static boolean a(final PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
    
    public static int b(final PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
    
    public static void c(final PopupWindow popupWindow, final boolean overlapAnchor) {
        popupWindow.setOverlapAnchor(overlapAnchor);
    }
    
    public static void d(final PopupWindow popupWindow, final int windowLayoutType) {
        popupWindow.setWindowLayoutType(windowLayoutType);
    }
}
