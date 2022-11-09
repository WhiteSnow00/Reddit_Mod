// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Crawler
{
    public static final a<Crawler, Crawler.Crawler$Builder> ADAPTER;
    public final String name;
    
    static {
        ADAPTER = (a)new Crawler.Crawler$CrawlerAdapter((Crawler$1)null);
    }
    
    private Crawler(final Crawler.Crawler$Builder crawler$Builder) {
        this.name = Crawler.Crawler$Builder.access$100(crawler$Builder);
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
        if (!(o instanceof Crawler)) {
            return false;
        }
        final Crawler crawler = (Crawler)o;
        final String name = this.name;
        final String name2 = crawler.name;
        boolean b2 = b;
        if (name != name2) {
            b2 = (name != null && name.equals(name2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String name = this.name;
        int hashCode;
        if (name == null) {
            hashCode = 0;
        }
        else {
            hashCode = name.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Crawler{name="), this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        Crawler.ADAPTER.write(e, (Object)this);
    }
}
