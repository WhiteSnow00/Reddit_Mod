// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Admin
{
    public static final a<Admin, Admin.Admin$Builder> ADAPTER;
    public final String id;
    public final String name;
    
    static {
        ADAPTER = (a)new Admin.Admin$AdminAdapter((Admin$1)null);
    }
    
    private Admin(final Admin.Admin$Builder admin$Builder) {
        this.id = Admin.Admin$Builder.access$100(admin$Builder);
        this.name = Admin.Admin$Builder.access$200(admin$Builder);
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
        if (!(o instanceof Admin)) {
            return false;
        }
        final Admin admin = (Admin)o;
        final String id = this.id;
        final String id2 = admin.id;
        if (id == id2 || id.equals(id2)) {
            final String name = this.name;
            final String name2 = admin.name;
            boolean b2 = b;
            if (name == name2) {
                return b2;
            }
            if (name != null && name.equals(name2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String name = this.name;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        return ((hashCode ^ 0x1000193) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Admin{id=");
        k.append(this.id);
        k.append(", name=");
        return b.j(k, this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        Admin.ADAPTER.write(e, (Object)this);
    }
}
