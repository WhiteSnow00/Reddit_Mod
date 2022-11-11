// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class Inbox
{
    public static final a<Inbox, Builder> ADAPTER;
    public final Long badge_count;
    public final String id;
    public final Boolean is_clicked;
    public final Boolean is_viewed;
    public final String tab;
    
    static {
        ADAPTER = (a)new InboxAdapter(null);
    }
    
    private Inbox(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.tab = Builder.access$200(builder);
        this.badge_count = Builder.access$300(builder);
        this.is_viewed = Builder.access$400(builder);
        this.is_clicked = Builder.access$500(builder);
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
        if (!(o instanceof Inbox)) {
            return false;
        }
        final Inbox inbox = (Inbox)o;
        final String id = this.id;
        final String id2 = inbox.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String tab = this.tab;
            final String tab2 = inbox.tab;
            if (tab == tab2 || (tab != null && tab.equals(tab2))) {
                final Long badge_count = this.badge_count;
                final Long badge_count2 = inbox.badge_count;
                if (badge_count == badge_count2 || (badge_count != null && badge_count.equals(badge_count2))) {
                    final Boolean is_viewed = this.is_viewed;
                    final Boolean is_viewed2 = inbox.is_viewed;
                    if (is_viewed == is_viewed2 || (is_viewed != null && is_viewed.equals(is_viewed2))) {
                        final Boolean is_clicked = this.is_clicked;
                        final Boolean is_clicked2 = inbox.is_clicked;
                        boolean b2 = b;
                        if (is_clicked == is_clicked2) {
                            return b2;
                        }
                        if (is_clicked != null && is_clicked.equals(is_clicked2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String tab = this.tab;
        int hashCode3;
        if (tab == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = tab.hashCode();
        }
        final Long badge_count = this.badge_count;
        int hashCode4;
        if (badge_count == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = badge_count.hashCode();
        }
        final Boolean is_viewed = this.is_viewed;
        int hashCode5;
        if (is_viewed == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = is_viewed.hashCode();
        }
        final Boolean is_clicked = this.is_clicked;
        if (is_clicked != null) {
            hashCode = is_clicked.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Inbox{id=");
        k.append(this.id);
        k.append(", tab=");
        k.append(this.tab);
        k.append(", badge_count=");
        k.append(this.badge_count);
        k.append(", is_viewed=");
        k.append(this.is_viewed);
        k.append(", is_clicked=");
        k.append(this.is_clicked);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Inbox.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Inbox>
    {
        private Long badge_count;
        private String id;
        private Boolean is_clicked;
        private Boolean is_viewed;
        private String tab;
        
        public Builder() {
        }
        
        public Builder(final Inbox inbox) {
            this.id = inbox.id;
            this.tab = inbox.tab;
            this.badge_count = inbox.badge_count;
            this.is_viewed = inbox.is_viewed;
            this.is_clicked = inbox.is_clicked;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.tab;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.badge_count;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.is_viewed;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.is_clicked;
        }
        
        public Builder badge_count(final Long badge_count) {
            this.badge_count = badge_count;
            return this;
        }
        
        public Inbox build() {
            return new Inbox(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_clicked(final Boolean is_clicked) {
            this.is_clicked = is_clicked;
            return this;
        }
        
        public Builder is_viewed(final Boolean is_viewed) {
            this.is_viewed = is_viewed;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.tab = null;
            this.badge_count = null;
            this.is_viewed = null;
            this.is_clicked = null;
        }
        
        public Builder tab(final String tab) {
            this.tab = tab;
            return this;
        }
    }
    
    public static final class InboxAdapter implements a<Inbox, Builder>
    {
        private InboxAdapter() {
        }
        
        public Inbox read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Inbox read(final e e, final Builder builder) throws IOException {
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
                                if (b != 5) {
                                    mt.a.a(e, a);
                                }
                                else if (a == 2) {
                                    builder.is_clicked(e.b());
                                }
                                else {
                                    mt.a.a(e, a);
                                }
                            }
                            else if (a == 2) {
                                builder.is_viewed(e.b());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 10) {
                            builder.badge_count(e.v());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.tab(e.F());
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
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Inbox inbox) throws IOException {
            e.a0();
            if (inbox.id != null) {
                e.N(1, (byte)11);
                e.Z(inbox.id);
                e.O();
            }
            if (inbox.tab != null) {
                e.N(2, (byte)11);
                e.Z(inbox.tab);
                e.O();
            }
            if (inbox.badge_count != null) {
                e.N(3, (byte)10);
                a.r(inbox.badge_count, e);
            }
            if (inbox.is_viewed != null) {
                e.N(4, (byte)2);
                d.z(inbox.is_viewed, e);
            }
            if (inbox.is_clicked != null) {
                e.N(5, (byte)2);
                d.z(inbox.is_clicked, e);
            }
            e.P();
            e.b0();
        }
    }
}
