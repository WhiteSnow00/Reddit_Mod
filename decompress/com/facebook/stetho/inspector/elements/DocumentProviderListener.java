// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

public interface DocumentProviderListener
{
    void onAttributeModified(final Object p0, final String p1, final String p2);
    
    void onAttributeRemoved(final Object p0, final String p1);
    
    void onInspectRequested(final Object p0);
    
    void onPossiblyChanged();
}
