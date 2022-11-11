// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ThirdPartyBadge
{
    public static final a<ThirdPartyBadge, ThirdPartyBadge.ThirdPartyBadge$Builder> ADAPTER;
    public final String id;
    public final String target_user_id;
    public final String title;
    
    static {
        ADAPTER = (a)new ThirdPartyBadge.ThirdPartyBadge$ThirdPartyBadgeAdapter((ThirdPartyBadge$1)null);
    }
    
    private ThirdPartyBadge(final ThirdPartyBadge.ThirdPartyBadge$Builder thirdPartyBadge$Builder) {
        this.id = ThirdPartyBadge.ThirdPartyBadge$Builder.access$100(thirdPartyBadge$Builder);
        this.title = ThirdPartyBadge.ThirdPartyBadge$Builder.access$200(thirdPartyBadge$Builder);
        this.target_user_id = ThirdPartyBadge.ThirdPartyBadge$Builder.access$300(thirdPartyBadge$Builder);
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
        if (!(o instanceof ThirdPartyBadge)) {
            return false;
        }
        final ThirdPartyBadge thirdPartyBadge = (ThirdPartyBadge)o;
        final String id = this.id;
        final String id2 = thirdPartyBadge.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = thirdPartyBadge.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final String target_user_id = this.target_user_id;
                final String target_user_id2 = thirdPartyBadge.target_user_id;
                boolean b2 = b;
                if (target_user_id == target_user_id2) {
                    return b2;
                }
                if (target_user_id != null && target_user_id.equals(target_user_id2)) {
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
        final String title = this.title;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String target_user_id = this.target_user_id;
        if (target_user_id != null) {
            hashCode = target_user_id.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ThirdPartyBadge{id=");
        r.append(this.id);
        r.append(", title=");
        r.append(this.title);
        r.append(", target_user_id=");
        return a.o(r, this.target_user_id, "}");
    }
    
    public void write(final e e) throws IOException {
        ThirdPartyBadge.ADAPTER.write(e, (Object)this);
    }
}
