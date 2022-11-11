// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import android.graphics.Rect;

public interface HighlightableDescriptor<E>
{
    Object getElementToHighlightAtPosition(final E p0, final int p1, final int p2, final Rect p3);
    
    View getViewAndBoundsForHighlighting(final E p0, final Rect p1);
}
