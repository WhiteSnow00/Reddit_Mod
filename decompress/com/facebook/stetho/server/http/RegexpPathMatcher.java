// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

import java.util.regex.Pattern;

public class RegexpPathMatcher implements PathMatcher
{
    private final Pattern mPattern;
    
    public RegexpPathMatcher(final Pattern mPattern) {
        this.mPattern = mPattern;
    }
    
    public boolean match(final String s) {
        return this.mPattern.matcher(s).matches();
    }
}
