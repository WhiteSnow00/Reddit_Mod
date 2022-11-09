// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class UserPreferences
{
    public static final a<UserPreferences, Builder> ADAPTER;
    public final String expando;
    public final Boolean hide_nsfw;
    public final Boolean hide_previously_seen_posts;
    public final Boolean in_beta;
    public final String language;
    public final String service_language;
    
    static {
        ADAPTER = (a)new UserPreferencesAdapter(null);
    }
    
    private UserPreferences(final Builder builder) {
        this.in_beta = Builder.access$100(builder);
        this.language = Builder.access$200(builder);
        this.hide_nsfw = Builder.access$300(builder);
        this.expando = Builder.access$400(builder);
        this.hide_previously_seen_posts = Builder.access$500(builder);
        this.service_language = Builder.access$600(builder);
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
        final StringBuilder k = a.k("UserPreferences{in_beta=");
        k.append(this.in_beta);
        k.append(", language=");
        k.append(this.language);
        k.append(", hide_nsfw=");
        k.append(this.hide_nsfw);
        k.append(", expando=");
        k.append(this.expando);
        k.append(", hide_previously_seen_posts=");
        k.append(this.hide_previously_seen_posts);
        k.append(", service_language=");
        return b.j(k, this.service_language, "}");
    }
    
    public void write(final e e) throws IOException {
        UserPreferences.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<UserPreferences>
    {
        private String expando;
        private Boolean hide_nsfw;
        private Boolean hide_previously_seen_posts;
        private Boolean in_beta;
        private String language;
        private String service_language;
        
        public Builder() {
        }
        
        public Builder(final UserPreferences userPreferences) {
            this.in_beta = userPreferences.in_beta;
            this.language = userPreferences.language;
            this.hide_nsfw = userPreferences.hide_nsfw;
            this.expando = userPreferences.expando;
            this.hide_previously_seen_posts = userPreferences.hide_previously_seen_posts;
            this.service_language = userPreferences.service_language;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.in_beta;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.language;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.hide_nsfw;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.expando;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.hide_previously_seen_posts;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.service_language;
        }
        
        public UserPreferences build() {
            return new UserPreferences(this, null);
        }
        
        public Builder expando(final String expando) {
            this.expando = expando;
            return this;
        }
        
        public Builder hide_nsfw(final Boolean hide_nsfw) {
            this.hide_nsfw = hide_nsfw;
            return this;
        }
        
        public Builder hide_previously_seen_posts(final Boolean hide_previously_seen_posts) {
            this.hide_previously_seen_posts = hide_previously_seen_posts;
            return this;
        }
        
        public Builder in_beta(final Boolean in_beta) {
            this.in_beta = in_beta;
            return this;
        }
        
        public Builder language(final String language) {
            this.language = language;
            return this;
        }
        
        public void reset() {
            this.in_beta = null;
            this.language = null;
            this.hide_nsfw = null;
            this.expando = null;
            this.hide_previously_seen_posts = null;
            this.service_language = null;
        }
        
        public Builder service_language(final String service_language) {
            this.service_language = service_language;
            return this;
        }
    }
    
    public static final class UserPreferencesAdapter implements a<UserPreferences, Builder>
    {
        private UserPreferencesAdapter() {
        }
        
        public UserPreferences read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public UserPreferences read(final e e, final Builder builder) throws IOException {
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
                            builder.service_language(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.hide_previously_seen_posts(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.expando(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.hide_nsfw(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.language(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 2) {
                            builder.in_beta(e.b());
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
        
        public void write(final e e, final UserPreferences userPreferences) throws IOException {
            e.a0();
            if (userPreferences.in_beta != null) {
                e.N(1, (byte)2);
                d.z(userPreferences.in_beta, e);
            }
            if (userPreferences.language != null) {
                e.N(2, (byte)11);
                e.Z(userPreferences.language);
                e.O();
            }
            if (userPreferences.hide_nsfw != null) {
                e.N(3, (byte)2);
                d.z(userPreferences.hide_nsfw, e);
            }
            if (userPreferences.expando != null) {
                e.N(4, (byte)11);
                e.Z(userPreferences.expando);
                e.O();
            }
            if (userPreferences.hide_previously_seen_posts != null) {
                e.N(5, (byte)2);
                d.z(userPreferences.hide_previously_seen_posts, e);
            }
            if (userPreferences.service_language != null) {
                e.N(6, (byte)11);
                e.Z(userPreferences.service_language);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
