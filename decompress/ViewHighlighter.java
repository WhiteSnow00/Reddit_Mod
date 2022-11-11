// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

abstract class ViewHighlighter
{
    public ViewHighlighter() {
    }
    
    public static ViewHighlighter newInstance() {
        return (ViewHighlighter)new ViewHighlighter.ViewHighlighter$OverlayHighlighter();
    }
    
    public abstract void clearHighlight();
    
    public abstract void setHighlightedView(final View p0, final Rect p1, final int p2);
}
