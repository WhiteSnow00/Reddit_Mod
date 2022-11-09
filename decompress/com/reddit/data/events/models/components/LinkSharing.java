// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class LinkSharing
{
    public static final a<LinkSharing, Builder> ADAPTER;
    public final Long shared_at_timestamp;
    
    static {
        ADAPTER = (a)new LinkSharingAdapter(null);
    }
    
    private LinkSharing(final Builder builder) {
        this.shared_at_timestamp = Builder.access$100(builder);
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
        if (!(o instanceof LinkSharing)) {
            return false;
        }
        final LinkSharing linkSharing = (LinkSharing)o;
        final Long shared_at_timestamp = this.shared_at_timestamp;
        final Long shared_at_timestamp2 = linkSharing.shared_at_timestamp;
        boolean b2 = b;
        if (shared_at_timestamp != shared_at_timestamp2) {
            b2 = (shared_at_timestamp != null && shared_at_timestamp.equals(shared_at_timestamp2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final Long shared_at_timestamp = this.shared_at_timestamp;
        int hashCode;
        if (shared_at_timestamp == null) {
            hashCode = 0;
        }
        else {
            hashCode = shared_at_timestamp.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return a.h(a.k("LinkSharing{shared_at_timestamp="), this.shared_at_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        LinkSharing.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<LinkSharing>
    {
        private Long shared_at_timestamp;
        
        public Builder() {
        }
        
        public Builder(final LinkSharing linkSharing) {
            this.shared_at_timestamp = linkSharing.shared_at_timestamp;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.shared_at_timestamp;
        }
        
        public LinkSharing build() {
            return new LinkSharing(this, null);
        }
        
        public void reset() {
            this.shared_at_timestamp = null;
        }
        
        public Builder shared_at_timestamp(final Long shared_at_timestamp) {
            this.shared_at_timestamp = shared_at_timestamp;
            return this;
        }
    }
    
    public static final class LinkSharingAdapter implements a<LinkSharing, Builder>
    {
        private LinkSharingAdapter() {
        }
        
        public LinkSharing read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public LinkSharing read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    mt.a.a(e, a);
                }
                else if (a == 10) {
                    builder.shared_at_timestamp(e.v());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final LinkSharing linkSharing) throws IOException {
            e.a0();
            if (linkSharing.shared_at_timestamp != null) {
                e.N(1, (byte)10);
                a.r(linkSharing.shared_at_timestamp, e);
            }
            e.P();
            e.b0();
        }
    }
}
