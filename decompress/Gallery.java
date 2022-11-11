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

public final class Gallery
{
    public static final a<Gallery, Builder> ADAPTER;
    public final String id;
    public final List<String> media_ids;
    public final Integer next_position;
    public final Integer num_images;
    public final Integer num_items;
    public final Integer num_videos;
    public final Integer position;
    
    static {
        ADAPTER = (a)new GalleryAdapter(null);
    }
    
    private Gallery(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.position = Builder.access$200(builder);
        List<String> unmodifiableList;
        if (Builder.access$300(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$300(builder));
        }
        this.media_ids = unmodifiableList;
        this.num_items = Builder.access$400(builder);
        this.num_images = Builder.access$500(builder);
        this.num_videos = Builder.access$600(builder);
        this.next_position = Builder.access$700(builder);
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
        if (!(o instanceof Gallery)) {
            return false;
        }
        final Gallery gallery = (Gallery)o;
        final String id = this.id;
        final String id2 = gallery.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Integer position = this.position;
            final Integer position2 = gallery.position;
            if (position == position2 || (position != null && position.equals(position2))) {
                final List<String> media_ids = this.media_ids;
                final List<String> media_ids2 = gallery.media_ids;
                if (media_ids == media_ids2 || (media_ids != null && media_ids.equals(media_ids2))) {
                    final Integer num_items = this.num_items;
                    final Integer num_items2 = gallery.num_items;
                    if (num_items == num_items2 || (num_items != null && num_items.equals(num_items2))) {
                        final Integer num_images = this.num_images;
                        final Integer num_images2 = gallery.num_images;
                        if (num_images == num_images2 || (num_images != null && num_images.equals(num_images2))) {
                            final Integer num_videos = this.num_videos;
                            final Integer num_videos2 = gallery.num_videos;
                            if (num_videos == num_videos2 || (num_videos != null && num_videos.equals(num_videos2))) {
                                final Integer next_position = this.next_position;
                                final Integer next_position2 = gallery.next_position;
                                boolean b2 = b;
                                if (next_position == next_position2) {
                                    return b2;
                                }
                                if (next_position != null && next_position.equals(next_position2)) {
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Integer position = this.position;
        int hashCode3;
        if (position == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = position.hashCode();
        }
        final List<String> media_ids = this.media_ids;
        int hashCode4;
        if (media_ids == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = media_ids.hashCode();
        }
        final Integer num_items = this.num_items;
        int hashCode5;
        if (num_items == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = num_items.hashCode();
        }
        final Integer num_images = this.num_images;
        int hashCode6;
        if (num_images == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = num_images.hashCode();
        }
        final Integer num_videos = this.num_videos;
        int hashCode7;
        if (num_videos == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = num_videos.hashCode();
        }
        final Integer next_position = this.next_position;
        if (next_position != null) {
            hashCode = next_position.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Gallery{id=");
        k.append(this.id);
        k.append(", position=");
        k.append(this.position);
        k.append(", media_ids=");
        k.append(this.media_ids);
        k.append(", num_items=");
        k.append(this.num_items);
        k.append(", num_images=");
        k.append(this.num_images);
        k.append(", num_videos=");
        k.append(this.num_videos);
        k.append(", next_position=");
        k.append(this.next_position);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Gallery.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Gallery>
    {
        private String id;
        private List<String> media_ids;
        private Integer next_position;
        private Integer num_images;
        private Integer num_items;
        private Integer num_videos;
        private Integer position;
        
        public Builder() {
        }
        
        public Builder(final Gallery gallery) {
            this.id = gallery.id;
            this.position = gallery.position;
            this.media_ids = gallery.media_ids;
            this.num_items = gallery.num_items;
            this.num_images = gallery.num_images;
            this.num_videos = gallery.num_videos;
            this.next_position = gallery.next_position;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Integer access$200(final Builder builder) {
            return builder.position;
        }
        
        public static /* synthetic */ List access$300(final Builder builder) {
            return builder.media_ids;
        }
        
        public static /* synthetic */ Integer access$400(final Builder builder) {
            return builder.num_items;
        }
        
        public static /* synthetic */ Integer access$500(final Builder builder) {
            return builder.num_images;
        }
        
        public static /* synthetic */ Integer access$600(final Builder builder) {
            return builder.num_videos;
        }
        
        public static /* synthetic */ Integer access$700(final Builder builder) {
            return builder.next_position;
        }
        
        public Gallery build() {
            return new Gallery(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder media_ids(final List<String> media_ids) {
            this.media_ids = media_ids;
            return this;
        }
        
        public Builder next_position(final Integer next_position) {
            this.next_position = next_position;
            return this;
        }
        
        public Builder num_images(final Integer num_images) {
            this.num_images = num_images;
            return this;
        }
        
        public Builder num_items(final Integer num_items) {
            this.num_items = num_items;
            return this;
        }
        
        public Builder num_videos(final Integer num_videos) {
            this.num_videos = num_videos;
            return this;
        }
        
        public Builder position(final Integer position) {
            this.position = position;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.position = null;
            this.media_ids = null;
            this.num_items = null;
            this.num_images = null;
            this.num_videos = null;
            this.next_position = null;
        }
    }
    
    public static final class GalleryAdapter implements a<Gallery, Builder>
    {
        private GalleryAdapter() {
        }
        
        public Gallery read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Gallery read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 8) {
                            builder.next_position(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 8) {
                            builder.num_videos(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.num_images(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.num_items(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.media_ids((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 8) {
                            builder.position(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Gallery gallery) throws IOException {
            e.a0();
            if (gallery.id != null) {
                e.N(1, (byte)11);
                e.Z(gallery.id);
                e.O();
            }
            if (gallery.position != null) {
                e.N(2, (byte)8);
                b.r(gallery.position, e);
            }
            if (gallery.media_ids != null) {
                e.N(3, (byte)15);
                e.V((byte)11, gallery.media_ids.size());
                final Iterator<String> iterator = gallery.media_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (gallery.num_items != null) {
                e.N(4, (byte)8);
                b.r(gallery.num_items, e);
            }
            if (gallery.num_images != null) {
                e.N(5, (byte)8);
                b.r(gallery.num_images, e);
            }
            if (gallery.num_videos != null) {
                e.N(6, (byte)8);
                b.r(gallery.num_videos, e);
            }
            if (gallery.next_position != null) {
                e.N(7, (byte)8);
                b.r(gallery.next_position, e);
            }
            e.P();
            e.b0();
        }
    }
}
