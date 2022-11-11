// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class MetaSearch
{
    public static final a<MetaSearch, Builder> ADAPTER;
    public final String display_query;
    public final String meta_flair_id;
    public final String meta_flair_name;
    public final Integer number_current_window;
    public final Integer number_previous_window;
    public final String post_flair_name;
    public final String range;
    public final String raw_query;
    public final String sort;
    public final String structure_type;
    public final String subreddit_id;
    public final String subreddit_name;
    
    static {
        ADAPTER = (a)new MetaSearchAdapter(null);
    }
    
    private MetaSearch(final Builder builder) {
        this.display_query = Builder.access$100(builder);
        this.raw_query = Builder.access$200(builder);
        this.structure_type = Builder.access$300(builder);
        this.sort = Builder.access$400(builder);
        this.range = Builder.access$500(builder);
        this.subreddit_id = Builder.access$600(builder);
        this.subreddit_name = Builder.access$700(builder);
        this.post_flair_name = Builder.access$800(builder);
        this.meta_flair_id = Builder.access$900(builder);
        this.meta_flair_name = Builder.access$1000(builder);
        this.number_previous_window = Builder.access$1100(builder);
        this.number_current_window = Builder.access$1200(builder);
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
        if (!(o instanceof MetaSearch)) {
            return false;
        }
        final MetaSearch metaSearch = (MetaSearch)o;
        final String display_query = this.display_query;
        final String display_query2 = metaSearch.display_query;
        if (display_query == display_query2 || (display_query != null && display_query.equals(display_query2))) {
            final String raw_query = this.raw_query;
            final String raw_query2 = metaSearch.raw_query;
            if (raw_query == raw_query2 || (raw_query != null && raw_query.equals(raw_query2))) {
                final String structure_type = this.structure_type;
                final String structure_type2 = metaSearch.structure_type;
                if (structure_type == structure_type2 || structure_type.equals(structure_type2)) {
                    final String sort = this.sort;
                    final String sort2 = metaSearch.sort;
                    if (sort == sort2 || (sort != null && sort.equals(sort2))) {
                        final String range = this.range;
                        final String range2 = metaSearch.range;
                        if (range == range2 || (range != null && range.equals(range2))) {
                            final String subreddit_id = this.subreddit_id;
                            final String subreddit_id2 = metaSearch.subreddit_id;
                            if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                                final String subreddit_name = this.subreddit_name;
                                final String subreddit_name2 = metaSearch.subreddit_name;
                                if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                                    final String post_flair_name = this.post_flair_name;
                                    final String post_flair_name2 = metaSearch.post_flair_name;
                                    if (post_flair_name == post_flair_name2 || (post_flair_name != null && post_flair_name.equals(post_flair_name2))) {
                                        final String meta_flair_id = this.meta_flair_id;
                                        final String meta_flair_id2 = metaSearch.meta_flair_id;
                                        if (meta_flair_id == meta_flair_id2 || (meta_flair_id != null && meta_flair_id.equals(meta_flair_id2))) {
                                            final String meta_flair_name = this.meta_flair_name;
                                            final String meta_flair_name2 = metaSearch.meta_flair_name;
                                            if (meta_flair_name == meta_flair_name2 || (meta_flair_name != null && meta_flair_name.equals(meta_flair_name2))) {
                                                final Integer number_previous_window = this.number_previous_window;
                                                final Integer number_previous_window2 = metaSearch.number_previous_window;
                                                if (number_previous_window == number_previous_window2 || (number_previous_window != null && number_previous_window.equals(number_previous_window2))) {
                                                    final Integer number_current_window = this.number_current_window;
                                                    final Integer number_current_window2 = metaSearch.number_current_window;
                                                    boolean b2 = b;
                                                    if (number_current_window == number_current_window2) {
                                                        return b2;
                                                    }
                                                    if (number_current_window != null && number_current_window.equals(number_current_window2)) {
                                                        b2 = b;
                                                        return b2;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        final String display_query = this.display_query;
        int hashCode = 0;
        int hashCode2;
        if (display_query == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = display_query.hashCode();
        }
        final String raw_query = this.raw_query;
        int hashCode3;
        if (raw_query == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = raw_query.hashCode();
        }
        final int hashCode4 = this.structure_type.hashCode();
        final String sort = this.sort;
        int hashCode5;
        if (sort == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = sort.hashCode();
        }
        final String range = this.range;
        int hashCode6;
        if (range == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = range.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        int hashCode7;
        if (subreddit_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subreddit_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode8;
        if (subreddit_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = subreddit_name.hashCode();
        }
        final String post_flair_name = this.post_flair_name;
        int hashCode9;
        if (post_flair_name == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = post_flair_name.hashCode();
        }
        final String meta_flair_id = this.meta_flair_id;
        int hashCode10;
        if (meta_flair_id == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = meta_flair_id.hashCode();
        }
        final String meta_flair_name = this.meta_flair_name;
        int hashCode11;
        if (meta_flair_name == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = meta_flair_name.hashCode();
        }
        final Integer number_previous_window = this.number_previous_window;
        int hashCode12;
        if (number_previous_window == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = number_previous_window.hashCode();
        }
        final Integer number_current_window = this.number_current_window;
        if (number_current_window != null) {
            hashCode = number_current_window.hashCode();
        }
        return ((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MetaSearch{display_query=");
        k.append(this.display_query);
        k.append(", raw_query=");
        k.append(this.raw_query);
        k.append(", structure_type=");
        k.append(this.structure_type);
        k.append(", sort=");
        k.append(this.sort);
        k.append(", range=");
        k.append(this.range);
        k.append(", subreddit_id=");
        k.append(this.subreddit_id);
        k.append(", subreddit_name=");
        k.append(this.subreddit_name);
        k.append(", post_flair_name=");
        k.append(this.post_flair_name);
        k.append(", meta_flair_id=");
        k.append(this.meta_flair_id);
        k.append(", meta_flair_name=");
        k.append(this.meta_flair_name);
        k.append(", number_previous_window=");
        k.append(this.number_previous_window);
        k.append(", number_current_window=");
        k.append(this.number_current_window);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        MetaSearch.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<MetaSearch>
    {
        private String display_query;
        private String meta_flair_id;
        private String meta_flair_name;
        private Integer number_current_window;
        private Integer number_previous_window;
        private String post_flair_name;
        private String range;
        private String raw_query;
        private String sort;
        private String structure_type;
        private String subreddit_id;
        private String subreddit_name;
        
        public Builder() {
        }
        
        public Builder(final MetaSearch metaSearch) {
            this.display_query = metaSearch.display_query;
            this.raw_query = metaSearch.raw_query;
            this.structure_type = metaSearch.structure_type;
            this.sort = metaSearch.sort;
            this.range = metaSearch.range;
            this.subreddit_id = metaSearch.subreddit_id;
            this.subreddit_name = metaSearch.subreddit_name;
            this.post_flair_name = metaSearch.post_flair_name;
            this.meta_flair_id = metaSearch.meta_flair_id;
            this.meta_flair_name = metaSearch.meta_flair_name;
            this.number_previous_window = metaSearch.number_previous_window;
            this.number_current_window = metaSearch.number_current_window;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.display_query;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.meta_flair_name;
        }
        
        public static /* synthetic */ Integer access$1100(final Builder builder) {
            return builder.number_previous_window;
        }
        
        public static /* synthetic */ Integer access$1200(final Builder builder) {
            return builder.number_current_window;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.raw_query;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.structure_type;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.sort;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.range;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.subreddit_name;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.post_flair_name;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.meta_flair_id;
        }
        
        public MetaSearch build() {
            if (this.structure_type != null) {
                return new MetaSearch(this, null);
            }
            throw new IllegalStateException("Required field 'structure_type' is missing");
        }
        
        public Builder display_query(final String display_query) {
            this.display_query = display_query;
            return this;
        }
        
        public Builder meta_flair_id(final String meta_flair_id) {
            this.meta_flair_id = meta_flair_id;
            return this;
        }
        
        public Builder meta_flair_name(final String meta_flair_name) {
            this.meta_flair_name = meta_flair_name;
            return this;
        }
        
        public Builder number_current_window(final Integer number_current_window) {
            this.number_current_window = number_current_window;
            return this;
        }
        
        public Builder number_previous_window(final Integer number_previous_window) {
            this.number_previous_window = number_previous_window;
            return this;
        }
        
        public Builder post_flair_name(final String post_flair_name) {
            this.post_flair_name = post_flair_name;
            return this;
        }
        
        public Builder range(final String range) {
            this.range = range;
            return this;
        }
        
        public Builder raw_query(final String raw_query) {
            this.raw_query = raw_query;
            return this;
        }
        
        public void reset() {
            this.display_query = null;
            this.raw_query = null;
            this.structure_type = null;
            this.sort = null;
            this.range = null;
            this.subreddit_id = null;
            this.subreddit_name = null;
            this.post_flair_name = null;
            this.meta_flair_id = null;
            this.meta_flair_name = null;
            this.number_previous_window = null;
            this.number_current_window = null;
        }
        
        public Builder sort(final String sort) {
            this.sort = sort;
            return this;
        }
        
        public Builder structure_type(final String structure_type) {
            if (structure_type != null) {
                this.structure_type = structure_type;
                return this;
            }
            throw new NullPointerException("Required field 'structure_type' cannot be null");
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder subreddit_name(final String subreddit_name) {
            this.subreddit_name = subreddit_name;
            return this;
        }
    }
    
    public static final class MetaSearchAdapter implements a<MetaSearch, Builder>
    {
        private MetaSearchAdapter() {
        }
        
        public MetaSearch read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public MetaSearch read(final e e, final Builder builder) throws IOException {
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
                    case 12: {
                        if (a == 8) {
                            builder.number_current_window(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 8) {
                            builder.number_previous_window(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.meta_flair_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.meta_flair_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.post_flair_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.subreddit_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.range(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.sort(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.structure_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.raw_query(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.display_query(e.F());
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
        
        public void write(final e e, final MetaSearch metaSearch) throws IOException {
            e.a0();
            if (metaSearch.display_query != null) {
                e.N(1, (byte)11);
                e.Z(metaSearch.display_query);
                e.O();
            }
            if (metaSearch.raw_query != null) {
                e.N(2, (byte)11);
                e.Z(metaSearch.raw_query);
                e.O();
            }
            e.N(3, (byte)11);
            e.Z(metaSearch.structure_type);
            e.O();
            if (metaSearch.sort != null) {
                e.N(4, (byte)11);
                e.Z(metaSearch.sort);
                e.O();
            }
            if (metaSearch.range != null) {
                e.N(5, (byte)11);
                e.Z(metaSearch.range);
                e.O();
            }
            if (metaSearch.subreddit_id != null) {
                e.N(6, (byte)11);
                e.Z(metaSearch.subreddit_id);
                e.O();
            }
            if (metaSearch.subreddit_name != null) {
                e.N(7, (byte)11);
                e.Z(metaSearch.subreddit_name);
                e.O();
            }
            if (metaSearch.post_flair_name != null) {
                e.N(8, (byte)11);
                e.Z(metaSearch.post_flair_name);
                e.O();
            }
            if (metaSearch.meta_flair_id != null) {
                e.N(9, (byte)11);
                e.Z(metaSearch.meta_flair_id);
                e.O();
            }
            if (metaSearch.meta_flair_name != null) {
                e.N(10, (byte)11);
                e.Z(metaSearch.meta_flair_name);
                e.O();
            }
            if (metaSearch.number_previous_window != null) {
                e.N(11, (byte)8);
                b.r(metaSearch.number_previous_window, e);
            }
            if (metaSearch.number_current_window != null) {
                e.N(12, (byte)8);
                b.r(metaSearch.number_current_window, e);
            }
            e.P();
            e.b0();
        }
    }
}
