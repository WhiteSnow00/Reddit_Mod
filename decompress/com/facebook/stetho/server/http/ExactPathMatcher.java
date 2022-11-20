// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

public class ExactPathMatcher implements PathMatcher
{
    private final String mPath;
    
    public ExactPathMatcher(final String mPath) {
        this.mPath = mPath;
    }
    
    public boolean match(final String s) {
        return this.mPath.equals(s);
    }
}
