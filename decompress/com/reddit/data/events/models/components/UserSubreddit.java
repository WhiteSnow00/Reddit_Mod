// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class UserSubreddit
{
    public static final a<UserSubreddit, Builder> ADAPTER;
    public final Long comment_karma;
    public final Boolean is_favorite;
    public final Boolean is_mod;
    public final Boolean is_steward;
    public final Boolean is_subscriber;
    public final Boolean mod_access;
    public final Boolean mod_config;
    public final Boolean mod_flair;
    public final Boolean mod_full;
    public final Boolean mod_mail;
    public final Boolean mod_none;
    public final Boolean mod_post;
    public final Boolean mod_wiki;
    public final Long post_karma;
    public final Boolean recently_visited;
    
    static {
        ADAPTER = (a)new UserSubredditAdapter(null);
    }
    
    private UserSubreddit(final Builder builder) {
        this.is_mod = Builder.access$100(builder);
        this.mod_full = Builder.access$200(builder);
        this.mod_access = Builder.access$300(builder);
        this.mod_config = Builder.access$400(builder);
        this.mod_flair = Builder.access$500(builder);
        this.mod_mail = Builder.access$600(builder);
        this.mod_post = Builder.access$700(builder);
        this.mod_wiki = Builder.access$800(builder);
        this.mod_none = Builder.access$900(builder);
        this.is_favorite = Builder.access$1000(builder);
        this.is_subscriber = Builder.access$1100(builder);
        this.post_karma = Builder.access$1200(builder);
        this.comment_karma = Builder.access$1300(builder);
        this.is_steward = Builder.access$1400(builder);
        this.recently_visited = Builder.access$1500(builder);
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
        if (!(o instanceof UserSubreddit)) {
            return false;
        }
        final UserSubreddit userSubreddit = (UserSubreddit)o;
        final Boolean is_mod = this.is_mod;
        final Boolean is_mod2 = userSubreddit.is_mod;
        if (is_mod == is_mod2 || (is_mod != null && is_mod.equals(is_mod2))) {
            final Boolean mod_full = this.mod_full;
            final Boolean mod_full2 = userSubreddit.mod_full;
            if (mod_full == mod_full2 || (mod_full != null && mod_full.equals(mod_full2))) {
                final Boolean mod_access = this.mod_access;
                final Boolean mod_access2 = userSubreddit.mod_access;
                if (mod_access == mod_access2 || (mod_access != null && mod_access.equals(mod_access2))) {
                    final Boolean mod_config = this.mod_config;
                    final Boolean mod_config2 = userSubreddit.mod_config;
                    if (mod_config == mod_config2 || (mod_config != null && mod_config.equals(mod_config2))) {
                        final Boolean mod_flair = this.mod_flair;
                        final Boolean mod_flair2 = userSubreddit.mod_flair;
                        if (mod_flair == mod_flair2 || (mod_flair != null && mod_flair.equals(mod_flair2))) {
                            final Boolean mod_mail = this.mod_mail;
                            final Boolean mod_mail2 = userSubreddit.mod_mail;
                            if (mod_mail == mod_mail2 || (mod_mail != null && mod_mail.equals(mod_mail2))) {
                                final Boolean mod_post = this.mod_post;
                                final Boolean mod_post2 = userSubreddit.mod_post;
                                if (mod_post == mod_post2 || (mod_post != null && mod_post.equals(mod_post2))) {
                                    final Boolean mod_wiki = this.mod_wiki;
                                    final Boolean mod_wiki2 = userSubreddit.mod_wiki;
                                    if (mod_wiki == mod_wiki2 || (mod_wiki != null && mod_wiki.equals(mod_wiki2))) {
                                        final Boolean mod_none = this.mod_none;
                                        final Boolean mod_none2 = userSubreddit.mod_none;
                                        if (mod_none == mod_none2 || (mod_none != null && mod_none.equals(mod_none2))) {
                                            final Boolean is_favorite = this.is_favorite;
                                            final Boolean is_favorite2 = userSubreddit.is_favorite;
                                            if (is_favorite == is_favorite2 || (is_favorite != null && is_favorite.equals(is_favorite2))) {
                                                final Boolean is_subscriber = this.is_subscriber;
                                                final Boolean is_subscriber2 = userSubreddit.is_subscriber;
                                                if (is_subscriber == is_subscriber2 || (is_subscriber != null && is_subscriber.equals(is_subscriber2))) {
                                                    final Long post_karma = this.post_karma;
                                                    final Long post_karma2 = userSubreddit.post_karma;
                                                    if (post_karma == post_karma2 || (post_karma != null && post_karma.equals(post_karma2))) {
                                                        final Long comment_karma = this.comment_karma;
                                                        final Long comment_karma2 = userSubreddit.comment_karma;
                                                        if (comment_karma == comment_karma2 || (comment_karma != null && comment_karma.equals(comment_karma2))) {
                                                            final Boolean is_steward = this.is_steward;
                                                            final Boolean is_steward2 = userSubreddit.is_steward;
                                                            if (is_steward == is_steward2 || (is_steward != null && is_steward.equals(is_steward2))) {
                                                                final Boolean recently_visited = this.recently_visited;
                                                                final Boolean recently_visited2 = userSubreddit.recently_visited;
                                                                boolean b2 = b;
                                                                if (recently_visited == recently_visited2) {
                                                                    return b2;
                                                                }
                                                                if (recently_visited != null && recently_visited.equals(recently_visited2)) {
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
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean is_mod = this.is_mod;
        int hashCode = 0;
        int hashCode2;
        if (is_mod == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = is_mod.hashCode();
        }
        final Boolean mod_full = this.mod_full;
        int hashCode3;
        if (mod_full == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = mod_full.hashCode();
        }
        final Boolean mod_access = this.mod_access;
        int hashCode4;
        if (mod_access == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mod_access.hashCode();
        }
        final Boolean mod_config = this.mod_config;
        int hashCode5;
        if (mod_config == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = mod_config.hashCode();
        }
        final Boolean mod_flair = this.mod_flair;
        int hashCode6;
        if (mod_flair == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = mod_flair.hashCode();
        }
        final Boolean mod_mail = this.mod_mail;
        int hashCode7;
        if (mod_mail == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = mod_mail.hashCode();
        }
        final Boolean mod_post = this.mod_post;
        int hashCode8;
        if (mod_post == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = mod_post.hashCode();
        }
        final Boolean mod_wiki = this.mod_wiki;
        int hashCode9;
        if (mod_wiki == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = mod_wiki.hashCode();
        }
        final Boolean mod_none = this.mod_none;
        int hashCode10;
        if (mod_none == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = mod_none.hashCode();
        }
        final Boolean is_favorite = this.is_favorite;
        int hashCode11;
        if (is_favorite == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = is_favorite.hashCode();
        }
        final Boolean is_subscriber = this.is_subscriber;
        int hashCode12;
        if (is_subscriber == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = is_subscriber.hashCode();
        }
        final Long post_karma = this.post_karma;
        int hashCode13;
        if (post_karma == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = post_karma.hashCode();
        }
        final Long comment_karma = this.comment_karma;
        int hashCode14;
        if (comment_karma == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = comment_karma.hashCode();
        }
        final Boolean is_steward = this.is_steward;
        int hashCode15;
        if (is_steward == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = is_steward.hashCode();
        }
        final Boolean recently_visited = this.recently_visited;
        if (recently_visited != null) {
            hashCode = recently_visited.hashCode();
        }
        return (((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserSubreddit{is_mod=");
        k.append(this.is_mod);
        k.append(", mod_full=");
        k.append(this.mod_full);
        k.append(", mod_access=");
        k.append(this.mod_access);
        k.append(", mod_config=");
        k.append(this.mod_config);
        k.append(", mod_flair=");
        k.append(this.mod_flair);
        k.append(", mod_mail=");
        k.append(this.mod_mail);
        k.append(", mod_post=");
        k.append(this.mod_post);
        k.append(", mod_wiki=");
        k.append(this.mod_wiki);
        k.append(", mod_none=");
        k.append(this.mod_none);
        k.append(", is_favorite=");
        k.append(this.is_favorite);
        k.append(", is_subscriber=");
        k.append(this.is_subscriber);
        k.append(", post_karma=");
        k.append(this.post_karma);
        k.append(", comment_karma=");
        k.append(this.comment_karma);
        k.append(", is_steward=");
        k.append(this.is_steward);
        k.append(", recently_visited=");
        k.append(this.recently_visited);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        UserSubreddit.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<UserSubreddit>
    {
        private Long comment_karma;
        private Boolean is_favorite;
        private Boolean is_mod;
        private Boolean is_steward;
        private Boolean is_subscriber;
        private Boolean mod_access;
        private Boolean mod_config;
        private Boolean mod_flair;
        private Boolean mod_full;
        private Boolean mod_mail;
        private Boolean mod_none;
        private Boolean mod_post;
        private Boolean mod_wiki;
        private Long post_karma;
        private Boolean recently_visited;
        
        public Builder() {
        }
        
        public Builder(final UserSubreddit userSubreddit) {
            this.is_mod = userSubreddit.is_mod;
            this.mod_full = userSubreddit.mod_full;
            this.mod_access = userSubreddit.mod_access;
            this.mod_config = userSubreddit.mod_config;
            this.mod_flair = userSubreddit.mod_flair;
            this.mod_mail = userSubreddit.mod_mail;
            this.mod_post = userSubreddit.mod_post;
            this.mod_wiki = userSubreddit.mod_wiki;
            this.mod_none = userSubreddit.mod_none;
            this.is_favorite = userSubreddit.is_favorite;
            this.is_subscriber = userSubreddit.is_subscriber;
            this.post_karma = userSubreddit.post_karma;
            this.comment_karma = userSubreddit.comment_karma;
            this.is_steward = userSubreddit.is_steward;
            this.recently_visited = userSubreddit.recently_visited;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.is_mod;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.is_favorite;
        }
        
        public static /* synthetic */ Boolean access$1100(final Builder builder) {
            return builder.is_subscriber;
        }
        
        public static /* synthetic */ Long access$1200(final Builder builder) {
            return builder.post_karma;
        }
        
        public static /* synthetic */ Long access$1300(final Builder builder) {
            return builder.comment_karma;
        }
        
        public static /* synthetic */ Boolean access$1400(final Builder builder) {
            return builder.is_steward;
        }
        
        public static /* synthetic */ Boolean access$1500(final Builder builder) {
            return builder.recently_visited;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.mod_full;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.mod_access;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.mod_config;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.mod_flair;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.mod_mail;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.mod_post;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.mod_wiki;
        }
        
        public static /* synthetic */ Boolean access$900(final Builder builder) {
            return builder.mod_none;
        }
        
        public UserSubreddit build() {
            return new UserSubreddit(this, null);
        }
        
        public Builder comment_karma(final Long comment_karma) {
            this.comment_karma = comment_karma;
            return this;
        }
        
        public Builder is_favorite(final Boolean is_favorite) {
            this.is_favorite = is_favorite;
            return this;
        }
        
        public Builder is_mod(final Boolean is_mod) {
            this.is_mod = is_mod;
            return this;
        }
        
        public Builder is_steward(final Boolean is_steward) {
            this.is_steward = is_steward;
            return this;
        }
        
        public Builder is_subscriber(final Boolean is_subscriber) {
            this.is_subscriber = is_subscriber;
            return this;
        }
        
        public Builder mod_access(final Boolean mod_access) {
            this.mod_access = mod_access;
            return this;
        }
        
        public Builder mod_config(final Boolean mod_config) {
            this.mod_config = mod_config;
            return this;
        }
        
        public Builder mod_flair(final Boolean mod_flair) {
            this.mod_flair = mod_flair;
            return this;
        }
        
        public Builder mod_full(final Boolean mod_full) {
            this.mod_full = mod_full;
            return this;
        }
        
        public Builder mod_mail(final Boolean mod_mail) {
            this.mod_mail = mod_mail;
            return this;
        }
        
        public Builder mod_none(final Boolean mod_none) {
            this.mod_none = mod_none;
            return this;
        }
        
        public Builder mod_post(final Boolean mod_post) {
            this.mod_post = mod_post;
            return this;
        }
        
        public Builder mod_wiki(final Boolean mod_wiki) {
            this.mod_wiki = mod_wiki;
            return this;
        }
        
        public Builder post_karma(final Long post_karma) {
            this.post_karma = post_karma;
            return this;
        }
        
        public Builder recently_visited(final Boolean recently_visited) {
            this.recently_visited = recently_visited;
            return this;
        }
        
        public void reset() {
            this.is_mod = null;
            this.mod_full = null;
            this.mod_access = null;
            this.mod_config = null;
            this.mod_flair = null;
            this.mod_mail = null;
            this.mod_post = null;
            this.mod_wiki = null;
            this.mod_none = null;
            this.is_favorite = null;
            this.is_subscriber = null;
            this.post_karma = null;
            this.comment_karma = null;
            this.is_steward = null;
            this.recently_visited = null;
        }
    }
    
    public static final class UserSubredditAdapter implements a<UserSubreddit, Builder>
    {
        private UserSubredditAdapter() {
        }
        
        public UserSubreddit read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public UserSubreddit read(final e e, final Builder builder) throws IOException {
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
                    case 15: {
                        if (a == 2) {
                            builder.recently_visited(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 2) {
                            builder.is_steward(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 10) {
                            builder.comment_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 10) {
                            builder.post_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.is_subscriber(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.is_favorite(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.mod_none(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.mod_wiki(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.mod_post(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.mod_mail(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.mod_flair(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.mod_config(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.mod_access(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 2) {
                            builder.mod_full(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 2) {
                            builder.is_mod(e.b());
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
        
        public void write(final e e, final UserSubreddit userSubreddit) throws IOException {
            e.a0();
            if (userSubreddit.is_mod != null) {
                e.N(1, (byte)2);
                d.z(userSubreddit.is_mod, e);
            }
            if (userSubreddit.mod_full != null) {
                e.N(2, (byte)2);
                d.z(userSubreddit.mod_full, e);
            }
            if (userSubreddit.mod_access != null) {
                e.N(3, (byte)2);
                d.z(userSubreddit.mod_access, e);
            }
            if (userSubreddit.mod_config != null) {
                e.N(4, (byte)2);
                d.z(userSubreddit.mod_config, e);
            }
            if (userSubreddit.mod_flair != null) {
                e.N(5, (byte)2);
                d.z(userSubreddit.mod_flair, e);
            }
            if (userSubreddit.mod_mail != null) {
                e.N(6, (byte)2);
                d.z(userSubreddit.mod_mail, e);
            }
            if (userSubreddit.mod_post != null) {
                e.N(7, (byte)2);
                d.z(userSubreddit.mod_post, e);
            }
            if (userSubreddit.mod_wiki != null) {
                e.N(8, (byte)2);
                d.z(userSubreddit.mod_wiki, e);
            }
            if (userSubreddit.mod_none != null) {
                e.N(9, (byte)2);
                d.z(userSubreddit.mod_none, e);
            }
            if (userSubreddit.is_favorite != null) {
                e.N(10, (byte)2);
                d.z(userSubreddit.is_favorite, e);
            }
            if (userSubreddit.is_subscriber != null) {
                e.N(11, (byte)2);
                d.z(userSubreddit.is_subscriber, e);
            }
            if (userSubreddit.post_karma != null) {
                e.N(12, (byte)10);
                a.r(userSubreddit.post_karma, e);
            }
            if (userSubreddit.comment_karma != null) {
                e.N(13, (byte)10);
                a.r(userSubreddit.comment_karma, e);
            }
            if (userSubreddit.is_steward != null) {
                e.N(14, (byte)2);
                d.z(userSubreddit.is_steward, e);
            }
            if (userSubreddit.recently_visited != null) {
                e.N(15, (byte)2);
                d.z(userSubreddit.recently_visited, e);
            }
            e.P();
            e.b0();
        }
    }
}
