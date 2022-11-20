// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class PostFlair
{
    public static final a<PostFlair, Builder> ADAPTER;
    public final String id;
    public final String title;
    
    static {
        ADAPTER = (a)new PostFlairAdapter(null);
    }
    
    private PostFlair(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
    }
    
    public PostFlair(final Builder builder, final PostFlair$1 object) {
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
        if (!(o instanceof PostFlair)) {
            return false;
        }
        final PostFlair postFlair = (PostFlair)o;
        final String id = this.id;
        final String id2 = postFlair.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = postFlair.title;
            boolean b2 = b;
            if (title == title2) {
                return b2;
            }
            if (title != null && title.equals(title2)) {
                b2 = b;
                return b2;
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
        final String title = this.title;
        if (title != null) {
            hashCode = title.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostFlair{id=");
        t.append(this.id);
        t.append(", title=");
        return ph0.a.f(t, this.title, "}");
    }
    
    public void write(final e e) throws IOException {
        PostFlair.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostFlair>
    {
        private String id;
        private String title;
        
        public Builder() {
        }
        
        public Builder(final PostFlair postFlair) {
            this.id = postFlair.id;
            this.title = postFlair.title;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.title;
        }
        
        public PostFlair build() {
            return new PostFlair(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.title = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
    }
    
    public static final class PostFlairAdapter implements a<PostFlair, Builder>
    {
        private PostFlairAdapter() {
        }
        
        public PostFlairAdapter(final PostFlair$1 object) {
            this();
        }
        
        public PostFlair read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostFlair read(final e e, final Builder builder) throws IOException {
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
                        ht.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.title(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
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
        
        public void write(final e e, final PostFlair postFlair) throws IOException {
            e.X();
            if (postFlair.id != null) {
                e.O(1, (byte)11);
                e.W(postFlair.id);
                e.P();
            }
            if (postFlair.title != null) {
                e.O(2, (byte)11);
                e.W(postFlair.title);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostFlair)o);
        }
    }
}
