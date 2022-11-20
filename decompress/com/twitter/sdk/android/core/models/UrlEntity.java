// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import ij.a;

public class UrlEntity extends Entity
{
    @a("display_url")
    public final String displayUrl;
    @a("expanded_url")
    public final String expandedUrl;
    @a("url")
    public final String url;
    
    public UrlEntity(final String url, final String expandedUrl, final String displayUrl, final int n, final int n2) {
        super(n, n2);
        this.url = url;
        this.expandedUrl = expandedUrl;
        this.displayUrl = displayUrl;
    }
    
    public /* bridge */ int getEnd() {
        return super.getEnd();
    }
    
    public /* bridge */ int getStart() {
        return super.getStart();
    }
}
