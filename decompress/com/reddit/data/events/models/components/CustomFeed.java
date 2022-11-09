// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class CustomFeed
{
    public static final a<CustomFeed, CustomFeed.CustomFeed$Builder> ADAPTER;
    public final String cover_art_url;
    public final String id;
    public final Boolean is_nsfw;
    public final Integer number_followers;
    public final Integer number_subreddits;
    public final String owner_id;
    public final String visibility;
    
    static {
        ADAPTER = (a)new CustomFeed.CustomFeed$CustomFeedAdapter((CustomFeed$1)null);
    }
    
    private CustomFeed(final CustomFeed.CustomFeed$Builder customFeed$Builder) {
        this.id = CustomFeed.CustomFeed$Builder.access$100(customFeed$Builder);
        this.owner_id = CustomFeed.CustomFeed$Builder.access$200(customFeed$Builder);
        this.number_subreddits = CustomFeed.CustomFeed$Builder.access$300(customFeed$Builder);
        this.number_followers = CustomFeed.CustomFeed$Builder.access$400(customFeed$Builder);
        this.is_nsfw = CustomFeed.CustomFeed$Builder.access$500(customFeed$Builder);
        this.cover_art_url = CustomFeed.CustomFeed$Builder.access$600(customFeed$Builder);
        this.visibility = CustomFeed.CustomFeed$Builder.access$700(customFeed$Builder);
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
        if (!(o instanceof CustomFeed)) {
            return false;
        }
        final CustomFeed customFeed = (CustomFeed)o;
        final String id = this.id;
        final String id2 = customFeed.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String owner_id = this.owner_id;
            final String owner_id2 = customFeed.owner_id;
            if (owner_id == owner_id2 || (owner_id != null && owner_id.equals(owner_id2))) {
                final Integer number_subreddits = this.number_subreddits;
                final Integer number_subreddits2 = customFeed.number_subreddits;
                if (number_subreddits == number_subreddits2 || (number_subreddits != null && number_subreddits.equals(number_subreddits2))) {
                    final Integer number_followers = this.number_followers;
                    final Integer number_followers2 = customFeed.number_followers;
                    if (number_followers == number_followers2 || (number_followers != null && number_followers.equals(number_followers2))) {
                        final Boolean is_nsfw = this.is_nsfw;
                        final Boolean is_nsfw2 = customFeed.is_nsfw;
                        if (is_nsfw == is_nsfw2 || (is_nsfw != null && is_nsfw.equals(is_nsfw2))) {
                            final String cover_art_url = this.cover_art_url;
                            final String cover_art_url2 = customFeed.cover_art_url;
                            if (cover_art_url == cover_art_url2 || (cover_art_url != null && cover_art_url.equals(cover_art_url2))) {
                                final String visibility = this.visibility;
                                final String visibility2 = customFeed.visibility;
                                boolean b2 = b;
                                if (visibility == visibility2) {
                                    return b2;
                                }
                                if (visibility != null && visibility.equals(visibility2)) {
                                    b2 = b;
                                    return b2;
                                }
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String owner_id = this.owner_id;
        int hashCode3;
        if (owner_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = owner_id.hashCode();
        }
        final Integer number_subreddits = this.number_subreddits;
        int hashCode4;
        if (number_subreddits == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = number_subreddits.hashCode();
        }
        final Integer number_followers = this.number_followers;
        int hashCode5;
        if (number_followers == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = number_followers.hashCode();
        }
        final Boolean is_nsfw = this.is_nsfw;
        int hashCode6;
        if (is_nsfw == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = is_nsfw.hashCode();
        }
        final String cover_art_url = this.cover_art_url;
        int hashCode7;
        if (cover_art_url == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = cover_art_url.hashCode();
        }
        final String visibility = this.visibility;
        if (visibility != null) {
            hashCode = visibility.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CustomFeed{id=");
        k.append(this.id);
        k.append(", owner_id=");
        k.append(this.owner_id);
        k.append(", number_subreddits=");
        k.append(this.number_subreddits);
        k.append(", number_followers=");
        k.append(this.number_followers);
        k.append(", is_nsfw=");
        k.append(this.is_nsfw);
        k.append(", cover_art_url=");
        k.append(this.cover_art_url);
        k.append(", visibility=");
        return b.j(k, this.visibility, "}");
    }
    
    public void write(final e e) throws IOException {
        CustomFeed.ADAPTER.write(e, (Object)this);
    }
}
