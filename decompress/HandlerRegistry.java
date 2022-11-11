// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

import java.util.ArrayList;

public class HandlerRegistry
{
    private final ArrayList<HttpHandler> mHttpHandlers;
    private final ArrayList<PathMatcher> mPathMatchers;
    
    public HandlerRegistry() {
        this.mPathMatchers = new ArrayList<PathMatcher>();
        this.mHttpHandlers = new ArrayList<HttpHandler>();
    }
    
    public HttpHandler lookup(final String s) {
        monitorenter(this);
        int i = 0;
        try {
            while (i < this.mPathMatchers.size()) {
                if (this.mPathMatchers.get(i).match(s)) {
                    return this.mHttpHandlers.get(i);
                }
                ++i;
            }
            return null;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public void register(final PathMatcher pathMatcher, final HttpHandler httpHandler) {
        synchronized (this) {
            this.mPathMatchers.add(pathMatcher);
            this.mHttpHandlers.add(httpHandler);
        }
    }
    
    public boolean unregister(final PathMatcher pathMatcher, final HttpHandler httpHandler) {
        synchronized (this) {
            final int index = this.mPathMatchers.indexOf(pathMatcher);
            if (index >= 0 && httpHandler == this.mHttpHandlers.get(index)) {
                this.mPathMatchers.remove(index);
                this.mHttpHandlers.remove(index);
                return true;
            }
            return false;
        }
    }
}
