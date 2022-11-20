// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class ReddarQueue
{
    public static final a<ReddarQueue, ReddarQueue.ReddarQueue$Builder> ADAPTER;
    public final List<String> applied_filters;
    public final String group_type;
    public final String id;
    public final String name;
    public final String priority;
    public final String ticket_type;
    public final String type;
    
    static {
        ADAPTER = (a)new ReddarQueue.ReddarQueue$ReddarQueueAdapter((ReddarQueue$1)null);
    }
    
    private ReddarQueue(final ReddarQueue.ReddarQueue$Builder reddarQueue$Builder) {
        this.id = ReddarQueue.ReddarQueue$Builder.access$100(reddarQueue$Builder);
        this.type = ReddarQueue.ReddarQueue$Builder.access$200(reddarQueue$Builder);
        this.ticket_type = ReddarQueue.ReddarQueue$Builder.access$300(reddarQueue$Builder);
        this.group_type = ReddarQueue.ReddarQueue$Builder.access$400(reddarQueue$Builder);
        this.name = ReddarQueue.ReddarQueue$Builder.access$500(reddarQueue$Builder);
        this.priority = ReddarQueue.ReddarQueue$Builder.access$600(reddarQueue$Builder);
        List<String> unmodifiableList;
        if (ReddarQueue.ReddarQueue$Builder.access$700(reddarQueue$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ReddarQueue.ReddarQueue$Builder.access$700(reddarQueue$Builder));
        }
        this.applied_filters = unmodifiableList;
    }
    
    public ReddarQueue(final ReddarQueue.ReddarQueue$Builder reddarQueue$Builder, final ReddarQueue$1 object) {
        this(reddarQueue$Builder);
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
        if (!(o instanceof ReddarQueue)) {
            return false;
        }
        final ReddarQueue reddarQueue = (ReddarQueue)o;
        final String id = this.id;
        final String id2 = reddarQueue.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String type = this.type;
            final String type2 = reddarQueue.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String ticket_type = this.ticket_type;
                final String ticket_type2 = reddarQueue.ticket_type;
                if (ticket_type == ticket_type2 || (ticket_type != null && ticket_type.equals(ticket_type2))) {
                    final String group_type = this.group_type;
                    final String group_type2 = reddarQueue.group_type;
                    if (group_type == group_type2 || (group_type != null && group_type.equals(group_type2))) {
                        final String name = this.name;
                        final String name2 = reddarQueue.name;
                        if (name == name2 || (name != null && name.equals(name2))) {
                            final String priority = this.priority;
                            final String priority2 = reddarQueue.priority;
                            if (priority == priority2 || (priority != null && priority.equals(priority2))) {
                                final List<String> applied_filters = this.applied_filters;
                                final List<String> applied_filters2 = reddarQueue.applied_filters;
                                boolean b2 = b;
                                if (applied_filters == applied_filters2) {
                                    return b2;
                                }
                                if (applied_filters != null && applied_filters.equals(applied_filters2)) {
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
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String ticket_type = this.ticket_type;
        int hashCode4;
        if (ticket_type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ticket_type.hashCode();
        }
        final String group_type = this.group_type;
        int hashCode5;
        if (group_type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = group_type.hashCode();
        }
        final String name = this.name;
        int hashCode6;
        if (name == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = name.hashCode();
        }
        final String priority = this.priority;
        int hashCode7;
        if (priority == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = priority.hashCode();
        }
        final List<String> applied_filters = this.applied_filters;
        if (applied_filters != null) {
            hashCode = applied_filters.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReddarQueue{id=");
        t.append(this.id);
        t.append(", type=");
        t.append(this.type);
        t.append(", ticket_type=");
        t.append(this.ticket_type);
        t.append(", group_type=");
        t.append(this.group_type);
        t.append(", name=");
        t.append(this.name);
        t.append(", priority=");
        t.append(this.priority);
        t.append(", applied_filters=");
        return a.s(t, (List)this.applied_filters, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarQueue.ADAPTER.write(e, (Object)this);
    }
}
