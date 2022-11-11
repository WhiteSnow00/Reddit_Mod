// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.protocol.module.Page;

public enum PrettyPrinterDisplayType
{
    HTML(document), 
    JSON(Page.ResourceType.XHR), 
    TEXT(document);
    
    private final Page.ResourceType mResourceType;
    
    static {
        final Page.ResourceType document = Page.ResourceType.DOCUMENT;
    }
    
    private PrettyPrinterDisplayType(final Page.ResourceType mResourceType) {
        this.mResourceType = mResourceType;
    }
    
    public Page.ResourceType getResourceType() {
        return this.mResourceType;
    }
}
