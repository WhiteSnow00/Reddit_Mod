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
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class ViewStats
{
    public static final a<ViewStats, Builder> ADAPTER;
    public final List<String> comments_consumed_list;
    public final List<String> comments_viewed_list;
    public final Long num_comments_consumed;
    public final Long num_comments_viewed;
    
    static {
        ADAPTER = (a)new ViewStatsAdapter(null);
    }
    
    private ViewStats(final Builder builder) {
        this.num_comments_viewed = Builder.access$100(builder);
        final List access$200 = Builder.access$200(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.comments_viewed_list = unmodifiableList;
        this.num_comments_consumed = Builder.access$300(builder);
        List<String> unmodifiableList2;
        if (Builder.access$400(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$400(builder));
        }
        this.comments_consumed_list = unmodifiableList2;
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
        if (!(o instanceof ViewStats)) {
            return false;
        }
        final ViewStats viewStats = (ViewStats)o;
        final Long num_comments_viewed = this.num_comments_viewed;
        final Long num_comments_viewed2 = viewStats.num_comments_viewed;
        if (num_comments_viewed == num_comments_viewed2 || (num_comments_viewed != null && num_comments_viewed.equals(num_comments_viewed2))) {
            final List<String> comments_viewed_list = this.comments_viewed_list;
            final List<String> comments_viewed_list2 = viewStats.comments_viewed_list;
            if (comments_viewed_list == comments_viewed_list2 || (comments_viewed_list != null && comments_viewed_list.equals(comments_viewed_list2))) {
                final Long num_comments_consumed = this.num_comments_consumed;
                final Long num_comments_consumed2 = viewStats.num_comments_consumed;
                if (num_comments_consumed == num_comments_consumed2 || (num_comments_consumed != null && num_comments_consumed.equals(num_comments_consumed2))) {
                    final List<String> comments_consumed_list = this.comments_consumed_list;
                    final List<String> comments_consumed_list2 = viewStats.comments_consumed_list;
                    boolean b2 = b;
                    if (comments_consumed_list == comments_consumed_list2) {
                        return b2;
                    }
                    if (comments_consumed_list != null && comments_consumed_list.equals(comments_consumed_list2)) {
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
        final Long num_comments_viewed = this.num_comments_viewed;
        int hashCode = 0;
        int hashCode2;
        if (num_comments_viewed == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = num_comments_viewed.hashCode();
        }
        final List<String> comments_viewed_list = this.comments_viewed_list;
        int hashCode3;
        if (comments_viewed_list == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = comments_viewed_list.hashCode();
        }
        final Long num_comments_consumed = this.num_comments_consumed;
        int hashCode4;
        if (num_comments_consumed == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = num_comments_consumed.hashCode();
        }
        final List<String> comments_consumed_list = this.comments_consumed_list;
        if (comments_consumed_list != null) {
            hashCode = comments_consumed_list.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ViewStats{num_comments_viewed=");
        k.append(this.num_comments_viewed);
        k.append(", comments_viewed_list=");
        k.append(this.comments_viewed_list);
        k.append(", num_comments_consumed=");
        k.append(this.num_comments_consumed);
        k.append(", comments_consumed_list=");
        return n.r(k, (List)this.comments_consumed_list, "}");
    }
    
    public void write(final e e) throws IOException {
        ViewStats.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ViewStats>
    {
        private List<String> comments_consumed_list;
        private List<String> comments_viewed_list;
        private Long num_comments_consumed;
        private Long num_comments_viewed;
        
        public Builder() {
        }
        
        public Builder(final ViewStats viewStats) {
            this.num_comments_viewed = viewStats.num_comments_viewed;
            this.comments_viewed_list = viewStats.comments_viewed_list;
            this.num_comments_consumed = viewStats.num_comments_consumed;
            this.comments_consumed_list = viewStats.comments_consumed_list;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.num_comments_viewed;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.comments_viewed_list;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.num_comments_consumed;
        }
        
        public static /* synthetic */ List access$400(final Builder builder) {
            return builder.comments_consumed_list;
        }
        
        public ViewStats build() {
            return new ViewStats(this, null);
        }
        
        public Builder comments_consumed_list(final List<String> comments_consumed_list) {
            this.comments_consumed_list = comments_consumed_list;
            return this;
        }
        
        public Builder comments_viewed_list(final List<String> comments_viewed_list) {
            this.comments_viewed_list = comments_viewed_list;
            return this;
        }
        
        public Builder num_comments_consumed(final Long num_comments_consumed) {
            this.num_comments_consumed = num_comments_consumed;
            return this;
        }
        
        public Builder num_comments_viewed(final Long num_comments_viewed) {
            this.num_comments_viewed = num_comments_viewed;
            return this;
        }
        
        public void reset() {
            this.num_comments_viewed = null;
            this.comments_viewed_list = null;
            this.num_comments_consumed = null;
            this.comments_consumed_list = null;
        }
    }
    
    public static final class ViewStatsAdapter implements a<ViewStats, Builder>
    {
        private ViewStatsAdapter() {
        }
        
        public ViewStats read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ViewStats read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    final int n = 0;
                    int i = 0;
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                mt.a.a(e, a);
                            }
                            else if (a == 15) {
                                c w;
                                ArrayList list;
                                for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                                e.x();
                                builder.comments_consumed_list((List<String>)list);
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 10) {
                            builder.num_comments_consumed(e.v());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 15) {
                        final c w2 = e.w();
                        final ArrayList list2 = new ArrayList(w2.b);
                        for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                        e.x();
                        builder.comments_viewed_list((List<String>)list2);
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 10) {
                    builder.num_comments_viewed(e.v());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final ViewStats viewStats) throws IOException {
            e.a0();
            if (viewStats.num_comments_viewed != null) {
                e.N(1, (byte)10);
                a.r(viewStats.num_comments_viewed, e);
            }
            if (viewStats.comments_viewed_list != null) {
                e.N(2, (byte)15);
                e.V((byte)11, viewStats.comments_viewed_list.size());
                final Iterator<String> iterator = viewStats.comments_viewed_list.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (viewStats.num_comments_consumed != null) {
                e.N(3, (byte)10);
                a.r(viewStats.num_comments_consumed, e);
            }
            if (viewStats.comments_consumed_list != null) {
                e.N(4, (byte)15);
                e.V((byte)11, viewStats.comments_consumed_list.size());
                final Iterator<String> iterator2 = viewStats.comments_consumed_list.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
