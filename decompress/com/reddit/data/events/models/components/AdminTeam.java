// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdminTeam
{
    public static final a<AdminTeam, AdminTeam.AdminTeam$Builder> ADAPTER;
    public final String access_type;
    public final Integer id;
    public final String name;
    
    static {
        ADAPTER = (a)new AdminTeam.AdminTeam$AdminTeamAdapter((AdminTeam$1)null);
    }
    
    private AdminTeam(final AdminTeam.AdminTeam$Builder adminTeam$Builder) {
        this.id = AdminTeam.AdminTeam$Builder.access$100(adminTeam$Builder);
        this.name = AdminTeam.AdminTeam$Builder.access$200(adminTeam$Builder);
        this.access_type = AdminTeam.AdminTeam$Builder.access$300(adminTeam$Builder);
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
        if (!(o instanceof AdminTeam)) {
            return false;
        }
        final AdminTeam adminTeam = (AdminTeam)o;
        final Integer id = this.id;
        final Integer id2 = adminTeam.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = adminTeam.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String access_type = this.access_type;
                final String access_type2 = adminTeam.access_type;
                boolean b2 = b;
                if (access_type == access_type2) {
                    return b2;
                }
                if (access_type != null && access_type.equals(access_type2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String access_type = this.access_type;
        if (access_type != null) {
            hashCode = access_type.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdminTeam{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", access_type=");
        return b.j(k, this.access_type, "}");
    }
    
    public void write(final e e) throws IOException {
        AdminTeam.ADAPTER.write(e, (Object)this);
    }
}
