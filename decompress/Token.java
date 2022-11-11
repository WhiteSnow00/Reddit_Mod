// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Token
{
    public static final a<Token, Token.Token$Builder> ADAPTER;
    public final String id;
    
    static {
        ADAPTER = (a)new Token.Token$TokenAdapter((Token$1)null);
    }
    
    private Token(final Token.Token$Builder token$Builder) {
        this.id = Token.Token$Builder.access$100(token$Builder);
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
        return a.o(a.r("Token{id="), this.id, "}");
    }
    
    public void write(final e e) throws IOException {
        Token.ADAPTER.write(e, (Object)this);
    }
}
