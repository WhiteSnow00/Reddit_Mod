// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Widget
{
    public static final a<Widget, Builder> ADAPTER;
    public final String target_subreddit_id;
    public final String target_subreddit_name;
    public final String type;
    
    static {
        ADAPTER = (a)new WidgetAdapter(null);
    }
    
    private Widget(final Builder builder) {
        this.target_subreddit_name = Builder.access$100(builder);
        this.target_subreddit_id = Builder.access$200(builder);
        this.type = Builder.access$300(builder);
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
        if (!(o instanceof Widget)) {
            return false;
        }
        final Widget widget = (Widget)o;
        final String target_subreddit_name = this.target_subreddit_name;
        final String target_subreddit_name2 = widget.target_subreddit_name;
        if (target_subreddit_name == target_subreddit_name2 || (target_subreddit_name != null && target_subreddit_name.equals(target_subreddit_name2))) {
            final String target_subreddit_id = this.target_subreddit_id;
            final String target_subreddit_id2 = widget.target_subreddit_id;
            if (target_subreddit_id == target_subreddit_id2 || (target_subreddit_id != null && target_subreddit_id.equals(target_subreddit_id2))) {
                final String type = this.type;
                final String type2 = widget.type;
                boolean b2 = b;
                if (type == type2) {
                    return b2;
                }
                if (type != null && type.equals(type2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String target_subreddit_name = this.target_subreddit_name;
        int hashCode = 0;
        int hashCode2;
        if (target_subreddit_name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = target_subreddit_name.hashCode();
        }
        final String target_subreddit_id = this.target_subreddit_id;
        int hashCode3;
        if (target_subreddit_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = target_subreddit_id.hashCode();
        }
        final String type = this.type;
        if (type != null) {
            hashCode = type.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Widget{target_subreddit_name=");
        k.append(this.target_subreddit_name);
        k.append(", target_subreddit_id=");
        k.append(this.target_subreddit_id);
        k.append(", type=");
        return b.j(k, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Widget.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Widget>
    {
        private String target_subreddit_id;
        private String target_subreddit_name;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Widget widget) {
            this.target_subreddit_name = widget.target_subreddit_name;
            this.target_subreddit_id = widget.target_subreddit_id;
            this.type = widget.type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.target_subreddit_name;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.target_subreddit_id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.type;
        }
        
        public Widget build() {
            return new Widget(this, null);
        }
        
        public void reset() {
            this.target_subreddit_name = null;
            this.target_subreddit_id = null;
            this.type = null;
        }
        
        public Builder target_subreddit_id(final String target_subreddit_id) {
            this.target_subreddit_id = target_subreddit_id;
            return this;
        }
        
        public Builder target_subreddit_name(final String target_subreddit_name) {
            this.target_subreddit_name = target_subreddit_name;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class WidgetAdapter implements a<Widget, Builder>
    {
        private WidgetAdapter() {
        }
        
        public Widget read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Widget read(final e e, final Builder builder) throws IOException {
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
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.type(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.target_subreddit_id(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.target_subreddit_name(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Widget widget) throws IOException {
            e.a0();
            if (widget.target_subreddit_name != null) {
                e.N(1, (byte)11);
                e.Z(widget.target_subreddit_name);
                e.O();
            }
            if (widget.target_subreddit_id != null) {
                e.N(2, (byte)11);
                e.Z(widget.target_subreddit_id);
                e.O();
            }
            if (widget.type != null) {
                e.N(3, (byte)11);
                e.Z(widget.type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
