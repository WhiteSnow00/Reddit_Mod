// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class SocialLink
{
    public static final a<SocialLink, SocialLink.SocialLink$Builder> ADAPTER;
    public final String current_list;
    public final Boolean is_new;
    public final String name;
    public final Long position;
    public final String type;
    public final String url;
    
    static {
        ADAPTER = (a)new SocialLink.SocialLink$SocialLinkAdapter((SocialLink$1)null);
    }
    
    private SocialLink(final SocialLink.SocialLink$Builder socialLink$Builder) {
        this.type = SocialLink.SocialLink$Builder.access$100(socialLink$Builder);
        this.url = SocialLink.SocialLink$Builder.access$200(socialLink$Builder);
        this.name = SocialLink.SocialLink$Builder.access$300(socialLink$Builder);
        this.position = SocialLink.SocialLink$Builder.access$400(socialLink$Builder);
        this.is_new = SocialLink.SocialLink$Builder.access$500(socialLink$Builder);
        this.current_list = SocialLink.SocialLink$Builder.access$600(socialLink$Builder);
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
        final StringBuilder r = a.r("SocialLink{type=");
        r.append(this.type);
        r.append(", url=");
        r.append(this.url);
        r.append(", name=");
        r.append(this.name);
        r.append(", position=");
        r.append(this.position);
        r.append(", is_new=");
        r.append(this.is_new);
        r.append(", current_list=");
        return a.o(r, this.current_list, "}");
    }
    
    public void write(final e e) throws IOException {
        SocialLink.ADAPTER.write(e, (Object)this);
    }
}
