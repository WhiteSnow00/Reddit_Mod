// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class UserPreferences
{
    public static final a<UserPreferences, UserPreferences.UserPreferences$Builder> ADAPTER;
    public final String expando;
    public final Boolean hide_nsfw;
    public final Boolean hide_previously_seen_posts;
    public final Boolean in_beta;
    public final String language;
    public final String service_language;
    
    static {
        ADAPTER = (a)new UserPreferences.UserPreferences$UserPreferencesAdapter((UserPreferences$1)null);
    }
    
    private UserPreferences(final UserPreferences.UserPreferences$Builder userPreferences$Builder) {
        this.in_beta = UserPreferences.UserPreferences$Builder.access$100(userPreferences$Builder);
        this.language = UserPreferences.UserPreferences$Builder.access$200(userPreferences$Builder);
        this.hide_nsfw = UserPreferences.UserPreferences$Builder.access$300(userPreferences$Builder);
        this.expando = UserPreferences.UserPreferences$Builder.access$400(userPreferences$Builder);
        this.hide_previously_seen_posts = UserPreferences.UserPreferences$Builder.access$500(userPreferences$Builder);
        this.service_language = UserPreferences.UserPreferences$Builder.access$600(userPreferences$Builder);
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
        if (!(o instanceof UserPreferences)) {
            return false;
        }
        final UserPreferences userPreferences = (UserPreferences)o;
        final Boolean in_beta = this.in_beta;
        final Boolean in_beta2 = userPreferences.in_beta;
        if (in_beta == in_beta2 || (in_beta != null && in_beta.equals(in_beta2))) {
            final String language = this.language;
            final String language2 = userPreferences.language;
            if (language == language2 || (language != null && language.equals(language2))) {
                final Boolean hide_nsfw = this.hide_nsfw;
                final Boolean hide_nsfw2 = userPreferences.hide_nsfw;
                if (hide_nsfw == hide_nsfw2 || (hide_nsfw != null && hide_nsfw.equals(hide_nsfw2))) {
                    final String expando = this.expando;
                    final String expando2 = userPreferences.expando;
                    if (expando == expando2 || (expando != null && expando.equals(expando2))) {
                        final Boolean hide_previously_seen_posts = this.hide_previously_seen_posts;
                        final Boolean hide_previously_seen_posts2 = userPreferences.hide_previously_seen_posts;
                        if (hide_previously_seen_posts == hide_previously_seen_posts2 || (hide_previously_seen_posts != null && hide_previously_seen_posts.equals(hide_previously_seen_posts2))) {
                            final String service_language = this.service_language;
                            final String service_language2 = userPreferences.service_language;
                            boolean b2 = b;
                            if (service_language == service_language2) {
                                return b2;
                            }
                            if (service_language != null && service_language.equals(service_language2)) {
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
        final Boolean in_beta = this.in_beta;
        int hashCode = 0;
        int hashCode2;
        if (in_beta == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = in_beta.hashCode();
        }
        final String language = this.language;
        int hashCode3;
        if (language == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = language.hashCode();
        }
        final Boolean hide_nsfw = this.hide_nsfw;
        int hashCode4;
        if (hide_nsfw == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = hide_nsfw.hashCode();
        }
        final String expando = this.expando;
        int hashCode5;
        if (expando == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = expando.hashCode();
        }
        final Boolean hide_previously_seen_posts = this.hide_previously_seen_posts;
        int hashCode6;
        if (hide_previously_seen_posts == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = hide_previously_seen_posts.hashCode();
        }
        final String service_language = this.service_language;
        if (service_language != null) {
            hashCode = service_language.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("UserPreferences{in_beta=");
        r.append(this.in_beta);
        r.append(", language=");
        r.append(this.language);
        r.append(", hide_nsfw=");
        r.append(this.hide_nsfw);
        r.append(", expando=");
        r.append(this.expando);
        r.append(", hide_previously_seen_posts=");
        r.append(this.hide_previously_seen_posts);
        r.append(", service_language=");
        return a.o(r, this.service_language, "}");
    }
    
    public void write(final e e) throws IOException {
        UserPreferences.ADAPTER.write(e, (Object)this);
    }
}
