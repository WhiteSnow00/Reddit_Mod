// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class DOMTimers
{
    public static final a<DOMTimers, DOMTimers.DOMTimers$Builder> ADAPTER;
    public final Long loaded;
    public final Long loading;
    public final Long request;
    
    static {
        ADAPTER = (a)new DOMTimers.DOMTimers$DOMTimersAdapter((DOMTimers$1)null);
    }
    
    private DOMTimers(final DOMTimers.DOMTimers$Builder domTimers$Builder) {
        this.request = DOMTimers.DOMTimers$Builder.access$100(domTimers$Builder);
        this.loading = DOMTimers.DOMTimers$Builder.access$200(domTimers$Builder);
        this.loaded = DOMTimers.DOMTimers$Builder.access$300(domTimers$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof DOMTimers)) {
            return false;
        }
        final DOMTimers domTimers = (DOMTimers)o;
        final Long request = this.request;
        final Long request2 = domTimers.request;
        if (request == request2 || (request != null && request.equals(request2))) {
            final Long loading = this.loading;
            final Long loading2 = domTimers.loading;
            if (loading == loading2 || (loading != null && loading.equals(loading2))) {
                final Long loaded = this.loaded;
                final Long loaded2 = domTimers.loaded;
                boolean b2 = b;
                if (loaded == loaded2) {
                    return b2;
                }
                if (loaded != null && loaded.equals(loaded2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long request = this.request;
        int hashCode = 0;
        int hashCode2;
        if (request == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = request.hashCode();
        }
        final Long loading = this.loading;
        int hashCode3;
        if (loading == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = loading.hashCode();
        }
        final Long loaded = this.loaded;
        if (loaded != null) {
            hashCode = loaded.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("DOMTimers{request=");
        k.append(this.request);
        k.append(", loading=");
        k.append(this.loading);
        k.append(", loaded=");
        return a.h(k, this.loaded, "}");
    }
    
    public void write(final e e) throws IOException {
        DOMTimers.ADAPTER.write(e, (Object)this);
    }
}
