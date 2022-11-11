// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;

public interface DocumentProvider extends ThreadBound
{
    void dispose();
    
    NodeDescriptor getNodeDescriptor(final Object p0);
    
    Object getRootElement();
    
    void hideHighlight();
    
    void highlightElement(final Object p0, final int p1);
    
    void setAttributesAsText(final Object p0, final String p1);
    
    void setInspectModeEnabled(final boolean p0);
    
    void setListener(final DocumentProviderListener p0);
}
