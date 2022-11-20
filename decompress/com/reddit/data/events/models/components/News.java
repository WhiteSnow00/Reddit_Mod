// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class News
{
    public static final a<News, Builder> ADAPTER;
    public final String subtopic_id;
    public final String subtopic_name;
    public final String topic_id;
    public final String topic_name;
    
    static {
        ADAPTER = (a)new NewsAdapter(null);
    }
    
    private News(final Builder builder) {
        this.topic_id = Builder.access$100(builder);
        this.topic_name = Builder.access$200(builder);
        this.subtopic_id = Builder.access$300(builder);
        this.subtopic_name = Builder.access$400(builder);
    }
    
    public News(final Builder builder, final News$1 object) {
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
        if (!(o instanceof News)) {
            return false;
        }
        final News news = (News)o;
        final String topic_id = this.topic_id;
        final String topic_id2 = news.topic_id;
        if (topic_id == topic_id2 || (topic_id != null && topic_id.equals(topic_id2))) {
            final String topic_name = this.topic_name;
            final String topic_name2 = news.topic_name;
            if (topic_name == topic_name2 || (topic_name != null && topic_name.equals(topic_name2))) {
                final String subtopic_id = this.subtopic_id;
                final String subtopic_id2 = news.subtopic_id;
                if (subtopic_id == subtopic_id2 || (subtopic_id != null && subtopic_id.equals(subtopic_id2))) {
                    final String subtopic_name = this.subtopic_name;
                    final String subtopic_name2 = news.subtopic_name;
                    boolean b2 = b;
                    if (subtopic_name == subtopic_name2) {
                        return b2;
                    }
                    if (subtopic_name != null && subtopic_name.equals(subtopic_name2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String topic_id = this.topic_id;
        int hashCode = 0;
        int hashCode2;
        if (topic_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = topic_id.hashCode();
        }
        final String topic_name = this.topic_name;
        int hashCode3;
        if (topic_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = topic_name.hashCode();
        }
        final String subtopic_id = this.subtopic_id;
        int hashCode4;
        if (subtopic_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subtopic_id.hashCode();
        }
        final String subtopic_name = this.subtopic_name;
        if (subtopic_name != null) {
            hashCode = subtopic_name.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("News{topic_id=");
        t.append(this.topic_id);
        t.append(", topic_name=");
        t.append(this.topic_name);
        t.append(", subtopic_id=");
        t.append(this.subtopic_id);
        t.append(", subtopic_name=");
        return ph0.a.f(t, this.subtopic_name, "}");
    }
    
    public void write(final e e) throws IOException {
        News.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<News>
    {
        private String subtopic_id;
        private String subtopic_name;
        private String topic_id;
        private String topic_name;
        
        public Builder() {
        }
        
        public Builder(final News news) {
            this.topic_id = news.topic_id;
            this.topic_name = news.topic_name;
            this.subtopic_id = news.subtopic_id;
            this.subtopic_name = news.subtopic_name;
        }
        
        public static String access$100(final Builder builder) {
            return builder.topic_id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.topic_name;
        }
        
        public static String access$300(final Builder builder) {
            return builder.subtopic_id;
        }
        
        public static String access$400(final Builder builder) {
            return builder.subtopic_name;
        }
        
        public News build() {
            return new News(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public void reset() {
            this.topic_id = null;
            this.topic_name = null;
            this.subtopic_id = null;
            this.subtopic_name = null;
        }
        
        public Builder subtopic_id(final String subtopic_id) {
            this.subtopic_id = subtopic_id;
            return this;
        }
        
        public Builder subtopic_name(final String subtopic_name) {
            this.subtopic_name = subtopic_name;
            return this;
        }
        
        public Builder topic_id(final String topic_id) {
            this.topic_id = topic_id;
            return this;
        }
        
        public Builder topic_name(final String topic_name) {
            this.topic_name = topic_name;
            return this;
        }
    }
    
    public static final class NewsAdapter implements a<News, Builder>
    {
        private NewsAdapter() {
        }
        
        public NewsAdapter(final News$1 object) {
            this();
        }
        
        public News read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public News read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                ht.a.a(e, a);
                            }
                            else if (a == 11) {
                                builder.subtopic_name(e.F());
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.subtopic_id(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.topic_name(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.topic_id(e.F());
                }
                else {
                    ht.a.a(e, a);
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
        
        public void write(final e e, final News news) throws IOException {
            e.X();
            if (news.topic_id != null) {
                e.O(1, (byte)11);
                e.W(news.topic_id);
                e.P();
            }
            if (news.topic_name != null) {
                e.O(2, (byte)11);
                e.W(news.topic_name);
                e.P();
            }
            if (news.subtopic_id != null) {
                e.O(3, (byte)11);
                e.W(news.subtopic_id);
                e.P();
            }
            if (news.subtopic_name != null) {
                e.O(4, (byte)11);
                e.W(news.subtopic_name);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (News)o);
        }
    }
}
