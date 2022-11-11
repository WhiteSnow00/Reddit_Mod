// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class TheaterMode
{
    public static final a<TheaterMode, TheaterMode.TheaterMode$Builder> ADAPTER;
    public final String id;
    public final Long position;
    
    static {
        ADAPTER = (a)new TheaterMode.TheaterMode$TheaterModeAdapter((TheaterMode$1)null);
    }
    
    private TheaterMode(final TheaterMode.TheaterMode$Builder theaterMode$Builder) {
        this.id = TheaterMode.TheaterMode$Builder.access$100(theaterMode$Builder);
        this.position = TheaterMode.TheaterMode$Builder.access$200(theaterMode$Builder);
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
        if (!(o instanceof TheaterMode)) {
            return false;
        }
        final TheaterMode theaterMode = (TheaterMode)o;
        final String id = this.id;
        final String id2 = theaterMode.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long position = this.position;
            final Long position2 = theaterMode.position;
            boolean b2 = b;
            if (position == position2) {
                return b2;
            }
            if (position != null && position.equals(position2)) {
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
        final Long position = this.position;
        if (position != null) {
            hashCode = position.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TheaterMode{id=");
        r.append(this.id);
        r.append(", position=");
        return a.m(r, this.position, "}");
    }
    
    public void write(final e e) throws IOException {
        TheaterMode.ADAPTER.write(e, (Object)this);
    }
}
