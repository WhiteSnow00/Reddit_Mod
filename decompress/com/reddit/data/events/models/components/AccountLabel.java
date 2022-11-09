// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AccountLabel
{
    public static final a<AccountLabel, Builder> ADAPTER;
    public final String id;
    public final String name;
    public final String type;
    
    static {
        ADAPTER = (a)new AccountLabelAdapter(null);
    }
    
    private AccountLabel(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.type = Builder.access$200(builder);
        this.name = Builder.access$300(builder);
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
        if (!(o instanceof AccountLabel)) {
            return false;
        }
        final AccountLabel accountLabel = (AccountLabel)o;
        final String id = this.id;
        final String id2 = accountLabel.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String type = this.type;
            final String type2 = accountLabel.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String name = this.name;
                final String name2 = accountLabel.name;
                boolean b2 = b;
                if (name == name2) {
                    return b2;
                }
                if (name != null && name.equals(name2)) {
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
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String name = this.name;
        if (name != null) {
            hashCode = name.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AccountLabel{id=");
        k.append(this.id);
        k.append(", type=");
        k.append(this.type);
        k.append(", name=");
        return b.j(k, this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        AccountLabel.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AccountLabelAdapter implements a<AccountLabel, Builder>
    {
        private AccountLabelAdapter() {
        }
        
        public AccountLabel read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AccountLabel read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.name(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.type(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
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
        
        public void write(final e e, final AccountLabel accountLabel) throws IOException {
            e.a0();
            if (accountLabel.id != null) {
                e.N(1, (byte)11);
                e.Z(accountLabel.id);
                e.O();
            }
            if (accountLabel.type != null) {
                e.N(2, (byte)11);
                e.Z(accountLabel.type);
                e.O();
            }
            if (accountLabel.name != null) {
                e.N(3, (byte)11);
                e.Z(accountLabel.name);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AccountLabel>
    {
        private String id;
        private String name;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final AccountLabel accountLabel) {
            this.id = accountLabel.id;
            this.type = accountLabel.type;
            this.name = accountLabel.name;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.name;
        }
        
        public AccountLabel build() {
            return new AccountLabel(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.type = null;
            this.name = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
}
