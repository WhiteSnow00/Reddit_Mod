// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Carousel
{
    public static final a<Carousel, Carousel.Carousel$Builder> ADAPTER;
    public final String id;
    public final String type;
    
    static {
        ADAPTER = (a)new Carousel.Carousel$CarouselAdapter((Carousel$1)null);
    }
    
    private Carousel(final Carousel.Carousel$Builder carousel$Builder) {
        this.id = Carousel.Carousel$Builder.access$100(carousel$Builder);
        this.type = Carousel.Carousel$Builder.access$200(carousel$Builder);
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
        if (!(o instanceof Carousel)) {
            return false;
        }
        final Carousel carousel = (Carousel)o;
        final String id = this.id;
        final String id2 = carousel.id;
        if (id == id2 || id.equals(id2)) {
            final String type = this.type;
            final String type2 = carousel.type;
            boolean b2 = b;
            if (type == type2) {
                return b2;
            }
            if (type.equals(type2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.id.hashCode() ^ 0x1000193) * -2128831035 ^ this.type.hashCode()) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Carousel{id=");
        k.append(this.id);
        k.append(", type=");
        return b.j(k, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Carousel.ADAPTER.write(e, (Object)this);
    }
}
