// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ThreadBound;

public interface NodeDescriptor<E> extends ThreadBound
{
    void getAttributes(final E p0, final AttributeAccumulator p1);
    
    void getChildren(final E p0, final Accumulator<Object> p1);
    
    void getComputedStyles(final E p0, final ComputedStyleAccumulator p1);
    
    String getLocalName(final E p0);
    
    String getNodeName(final E p0);
    
    NodeType getNodeType(final E p0);
    
    String getNodeValue(final E p0);
    
    void getStyleRuleNames(final E p0, final StyleRuleNameAccumulator p1);
    
    void getStyles(final E p0, final String p1, final StyleAccumulator p2);
    
    void hook(final E p0);
    
    void setAttributesAsText(final E p0, final String p1);
    
    void setStyle(final E p0, final String p1, final String p2, final String p3);
    
    void unhook(final E p0);
}
