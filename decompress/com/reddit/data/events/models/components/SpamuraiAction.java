// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class SpamuraiAction
{
    public static final a<SpamuraiAction, Builder> ADAPTER;
    public final String channel;
    public final Boolean is_ban_all;
    public final Boolean is_mark_for_alt_tracking;
    public final Boolean is_unapprovable;
    public final Boolean is_unban_all;
    public final String task_name;
    public final String task_version;
    public final String thing_id;
    
    static {
        ADAPTER = (a)new SpamuraiActionAdapter(null);
    }
    
    private SpamuraiAction(final Builder builder) {
        this.task_name = Builder.access$100(builder);
        this.task_version = Builder.access$200(builder);
        this.thing_id = Builder.access$300(builder);
        this.is_unapprovable = Builder.access$400(builder);
        this.is_ban_all = Builder.access$500(builder);
        this.is_mark_for_alt_tracking = Builder.access$600(builder);
        this.is_unban_all = Builder.access$700(builder);
        this.channel = Builder.access$800(builder);
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
        final StringBuilder k = a.k("SpamuraiAction{task_name=");
        k.append(this.task_name);
        k.append(", task_version=");
        k.append(this.task_version);
        k.append(", thing_id=");
        k.append(this.thing_id);
        k.append(", is_unapprovable=");
        k.append(this.is_unapprovable);
        k.append(", is_ban_all=");
        k.append(this.is_ban_all);
        k.append(", is_mark_for_alt_tracking=");
        k.append(this.is_mark_for_alt_tracking);
        k.append(", is_unban_all=");
        k.append(this.is_unban_all);
        k.append(", channel=");
        return b.j(k, this.channel, "}");
    }
    
    public void write(final e e) throws IOException {
        SpamuraiAction.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<SpamuraiAction>
    {
        private String channel;
        private Boolean is_ban_all;
        private Boolean is_mark_for_alt_tracking;
        private Boolean is_unapprovable;
        private Boolean is_unban_all;
        private String task_name;
        private String task_version;
        private String thing_id;
        
        public Builder() {
        }
        
        public Builder(final SpamuraiAction spamuraiAction) {
            this.task_name = spamuraiAction.task_name;
            this.task_version = spamuraiAction.task_version;
            this.thing_id = spamuraiAction.thing_id;
            this.is_unapprovable = spamuraiAction.is_unapprovable;
            this.is_ban_all = spamuraiAction.is_ban_all;
            this.is_mark_for_alt_tracking = spamuraiAction.is_mark_for_alt_tracking;
            this.is_unban_all = spamuraiAction.is_unban_all;
            this.channel = spamuraiAction.channel;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.task_name;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.task_version;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.thing_id;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.is_unapprovable;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.is_ban_all;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.is_mark_for_alt_tracking;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.is_unban_all;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.channel;
        }
        
        public SpamuraiAction build() {
            return new SpamuraiAction(this, null);
        }
        
        public Builder channel(final String channel) {
            this.channel = channel;
            return this;
        }
        
        public Builder is_ban_all(final Boolean is_ban_all) {
            this.is_ban_all = is_ban_all;
            return this;
        }
        
        public Builder is_mark_for_alt_tracking(final Boolean is_mark_for_alt_tracking) {
            this.is_mark_for_alt_tracking = is_mark_for_alt_tracking;
            return this;
        }
        
        public Builder is_unapprovable(final Boolean is_unapprovable) {
            this.is_unapprovable = is_unapprovable;
            return this;
        }
        
        public Builder is_unban_all(final Boolean is_unban_all) {
            this.is_unban_all = is_unban_all;
            return this;
        }
        
        public void reset() {
            this.task_name = null;
            this.task_version = null;
            this.thing_id = null;
            this.is_unapprovable = null;
            this.is_ban_all = null;
            this.is_mark_for_alt_tracking = null;
            this.is_unban_all = null;
            this.channel = null;
        }
        
        public Builder task_name(final String task_name) {
            this.task_name = task_name;
            return this;
        }
        
        public Builder task_version(final String task_version) {
            this.task_version = task_version;
            return this;
        }
        
        public Builder thing_id(final String thing_id) {
            this.thing_id = thing_id;
            return this;
        }
    }
    
    public static final class SpamuraiActionAdapter implements a<SpamuraiAction, Builder>
    {
        private SpamuraiActionAdapter() {
        }
        
        public SpamuraiAction read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public SpamuraiAction read(final e e, final Builder builder) throws IOException {
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
                    case 8: {
                        if (a == 11) {
                            builder.channel(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.is_unban_all(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.is_mark_for_alt_tracking(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.is_ban_all(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.is_unapprovable(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.thing_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.task_version(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.task_name(e.F());
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
        
        public void write(final e e, final SpamuraiAction spamuraiAction) throws IOException {
            e.a0();
            if (spamuraiAction.task_name != null) {
                e.N(1, (byte)11);
                e.Z(spamuraiAction.task_name);
                e.O();
            }
            if (spamuraiAction.task_version != null) {
                e.N(2, (byte)11);
                e.Z(spamuraiAction.task_version);
                e.O();
            }
            if (spamuraiAction.thing_id != null) {
                e.N(3, (byte)11);
                e.Z(spamuraiAction.thing_id);
                e.O();
            }
            if (spamuraiAction.is_unapprovable != null) {
                e.N(4, (byte)2);
                d.z(spamuraiAction.is_unapprovable, e);
            }
            if (spamuraiAction.is_ban_all != null) {
                e.N(5, (byte)2);
                d.z(spamuraiAction.is_ban_all, e);
            }
            if (spamuraiAction.is_mark_for_alt_tracking != null) {
                e.N(6, (byte)2);
                d.z(spamuraiAction.is_mark_for_alt_tracking, e);
            }
            if (spamuraiAction.is_unban_all != null) {
                e.N(7, (byte)2);
                d.z(spamuraiAction.is_unban_all, e);
            }
            if (spamuraiAction.channel != null) {
                e.N(8, (byte)11);
                e.Z(spamuraiAction.channel);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
