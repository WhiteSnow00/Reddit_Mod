// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Share
{
    public static final a<Share, Share.Share$Builder> ADAPTER;
    public final String id;
    public final String target;
    public final String text;
    
    static {
        ADAPTER = (a)new Share.Share$ShareAdapter((Share$1)null);
    }
    
    private Share(final Share.Share$Builder share$Builder) {
        this.target = Share.Share$Builder.access$100(share$Builder);
        this.id = Share.Share$Builder.access$200(share$Builder);
        this.text = Share.Share$Builder.access$300(share$Builder);
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
        if (!(o instanceof Share)) {
            return false;
        }
        final Share share = (Share)o;
        final String target = this.target;
        final String target2 = share.target;
        if (target == target2 || (target != null && target.equals(target2))) {
            final String id = this.id;
            final String id2 = share.id;
            if (id == id2 || (id != null && id.equals(id2))) {
                final String text = this.text;
                final String text2 = share.text;
                boolean b2 = b;
                if (text == text2) {
                    return b2;
                }
                if (text != null && text.equals(text2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String target = this.target;
        int hashCode = 0;
        int hashCode2;
        if (target == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = target.hashCode();
        }
        final String id = this.id;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final String text = this.text;
        if (text != null) {
            hashCode = text.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Share{target=");
        r.append(this.target);
        r.append(", id=");
        r.append(this.id);
        r.append(", text=");
        return a.o(r, this.text, "}");
    }
    
    public void write(final e e) throws IOException {
        Share.ADAPTER.write(e, (Object)this);
    }
}
