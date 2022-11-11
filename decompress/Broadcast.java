// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class Broadcast
{
    public static final a<Broadcast, Broadcast.Broadcast$Builder> ADAPTER;
    public final Long concurrent_user_count;
    public final Long current_age_limit;
    public final Long current_hard_limit;
    public final Long current_karma_limit;
    public final Long duration_ms;
    public final Long heartbeat_length_ms;
    public final Long max_concurrent_watchers;
    public final String stream_state;
    public final Long time_added_ms;
    public final Long time_remaining_ms;
    public final Long unique_watchers;
    public final Long user_account_age;
    public final Long user_karma;
    
    static {
        ADAPTER = (a)new Broadcast.Broadcast$BroadcastAdapter((Broadcast$1)null);
    }
    
    private Broadcast(final Broadcast.Broadcast$Builder broadcast$Builder) {
        this.unique_watchers = Broadcast.Broadcast$Builder.access$100(broadcast$Builder);
        this.max_concurrent_watchers = Broadcast.Broadcast$Builder.access$200(broadcast$Builder);
        this.duration_ms = Broadcast.Broadcast$Builder.access$300(broadcast$Builder);
        this.time_remaining_ms = Broadcast.Broadcast$Builder.access$400(broadcast$Builder);
        this.time_added_ms = Broadcast.Broadcast$Builder.access$500(broadcast$Builder);
        this.stream_state = Broadcast.Broadcast$Builder.access$600(broadcast$Builder);
        this.heartbeat_length_ms = Broadcast.Broadcast$Builder.access$700(broadcast$Builder);
        this.concurrent_user_count = Broadcast.Broadcast$Builder.access$800(broadcast$Builder);
        this.current_hard_limit = Broadcast.Broadcast$Builder.access$900(broadcast$Builder);
        this.user_karma = Broadcast.Broadcast$Builder.access$1000(broadcast$Builder);
        this.current_karma_limit = Broadcast.Broadcast$Builder.access$1100(broadcast$Builder);
        this.user_account_age = Broadcast.Broadcast$Builder.access$1200(broadcast$Builder);
        this.current_age_limit = Broadcast.Broadcast$Builder.access$1300(broadcast$Builder);
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
        if (!(o instanceof Broadcast)) {
            return false;
        }
        final Broadcast broadcast = (Broadcast)o;
        final Long unique_watchers = this.unique_watchers;
        final Long unique_watchers2 = broadcast.unique_watchers;
        if (unique_watchers == unique_watchers2 || (unique_watchers != null && unique_watchers.equals(unique_watchers2))) {
            final Long max_concurrent_watchers = this.max_concurrent_watchers;
            final Long max_concurrent_watchers2 = broadcast.max_concurrent_watchers;
            if (max_concurrent_watchers == max_concurrent_watchers2 || (max_concurrent_watchers != null && max_concurrent_watchers.equals(max_concurrent_watchers2))) {
                final Long duration_ms = this.duration_ms;
                final Long duration_ms2 = broadcast.duration_ms;
                if (duration_ms == duration_ms2 || (duration_ms != null && duration_ms.equals(duration_ms2))) {
                    final Long time_remaining_ms = this.time_remaining_ms;
                    final Long time_remaining_ms2 = broadcast.time_remaining_ms;
                    if (time_remaining_ms == time_remaining_ms2 || (time_remaining_ms != null && time_remaining_ms.equals(time_remaining_ms2))) {
                        final Long time_added_ms = this.time_added_ms;
                        final Long time_added_ms2 = broadcast.time_added_ms;
                        if (time_added_ms == time_added_ms2 || (time_added_ms != null && time_added_ms.equals(time_added_ms2))) {
                            final String stream_state = this.stream_state;
                            final String stream_state2 = broadcast.stream_state;
                            if (stream_state == stream_state2 || (stream_state != null && stream_state.equals(stream_state2))) {
                                final Long heartbeat_length_ms = this.heartbeat_length_ms;
                                final Long heartbeat_length_ms2 = broadcast.heartbeat_length_ms;
                                if (heartbeat_length_ms == heartbeat_length_ms2 || (heartbeat_length_ms != null && heartbeat_length_ms.equals(heartbeat_length_ms2))) {
                                    final Long concurrent_user_count = this.concurrent_user_count;
                                    final Long concurrent_user_count2 = broadcast.concurrent_user_count;
                                    if (concurrent_user_count == concurrent_user_count2 || (concurrent_user_count != null && concurrent_user_count.equals(concurrent_user_count2))) {
                                        final Long current_hard_limit = this.current_hard_limit;
                                        final Long current_hard_limit2 = broadcast.current_hard_limit;
                                        if (current_hard_limit == current_hard_limit2 || (current_hard_limit != null && current_hard_limit.equals(current_hard_limit2))) {
                                            final Long user_karma = this.user_karma;
                                            final Long user_karma2 = broadcast.user_karma;
                                            if (user_karma == user_karma2 || (user_karma != null && user_karma.equals(user_karma2))) {
                                                final Long current_karma_limit = this.current_karma_limit;
                                                final Long current_karma_limit2 = broadcast.current_karma_limit;
                                                if (current_karma_limit == current_karma_limit2 || (current_karma_limit != null && current_karma_limit.equals(current_karma_limit2))) {
                                                    final Long user_account_age = this.user_account_age;
                                                    final Long user_account_age2 = broadcast.user_account_age;
                                                    if (user_account_age == user_account_age2 || (user_account_age != null && user_account_age.equals(user_account_age2))) {
                                                        final Long current_age_limit = this.current_age_limit;
                                                        final Long current_age_limit2 = broadcast.current_age_limit;
                                                        boolean b2 = b;
                                                        if (current_age_limit == current_age_limit2) {
                                                            return b2;
                                                        }
                                                        if (current_age_limit != null && current_age_limit.equals(current_age_limit2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long unique_watchers = this.unique_watchers;
        int hashCode = 0;
        int hashCode2;
        if (unique_watchers == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = unique_watchers.hashCode();
        }
        final Long max_concurrent_watchers = this.max_concurrent_watchers;
        int hashCode3;
        if (max_concurrent_watchers == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = max_concurrent_watchers.hashCode();
        }
        final Long duration_ms = this.duration_ms;
        int hashCode4;
        if (duration_ms == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = duration_ms.hashCode();
        }
        final Long time_remaining_ms = this.time_remaining_ms;
        int hashCode5;
        if (time_remaining_ms == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = time_remaining_ms.hashCode();
        }
        final Long time_added_ms = this.time_added_ms;
        int hashCode6;
        if (time_added_ms == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = time_added_ms.hashCode();
        }
        final String stream_state = this.stream_state;
        int hashCode7;
        if (stream_state == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = stream_state.hashCode();
        }
        final Long heartbeat_length_ms = this.heartbeat_length_ms;
        int hashCode8;
        if (heartbeat_length_ms == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = heartbeat_length_ms.hashCode();
        }
        final Long concurrent_user_count = this.concurrent_user_count;
        int hashCode9;
        if (concurrent_user_count == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = concurrent_user_count.hashCode();
        }
        final Long current_hard_limit = this.current_hard_limit;
        int hashCode10;
        if (current_hard_limit == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = current_hard_limit.hashCode();
        }
        final Long user_karma = this.user_karma;
        int hashCode11;
        if (user_karma == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = user_karma.hashCode();
        }
        final Long current_karma_limit = this.current_karma_limit;
        int hashCode12;
        if (current_karma_limit == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = current_karma_limit.hashCode();
        }
        final Long user_account_age = this.user_account_age;
        int hashCode13;
        if (user_account_age == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = user_account_age.hashCode();
        }
        final Long current_age_limit = this.current_age_limit;
        if (current_age_limit != null) {
            hashCode = current_age_limit.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Broadcast{unique_watchers=");
        k.append(this.unique_watchers);
        k.append(", max_concurrent_watchers=");
        k.append(this.max_concurrent_watchers);
        k.append(", duration_ms=");
        k.append(this.duration_ms);
        k.append(", time_remaining_ms=");
        k.append(this.time_remaining_ms);
        k.append(", time_added_ms=");
        k.append(this.time_added_ms);
        k.append(", stream_state=");
        k.append(this.stream_state);
        k.append(", heartbeat_length_ms=");
        k.append(this.heartbeat_length_ms);
        k.append(", concurrent_user_count=");
        k.append(this.concurrent_user_count);
        k.append(", current_hard_limit=");
        k.append(this.current_hard_limit);
        k.append(", user_karma=");
        k.append(this.user_karma);
        k.append(", current_karma_limit=");
        k.append(this.current_karma_limit);
        k.append(", user_account_age=");
        k.append(this.user_account_age);
        k.append(", current_age_limit=");
        return a.h(k, this.current_age_limit, "}");
    }
    
    public void write(final e e) throws IOException {
        Broadcast.ADAPTER.write(e, (Object)this);
    }
}
