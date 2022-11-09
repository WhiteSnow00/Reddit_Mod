// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class CommentsLoad
{
    public static final a<CommentsLoad, CommentsLoad.CommentsLoad$Builder> ADAPTER;
    public final Long fetch_millis;
    public final Long fetch_truncated_millis;
    public final Long viewable_millis;
    public final Long viewable_truncated_millis;
    
    static {
        ADAPTER = (a)new CommentsLoad.CommentsLoad$CommentsLoadAdapter((CommentsLoad$1)null);
    }
    
    private CommentsLoad(final CommentsLoad.CommentsLoad$Builder commentsLoad$Builder) {
        this.fetch_millis = CommentsLoad.CommentsLoad$Builder.access$100(commentsLoad$Builder);
        this.fetch_truncated_millis = CommentsLoad.CommentsLoad$Builder.access$200(commentsLoad$Builder);
        this.viewable_millis = CommentsLoad.CommentsLoad$Builder.access$300(commentsLoad$Builder);
        this.viewable_truncated_millis = CommentsLoad.CommentsLoad$Builder.access$400(commentsLoad$Builder);
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
        if (!(o instanceof CommentsLoad)) {
            return false;
        }
        final CommentsLoad commentsLoad = (CommentsLoad)o;
        final Long fetch_millis = this.fetch_millis;
        final Long fetch_millis2 = commentsLoad.fetch_millis;
        if (fetch_millis == fetch_millis2 || (fetch_millis != null && fetch_millis.equals(fetch_millis2))) {
            final Long fetch_truncated_millis = this.fetch_truncated_millis;
            final Long fetch_truncated_millis2 = commentsLoad.fetch_truncated_millis;
            if (fetch_truncated_millis == fetch_truncated_millis2 || (fetch_truncated_millis != null && fetch_truncated_millis.equals(fetch_truncated_millis2))) {
                final Long viewable_millis = this.viewable_millis;
                final Long viewable_millis2 = commentsLoad.viewable_millis;
                if (viewable_millis == viewable_millis2 || (viewable_millis != null && viewable_millis.equals(viewable_millis2))) {
                    final Long viewable_truncated_millis = this.viewable_truncated_millis;
                    final Long viewable_truncated_millis2 = commentsLoad.viewable_truncated_millis;
                    boolean b2 = b;
                    if (viewable_truncated_millis == viewable_truncated_millis2) {
                        return b2;
                    }
                    if (viewable_truncated_millis != null && viewable_truncated_millis.equals(viewable_truncated_millis2)) {
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
        final Long fetch_millis = this.fetch_millis;
        int hashCode = 0;
        int hashCode2;
        if (fetch_millis == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = fetch_millis.hashCode();
        }
        final Long fetch_truncated_millis = this.fetch_truncated_millis;
        int hashCode3;
        if (fetch_truncated_millis == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = fetch_truncated_millis.hashCode();
        }
        final Long viewable_millis = this.viewable_millis;
        int hashCode4;
        if (viewable_millis == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = viewable_millis.hashCode();
        }
        final Long viewable_truncated_millis = this.viewable_truncated_millis;
        if (viewable_truncated_millis != null) {
            hashCode = viewable_truncated_millis.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommentsLoad{fetch_millis=");
        k.append(this.fetch_millis);
        k.append(", fetch_truncated_millis=");
        k.append(this.fetch_truncated_millis);
        k.append(", viewable_millis=");
        k.append(this.viewable_millis);
        k.append(", viewable_truncated_millis=");
        return a.h(k, this.viewable_truncated_millis, "}");
    }
    
    public void write(final e e) throws IOException {
        CommentsLoad.ADAPTER.write(e, (Object)this);
    }
}
