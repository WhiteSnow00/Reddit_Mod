// 
// Decompiled by Procyon v0.6.0
// 

package com.danikula.videocache;

public class ProxyCacheException extends Exception
{
    public ProxyCacheException(final String s) {
        super(b.l(s, ". Version: 2.7.1"));
    }
    
    public ProxyCacheException(final String s, final Throwable t) {
        super(b.l(s, ". Version: 2.7.1"), t);
    }
    
    public ProxyCacheException(final Throwable t) {
        super("No explanation error. Version: 2.7.1", t);
    }
}
