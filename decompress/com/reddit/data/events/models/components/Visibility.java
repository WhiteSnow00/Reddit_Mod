// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Visibility
{
    public static final a<Visibility, Visibility.Visibility$Builder> ADAPTER;
    public final Long number_items;
    public final Long number_scrolled_pages;
    public final Long number_seen_items;
    public final Long off_screen_timestamp;
    public final Long on_screen_timestamp;
    public final Boolean seen;
    public final List<String> seen_items;
    
    static {
        ADAPTER = (a)new Visibility.Visibility$VisibilityAdapter((Visibility$1)null);
    }
    
    private Visibility(final Visibility.Visibility$Builder visibility$Builder) {
        this.seen = Visibility.Visibility$Builder.access$100(visibility$Builder);
        List<String> unmodifiableList;
        if (Visibility.Visibility$Builder.access$200(visibility$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Visibility.Visibility$Builder.access$200(visibility$Builder));
        }
        this.seen_items = unmodifiableList;
        this.number_items = Visibility.Visibility$Builder.access$300(visibility$Builder);
        this.number_seen_items = Visibility.Visibility$Builder.access$400(visibility$Builder);
        this.number_scrolled_pages = Visibility.Visibility$Builder.access$500(visibility$Builder);
        this.on_screen_timestamp = Visibility.Visibility$Builder.access$600(visibility$Builder);
        this.off_screen_timestamp = Visibility.Visibility$Builder.access$700(visibility$Builder);
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
        if (!(o instanceof Visibility)) {
            return false;
        }
        final Visibility visibility = (Visibility)o;
        final Boolean seen = this.seen;
        final Boolean seen2 = visibility.seen;
        if (seen == seen2 || (seen != null && seen.equals(seen2))) {
            final List<String> seen_items = this.seen_items;
            final List<String> seen_items2 = visibility.seen_items;
            if (seen_items == seen_items2 || (seen_items != null && seen_items.equals(seen_items2))) {
                final Long number_items = this.number_items;
                final Long number_items2 = visibility.number_items;
                if (number_items == number_items2 || (number_items != null && number_items.equals(number_items2))) {
                    final Long number_seen_items = this.number_seen_items;
                    final Long number_seen_items2 = visibility.number_seen_items;
                    if (number_seen_items == number_seen_items2 || (number_seen_items != null && number_seen_items.equals(number_seen_items2))) {
                        final Long number_scrolled_pages = this.number_scrolled_pages;
                        final Long number_scrolled_pages2 = visibility.number_scrolled_pages;
                        if (number_scrolled_pages == number_scrolled_pages2 || (number_scrolled_pages != null && number_scrolled_pages.equals(number_scrolled_pages2))) {
                            final Long on_screen_timestamp = this.on_screen_timestamp;
                            final Long on_screen_timestamp2 = visibility.on_screen_timestamp;
                            if (on_screen_timestamp == on_screen_timestamp2 || (on_screen_timestamp != null && on_screen_timestamp.equals(on_screen_timestamp2))) {
                                final Long off_screen_timestamp = this.off_screen_timestamp;
                                final Long off_screen_timestamp2 = visibility.off_screen_timestamp;
                                boolean b2 = b;
                                if (off_screen_timestamp == off_screen_timestamp2) {
                                    return b2;
                                }
                                if (off_screen_timestamp != null && off_screen_timestamp.equals(off_screen_timestamp2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean seen = this.seen;
        int hashCode = 0;
        int hashCode2;
        if (seen == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = seen.hashCode();
        }
        final List<String> seen_items = this.seen_items;
        int hashCode3;
        if (seen_items == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = seen_items.hashCode();
        }
        final Long number_items = this.number_items;
        int hashCode4;
        if (number_items == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = number_items.hashCode();
        }
        final Long number_seen_items = this.number_seen_items;
        int hashCode5;
        if (number_seen_items == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = number_seen_items.hashCode();
        }
        final Long number_scrolled_pages = this.number_scrolled_pages;
        int hashCode6;
        if (number_scrolled_pages == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = number_scrolled_pages.hashCode();
        }
        final Long on_screen_timestamp = this.on_screen_timestamp;
        int hashCode7;
        if (on_screen_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = on_screen_timestamp.hashCode();
        }
        final Long off_screen_timestamp = this.off_screen_timestamp;
        if (off_screen_timestamp != null) {
            hashCode = off_screen_timestamp.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Visibility{seen=");
        r.append(this.seen);
        r.append(", seen_items=");
        r.append(this.seen_items);
        r.append(", number_items=");
        r.append(this.number_items);
        r.append(", number_seen_items=");
        r.append(this.number_seen_items);
        r.append(", number_scrolled_pages=");
        r.append(this.number_scrolled_pages);
        r.append(", on_screen_timestamp=");
        r.append(this.on_screen_timestamp);
        r.append(", off_screen_timestamp=");
        return a.m(r, this.off_screen_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        Visibility.ADAPTER.write(e, (Object)this);
    }
}
