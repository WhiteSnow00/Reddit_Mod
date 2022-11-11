// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Announcement
{
    public static final a<Announcement, Announcement.Announcement$Builder> ADAPTER;
    public final String body;
    public final String id;
    public final String title;
    
    static {
        ADAPTER = (a)new Announcement.Announcement$AnnouncementAdapter((Announcement$1)null);
    }
    
    private Announcement(final Announcement.Announcement$Builder announcement$Builder) {
        this.id = Announcement.Announcement$Builder.access$100(announcement$Builder);
        this.title = Announcement.Announcement$Builder.access$200(announcement$Builder);
        this.body = Announcement.Announcement$Builder.access$300(announcement$Builder);
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
        if (!(o instanceof Announcement)) {
            return false;
        }
        final Announcement announcement = (Announcement)o;
        final String id = this.id;
        final String id2 = announcement.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = announcement.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final String body = this.body;
                final String body2 = announcement.body;
                boolean b2 = b;
                if (body == body2) {
                    return b2;
                }
                if (body != null && body.equals(body2)) {
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
        final String body = this.body;
        if (body != null) {
            hashCode = body.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Announcement{id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", body=");
        return b.j(k, this.body, "}");
    }
    
    public void write(final e e) throws IOException {
        Announcement.ADAPTER.write(e, (Object)this);
    }
}
