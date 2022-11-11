// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Tooltip
{
    public static final a<Tooltip, Tooltip.Tooltip$Builder> ADAPTER;
    public final String id;
    public final String text;
    
    static {
        ADAPTER = (a)new Tooltip.Tooltip$TooltipAdapter((Tooltip$1)null);
    }
    
    private Tooltip(final Tooltip.Tooltip$Builder tooltip$Builder) {
        this.id = Tooltip.Tooltip$Builder.access$100(tooltip$Builder);
        this.text = Tooltip.Tooltip$Builder.access$200(tooltip$Builder);
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
        if (!(o instanceof Tooltip)) {
            return false;
        }
        final Tooltip tooltip = (Tooltip)o;
        final String id = this.id;
        final String id2 = tooltip.id;
        if (id == id2 || id.equals(id2)) {
            final String text = this.text;
            final String text2 = tooltip.text;
            boolean b2 = b;
            if (text == text2) {
                return b2;
            }
            if (text.equals(text2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.id.hashCode() ^ 0x1000193) * -2128831035 ^ this.text.hashCode()) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Tooltip{id=");
        r.append(this.id);
        r.append(", text=");
        return a.o(r, this.text, "}");
    }
    
    public void write(final e e) throws IOException {
        Tooltip.ADAPTER.write(e, (Object)this);
    }
}
