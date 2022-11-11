// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class AccountLabel
{
    public static final a<AccountLabel, AccountLabel.AccountLabel$Builder> ADAPTER;
    public final String id;
    public final String name;
    public final String type;
    
    static {
        ADAPTER = (a)new AccountLabel.AccountLabel$AccountLabelAdapter((AccountLabel$1)null);
    }
    
    private AccountLabel(final AccountLabel.AccountLabel$Builder accountLabel$Builder) {
        this.id = AccountLabel.AccountLabel$Builder.access$100(accountLabel$Builder);
        this.type = AccountLabel.AccountLabel$Builder.access$200(accountLabel$Builder);
        this.name = AccountLabel.AccountLabel$Builder.access$300(accountLabel$Builder);
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
        final StringBuilder r = a.r("AccountLabel{id=");
        r.append(this.id);
        r.append(", type=");
        r.append(this.type);
        r.append(", name=");
        return a.o(r, this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        AccountLabel.ADAPTER.write(e, (Object)this);
    }
}
