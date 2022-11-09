// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ThirdPartyBadge
{
    public static final a<ThirdPartyBadge, Builder> ADAPTER;
    public final String id;
    public final String target_user_id;
    public final String title;
    
    static {
        ADAPTER = (a)new ThirdPartyBadgeAdapter(null);
    }
    
    private ThirdPartyBadge(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
        this.target_user_id = Builder.access$300(builder);
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
        if (!(o instanceof ThirdPartyBadge)) {
            return false;
        }
        final ThirdPartyBadge thirdPartyBadge = (ThirdPartyBadge)o;
        final String id = this.id;
        final String id2 = thirdPartyBadge.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = thirdPartyBadge.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final String target_user_id = this.target_user_id;
                final String target_user_id2 = thirdPartyBadge.target_user_id;
                boolean b2 = b;
                if (target_user_id == target_user_id2) {
                    return b2;
                }
                if (target_user_id != null && target_user_id.equals(target_user_id2)) {
                    b2 = b;
                    return b2;
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
        final String title = this.title;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String target_user_id = this.target_user_id;
        if (target_user_id != null) {
            hashCode = target_user_id.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ThirdPartyBadge{id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", target_user_id=");
        return b.j(k, this.target_user_id, "}");
    }
    
    public void write(final e e) throws IOException {
        ThirdPartyBadge.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<ThirdPartyBadge>
    {
        private String id;
        private String target_user_id;
        private String title;
        
        public Builder() {
        }
        
        public Builder(final ThirdPartyBadge thirdPartyBadge) {
            this.id = thirdPartyBadge.id;
            this.title = thirdPartyBadge.title;
            this.target_user_id = thirdPartyBadge.target_user_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.title;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.target_user_id;
        }
        
        public ThirdPartyBadge build() {
            return new ThirdPartyBadge(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.title = null;
            this.target_user_id = null;
        }
        
        public Builder target_user_id(final String target_user_id) {
            this.target_user_id = target_user_id;
            return this;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
    }
    
    public static final class ThirdPartyBadgeAdapter implements a<ThirdPartyBadge, Builder>
    {
        private ThirdPartyBadgeAdapter() {
        }
        
        public ThirdPartyBadge read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ThirdPartyBadge read(final e e, final Builder builder) throws IOException {
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
                            builder.target_user_id(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.title(e.F());
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
        
        public void write(final e e, final ThirdPartyBadge thirdPartyBadge) throws IOException {
            e.a0();
            if (thirdPartyBadge.id != null) {
                e.N(1, (byte)11);
                e.Z(thirdPartyBadge.id);
                e.O();
            }
            if (thirdPartyBadge.title != null) {
                e.N(2, (byte)11);
                e.Z(thirdPartyBadge.title);
                e.O();
            }
            if (thirdPartyBadge.target_user_id != null) {
                e.N(3, (byte)11);
                e.Z(thirdPartyBadge.target_user_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
