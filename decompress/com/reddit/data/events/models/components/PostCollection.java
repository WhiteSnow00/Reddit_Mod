// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class PostCollection
{
    public static final a<PostCollection, Builder> ADAPTER;
    public final String author_id;
    public final String display_layout;
    public final String id;
    public final List<String> post_ids;
    public final String title;
    
    static {
        ADAPTER = (a)new PostCollectionAdapter(null);
    }
    
    private PostCollection(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
        this.author_id = Builder.access$300(builder);
        List<String> unmodifiableList;
        if (Builder.access$400(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$400(builder));
        }
        this.post_ids = unmodifiableList;
        this.display_layout = Builder.access$500(builder);
    }
    
    public PostCollection(final Builder builder, final PostCollection$1 object) {
        this(builder);
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
        if (!(o instanceof PostCollection)) {
            return false;
        }
        final PostCollection collection = (PostCollection)o;
        final String id = this.id;
        final String id2 = collection.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = collection.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final String author_id = this.author_id;
                final String author_id2 = collection.author_id;
                if (author_id == author_id2 || (author_id != null && author_id.equals(author_id2))) {
                    final List<String> post_ids = this.post_ids;
                    final List<String> post_ids2 = collection.post_ids;
                    if (post_ids == post_ids2 || (post_ids != null && post_ids.equals(post_ids2))) {
                        final String display_layout = this.display_layout;
                        final String display_layout2 = collection.display_layout;
                        boolean b2 = b;
                        if (display_layout == display_layout2) {
                            return b2;
                        }
                        if (display_layout != null && display_layout.equals(display_layout2)) {
                            b2 = b;
                            return b2;
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
        final String title = this.title;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String author_id = this.author_id;
        int hashCode4;
        if (author_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = author_id.hashCode();
        }
        final List<String> post_ids = this.post_ids;
        int hashCode5;
        if (post_ids == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = post_ids.hashCode();
        }
        final String display_layout = this.display_layout;
        if (display_layout != null) {
            hashCode = display_layout.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostCollection{id=");
        t.append(this.id);
        t.append(", title=");
        t.append(this.title);
        t.append(", author_id=");
        t.append(this.author_id);
        t.append(", post_ids=");
        t.append(this.post_ids);
        t.append(", display_layout=");
        return ph0.a.f(t, this.display_layout, "}");
    }
    
    public void write(final e e) throws IOException {
        PostCollection.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostCollection>
    {
        private String author_id;
        private String display_layout;
        private String id;
        private List<String> post_ids;
        private String title;
        
        public Builder() {
        }
        
        public Builder(final PostCollection collection) {
            this.id = collection.id;
            this.title = collection.title;
            this.author_id = collection.author_id;
            this.post_ids = collection.post_ids;
            this.display_layout = collection.display_layout;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.title;
        }
        
        public static String access$300(final Builder builder) {
            return builder.author_id;
        }
        
        public static List access$400(final Builder builder) {
            return builder.post_ids;
        }
        
        public static String access$500(final Builder builder) {
            return builder.display_layout;
        }
        
        public Builder author_id(final String author_id) {
            this.author_id = author_id;
            return this;
        }
        
        public PostCollection build() {
            return new PostCollection(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder display_layout(final String display_layout) {
            this.display_layout = display_layout;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder post_ids(final List<String> post_ids) {
            this.post_ids = post_ids;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.title = null;
            this.author_id = null;
            this.post_ids = null;
            this.display_layout = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
    }
    
    public static final class PostCollectionAdapter implements a<PostCollection, Builder>
    {
        private PostCollectionAdapter() {
        }
        
        public PostCollectionAdapter(final PostCollection$1 object) {
            this();
        }
        
        public PostCollection read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostCollection read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 4) {
                            if (b != 5) {
                                if (b != 6) {
                                    ht.a.a(e, a);
                                }
                                else if (a == 11) {
                                    builder.display_layout(e.F());
                                }
                                else {
                                    ht.a.a(e, a);
                                }
                            }
                            else if (a == 15) {
                                final c w = e.w();
                                final ArrayList list = new ArrayList(w.b);
                                for (int i = 0; i < w.b; i = k.f(e, list, i, 1)) {}
                                e.x();
                                builder.post_ids((List<String>)list);
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.author_id(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.title(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final PostCollection collection) throws IOException {
            e.X();
            if (collection.id != null) {
                e.O(1, (byte)11);
                e.W(collection.id);
                e.P();
            }
            if (collection.title != null) {
                e.O(2, (byte)11);
                e.W(collection.title);
                e.P();
            }
            if (collection.author_id != null) {
                e.O(4, (byte)11);
                e.W(collection.author_id);
                e.P();
            }
            if (collection.post_ids != null) {
                e.O(5, (byte)15);
                e.U((byte)11, collection.post_ids.size());
                final Iterator<String> iterator = collection.post_ids.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (collection.display_layout != null) {
                e.O(6, (byte)11);
                e.W(collection.display_layout);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostCollection)o);
        }
    }
}
