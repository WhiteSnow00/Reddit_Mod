// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Profile
{
    public static final a<Profile, Builder> ADAPTER;
    public final String about;
    public final Boolean allow_follow;
    public final String avatar_url;
    public final Boolean communities_visible;
    public final Boolean content_visible;
    public final String cover_url;
    public final String display_name;
    public final String id;
    public final String name;
    public final Boolean nsfw;
    public final Long social_links;
    public final String type;
    
    static {
        ADAPTER = (a)new ProfileAdapter(null);
    }
    
    private Profile(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
        this.type = Builder.access$300(builder);
        this.display_name = Builder.access$400(builder);
        this.about = Builder.access$500(builder);
        this.avatar_url = Builder.access$600(builder);
        this.cover_url = Builder.access$700(builder);
        this.nsfw = Builder.access$800(builder);
        this.content_visible = Builder.access$900(builder);
        this.communities_visible = Builder.access$1000(builder);
        this.allow_follow = Builder.access$1100(builder);
        this.social_links = Builder.access$1200(builder);
    }
    
    public Profile(final Builder builder, final Profile$1 object) {
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
        if (!(o instanceof Profile)) {
            return false;
        }
        final Profile profile = (Profile)o;
        final String id = this.id;
        final String id2 = profile.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = profile.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String type = this.type;
                final String type2 = profile.type;
                if (type == type2 || (type != null && type.equals(type2))) {
                    final String display_name = this.display_name;
                    final String display_name2 = profile.display_name;
                    if (display_name == display_name2 || (display_name != null && display_name.equals(display_name2))) {
                        final String about = this.about;
                        final String about2 = profile.about;
                        if (about == about2 || (about != null && about.equals(about2))) {
                            final String avatar_url = this.avatar_url;
                            final String avatar_url2 = profile.avatar_url;
                            if (avatar_url == avatar_url2 || (avatar_url != null && avatar_url.equals(avatar_url2))) {
                                final String cover_url = this.cover_url;
                                final String cover_url2 = profile.cover_url;
                                if (cover_url == cover_url2 || (cover_url != null && cover_url.equals(cover_url2))) {
                                    final Boolean nsfw = this.nsfw;
                                    final Boolean nsfw2 = profile.nsfw;
                                    if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                        final Boolean content_visible = this.content_visible;
                                        final Boolean content_visible2 = profile.content_visible;
                                        if (content_visible == content_visible2 || (content_visible != null && content_visible.equals(content_visible2))) {
                                            final Boolean communities_visible = this.communities_visible;
                                            final Boolean communities_visible2 = profile.communities_visible;
                                            if (communities_visible == communities_visible2 || (communities_visible != null && communities_visible.equals(communities_visible2))) {
                                                final Boolean allow_follow = this.allow_follow;
                                                final Boolean allow_follow2 = profile.allow_follow;
                                                if (allow_follow == allow_follow2 || (allow_follow != null && allow_follow.equals(allow_follow2))) {
                                                    final Long social_links = this.social_links;
                                                    final Long social_links2 = profile.social_links;
                                                    boolean b2 = b;
                                                    if (social_links == social_links2) {
                                                        return b2;
                                                    }
                                                    if (social_links != null && social_links.equals(social_links2)) {
                                                        b2 = b;
                                                        return b2;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final String display_name = this.display_name;
        int hashCode5;
        if (display_name == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = display_name.hashCode();
        }
        final String about = this.about;
        int hashCode6;
        if (about == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = about.hashCode();
        }
        final String avatar_url = this.avatar_url;
        int hashCode7;
        if (avatar_url == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = avatar_url.hashCode();
        }
        final String cover_url = this.cover_url;
        int hashCode8;
        if (cover_url == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = cover_url.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode9;
        if (nsfw == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = nsfw.hashCode();
        }
        final Boolean content_visible = this.content_visible;
        int hashCode10;
        if (content_visible == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = content_visible.hashCode();
        }
        final Boolean communities_visible = this.communities_visible;
        int hashCode11;
        if (communities_visible == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = communities_visible.hashCode();
        }
        final Boolean allow_follow = this.allow_follow;
        int hashCode12;
        if (allow_follow == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = allow_follow.hashCode();
        }
        final Long social_links = this.social_links;
        if (social_links != null) {
            hashCode = social_links.hashCode();
        }
        return ((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Profile{id=");
        t.append(this.id);
        t.append(", name=");
        t.append(this.name);
        t.append(", type=");
        t.append(this.type);
        t.append(", display_name=");
        t.append(this.display_name);
        t.append(", about=");
        t.append(this.about);
        t.append(", avatar_url=");
        t.append(this.avatar_url);
        t.append(", cover_url=");
        t.append(this.cover_url);
        t.append(", nsfw=");
        t.append(this.nsfw);
        t.append(", content_visible=");
        t.append(this.content_visible);
        t.append(", communities_visible=");
        t.append(this.communities_visible);
        t.append(", allow_follow=");
        t.append(this.allow_follow);
        t.append(", social_links=");
        return d.l(t, this.social_links, "}");
    }
    
    public void write(final e e) throws IOException {
        Profile.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Profile>
    {
        private String about;
        private Boolean allow_follow;
        private String avatar_url;
        private Boolean communities_visible;
        private Boolean content_visible;
        private String cover_url;
        private String display_name;
        private String id;
        private String name;
        private Boolean nsfw;
        private Long social_links;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Profile profile) {
            this.id = profile.id;
            this.name = profile.name;
            this.type = profile.type;
            this.display_name = profile.display_name;
            this.about = profile.about;
            this.avatar_url = profile.avatar_url;
            this.cover_url = profile.cover_url;
            this.nsfw = profile.nsfw;
            this.content_visible = profile.content_visible;
            this.communities_visible = profile.communities_visible;
            this.allow_follow = profile.allow_follow;
            this.social_links = profile.social_links;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static Boolean access$1000(final Builder builder) {
            return builder.communities_visible;
        }
        
        public static Boolean access$1100(final Builder builder) {
            return builder.allow_follow;
        }
        
        public static Long access$1200(final Builder builder) {
            return builder.social_links;
        }
        
        public static String access$200(final Builder builder) {
            return builder.name;
        }
        
        public static String access$300(final Builder builder) {
            return builder.type;
        }
        
        public static String access$400(final Builder builder) {
            return builder.display_name;
        }
        
        public static String access$500(final Builder builder) {
            return builder.about;
        }
        
        public static String access$600(final Builder builder) {
            return builder.avatar_url;
        }
        
        public static String access$700(final Builder builder) {
            return builder.cover_url;
        }
        
        public static Boolean access$800(final Builder builder) {
            return builder.nsfw;
        }
        
        public static Boolean access$900(final Builder builder) {
            return builder.content_visible;
        }
        
        public Builder about(final String about) {
            this.about = about;
            return this;
        }
        
        public Builder allow_follow(final Boolean allow_follow) {
            this.allow_follow = allow_follow;
            return this;
        }
        
        public Builder avatar_url(final String avatar_url) {
            this.avatar_url = avatar_url;
            return this;
        }
        
        public Profile build() {
            return new Profile(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder communities_visible(final Boolean communities_visible) {
            this.communities_visible = communities_visible;
            return this;
        }
        
        public Builder content_visible(final Boolean content_visible) {
            this.content_visible = content_visible;
            return this;
        }
        
        public Builder cover_url(final String cover_url) {
            this.cover_url = cover_url;
            return this;
        }
        
        public Builder display_name(final String display_name) {
            this.display_name = display_name;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder nsfw(final Boolean nsfw) {
            this.nsfw = nsfw;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
            this.type = null;
            this.display_name = null;
            this.about = null;
            this.avatar_url = null;
            this.cover_url = null;
            this.nsfw = null;
            this.content_visible = null;
            this.communities_visible = null;
            this.allow_follow = null;
            this.social_links = null;
        }
        
        public Builder social_links(final Long social_links) {
            this.social_links = social_links;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ProfileAdapter implements a<Profile, Builder>
    {
        private ProfileAdapter() {
        }
        
        public ProfileAdapter(final Profile$1 object) {
            this();
        }
        
        public Profile read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Profile read(final e e, final Builder builder) throws IOException {
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
                    case 13: {
                        if (a == 10) {
                            builder.social_links(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 2) {
                            builder.allow_follow(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.communities_visible(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.content_visible(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.nsfw(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.cover_url(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.avatar_url(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.about(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.display_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
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
        
        public void write(final e e, final Profile profile) throws IOException {
            e.X();
            if (profile.id != null) {
                e.O(1, (byte)11);
                e.W(profile.id);
                e.P();
            }
            if (profile.name != null) {
                e.O(2, (byte)11);
                e.W(profile.name);
                e.P();
            }
            if (profile.type != null) {
                e.O(3, (byte)11);
                e.W(profile.type);
                e.P();
            }
            if (profile.display_name != null) {
                e.O(4, (byte)11);
                e.W(profile.display_name);
                e.P();
            }
            if (profile.about != null) {
                e.O(5, (byte)11);
                e.W(profile.about);
                e.P();
            }
            if (profile.avatar_url != null) {
                e.O(6, (byte)11);
                e.W(profile.avatar_url);
                e.P();
            }
            if (profile.cover_url != null) {
                e.O(7, (byte)11);
                e.W(profile.cover_url);
                e.P();
            }
            if (profile.nsfw != null) {
                e.O(8, (byte)2);
                android.support.v4.media.a.A(profile.nsfw, e);
            }
            if (profile.content_visible != null) {
                e.O(9, (byte)2);
                android.support.v4.media.a.A(profile.content_visible, e);
            }
            if (profile.communities_visible != null) {
                e.O(11, (byte)2);
                android.support.v4.media.a.A(profile.communities_visible, e);
            }
            if (profile.allow_follow != null) {
                e.O(12, (byte)2);
                android.support.v4.media.a.A(profile.allow_follow, e);
            }
            if (profile.social_links != null) {
                e.O(13, (byte)10);
                k.w(profile.social_links, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Profile)o);
        }
    }
}
