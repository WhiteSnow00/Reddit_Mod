// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

abstract class ViewHighlightOverlays
{
    public ViewHighlightOverlays() {
    }
    
    public static ViewHighlightOverlays newInstance() {
        return (ViewHighlightOverlays)new ViewHighlightOverlays.ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2();
    }
    
    public abstract void highlightView(final View p0, final Rect p1, final int p2);
    
    public abstract void removeHighlight(final View p0);
}
