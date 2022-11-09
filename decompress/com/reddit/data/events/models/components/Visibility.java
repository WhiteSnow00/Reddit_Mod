// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import jt.b;
import java.io.IOException;
import kt.e;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Visibility
{
    public static final a<Visibility, Builder> ADAPTER;
    public final Long number_items;
    public final Long number_scrolled_pages;
    public final Long number_seen_items;
    public final Long off_screen_timestamp;
    public final Long on_screen_timestamp;
    public final Boolean seen;
    public final List<String> seen_items;
    
    static {
        ADAPTER = (a)new VisibilityAdapter(null);
    }
    
    private Visibility(final Builder builder) {
        this.seen = Builder.access$100(builder);
        List<String> unmodifiableList;
        if (Builder.access$200(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.seen_items = unmodifiableList;
        this.number_items = Builder.access$300(builder);
        this.number_seen_items = Builder.access$400(builder);
        this.number_scrolled_pages = Builder.access$500(builder);
        this.on_screen_timestamp = Builder.access$600(builder);
        this.off_screen_timestamp = Builder.access$700(builder);
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
        final StringBuilder k = a.k("Visibility{seen=");
        k.append(this.seen);
        k.append(", seen_items=");
        k.append(this.seen_items);
        k.append(", number_items=");
        k.append(this.number_items);
        k.append(", number_seen_items=");
        k.append(this.number_seen_items);
        k.append(", number_scrolled_pages=");
        k.append(this.number_scrolled_pages);
        k.append(", on_screen_timestamp=");
        k.append(this.on_screen_timestamp);
        k.append(", off_screen_timestamp=");
        return a.h(k, this.off_screen_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        Visibility.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Visibility>
    {
        private Long number_items;
        private Long number_scrolled_pages;
        private Long number_seen_items;
        private Long off_screen_timestamp;
        private Long on_screen_timestamp;
        private Boolean seen;
        private List<String> seen_items;
        
        public Builder() {
        }
        
        public Builder(final Visibility visibility) {
            this.seen = visibility.seen;
            this.seen_items = visibility.seen_items;
            this.number_items = visibility.number_items;
            this.number_seen_items = visibility.number_seen_items;
            this.number_scrolled_pages = visibility.number_scrolled_pages;
            this.on_screen_timestamp = visibility.on_screen_timestamp;
            this.off_screen_timestamp = visibility.off_screen_timestamp;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.seen;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.seen_items;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.number_items;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.number_seen_items;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.number_scrolled_pages;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.on_screen_timestamp;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.off_screen_timestamp;
        }
        
        public Visibility build() {
            return new Visibility(this, null);
        }
        
        public Builder number_items(final Long number_items) {
            this.number_items = number_items;
            return this;
        }
        
        public Builder number_scrolled_pages(final Long number_scrolled_pages) {
            this.number_scrolled_pages = number_scrolled_pages;
            return this;
        }
        
        public Builder number_seen_items(final Long number_seen_items) {
            this.number_seen_items = number_seen_items;
            return this;
        }
        
        public Builder off_screen_timestamp(final Long off_screen_timestamp) {
            this.off_screen_timestamp = off_screen_timestamp;
            return this;
        }
        
        public Builder on_screen_timestamp(final Long on_screen_timestamp) {
            this.on_screen_timestamp = on_screen_timestamp;
            return this;
        }
        
        public void reset() {
            this.seen = null;
            this.seen_items = null;
            this.number_items = null;
            this.number_seen_items = null;
            this.number_scrolled_pages = null;
            this.on_screen_timestamp = null;
            this.off_screen_timestamp = null;
        }
        
        public Builder seen(final Boolean seen) {
            this.seen = seen;
            return this;
        }
        
        public Builder seen_items(final List<String> seen_items) {
            this.seen_items = seen_items;
            return this;
        }
    }
    
    public static final class VisibilityAdapter implements a<Visibility, Builder>
    {
        private VisibilityAdapter() {
        }
        
        public Visibility read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Visibility read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    switch (b) {
                        default: {
                            mt.a.a(e, a);
                            break;
                        }
                        case 9: {
                            if (a == 10) {
                                builder.off_screen_timestamp(e.v());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 8: {
                            if (a == 10) {
                                builder.on_screen_timestamp(e.v());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 7: {
                            if (a == 10) {
                                builder.number_scrolled_pages(e.v());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 6: {
                            if (a == 10) {
                                builder.number_seen_items(e.v());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 5: {
                            if (a == 10) {
                                builder.number_items(e.v());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 4: {
                            if (a == 15) {
                                final c w = e.w();
                                final ArrayList list = new ArrayList(w.b);
                                for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                                e.x();
                                builder.seen_items((List<String>)list);
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                    }
                }
                else if (a == 2) {
                    builder.seen(e.b());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Visibility visibility) throws IOException {
            e.a0();
            if (visibility.seen != null) {
                e.N(1, (byte)2);
                d.z(visibility.seen, e);
            }
            if (visibility.seen_items != null) {
                e.N(4, (byte)15);
                e.V((byte)11, visibility.seen_items.size());
                final Iterator<String> iterator = visibility.seen_items.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (visibility.number_items != null) {
                e.N(5, (byte)10);
                a.r(visibility.number_items, e);
            }
            if (visibility.number_seen_items != null) {
                e.N(6, (byte)10);
                a.r(visibility.number_seen_items, e);
            }
            if (visibility.number_scrolled_pages != null) {
                e.N(7, (byte)10);
                a.r(visibility.number_scrolled_pages, e);
            }
            if (visibility.on_screen_timestamp != null) {
                e.N(8, (byte)10);
                a.r(visibility.on_screen_timestamp, e);
            }
            if (visibility.off_screen_timestamp != null) {
                e.N(9, (byte)10);
                a.r(visibility.off_screen_timestamp, e);
            }
            e.P();
            e.b0();
        }
    }
}
