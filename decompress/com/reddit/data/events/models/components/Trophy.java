// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Trophy
{
    public static final a<Trophy, Trophy.Trophy$Builder> ADAPTER;
    public final String id;
    public final String name;
    
    static {
        ADAPTER = (a)new Trophy.Trophy$TrophyAdapter((Trophy$1)null);
    }
    
    private Trophy(final Trophy.Trophy$Builder trophy$Builder) {
        this.id = Trophy.Trophy$Builder.access$100(trophy$Builder);
        this.name = Trophy.Trophy$Builder.access$200(trophy$Builder);
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
        if (!(o instanceof Trophy)) {
            return false;
        }
        final Trophy trophy = (Trophy)o;
        final String id = this.id;
        final String id2 = trophy.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = trophy.name;
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String name = this.name;
        if (name != null) {
            hashCode = name.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Trophy{id=");
        r.append(this.id);
        r.append(", name=");
        return a.o(r, this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        Trophy.ADAPTER.write(e, (Object)this);
    }
}
