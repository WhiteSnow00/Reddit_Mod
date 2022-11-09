// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Token
{
    public static final a<Token, Builder> ADAPTER;
    public final String id;
    
    static {
        ADAPTER = (a)new TokenAdapter(null);
    }
    
    private Token(final Builder builder) {
        this.id = Builder.access$100(builder);
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
        if (!(o instanceof Token)) {
            return false;
        }
        final Token token = (Token)o;
        final String id = this.id;
        final String id2 = token.id;
        boolean b2 = b;
        if (id != id2) {
            b2 = (id != null && id.equals(id2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode;
        if (id == null) {
            hashCode = 0;
        }
        else {
            hashCode = id.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Token{id="), this.id, "}");
    }
    
    public void write(final e e) throws IOException {
        Token.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Token>
    {
        private String id;
        
        public Builder() {
        }
        
        public Builder(final Token token) {
            this.id = token.id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public Token build() {
            return new Token(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
        }
    }
    
    public static final class TokenAdapter implements a<Token, Builder>
    {
        private TokenAdapter() {
        }
        
        public Token read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Token read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 10) {
                    mt.a.a(e, a);
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Token token) throws IOException {
            e.a0();
            if (token.id != null) {
                e.N(10, (byte)11);
                e.Z(token.id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
