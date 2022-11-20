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

public final class ReactSource
{
    public static final a<ReactSource, Builder> ADAPTER;
    public final Long media_duration;
    public final String media_id;
    public final Long post_created_timestamp;
    public final String subreddit_id;
    public final Long used_media_duration;
    public final String user_id;
    public final String username;
    
    static {
        ADAPTER = (a)new ReactSourceAdapter(null);
    }
    
    private ReactSource(final Builder builder) {
        this.user_id = Builder.access$100(builder);
        this.username = Builder.access$200(builder);
        this.used_media_duration = Builder.access$300(builder);
        this.media_duration = Builder.access$400(builder);
        this.media_id = Builder.access$500(builder);
        this.post_created_timestamp = Builder.access$600(builder);
        this.subreddit_id = Builder.access$700(builder);
    }
    
    public ReactSource(final Builder builder, final ReactSource$1 object) {
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
        if (!(o instanceof ReactSource)) {
            return false;
        }
        final ReactSource reactSource = (ReactSource)o;
        final String user_id = this.user_id;
        final String user_id2 = reactSource.user_id;
        if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
            final String username = this.username;
            final String username2 = reactSource.username;
            if (username == username2 || (username != null && username.equals(username2))) {
                final Long used_media_duration = this.used_media_duration;
                final Long used_media_duration2 = reactSource.used_media_duration;
                if (used_media_duration == used_media_duration2 || (used_media_duration != null && used_media_duration.equals(used_media_duration2))) {
                    final Long media_duration = this.media_duration;
                    final Long media_duration2 = reactSource.media_duration;
                    if (media_duration == media_duration2 || (media_duration != null && media_duration.equals(media_duration2))) {
                        final String media_id = this.media_id;
                        final String media_id2 = reactSource.media_id;
                        if (media_id == media_id2 || (media_id != null && media_id.equals(media_id2))) {
                            final Long post_created_timestamp = this.post_created_timestamp;
                            final Long post_created_timestamp2 = reactSource.post_created_timestamp;
                            if (post_created_timestamp == post_created_timestamp2 || (post_created_timestamp != null && post_created_timestamp.equals(post_created_timestamp2))) {
                                final String subreddit_id = this.subreddit_id;
                                final String subreddit_id2 = reactSource.subreddit_id;
                                boolean b2 = b;
                                if (subreddit_id == subreddit_id2) {
                                    return b2;
                                }
                                if (subreddit_id != null && subreddit_id.equals(subreddit_id2)) {
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
        final String user_id = this.user_id;
        int hashCode = 0;
        int hashCode2;
        if (user_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = user_id.hashCode();
        }
        final String username = this.username;
        int hashCode3;
        if (username == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = username.hashCode();
        }
        final Long used_media_duration = this.used_media_duration;
        int hashCode4;
        if (used_media_duration == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = used_media_duration.hashCode();
        }
        final Long media_duration = this.media_duration;
        int hashCode5;
        if (media_duration == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = media_duration.hashCode();
        }
        final String media_id = this.media_id;
        int hashCode6;
        if (media_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = media_id.hashCode();
        }
        final Long post_created_timestamp = this.post_created_timestamp;
        int hashCode7;
        if (post_created_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = post_created_timestamp.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        if (subreddit_id != null) {
            hashCode = subreddit_id.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReactSource{user_id=");
        t.append(this.user_id);
        t.append(", username=");
        t.append(this.username);
        t.append(", used_media_duration=");
        t.append(this.used_media_duration);
        t.append(", media_duration=");
        t.append(this.media_duration);
        t.append(", media_id=");
        t.append(this.media_id);
        t.append(", post_created_timestamp=");
        t.append(this.post_created_timestamp);
        t.append(", subreddit_id=");
        return ph0.a.f(t, this.subreddit_id, "}");
    }
    
    public void write(final e e) throws IOException {
        ReactSource.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ReactSource>
    {
        private Long media_duration;
        private String media_id;
        private Long post_created_timestamp;
        private String subreddit_id;
        private Long used_media_duration;
        private String user_id;
        private String username;
        
        public Builder() {
        }
        
        public Builder(final ReactSource reactSource) {
            this.user_id = reactSource.user_id;
            this.username = reactSource.username;
            this.used_media_duration = reactSource.used_media_duration;
            this.media_duration = reactSource.media_duration;
            this.media_id = reactSource.media_id;
            this.post_created_timestamp = reactSource.post_created_timestamp;
            this.subreddit_id = reactSource.subreddit_id;
        }
        
        public static String access$100(final Builder builder) {
            return builder.user_id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.username;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.used_media_duration;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.media_duration;
        }
        
        public static String access$500(final Builder builder) {
            return builder.media_id;
        }
        
        public static Long access$600(final Builder builder) {
            return builder.post_created_timestamp;
        }
        
        public static String access$700(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public ReactSource build() {
            return new ReactSource(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder media_duration(final Long media_duration) {
            this.media_duration = media_duration;
            return this;
        }
        
        public Builder media_id(final String media_id) {
            this.media_id = media_id;
            return this;
        }
        
        public Builder post_created_timestamp(final Long post_created_timestamp) {
            this.post_created_timestamp = post_created_timestamp;
            return this;
        }
        
        public void reset() {
            this.user_id = null;
            this.username = null;
            this.used_media_duration = null;
            this.media_duration = null;
            this.media_id = null;
            this.post_created_timestamp = null;
            this.subreddit_id = null;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder used_media_duration(final Long used_media_duration) {
            this.used_media_duration = used_media_duration;
            return this;
        }
        
        public Builder user_id(final String user_id) {
            this.user_id = user_id;
            return this;
        }
        
        public Builder username(final String username) {
            this.username = username;
            return this;
        }
    }
    
    public static final class ReactSourceAdapter implements a<ReactSource, Builder>
    {
        private ReactSourceAdapter() {
        }
        
        public ReactSourceAdapter(final ReactSource$1 object) {
            this();
        }
        
        public ReactSource read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ReactSource read(final e e, final Builder builder) throws IOException {
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
                    case 7: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.post_created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.media_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.media_duration(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.used_media_duration(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.username(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.user_id(e.F());
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
        
        public void write(final e e, final ReactSource reactSource) throws IOException {
            e.X();
            if (reactSource.user_id != null) {
                e.O(1, (byte)11);
                e.W(reactSource.user_id);
                e.P();
            }
            if (reactSource.username != null) {
                e.O(2, (byte)11);
                e.W(reactSource.username);
                e.P();
            }
            if (reactSource.used_media_duration != null) {
                e.O(3, (byte)10);
                k.w(reactSource.used_media_duration, e);
            }
            if (reactSource.media_duration != null) {
                e.O(4, (byte)10);
                k.w(reactSource.media_duration, e);
            }
            if (reactSource.media_id != null) {
                e.O(5, (byte)11);
                e.W(reactSource.media_id);
                e.P();
            }
            if (reactSource.post_created_timestamp != null) {
                e.O(6, (byte)10);
                k.w(reactSource.post_created_timestamp, e);
            }
            if (reactSource.subreddit_id != null) {
                e.O(7, (byte)11);
                e.W(reactSource.subreddit_id);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ReactSource)o);
        }
    }
}
