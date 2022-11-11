// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import al0.g7;
import java.util.Collections;
import java.util.List;
import et.a;

public final class ViewStats
{
    public static final a<ViewStats, ViewStats.ViewStats$Builder> ADAPTER;
    public final List<String> comments_consumed_list;
    public final List<String> comments_viewed_list;
    public final Long num_comments_consumed;
    public final Long num_comments_viewed;
    
    static {
        ADAPTER = (a)new ViewStats.ViewStats$ViewStatsAdapter((ViewStats$1)null);
    }
    
    private ViewStats(final ViewStats.ViewStats$Builder viewStats$Builder) {
        this.num_comments_viewed = ViewStats.ViewStats$Builder.access$100(viewStats$Builder);
        final List access$200 = ViewStats.ViewStats$Builder.access$200(viewStats$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ViewStats.ViewStats$Builder.access$200(viewStats$Builder));
        }
        this.comments_viewed_list = unmodifiableList;
        this.num_comments_consumed = ViewStats.ViewStats$Builder.access$300(viewStats$Builder);
        List<String> unmodifiableList2;
        if (ViewStats.ViewStats$Builder.access$400(viewStats$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)ViewStats.ViewStats$Builder.access$400(viewStats$Builder));
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
        final StringBuilder r = a.r("ViewStats{num_comments_viewed=");
        r.append(this.num_comments_viewed);
        r.append(", comments_viewed_list=");
        r.append(this.comments_viewed_list);
        r.append(", num_comments_consumed=");
        r.append(this.num_comments_consumed);
        r.append(", comments_consumed_list=");
        return g7.k(r, (List)this.comments_consumed_list, "}");
    }
    
    public void write(final e e) throws IOException {
        ViewStats.ADAPTER.write(e, (Object)this);
    }
}
