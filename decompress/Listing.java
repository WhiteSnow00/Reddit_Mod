// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Listing
{
    public static final a<Listing, Builder> ADAPTER;
    public final String aggregator;
    public final String cursor;
    public final String cursor_returned;
    public final Long depth;
    public final String geo_filter;
    public final Long length;
    public final List<String> links;
    public final Long max_rank;
    public final String metadata;
    public final Long min_rank;
    public final String old_sort;
    public final String sort;
    public final String sort_time_filter;
    public final String source;
    
    static {
        ADAPTER = (a)new ListingAdapter(null);
    }
    
    private Listing(final Builder builder) {
        this.length = Builder.access$100(builder);
        List<String> unmodifiableList;
        if (Builder.access$200(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.links = unmodifiableList;
        this.sort = Builder.access$300(builder);
        this.sort_time_filter = Builder.access$400(builder);
        this.min_rank = Builder.access$500(builder);
        this.max_rank = Builder.access$600(builder);
        this.geo_filter = Builder.access$700(builder);
        this.source = Builder.access$800(builder);
        this.old_sort = Builder.access$900(builder);
        this.depth = Builder.access$1000(builder);
        this.cursor = Builder.access$1100(builder);
        this.cursor_returned = Builder.access$1200(builder);
        this.aggregator = Builder.access$1300(builder);
        this.metadata = Builder.access$1400(builder);
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
        if (!(o instanceof Listing)) {
            return false;
        }
        final Listing listing = (Listing)o;
        final Long length = this.length;
        final Long length2 = listing.length;
        if (length == length2 || (length != null && length.equals(length2))) {
            final List<String> links = this.links;
            final List<String> links2 = listing.links;
            if (links == links2 || (links != null && links.equals(links2))) {
                final String sort = this.sort;
                final String sort2 = listing.sort;
                if (sort == sort2 || (sort != null && sort.equals(sort2))) {
                    final String sort_time_filter = this.sort_time_filter;
                    final String sort_time_filter2 = listing.sort_time_filter;
                    if (sort_time_filter == sort_time_filter2 || (sort_time_filter != null && sort_time_filter.equals(sort_time_filter2))) {
                        final Long min_rank = this.min_rank;
                        final Long min_rank2 = listing.min_rank;
                        if (min_rank == min_rank2 || (min_rank != null && min_rank.equals(min_rank2))) {
                            final Long max_rank = this.max_rank;
                            final Long max_rank2 = listing.max_rank;
                            if (max_rank == max_rank2 || (max_rank != null && max_rank.equals(max_rank2))) {
                                final String geo_filter = this.geo_filter;
                                final String geo_filter2 = listing.geo_filter;
                                if (geo_filter == geo_filter2 || (geo_filter != null && geo_filter.equals(geo_filter2))) {
                                    final String source = this.source;
                                    final String source2 = listing.source;
                                    if (source == source2 || (source != null && source.equals(source2))) {
                                        final String old_sort = this.old_sort;
                                        final String old_sort2 = listing.old_sort;
                                        if (old_sort == old_sort2 || (old_sort != null && old_sort.equals(old_sort2))) {
                                            final Long depth = this.depth;
                                            final Long depth2 = listing.depth;
                                            if (depth == depth2 || (depth != null && depth.equals(depth2))) {
                                                final String cursor = this.cursor;
                                                final String cursor2 = listing.cursor;
                                                if (cursor == cursor2 || (cursor != null && cursor.equals(cursor2))) {
                                                    final String cursor_returned = this.cursor_returned;
                                                    final String cursor_returned2 = listing.cursor_returned;
                                                    if (cursor_returned == cursor_returned2 || (cursor_returned != null && cursor_returned.equals(cursor_returned2))) {
                                                        final String aggregator = this.aggregator;
                                                        final String aggregator2 = listing.aggregator;
                                                        if (aggregator == aggregator2 || (aggregator != null && aggregator.equals(aggregator2))) {
                                                            final String metadata = this.metadata;
                                                            final String metadata2 = listing.metadata;
                                                            boolean b2 = b;
                                                            if (metadata == metadata2) {
                                                                return b2;
                                                            }
                                                            if (metadata != null && metadata.equals(metadata2)) {
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
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long length = this.length;
        int hashCode = 0;
        int hashCode2;
        if (length == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = length.hashCode();
        }
        final List<String> links = this.links;
        int hashCode3;
        if (links == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = links.hashCode();
        }
        final String sort = this.sort;
        int hashCode4;
        if (sort == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = sort.hashCode();
        }
        final String sort_time_filter = this.sort_time_filter;
        int hashCode5;
        if (sort_time_filter == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = sort_time_filter.hashCode();
        }
        final Long min_rank = this.min_rank;
        int hashCode6;
        if (min_rank == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = min_rank.hashCode();
        }
        final Long max_rank = this.max_rank;
        int hashCode7;
        if (max_rank == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = max_rank.hashCode();
        }
        final String geo_filter = this.geo_filter;
        int hashCode8;
        if (geo_filter == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = geo_filter.hashCode();
        }
        final String source = this.source;
        int hashCode9;
        if (source == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = source.hashCode();
        }
        final String old_sort = this.old_sort;
        int hashCode10;
        if (old_sort == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = old_sort.hashCode();
        }
        final Long depth = this.depth;
        int hashCode11;
        if (depth == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = depth.hashCode();
        }
        final String cursor = this.cursor;
        int hashCode12;
        if (cursor == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = cursor.hashCode();
        }
        final String cursor_returned = this.cursor_returned;
        int hashCode13;
        if (cursor_returned == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = cursor_returned.hashCode();
        }
        final String aggregator = this.aggregator;
        int hashCode14;
        if (aggregator == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = aggregator.hashCode();
        }
        final String metadata = this.metadata;
        if (metadata != null) {
            hashCode = metadata.hashCode();
        }
        return ((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Listing{length=");
        k.append(this.length);
        k.append(", links=");
        k.append(this.links);
        k.append(", sort=");
        k.append(this.sort);
        k.append(", sort_time_filter=");
        k.append(this.sort_time_filter);
        k.append(", min_rank=");
        k.append(this.min_rank);
        k.append(", max_rank=");
        k.append(this.max_rank);
        k.append(", geo_filter=");
        k.append(this.geo_filter);
        k.append(", source=");
        k.append(this.source);
        k.append(", old_sort=");
        k.append(this.old_sort);
        k.append(", depth=");
        k.append(this.depth);
        k.append(", cursor=");
        k.append(this.cursor);
        k.append(", cursor_returned=");
        k.append(this.cursor_returned);
        k.append(", aggregator=");
        k.append(this.aggregator);
        k.append(", metadata=");
        return b.j(k, this.metadata, "}");
    }
    
    public void write(final e e) throws IOException {
        Listing.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Listing>
    {
        private String aggregator;
        private String cursor;
        private String cursor_returned;
        private Long depth;
        private String geo_filter;
        private Long length;
        private List<String> links;
        private Long max_rank;
        private String metadata;
        private Long min_rank;
        private String old_sort;
        private String sort;
        private String sort_time_filter;
        private String source;
        
        public Builder() {
        }
        
        public Builder(final Listing listing) {
            this.length = listing.length;
            this.links = listing.links;
            this.sort = listing.sort;
            this.sort_time_filter = listing.sort_time_filter;
            this.min_rank = listing.min_rank;
            this.max_rank = listing.max_rank;
            this.geo_filter = listing.geo_filter;
            this.source = listing.source;
            this.old_sort = listing.old_sort;
            this.depth = listing.depth;
            this.cursor = listing.cursor;
            this.cursor_returned = listing.cursor_returned;
            this.aggregator = listing.aggregator;
            this.metadata = listing.metadata;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.length;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.depth;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.cursor;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.cursor_returned;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.aggregator;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.metadata;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.links;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.sort;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.sort_time_filter;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.min_rank;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.max_rank;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.geo_filter;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.source;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.old_sort;
        }
        
        public Builder aggregator(final String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        
        public Listing build() {
            return new Listing(this, null);
        }
        
        public Builder cursor(final String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        public Builder cursor_returned(final String cursor_returned) {
            this.cursor_returned = cursor_returned;
            return this;
        }
        
        public Builder depth(final Long depth) {
            this.depth = depth;
            return this;
        }
        
        public Builder geo_filter(final String geo_filter) {
            this.geo_filter = geo_filter;
            return this;
        }
        
        public Builder length(final Long length) {
            this.length = length;
            return this;
        }
        
        public Builder links(final List<String> links) {
            this.links = links;
            return this;
        }
        
        public Builder max_rank(final Long max_rank) {
            this.max_rank = max_rank;
            return this;
        }
        
        public Builder metadata(final String metadata) {
            this.metadata = metadata;
            return this;
        }
        
        public Builder min_rank(final Long min_rank) {
            this.min_rank = min_rank;
            return this;
        }
        
        public Builder old_sort(final String old_sort) {
            this.old_sort = old_sort;
            return this;
        }
        
        public void reset() {
            this.length = null;
            this.links = null;
            this.sort = null;
            this.sort_time_filter = null;
            this.min_rank = null;
            this.max_rank = null;
            this.geo_filter = null;
            this.source = null;
            this.old_sort = null;
            this.depth = null;
            this.cursor = null;
            this.cursor_returned = null;
            this.aggregator = null;
            this.metadata = null;
        }
        
        public Builder sort(final String sort) {
            this.sort = sort;
            return this;
        }
        
        public Builder sort_time_filter(final String sort_time_filter) {
            this.sort_time_filter = sort_time_filter;
            return this;
        }
        
        public Builder source(final String source) {
            this.source = source;
            return this;
        }
    }
    
    public static final class ListingAdapter implements a<Listing, Builder>
    {
        private ListingAdapter() {
        }
        
        public Listing read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Listing read(final e e, final Builder builder) throws IOException {
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
                    case 14: {
                        if (a == 11) {
                            builder.metadata(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.aggregator(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.cursor_returned(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.cursor(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 10) {
                            builder.depth(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.old_sort(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.geo_filter(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.max_rank(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.min_rank(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.sort_time_filter(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.sort(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.links((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 10) {
                            builder.length(e.v());
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
        
        public void write(final e e, final Listing listing) throws IOException {
            e.a0();
            if (listing.length != null) {
                e.N(1, (byte)10);
                a.r(listing.length, e);
            }
            if (listing.links != null) {
                e.N(2, (byte)15);
                e.V((byte)11, listing.links.size());
                final Iterator<String> iterator = listing.links.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (listing.sort != null) {
                e.N(3, (byte)11);
                e.Z(listing.sort);
                e.O();
            }
            if (listing.sort_time_filter != null) {
                e.N(4, (byte)11);
                e.Z(listing.sort_time_filter);
                e.O();
            }
            if (listing.min_rank != null) {
                e.N(5, (byte)10);
                a.r(listing.min_rank, e);
            }
            if (listing.max_rank != null) {
                e.N(6, (byte)10);
                a.r(listing.max_rank, e);
            }
            if (listing.geo_filter != null) {
                e.N(7, (byte)11);
                e.Z(listing.geo_filter);
                e.O();
            }
            if (listing.source != null) {
                e.N(8, (byte)11);
                e.Z(listing.source);
                e.O();
            }
            if (listing.old_sort != null) {
                e.N(9, (byte)11);
                e.Z(listing.old_sort);
                e.O();
            }
            if (listing.depth != null) {
                e.N(10, (byte)10);
                a.r(listing.depth, e);
            }
            if (listing.cursor != null) {
                e.N(11, (byte)11);
                e.Z(listing.cursor);
                e.O();
            }
            if (listing.cursor_returned != null) {
                e.N(12, (byte)11);
                e.Z(listing.cursor_returned);
                e.O();
            }
            if (listing.aggregator != null) {
                e.N(13, (byte)11);
                e.Z(listing.aggregator);
                e.O();
            }
            if (listing.metadata != null) {
                e.N(14, (byte)11);
                e.Z(listing.metadata);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
