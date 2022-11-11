// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

class WebViewException extends Exception
{
    private static final long serialVersionUID = -7397331487240298819L;
    private final int errorCode;
    private final String failingUrl;
    
    public WebViewException(final int errorCode, final String s, final String failingUrl) {
        super(s);
        this.errorCode = errorCode;
        this.failingUrl = failingUrl;
    }
    
    public String getDescription() {
        return this.getMessage();
    }
    
    public int getErrorCode() {
        return this.errorCode;
    }
    
    public String getFailingUrl() {
        return this.failingUrl;
    }
}
