// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class AdPush
{
    public static final a<AdPush, AdPush.AdPush$Builder> ADAPTER;
    public final String direction;
    public final Boolean first_ad;
    public final String push_keyword;
    public final Boolean push_nsfw;
    public final Boolean push_other;
    public final Boolean push_whitelist;
    
    static {
        ADAPTER = (a)new AdPush.AdPush$AdPushAdapter((AdPush$1)null);
    }
    
    private AdPush(final AdPush.AdPush$Builder adPush$Builder) {
        this.push_whitelist = AdPush.AdPush$Builder.access$100(adPush$Builder);
        this.push_nsfw = AdPush.AdPush$Builder.access$200(adPush$Builder);
        this.push_keyword = AdPush.AdPush$Builder.access$300(adPush$Builder);
        this.push_other = AdPush.AdPush$Builder.access$400(adPush$Builder);
        this.direction = AdPush.AdPush$Builder.access$500(adPush$Builder);
        this.first_ad = AdPush.AdPush$Builder.access$600(adPush$Builder);
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
        if (!(o instanceof AdPush)) {
            return false;
        }
        final AdPush adPush = (AdPush)o;
        final Boolean push_whitelist = this.push_whitelist;
        final Boolean push_whitelist2 = adPush.push_whitelist;
        if (push_whitelist == push_whitelist2 || (push_whitelist != null && push_whitelist.equals(push_whitelist2))) {
            final Boolean push_nsfw = this.push_nsfw;
            final Boolean push_nsfw2 = adPush.push_nsfw;
            if (push_nsfw == push_nsfw2 || (push_nsfw != null && push_nsfw.equals(push_nsfw2))) {
                final String push_keyword = this.push_keyword;
                final String push_keyword2 = adPush.push_keyword;
                if (push_keyword == push_keyword2 || (push_keyword != null && push_keyword.equals(push_keyword2))) {
                    final Boolean push_other = this.push_other;
                    final Boolean push_other2 = adPush.push_other;
                    if (push_other == push_other2 || (push_other != null && push_other.equals(push_other2))) {
                        final String direction = this.direction;
                        final String direction2 = adPush.direction;
                        if (direction == direction2 || (direction != null && direction.equals(direction2))) {
                            final Boolean first_ad = this.first_ad;
                            final Boolean first_ad2 = adPush.first_ad;
                            boolean b2 = b;
                            if (first_ad == first_ad2) {
                                return b2;
                            }
                            if (first_ad != null && first_ad.equals(first_ad2)) {
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
        final Boolean push_whitelist = this.push_whitelist;
        int hashCode = 0;
        int hashCode2;
        if (push_whitelist == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = push_whitelist.hashCode();
        }
        final Boolean push_nsfw = this.push_nsfw;
        int hashCode3;
        if (push_nsfw == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = push_nsfw.hashCode();
        }
        final String push_keyword = this.push_keyword;
        int hashCode4;
        if (push_keyword == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = push_keyword.hashCode();
        }
        final Boolean push_other = this.push_other;
        int hashCode5;
        if (push_other == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = push_other.hashCode();
        }
        final String direction = this.direction;
        int hashCode6;
        if (direction == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = direction.hashCode();
        }
        final Boolean first_ad = this.first_ad;
        if (first_ad != null) {
            hashCode = first_ad.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdPush{push_whitelist=");
        k.append(this.push_whitelist);
        k.append(", push_nsfw=");
        k.append(this.push_nsfw);
        k.append(", push_keyword=");
        k.append(this.push_keyword);
        k.append(", push_other=");
        k.append(this.push_other);
        k.append(", direction=");
        k.append(this.direction);
        k.append(", first_ad=");
        k.append(this.first_ad);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AdPush.ADAPTER.write(e, (Object)this);
    }
}
