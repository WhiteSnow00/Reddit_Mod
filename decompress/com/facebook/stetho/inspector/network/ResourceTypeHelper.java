// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.protocol.module.Page;

public class ResourceTypeHelper
{
    private final MimeMatcher<Page.ResourceType> mMimeMatcher;
    
    public ResourceTypeHelper() {
        final MimeMatcher mMimeMatcher = new MimeMatcher();
        (this.mMimeMatcher = mMimeMatcher).addRule("text/css", Page.ResourceType.STYLESHEET);
        mMimeMatcher.addRule("image/*", Page.ResourceType.IMAGE);
        mMimeMatcher.addRule("application/x-javascript", Page.ResourceType.SCRIPT);
        final Page.ResourceType xhr = Page.ResourceType.XHR;
        mMimeMatcher.addRule("text/javascript", xhr);
        mMimeMatcher.addRule("application/json", xhr);
        mMimeMatcher.addRule("text/*", Page.ResourceType.DOCUMENT);
        mMimeMatcher.addRule("*", Page.ResourceType.OTHER);
    }
    
    public Page.ResourceType determineResourceType(String stripContentExtras) {
        stripContentExtras = this.stripContentExtras(stripContentExtras);
        return this.mMimeMatcher.match(stripContentExtras);
    }
    
    public String stripContentExtras(final String s) {
        final int index = s.indexOf(59);
        String substring = s;
        if (index >= 0) {
            substring = s.substring(0, index);
        }
        return substring;
    }
}
