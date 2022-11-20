// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Outbound
{
    public static final a<Outbound, Builder> ADAPTER;
    public final String comment_id;
    public final String post_id;
    public final String source_element;
    public final String subreddit_id;
    public final String subreddit_name;
    public final String url;
    
    static {
        ADAPTER = (a)new OutboundAdapter(null);
    }
    
    private Outbound(final Builder builder) {
        this.url = Builder.access$100(builder);
        this.post_id = Builder.access$200(builder);
        this.subreddit_id = Builder.access$300(builder);
        this.comment_id = Builder.access$400(builder);
        this.subreddit_name = Builder.access$500(builder);
        this.source_element = Builder.access$600(builder);
    }
    
    public Outbound(final Builder builder, final Outbound$1 object) {
        this(builder);
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
        if (!(o instanceof Outbound)) {
            return false;
        }
        final Outbound outbound = (Outbound)o;
        final String url = this.url;
        final String url2 = outbound.url;
        if (url == url2 || (url != null && url.equals(url2))) {
            final String post_id = this.post_id;
            final String post_id2 = outbound.post_id;
            if (post_id == post_id2 || (post_id != null && post_id.equals(post_id2))) {
                final String subreddit_id = this.subreddit_id;
                final String subreddit_id2 = outbound.subreddit_id;
                if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                    final String comment_id = this.comment_id;
                    final String comment_id2 = outbound.comment_id;
                    if (comment_id == comment_id2 || (comment_id != null && comment_id.equals(comment_id2))) {
                        final String subreddit_name = this.subreddit_name;
                        final String subreddit_name2 = outbound.subreddit_name;
                        if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                            final String source_element = this.source_element;
                            final String source_element2 = outbound.source_element;
                            boolean b2 = b;
                            if (source_element == source_element2) {
                                return b2;
                            }
                            if (source_element != null && source_element.equals(source_element2)) {
                                b2 = b;
                                return b2;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String url = this.url;
        int hashCode = 0;
        int hashCode2;
        if (url == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = url.hashCode();
        }
        final String post_id = this.post_id;
        int hashCode3;
        if (post_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = post_id.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        int hashCode4;
        if (subreddit_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subreddit_id.hashCode();
        }
        final String comment_id = this.comment_id;
        int hashCode5;
        if (comment_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = comment_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode6;
        if (subreddit_name == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = subreddit_name.hashCode();
        }
        final String source_element = this.source_element;
        if (source_element != null) {
            hashCode = source_element.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Outbound{url=");
        t.append(this.url);
        t.append(", post_id=");
        t.append(this.post_id);
        t.append(", subreddit_id=");
        t.append(this.subreddit_id);
        t.append(", comment_id=");
        t.append(this.comment_id);
        t.append(", subreddit_name=");
        t.append(this.subreddit_name);
        t.append(", source_element=");
        return ph0.a.f(t, this.source_element, "}");
    }
    
    public void write(final e e) throws IOException {
        Outbound.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Outbound>
    {
        private String comment_id;
        private String post_id;
        private String source_element;
        private String subreddit_id;
        private String subreddit_name;
        private String url;
        
        public Builder() {
        }
        
        public Builder(final Outbound outbound) {
            this.url = outbound.url;
            this.post_id = outbound.post_id;
            this.subreddit_id = outbound.subreddit_id;
            this.comment_id = outbound.comment_id;
            this.subreddit_name = outbound.subreddit_name;
            this.source_element = outbound.source_element;
        }
        
        public static String access$100(final Builder builder) {
            return builder.url;
        }
        
        public static String access$200(final Builder builder) {
            return builder.post_id;
        }
        
        public static String access$300(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static String access$400(final Builder builder) {
            return builder.comment_id;
        }
        
        public static String access$500(final Builder builder) {
            return builder.subreddit_name;
        }
        
        public static String access$600(final Builder builder) {
            return builder.source_element;
        }
        
        public Outbound build() {
            return new Outbound(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder comment_id(final String comment_id) {
            this.comment_id = comment_id;
            return this;
        }
        
        public Builder post_id(final String post_id) {
            this.post_id = post_id;
            return this;
        }
        
        public void reset() {
            this.url = null;
            this.post_id = null;
            this.subreddit_id = null;
            this.comment_id = null;
            this.subreddit_name = null;
            this.source_element = null;
        }
        
        public Builder source_element(final String source_element) {
            this.source_element = source_element;
            return this;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder subreddit_name(final String subreddit_name) {
            this.subreddit_name = subreddit_name;
            return this;
        }
        
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
    }
    
    public static final class OutboundAdapter implements a<Outbound, Builder>
    {
        private OutboundAdapter() {
        }
        
        public OutboundAdapter(final Outbound$1 object) {
            this();
        }
        
        public Outbound read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Outbound read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.source_element(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.subreddit_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.comment_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.post_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.url(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final Outbound outbound) throws IOException {
            e.X();
            if (outbound.url != null) {
                e.O(1, (byte)11);
                e.W(outbound.url);
                e.P();
            }
            if (outbound.post_id != null) {
                e.O(2, (byte)11);
                e.W(outbound.post_id);
                e.P();
            }
            if (outbound.subreddit_id != null) {
                e.O(3, (byte)11);
                e.W(outbound.subreddit_id);
                e.P();
            }
            if (outbound.comment_id != null) {
                e.O(4, (byte)11);
                e.W(outbound.comment_id);
                e.P();
            }
            if (outbound.subreddit_name != null) {
                e.O(5, (byte)11);
                e.W(outbound.subreddit_name);
                e.P();
            }
            if (outbound.source_element != null) {
                e.O(6, (byte)11);
                e.W(outbound.source_element);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Outbound)o);
        }
    }
}
