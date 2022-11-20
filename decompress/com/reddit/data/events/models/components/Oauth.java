// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Oauth
{
    public static final a<Oauth, Builder> ADAPTER;
    public final String client_app_type;
    public final String client_id;
    public final String client_name;
    public final List<String> scopes;
    
    static {
        ADAPTER = (a)new OauthAdapter(null);
    }
    
    private Oauth(final Builder builder) {
        this.client_app_type = Builder.access$100(builder);
        this.client_name = Builder.access$200(builder);
        this.client_id = Builder.access$300(builder);
        List<String> unmodifiableList;
        if (Builder.access$400(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$400(builder));
        }
        this.scopes = unmodifiableList;
    }
    
    public Oauth(final Builder builder, final Oauth$1 object) {
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
        if (!(o instanceof Oauth)) {
            return false;
        }
        final Oauth oauth = (Oauth)o;
        final String client_app_type = this.client_app_type;
        final String client_app_type2 = oauth.client_app_type;
        if (client_app_type == client_app_type2 || (client_app_type != null && client_app_type.equals(client_app_type2))) {
            final String client_name = this.client_name;
            final String client_name2 = oauth.client_name;
            if (client_name == client_name2 || (client_name != null && client_name.equals(client_name2))) {
                final String client_id = this.client_id;
                final String client_id2 = oauth.client_id;
                if (client_id == client_id2 || (client_id != null && client_id.equals(client_id2))) {
                    final List<String> scopes = this.scopes;
                    final List<String> scopes2 = oauth.scopes;
                    boolean b2 = b;
                    if (scopes == scopes2) {
                        return b2;
                    }
                    if (scopes != null && scopes.equals(scopes2)) {
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
        final String client_app_type = this.client_app_type;
        int hashCode = 0;
        int hashCode2;
        if (client_app_type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = client_app_type.hashCode();
        }
        final String client_name = this.client_name;
        int hashCode3;
        if (client_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = client_name.hashCode();
        }
        final String client_id = this.client_id;
        int hashCode4;
        if (client_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = client_id.hashCode();
        }
        final List<String> scopes = this.scopes;
        if (scopes != null) {
            hashCode = scopes.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Oauth{client_app_type=");
        t.append(this.client_app_type);
        t.append(", client_name=");
        t.append(this.client_name);
        t.append(", client_id=");
        t.append(this.client_id);
        t.append(", scopes=");
        return a.s(t, (List)this.scopes, "}");
    }
    
    public void write(final e e) throws IOException {
        Oauth.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Oauth>
    {
        private String client_app_type;
        private String client_id;
        private String client_name;
        private List<String> scopes;
        
        public Builder() {
        }
        
        public Builder(final Oauth oauth) {
            this.client_app_type = oauth.client_app_type;
            this.client_name = oauth.client_name;
            this.client_id = oauth.client_id;
            this.scopes = oauth.scopes;
        }
        
        public static String access$100(final Builder builder) {
            return builder.client_app_type;
        }
        
        public static String access$200(final Builder builder) {
            return builder.client_name;
        }
        
        public static String access$300(final Builder builder) {
            return builder.client_id;
        }
        
        public static List access$400(final Builder builder) {
            return builder.scopes;
        }
        
        public Oauth build() {
            return new Oauth(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder client_app_type(final String client_app_type) {
            this.client_app_type = client_app_type;
            return this;
        }
        
        public Builder client_id(final String client_id) {
            this.client_id = client_id;
            return this;
        }
        
        public Builder client_name(final String client_name) {
            this.client_name = client_name;
            return this;
        }
        
        public void reset() {
            this.client_app_type = null;
            this.client_name = null;
            this.client_id = null;
            this.scopes = null;
        }
        
        public Builder scopes(final List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
    }
    
    public static final class OauthAdapter implements a<Oauth, Builder>
    {
        private OauthAdapter() {
        }
        
        public OauthAdapter(final Oauth$1 object) {
            this();
        }
        
        public Oauth read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Oauth read(final e e, final Builder builder) throws IOException {
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
                            else if (a == 15) {
                                final c w = e.w();
                                final ArrayList list = new ArrayList(w.b);
                                for (int i = 0; i < w.b; i = k.f(e, list, i, 1)) {}
                                e.x();
                                builder.scopes((List<String>)list);
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.client_id(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.client_name(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.client_app_type(e.F());
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
        
        public void write(final e e, final Oauth oauth) throws IOException {
            e.X();
            if (oauth.client_app_type != null) {
                e.O(1, (byte)11);
                e.W(oauth.client_app_type);
                e.P();
            }
            if (oauth.client_name != null) {
                e.O(2, (byte)11);
                e.W(oauth.client_name);
                e.P();
            }
            if (oauth.client_id != null) {
                e.O(3, (byte)11);
                e.W(oauth.client_id);
                e.P();
            }
            if (oauth.scopes != null) {
                e.O(4, (byte)15);
                e.U((byte)11, oauth.scopes.size());
                final Iterator<String> iterator = oauth.scopes.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Oauth)o);
        }
    }
}
