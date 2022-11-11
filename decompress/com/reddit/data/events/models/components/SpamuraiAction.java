// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class SpamuraiAction
{
    public static final a<SpamuraiAction, SpamuraiAction.SpamuraiAction$Builder> ADAPTER;
    public final String channel;
    public final Boolean is_ban_all;
    public final Boolean is_mark_for_alt_tracking;
    public final Boolean is_unapprovable;
    public final Boolean is_unban_all;
    public final String task_name;
    public final String task_version;
    public final String thing_id;
    
    static {
        ADAPTER = (a)new SpamuraiAction.SpamuraiAction$SpamuraiActionAdapter((SpamuraiAction$1)null);
    }
    
    private SpamuraiAction(final SpamuraiAction.SpamuraiAction$Builder spamuraiAction$Builder) {
        this.task_name = SpamuraiAction.SpamuraiAction$Builder.access$100(spamuraiAction$Builder);
        this.task_version = SpamuraiAction.SpamuraiAction$Builder.access$200(spamuraiAction$Builder);
        this.thing_id = SpamuraiAction.SpamuraiAction$Builder.access$300(spamuraiAction$Builder);
        this.is_unapprovable = SpamuraiAction.SpamuraiAction$Builder.access$400(spamuraiAction$Builder);
        this.is_ban_all = SpamuraiAction.SpamuraiAction$Builder.access$500(spamuraiAction$Builder);
        this.is_mark_for_alt_tracking = SpamuraiAction.SpamuraiAction$Builder.access$600(spamuraiAction$Builder);
        this.is_unban_all = SpamuraiAction.SpamuraiAction$Builder.access$700(spamuraiAction$Builder);
        this.channel = SpamuraiAction.SpamuraiAction$Builder.access$800(spamuraiAction$Builder);
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
        if (!(o instanceof SpamuraiAction)) {
            return false;
        }
        final SpamuraiAction spamuraiAction = (SpamuraiAction)o;
        final String task_name = this.task_name;
        final String task_name2 = spamuraiAction.task_name;
        if (task_name == task_name2 || (task_name != null && task_name.equals(task_name2))) {
            final String task_version = this.task_version;
            final String task_version2 = spamuraiAction.task_version;
            if (task_version == task_version2 || (task_version != null && task_version.equals(task_version2))) {
                final String thing_id = this.thing_id;
                final String thing_id2 = spamuraiAction.thing_id;
                if (thing_id == thing_id2 || (thing_id != null && thing_id.equals(thing_id2))) {
                    final Boolean is_unapprovable = this.is_unapprovable;
                    final Boolean is_unapprovable2 = spamuraiAction.is_unapprovable;
                    if (is_unapprovable == is_unapprovable2 || (is_unapprovable != null && is_unapprovable.equals(is_unapprovable2))) {
                        final Boolean is_ban_all = this.is_ban_all;
                        final Boolean is_ban_all2 = spamuraiAction.is_ban_all;
                        if (is_ban_all == is_ban_all2 || (is_ban_all != null && is_ban_all.equals(is_ban_all2))) {
                            final Boolean is_mark_for_alt_tracking = this.is_mark_for_alt_tracking;
                            final Boolean is_mark_for_alt_tracking2 = spamuraiAction.is_mark_for_alt_tracking;
                            if (is_mark_for_alt_tracking == is_mark_for_alt_tracking2 || (is_mark_for_alt_tracking != null && is_mark_for_alt_tracking.equals(is_mark_for_alt_tracking2))) {
                                final Boolean is_unban_all = this.is_unban_all;
                                final Boolean is_unban_all2 = spamuraiAction.is_unban_all;
                                if (is_unban_all == is_unban_all2 || (is_unban_all != null && is_unban_all.equals(is_unban_all2))) {
                                    final String channel = this.channel;
                                    final String channel2 = spamuraiAction.channel;
                                    boolean b2 = b;
                                    if (channel == channel2) {
                                        return b2;
                                    }
                                    if (channel != null && channel.equals(channel2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String task_name = this.task_name;
        int hashCode = 0;
        int hashCode2;
        if (task_name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = task_name.hashCode();
        }
        final String task_version = this.task_version;
        int hashCode3;
        if (task_version == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = task_version.hashCode();
        }
        final String thing_id = this.thing_id;
        int hashCode4;
        if (thing_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = thing_id.hashCode();
        }
        final Boolean is_unapprovable = this.is_unapprovable;
        int hashCode5;
        if (is_unapprovable == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = is_unapprovable.hashCode();
        }
        final Boolean is_ban_all = this.is_ban_all;
        int hashCode6;
        if (is_ban_all == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = is_ban_all.hashCode();
        }
        final Boolean is_mark_for_alt_tracking = this.is_mark_for_alt_tracking;
        int hashCode7;
        if (is_mark_for_alt_tracking == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = is_mark_for_alt_tracking.hashCode();
        }
        final Boolean is_unban_all = this.is_unban_all;
        int hashCode8;
        if (is_unban_all == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = is_unban_all.hashCode();
        }
        final String channel = this.channel;
        if (channel != null) {
            hashCode = channel.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SpamuraiAction{task_name=");
        r.append(this.task_name);
        r.append(", task_version=");
        r.append(this.task_version);
        r.append(", thing_id=");
        r.append(this.thing_id);
        r.append(", is_unapprovable=");
        r.append(this.is_unapprovable);
        r.append(", is_ban_all=");
        r.append(this.is_ban_all);
        r.append(", is_mark_for_alt_tracking=");
        r.append(this.is_mark_for_alt_tracking);
        r.append(", is_unban_all=");
        r.append(this.is_unban_all);
        r.append(", channel=");
        return a.o(r, this.channel, "}");
    }
    
    public void write(final e e) throws IOException {
        SpamuraiAction.ADAPTER.write(e, (Object)this);
    }
}
