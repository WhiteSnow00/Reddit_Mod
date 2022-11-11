// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Widget
{
    public static final a<Widget, Widget.Widget$Builder> ADAPTER;
    public final String target_subreddit_id;
    public final String target_subreddit_name;
    public final String type;
    
    static {
        ADAPTER = (a)new Widget.Widget$WidgetAdapter((Widget$1)null);
    }
    
    private Widget(final Widget.Widget$Builder widget$Builder) {
        this.target_subreddit_name = Widget.Widget$Builder.access$100(widget$Builder);
        this.target_subreddit_id = Widget.Widget$Builder.access$200(widget$Builder);
        this.type = Widget.Widget$Builder.access$300(widget$Builder);
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
        if (!(o instanceof Widget)) {
            return false;
        }
        final Widget widget = (Widget)o;
        final String target_subreddit_name = this.target_subreddit_name;
        final String target_subreddit_name2 = widget.target_subreddit_name;
        if (target_subreddit_name == target_subreddit_name2 || (target_subreddit_name != null && target_subreddit_name.equals(target_subreddit_name2))) {
            final String target_subreddit_id = this.target_subreddit_id;
            final String target_subreddit_id2 = widget.target_subreddit_id;
            if (target_subreddit_id == target_subreddit_id2 || (target_subreddit_id != null && target_subreddit_id.equals(target_subreddit_id2))) {
                final String type = this.type;
                final String type2 = widget.type;
                boolean b2 = b;
                if (type == type2) {
                    return b2;
                }
                if (type != null && type.equals(type2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String target_subreddit_name = this.target_subreddit_name;
        int hashCode = 0;
        int hashCode2;
        if (target_subreddit_name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = target_subreddit_name.hashCode();
        }
        final String target_subreddit_id = this.target_subreddit_id;
        int hashCode3;
        if (target_subreddit_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = target_subreddit_id.hashCode();
        }
        final String type = this.type;
        if (type != null) {
            hashCode = type.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Widget{target_subreddit_name=");
        r.append(this.target_subreddit_name);
        r.append(", target_subreddit_id=");
        r.append(this.target_subreddit_id);
        r.append(", type=");
        return a.o(r, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Widget.ADAPTER.write(e, (Object)this);
    }
}
