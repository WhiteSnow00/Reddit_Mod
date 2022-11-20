// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class NavigationSession
{
    public static final a<NavigationSession, Builder> ADAPTER;
    public final String id;
    public final String referring_page_type;
    public final String source;
    
    static {
        ADAPTER = (a)new NavigationSessionAdapter(null);
    }
    
    private NavigationSession(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.referring_page_type = Builder.access$200(builder);
        this.source = Builder.access$300(builder);
    }
    
    public NavigationSession(final Builder builder, final NavigationSession$1 object) {
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
        if (!(o instanceof NavigationSession)) {
            return false;
        }
        final NavigationSession navigationSession = (NavigationSession)o;
        final String id = this.id;
        final String id2 = navigationSession.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String referring_page_type = this.referring_page_type;
            final String referring_page_type2 = navigationSession.referring_page_type;
            if (referring_page_type == referring_page_type2 || (referring_page_type != null && referring_page_type.equals(referring_page_type2))) {
                final String source = this.source;
                final String source2 = navigationSession.source;
                boolean b2 = b;
                if (source == source2) {
                    return b2;
                }
                if (source != null && source.equals(source2)) {
                    b2 = b;
                    return b2;
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
        final String referring_page_type = this.referring_page_type;
        int hashCode3;
        if (referring_page_type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = referring_page_type.hashCode();
        }
        final String source = this.source;
        if (source != null) {
            hashCode = source.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("NavigationSession{id=");
        t.append(this.id);
        t.append(", referring_page_type=");
        t.append(this.referring_page_type);
        t.append(", source=");
        return ph0.a.f(t, this.source, "}");
    }
    
    public void write(final e e) throws IOException {
        NavigationSession.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<NavigationSession>
    {
        private String id;
        private String referring_page_type;
        private String source;
        
        public Builder() {
        }
        
        public Builder(final NavigationSession navigationSession) {
            this.id = navigationSession.id;
            this.referring_page_type = navigationSession.referring_page_type;
            this.source = navigationSession.source;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.referring_page_type;
        }
        
        public static String access$300(final Builder builder) {
            return builder.source;
        }
        
        public NavigationSession build() {
            return new NavigationSession(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder referring_page_type(final String referring_page_type) {
            this.referring_page_type = referring_page_type;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.referring_page_type = null;
            this.source = null;
        }
        
        public Builder source(final String source) {
            this.source = source;
            return this;
        }
    }
    
    public static final class NavigationSessionAdapter implements a<NavigationSession, Builder>
    {
        private NavigationSessionAdapter() {
        }
        
        public NavigationSessionAdapter(final NavigationSession$1 object) {
            this();
        }
        
        public NavigationSession read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public NavigationSession read(final e e, final Builder builder) throws IOException {
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
                            ht.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.source(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.referring_page_type(e.F());
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
        
        public void write(final e e, final NavigationSession navigationSession) throws IOException {
            e.X();
            if (navigationSession.id != null) {
                e.O(1, (byte)11);
                e.W(navigationSession.id);
                e.P();
            }
            if (navigationSession.referring_page_type != null) {
                e.O(2, (byte)11);
                e.W(navigationSession.referring_page_type);
                e.P();
            }
            if (navigationSession.source != null) {
                e.O(3, (byte)11);
                e.W(navigationSession.source);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (NavigationSession)o);
        }
    }
}
