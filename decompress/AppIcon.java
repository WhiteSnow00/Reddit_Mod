// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AppIcon
{
    public static final a<AppIcon, AppIcon.AppIcon$Builder> ADAPTER;
    public final String id;
    public final Boolean is_premium;
    public final String name;
    public final String prev_icon_id;
    
    static {
        ADAPTER = (a)new AppIcon.AppIcon$AppIconAdapter((AppIcon$1)null);
    }
    
    private AppIcon(final AppIcon.AppIcon$Builder appIcon$Builder) {
        this.id = AppIcon.AppIcon$Builder.access$100(appIcon$Builder);
        this.name = AppIcon.AppIcon$Builder.access$200(appIcon$Builder);
        this.is_premium = AppIcon.AppIcon$Builder.access$300(appIcon$Builder);
        this.prev_icon_id = AppIcon.AppIcon$Builder.access$400(appIcon$Builder);
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
        if (!(o instanceof AppIcon)) {
            return false;
        }
        final AppIcon appIcon = (AppIcon)o;
        final String id = this.id;
        final String id2 = appIcon.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = appIcon.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final Boolean is_premium = this.is_premium;
                final Boolean is_premium2 = appIcon.is_premium;
                if (is_premium == is_premium2 || (is_premium != null && is_premium.equals(is_premium2))) {
                    final String prev_icon_id = this.prev_icon_id;
                    final String prev_icon_id2 = appIcon.prev_icon_id;
                    boolean b2 = b;
                    if (prev_icon_id == prev_icon_id2) {
                        return b2;
                    }
                    if (prev_icon_id != null && prev_icon_id.equals(prev_icon_id2)) {
                        b2 = b;
                        return b2;
                    }
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
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final Boolean is_premium = this.is_premium;
        int hashCode4;
        if (is_premium == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = is_premium.hashCode();
        }
        final String prev_icon_id = this.prev_icon_id;
        if (prev_icon_id != null) {
            hashCode = prev_icon_id.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AppIcon{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", is_premium=");
        k.append(this.is_premium);
        k.append(", prev_icon_id=");
        return b.j(k, this.prev_icon_id, "}");
    }
    
    public void write(final e e) throws IOException {
        AppIcon.ADAPTER.write(e, (Object)this);
    }
}
