// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class SocialLink
{
    public static final a<SocialLink, Builder> ADAPTER;
    public final String current_list;
    public final Boolean is_new;
    public final String name;
    public final Long position;
    public final String type;
    public final String url;
    
    static {
        ADAPTER = (a)new SocialLinkAdapter(null);
    }
    
    private SocialLink(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.url = Builder.access$200(builder);
        this.name = Builder.access$300(builder);
        this.position = Builder.access$400(builder);
        this.is_new = Builder.access$500(builder);
        this.current_list = Builder.access$600(builder);
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
        if (!(o instanceof SocialLink)) {
            return false;
        }
        final SocialLink socialLink = (SocialLink)o;
        final String type = this.type;
        final String type2 = socialLink.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String url = this.url;
            final String url2 = socialLink.url;
            if (url == url2 || (url != null && url.equals(url2))) {
                final String name = this.name;
                final String name2 = socialLink.name;
                if (name == name2 || (name != null && name.equals(name2))) {
                    final Long position = this.position;
                    final Long position2 = socialLink.position;
                    if (position == position2 || (position != null && position.equals(position2))) {
                        final Boolean is_new = this.is_new;
                        final Boolean is_new2 = socialLink.is_new;
                        if (is_new == is_new2 || (is_new != null && is_new.equals(is_new2))) {
                            final String current_list = this.current_list;
                            final String current_list2 = socialLink.current_list;
                            boolean b2 = b;
                            if (current_list == current_list2) {
                                return b2;
                            }
                            if (current_list != null && current_list.equals(current_list2)) {
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
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final String url = this.url;
        int hashCode3;
        if (url == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = url.hashCode();
        }
        final String name = this.name;
        int hashCode4;
        if (name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = name.hashCode();
        }
        final Long position = this.position;
        int hashCode5;
        if (position == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = position.hashCode();
        }
        final Boolean is_new = this.is_new;
        int hashCode6;
        if (is_new == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = is_new.hashCode();
        }
        final String current_list = this.current_list;
        if (current_list != null) {
            hashCode = current_list.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SocialLink{type=");
        k.append(this.type);
        k.append(", url=");
        k.append(this.url);
        k.append(", name=");
        k.append(this.name);
        k.append(", position=");
        k.append(this.position);
        k.append(", is_new=");
        k.append(this.is_new);
        k.append(", current_list=");
        return b.j(k, this.current_list, "}");
    }
    
    public void write(final e e) throws IOException {
        SocialLink.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<SocialLink>
    {
        private String current_list;
        private Boolean is_new;
        private String name;
        private Long position;
        private String type;
        private String url;
        
        public Builder() {
        }
        
        public Builder(final SocialLink socialLink) {
            this.type = socialLink.type;
            this.url = socialLink.url;
            this.name = socialLink.name;
            this.position = socialLink.position;
            this.is_new = socialLink.is_new;
            this.current_list = socialLink.current_list;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.url;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.position;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.is_new;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.current_list;
        }
        
        public SocialLink build() {
            return new SocialLink(this, null);
        }
        
        public Builder current_list(final String current_list) {
            this.current_list = current_list;
            return this;
        }
        
        public Builder is_new(final Boolean is_new) {
            this.is_new = is_new;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder position(final Long position) {
            this.position = position;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.url = null;
            this.name = null;
            this.position = null;
            this.is_new = null;
            this.current_list = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
    }
    
    public static final class SocialLinkAdapter implements a<SocialLink, Builder>
    {
        private SocialLinkAdapter() {
        }
        
        public SocialLink read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public SocialLink read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.current_list(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.is_new(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.position(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final SocialLink socialLink) throws IOException {
            e.a0();
            if (socialLink.type != null) {
                e.N(1, (byte)11);
                e.Z(socialLink.type);
                e.O();
            }
            if (socialLink.url != null) {
                e.N(2, (byte)11);
                e.Z(socialLink.url);
                e.O();
            }
            if (socialLink.name != null) {
                e.N(3, (byte)11);
                e.Z(socialLink.name);
                e.O();
            }
            if (socialLink.position != null) {
                e.N(4, (byte)10);
                a.r(socialLink.position, e);
            }
            if (socialLink.is_new != null) {
                e.N(5, (byte)2);
                d.z(socialLink.is_new, e);
            }
            if (socialLink.current_list != null) {
                e.N(6, (byte)11);
                e.Z(socialLink.current_list);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
