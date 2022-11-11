// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp.decoder;

public final class WebpFrameCacheStrategy
{
    public static final WebpFrameCacheStrategy b;
    public static final WebpFrameCacheStrategy c;
    public CacheControl a;
    
    static {
        final a a = new a();
        a.a = CacheControl.CACHE_NONE;
        b = new WebpFrameCacheStrategy(a);
        final a a2 = new a();
        a2.a = CacheControl.CACHE_AUTO;
        c = new WebpFrameCacheStrategy(a2);
        final a a3 = new a();
        a3.a = CacheControl.CACHE_ALL;
        new WebpFrameCacheStrategy(a3);
    }
    
    public WebpFrameCacheStrategy(final a a) {
        this.a = a.a;
    }
    
    public enum CacheControl
    {
        CACHE_ALL, 
        CACHE_AUTO, 
        CACHE_LIMITED, 
        CACHE_NONE;
    }
    
    public static final class a
    {
        public CacheControl a;
    }
}
