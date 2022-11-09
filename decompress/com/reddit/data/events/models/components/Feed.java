// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Feed
{
    public static final a<Feed, Builder> ADAPTER;
    public final String correlation_id;
    public final String id;
    public final String referrer_correlation_id;
    public final Long serving_position;
    
    static {
        ADAPTER = (a)new FeedAdapter(null);
    }
    
    private Feed(final Builder builder) {
        this.correlation_id = Builder.access$100(builder);
        this.id = Builder.access$200(builder);
        this.serving_position = Builder.access$300(builder);
        this.referrer_correlation_id = Builder.access$400(builder);
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
        if (!(o instanceof Feed)) {
            return false;
        }
        final Feed feed = (Feed)o;
        final String correlation_id = this.correlation_id;
        final String correlation_id2 = feed.correlation_id;
        if (correlation_id == correlation_id2 || (correlation_id != null && correlation_id.equals(correlation_id2))) {
            final String id = this.id;
            final String id2 = feed.id;
            if (id == id2 || (id != null && id.equals(id2))) {
                final Long serving_position = this.serving_position;
                final Long serving_position2 = feed.serving_position;
                if (serving_position == serving_position2 || (serving_position != null && serving_position.equals(serving_position2))) {
                    final String referrer_correlation_id = this.referrer_correlation_id;
                    final String referrer_correlation_id2 = feed.referrer_correlation_id;
                    boolean b2 = b;
                    if (referrer_correlation_id == referrer_correlation_id2) {
                        return b2;
                    }
                    if (referrer_correlation_id != null && referrer_correlation_id.equals(referrer_correlation_id2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String correlation_id = this.correlation_id;
        int hashCode = 0;
        int hashCode2;
        if (correlation_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = correlation_id.hashCode();
        }
        final String id = this.id;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final Long serving_position = this.serving_position;
        int hashCode4;
        if (serving_position == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = serving_position.hashCode();
        }
        final String referrer_correlation_id = this.referrer_correlation_id;
        if (referrer_correlation_id != null) {
            hashCode = referrer_correlation_id.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Feed{correlation_id=");
        k.append(this.correlation_id);
        k.append(", id=");
        k.append(this.id);
        k.append(", serving_position=");
        k.append(this.serving_position);
        k.append(", referrer_correlation_id=");
        return b.j(k, this.referrer_correlation_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Feed.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Feed>
    {
        private String correlation_id;
        private String id;
        private String referrer_correlation_id;
        private Long serving_position;
        
        public Builder() {
        }
        
        public Builder(final Feed feed) {
            this.correlation_id = feed.correlation_id;
            this.id = feed.id;
            this.serving_position = feed.serving_position;
            this.referrer_correlation_id = feed.referrer_correlation_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.correlation_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.serving_position;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.referrer_correlation_id;
        }
        
        public Feed build() {
            return new Feed(this, null);
        }
        
        public Builder correlation_id(final String correlation_id) {
            this.correlation_id = correlation_id;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder referrer_correlation_id(final String referrer_correlation_id) {
            this.referrer_correlation_id = referrer_correlation_id;
            return this;
        }
        
        public void reset() {
            this.correlation_id = null;
            this.id = null;
            this.serving_position = null;
            this.referrer_correlation_id = null;
        }
        
        public Builder serving_position(final Long serving_position) {
            this.serving_position = serving_position;
            return this;
        }
    }
    
    public static final class FeedAdapter implements a<Feed, Builder>
    {
        private FeedAdapter() {
        }
        
        public Feed read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Feed read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                mt.a.a(e, a);
                            }
                            else if (a == 11) {
                                builder.referrer_correlation_id(e.F());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 10) {
                            builder.serving_position(e.v());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.id(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.correlation_id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Feed feed) throws IOException {
            e.a0();
            if (feed.correlation_id != null) {
                e.N(1, (byte)11);
                e.Z(feed.correlation_id);
                e.O();
            }
            if (feed.id != null) {
                e.N(2, (byte)11);
                e.Z(feed.id);
                e.O();
            }
            if (feed.serving_position != null) {
                e.N(3, (byte)10);
                a.r(feed.serving_position, e);
            }
            if (feed.referrer_correlation_id != null) {
                e.N(4, (byte)11);
                e.Z(feed.referrer_correlation_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
