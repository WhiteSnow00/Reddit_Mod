// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Banner
{
    public static final a<Banner, Banner.Banner$Builder> ADAPTER;
    public final String button_text;
    public final String id;
    
    static {
        ADAPTER = (a)new Banner.Banner$BannerAdapter((Banner$1)null);
    }
    
    private Banner(final Banner.Banner$Builder banner$Builder) {
        this.id = Banner.Banner$Builder.access$100(banner$Builder);
        this.button_text = Banner.Banner$Builder.access$200(banner$Builder);
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
        if (!(o instanceof Banner)) {
            return false;
        }
        final Banner banner = (Banner)o;
        final String id = this.id;
        final String id2 = banner.id;
        if (id == id2 || id.equals(id2)) {
            final String button_text = this.button_text;
            final String button_text2 = banner.button_text;
            boolean b2 = b;
            if (button_text == button_text2) {
                return b2;
            }
            if (button_text != null && button_text.equals(button_text2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String button_text = this.button_text;
        int hashCode2;
        if (button_text == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = button_text.hashCode();
        }
        return ((hashCode ^ 0x1000193) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Banner{id=");
        k.append(this.id);
        k.append(", button_text=");
        return b.j(k, this.button_text, "}");
    }
    
    public void write(final e e) throws IOException {
        Banner.ADAPTER.write(e, (Object)this);
    }
}
