// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class ModAction
{
    public static final a<ModAction, Builder> ADAPTER;
    public final String action;
    public final Integer duration;
    public final Boolean is_automoderator;
    public final Boolean is_target_removed_by_steward;
    public final ModQueueQuery modqueue;
    public final RemovalReason removalreason;
    public final String target_user_id;
    public final String trigger;
    public final String trigger_message;
    
    static {
        ADAPTER = (a)new ModActionAdapter(null);
    }
    
    private ModAction(final Builder builder) {
        this.target_user_id = Builder.access$100(builder);
        this.is_automoderator = Builder.access$200(builder);
        this.is_target_removed_by_steward = Builder.access$300(builder);
        this.duration = Builder.access$400(builder);
        this.trigger = Builder.access$500(builder);
        this.trigger_message = Builder.access$600(builder);
        this.action = Builder.access$700(builder);
        this.removalreason = Builder.access$800(builder);
        this.modqueue = Builder.access$900(builder);
    }
    
    public ModAction(final Builder builder, final ModAction$1 object) {
        this(builder);
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
        if (!(o instanceof ModAction)) {
            return false;
        }
        final ModAction modAction = (ModAction)o;
        final String target_user_id = this.target_user_id;
        final String target_user_id2 = modAction.target_user_id;
        if (target_user_id == target_user_id2 || (target_user_id != null && target_user_id.equals(target_user_id2))) {
            final Boolean is_automoderator = this.is_automoderator;
            final Boolean is_automoderator2 = modAction.is_automoderator;
            if (is_automoderator == is_automoderator2 || (is_automoderator != null && is_automoderator.equals(is_automoderator2))) {
                final Boolean is_target_removed_by_steward = this.is_target_removed_by_steward;
                final Boolean is_target_removed_by_steward2 = modAction.is_target_removed_by_steward;
                if (is_target_removed_by_steward == is_target_removed_by_steward2 || (is_target_removed_by_steward != null && is_target_removed_by_steward.equals(is_target_removed_by_steward2))) {
                    final Integer duration = this.duration;
                    final Integer duration2 = modAction.duration;
                    if (duration == duration2 || (duration != null && duration.equals(duration2))) {
                        final String trigger = this.trigger;
                        final String trigger2 = modAction.trigger;
                        if (trigger == trigger2 || (trigger != null && trigger.equals(trigger2))) {
                            final String trigger_message = this.trigger_message;
                            final String trigger_message2 = modAction.trigger_message;
                            if (trigger_message == trigger_message2 || (trigger_message != null && trigger_message.equals(trigger_message2))) {
                                final String action = this.action;
                                final String action2 = modAction.action;
                                if (action == action2 || (action != null && action.equals(action2))) {
                                    final RemovalReason removalreason = this.removalreason;
                                    final RemovalReason removalreason2 = modAction.removalreason;
                                    if (removalreason == removalreason2 || (removalreason != null && removalreason.equals((Object)removalreason2))) {
                                        final ModQueueQuery modqueue = this.modqueue;
                                        final ModQueueQuery modqueue2 = modAction.modqueue;
                                        boolean b2 = b;
                                        if (modqueue == modqueue2) {
                                            return b2;
                                        }
                                        if (modqueue != null && modqueue.equals(modqueue2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String target_user_id = this.target_user_id;
        int hashCode = 0;
        int hashCode2;
        if (target_user_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = target_user_id.hashCode();
        }
        final Boolean is_automoderator = this.is_automoderator;
        int hashCode3;
        if (is_automoderator == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = is_automoderator.hashCode();
        }
        final Boolean is_target_removed_by_steward = this.is_target_removed_by_steward;
        int hashCode4;
        if (is_target_removed_by_steward == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = is_target_removed_by_steward.hashCode();
        }
        final Integer duration = this.duration;
        int hashCode5;
        if (duration == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = duration.hashCode();
        }
        final String trigger = this.trigger;
        int hashCode6;
        if (trigger == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = trigger.hashCode();
        }
        final String trigger_message = this.trigger_message;
        int hashCode7;
        if (trigger_message == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = trigger_message.hashCode();
        }
        final String action = this.action;
        int hashCode8;
        if (action == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = action.hashCode();
        }
        final RemovalReason removalreason = this.removalreason;
        int hashCode9;
        if (removalreason == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = removalreason.hashCode();
        }
        final ModQueueQuery modqueue = this.modqueue;
        if (modqueue != null) {
            hashCode = modqueue.hashCode();
        }
        return (((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ModAction{target_user_id=");
        t.append(this.target_user_id);
        t.append(", is_automoderator=");
        t.append(this.is_automoderator);
        t.append(", is_target_removed_by_steward=");
        t.append(this.is_target_removed_by_steward);
        t.append(", duration=");
        t.append(this.duration);
        t.append(", trigger=");
        t.append(this.trigger);
        t.append(", trigger_message=");
        t.append(this.trigger_message);
        t.append(", action=");
        t.append(this.action);
        t.append(", removalreason=");
        t.append(this.removalreason);
        t.append(", modqueue=");
        t.append(this.modqueue);
        t.append("}");
        return t.toString();
    }
    
    public void write(final e e) throws IOException {
        ModAction.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModAction>
    {
        private String action;
        private Integer duration;
        private Boolean is_automoderator;
        private Boolean is_target_removed_by_steward;
        private ModQueueQuery modqueue;
        private RemovalReason removalreason;
        private String target_user_id;
        private String trigger;
        private String trigger_message;
        
        public Builder() {
        }
        
        public Builder(final ModAction modAction) {
            this.target_user_id = modAction.target_user_id;
            this.is_automoderator = modAction.is_automoderator;
            this.is_target_removed_by_steward = modAction.is_target_removed_by_steward;
            this.duration = modAction.duration;
            this.trigger = modAction.trigger;
            this.trigger_message = modAction.trigger_message;
            this.action = modAction.action;
            this.removalreason = modAction.removalreason;
            this.modqueue = modAction.modqueue;
        }
        
        public static String access$100(final Builder builder) {
            return builder.target_user_id;
        }
        
        public static Boolean access$200(final Builder builder) {
            return builder.is_automoderator;
        }
        
        public static Boolean access$300(final Builder builder) {
            return builder.is_target_removed_by_steward;
        }
        
        public static Integer access$400(final Builder builder) {
            return builder.duration;
        }
        
        public static String access$500(final Builder builder) {
            return builder.trigger;
        }
        
        public static String access$600(final Builder builder) {
            return builder.trigger_message;
        }
        
        public static String access$700(final Builder builder) {
            return builder.action;
        }
        
        public static RemovalReason access$800(final Builder builder) {
            return builder.removalreason;
        }
        
        public static ModQueueQuery access$900(final Builder builder) {
            return builder.modqueue;
        }
        
        public Builder action(final String action) {
            this.action = action;
            return this;
        }
        
        public ModAction build() {
            return new ModAction(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder duration(final Integer duration) {
            this.duration = duration;
            return this;
        }
        
        public Builder is_automoderator(final Boolean is_automoderator) {
            this.is_automoderator = is_automoderator;
            return this;
        }
        
        public Builder is_target_removed_by_steward(final Boolean is_target_removed_by_steward) {
            this.is_target_removed_by_steward = is_target_removed_by_steward;
            return this;
        }
        
        public Builder modqueue(final ModQueueQuery modqueue) {
            this.modqueue = modqueue;
            return this;
        }
        
        public Builder removalreason(final RemovalReason removalreason) {
            this.removalreason = removalreason;
            return this;
        }
        
        public void reset() {
            this.target_user_id = null;
            this.is_automoderator = null;
            this.is_target_removed_by_steward = null;
            this.duration = null;
            this.trigger = null;
            this.trigger_message = null;
            this.action = null;
            this.removalreason = null;
            this.modqueue = null;
        }
        
        public Builder target_user_id(final String target_user_id) {
            this.target_user_id = target_user_id;
            return this;
        }
        
        public Builder trigger(final String trigger) {
            this.trigger = trigger;
            return this;
        }
        
        public Builder trigger_message(final String trigger_message) {
            this.trigger_message = trigger_message;
            return this;
        }
    }
    
    public static final class ModActionAdapter implements a<ModAction, Builder>
    {
        private ModActionAdapter() {
        }
        
        public ModActionAdapter(final ModAction$1 object) {
            this();
        }
        
        public ModAction read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModAction read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 12) {
                            builder.modqueue((ModQueueQuery)ModQueueQuery.ADAPTER.read(e));
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 12) {
                            builder.removalreason((RemovalReason)RemovalReason.ADAPTER.read(e));
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.action(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.trigger_message(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.trigger(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.duration(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.is_target_removed_by_steward(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 2) {
                            builder.is_automoderator(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.target_user_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final ModAction modAction) throws IOException {
            e.X();
            if (modAction.target_user_id != null) {
                e.O(1, (byte)11);
                e.W(modAction.target_user_id);
                e.P();
            }
            if (modAction.is_automoderator != null) {
                e.O(2, (byte)2);
                android.support.v4.media.a.A(modAction.is_automoderator, e);
            }
            if (modAction.is_target_removed_by_steward != null) {
                e.O(3, (byte)2);
                android.support.v4.media.a.A(modAction.is_target_removed_by_steward, e);
            }
            if (modAction.duration != null) {
                e.O(4, (byte)8);
                aq2.a.x(modAction.duration, e);
            }
            if (modAction.trigger != null) {
                e.O(5, (byte)11);
                e.W(modAction.trigger);
                e.P();
            }
            if (modAction.trigger_message != null) {
                e.O(6, (byte)11);
                e.W(modAction.trigger_message);
                e.P();
            }
            if (modAction.action != null) {
                e.O(7, (byte)11);
                e.W(modAction.action);
                e.P();
            }
            if (modAction.removalreason != null) {
                e.O(8, (byte)12);
                RemovalReason.ADAPTER.write(e, (Object)modAction.removalreason);
                e.P();
            }
            if (modAction.modqueue != null) {
                e.O(9, (byte)12);
                ModQueueQuery.ADAPTER.write(e, (Object)modAction.modqueue);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModAction)o);
        }
    }
}
