// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class UserSubreddit
{
    public static final a<UserSubreddit, UserSubreddit.UserSubreddit$Builder> ADAPTER;
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
        ADAPTER = (a)new UserSubreddit.UserSubreddit$UserSubredditAdapter((UserSubreddit$1)null);
    }
    
    private UserSubreddit(final UserSubreddit.UserSubreddit$Builder userSubreddit$Builder) {
        this.is_mod = UserSubreddit.UserSubreddit$Builder.access$100(userSubreddit$Builder);
        this.mod_full = UserSubreddit.UserSubreddit$Builder.access$200(userSubreddit$Builder);
        this.mod_access = UserSubreddit.UserSubreddit$Builder.access$300(userSubreddit$Builder);
        this.mod_config = UserSubreddit.UserSubreddit$Builder.access$400(userSubreddit$Builder);
        this.mod_flair = UserSubreddit.UserSubreddit$Builder.access$500(userSubreddit$Builder);
        this.mod_mail = UserSubreddit.UserSubreddit$Builder.access$600(userSubreddit$Builder);
        this.mod_post = UserSubreddit.UserSubreddit$Builder.access$700(userSubreddit$Builder);
        this.mod_wiki = UserSubreddit.UserSubreddit$Builder.access$800(userSubreddit$Builder);
        this.mod_none = UserSubreddit.UserSubreddit$Builder.access$900(userSubreddit$Builder);
        this.is_favorite = UserSubreddit.UserSubreddit$Builder.access$1000(userSubreddit$Builder);
        this.is_subscriber = UserSubreddit.UserSubreddit$Builder.access$1100(userSubreddit$Builder);
        this.post_karma = UserSubreddit.UserSubreddit$Builder.access$1200(userSubreddit$Builder);
        this.comment_karma = UserSubreddit.UserSubreddit$Builder.access$1300(userSubreddit$Builder);
        this.is_steward = UserSubreddit.UserSubreddit$Builder.access$1400(userSubreddit$Builder);
        this.recently_visited = UserSubreddit.UserSubreddit$Builder.access$1500(userSubreddit$Builder);
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
        final StringBuilder r = a.r("UserSubreddit{is_mod=");
        r.append(this.is_mod);
        r.append(", mod_full=");
        r.append(this.mod_full);
        r.append(", mod_access=");
        r.append(this.mod_access);
        r.append(", mod_config=");
        r.append(this.mod_config);
        r.append(", mod_flair=");
        r.append(this.mod_flair);
        r.append(", mod_mail=");
        r.append(this.mod_mail);
        r.append(", mod_post=");
        r.append(this.mod_post);
        r.append(", mod_wiki=");
        r.append(this.mod_wiki);
        r.append(", mod_none=");
        r.append(this.mod_none);
        r.append(", is_favorite=");
        r.append(this.is_favorite);
        r.append(", is_subscriber=");
        r.append(this.is_subscriber);
        r.append(", post_karma=");
        r.append(this.post_karma);
        r.append(", comment_karma=");
        r.append(this.comment_karma);
        r.append(", is_steward=");
        r.append(this.is_steward);
        r.append(", recently_visited=");
        r.append(this.recently_visited);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        UserSubreddit.ADAPTER.write(e, (Object)this);
    }
}
