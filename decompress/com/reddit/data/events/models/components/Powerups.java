// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Powerups
{
    public static final a<Powerups, Builder> ADAPTER;
    public final Boolean automatic;
    public final String benefit;
    public final Integer cnt_emoji;
    public final Integer count;
    public final Integer current_subreddit_powerups;
    public final Integer free_count;
    public final Boolean is_grace_period;
    public final Integer paid_count;
    public final String post_type;
    public final String subreddit_ids;
    public final String subscription_id;
    public final Integer tier;
    
    static {
        ADAPTER = (a)new PowerupsAdapter(null);
    }
    
    private Powerups(final Builder builder) {
        this.subscription_id = Builder.access$100(builder);
        this.count = Builder.access$200(builder);
        this.free_count = Builder.access$300(builder);
        this.paid_count = Builder.access$400(builder);
        this.tier = Builder.access$500(builder);
        this.current_subreddit_powerups = Builder.access$600(builder);
        this.is_grace_period = Builder.access$700(builder);
        this.automatic = Builder.access$800(builder);
        this.benefit = Builder.access$900(builder);
        this.post_type = Builder.access$1000(builder);
        this.cnt_emoji = Builder.access$1100(builder);
        this.subreddit_ids = Builder.access$1200(builder);
    }
    
    public Powerups(final Builder builder, final Powerups$1 object) {
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
        if (!(o instanceof Powerups)) {
            return false;
        }
        final Powerups powerups = (Powerups)o;
        final String subscription_id = this.subscription_id;
        final String subscription_id2 = powerups.subscription_id;
        if (subscription_id == subscription_id2 || (subscription_id != null && subscription_id.equals(subscription_id2))) {
            final Integer count = this.count;
            final Integer count2 = powerups.count;
            if (count == count2 || (count != null && count.equals(count2))) {
                final Integer free_count = this.free_count;
                final Integer free_count2 = powerups.free_count;
                if (free_count == free_count2 || (free_count != null && free_count.equals(free_count2))) {
                    final Integer paid_count = this.paid_count;
                    final Integer paid_count2 = powerups.paid_count;
                    if (paid_count == paid_count2 || (paid_count != null && paid_count.equals(paid_count2))) {
                        final Integer tier = this.tier;
                        final Integer tier2 = powerups.tier;
                        if (tier == tier2 || (tier != null && tier.equals(tier2))) {
                            final Integer current_subreddit_powerups = this.current_subreddit_powerups;
                            final Integer current_subreddit_powerups2 = powerups.current_subreddit_powerups;
                            if (current_subreddit_powerups == current_subreddit_powerups2 || (current_subreddit_powerups != null && current_subreddit_powerups.equals(current_subreddit_powerups2))) {
                                final Boolean is_grace_period = this.is_grace_period;
                                final Boolean is_grace_period2 = powerups.is_grace_period;
                                if (is_grace_period == is_grace_period2 || (is_grace_period != null && is_grace_period.equals(is_grace_period2))) {
                                    final Boolean automatic = this.automatic;
                                    final Boolean automatic2 = powerups.automatic;
                                    if (automatic == automatic2 || (automatic != null && automatic.equals(automatic2))) {
                                        final String benefit = this.benefit;
                                        final String benefit2 = powerups.benefit;
                                        if (benefit == benefit2 || (benefit != null && benefit.equals(benefit2))) {
                                            final String post_type = this.post_type;
                                            final String post_type2 = powerups.post_type;
                                            if (post_type == post_type2 || (post_type != null && post_type.equals(post_type2))) {
                                                final Integer cnt_emoji = this.cnt_emoji;
                                                final Integer cnt_emoji2 = powerups.cnt_emoji;
                                                if (cnt_emoji == cnt_emoji2 || (cnt_emoji != null && cnt_emoji.equals(cnt_emoji2))) {
                                                    final String subreddit_ids = this.subreddit_ids;
                                                    final String subreddit_ids2 = powerups.subreddit_ids;
                                                    boolean b2 = b;
                                                    if (subreddit_ids == subreddit_ids2) {
                                                        return b2;
                                                    }
                                                    if (subreddit_ids != null && subreddit_ids.equals(subreddit_ids2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String subscription_id = this.subscription_id;
        int hashCode = 0;
        int hashCode2;
        if (subscription_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subscription_id.hashCode();
        }
        final Integer count = this.count;
        int hashCode3;
        if (count == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = count.hashCode();
        }
        final Integer free_count = this.free_count;
        int hashCode4;
        if (free_count == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = free_count.hashCode();
        }
        final Integer paid_count = this.paid_count;
        int hashCode5;
        if (paid_count == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = paid_count.hashCode();
        }
        final Integer tier = this.tier;
        int hashCode6;
        if (tier == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = tier.hashCode();
        }
        final Integer current_subreddit_powerups = this.current_subreddit_powerups;
        int hashCode7;
        if (current_subreddit_powerups == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = current_subreddit_powerups.hashCode();
        }
        final Boolean is_grace_period = this.is_grace_period;
        int hashCode8;
        if (is_grace_period == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = is_grace_period.hashCode();
        }
        final Boolean automatic = this.automatic;
        int hashCode9;
        if (automatic == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = automatic.hashCode();
        }
        final String benefit = this.benefit;
        int hashCode10;
        if (benefit == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = benefit.hashCode();
        }
        final String post_type = this.post_type;
        int hashCode11;
        if (post_type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = post_type.hashCode();
        }
        final Integer cnt_emoji = this.cnt_emoji;
        int hashCode12;
        if (cnt_emoji == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = cnt_emoji.hashCode();
        }
        final String subreddit_ids = this.subreddit_ids;
        if (subreddit_ids != null) {
            hashCode = subreddit_ids.hashCode();
        }
        return ((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Powerups{subscription_id=");
        t.append(this.subscription_id);
        t.append(", count=");
        t.append(this.count);
        t.append(", free_count=");
        t.append(this.free_count);
        t.append(", paid_count=");
        t.append(this.paid_count);
        t.append(", tier=");
        t.append(this.tier);
        t.append(", current_subreddit_powerups=");
        t.append(this.current_subreddit_powerups);
        t.append(", is_grace_period=");
        t.append(this.is_grace_period);
        t.append(", automatic=");
        t.append(this.automatic);
        t.append(", benefit=");
        t.append(this.benefit);
        t.append(", post_type=");
        t.append(this.post_type);
        t.append(", cnt_emoji=");
        t.append(this.cnt_emoji);
        t.append(", subreddit_ids=");
        return ph0.a.f(t, this.subreddit_ids, "}");
    }
    
    public void write(final e e) throws IOException {
        Powerups.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Powerups>
    {
        private Boolean automatic;
        private String benefit;
        private Integer cnt_emoji;
        private Integer count;
        private Integer current_subreddit_powerups;
        private Integer free_count;
        private Boolean is_grace_period;
        private Integer paid_count;
        private String post_type;
        private String subreddit_ids;
        private String subscription_id;
        private Integer tier;
        
        public Builder() {
        }
        
        public Builder(final Powerups powerups) {
            this.subscription_id = powerups.subscription_id;
            this.count = powerups.count;
            this.free_count = powerups.free_count;
            this.paid_count = powerups.paid_count;
            this.tier = powerups.tier;
            this.current_subreddit_powerups = powerups.current_subreddit_powerups;
            this.is_grace_period = powerups.is_grace_period;
            this.automatic = powerups.automatic;
            this.benefit = powerups.benefit;
            this.post_type = powerups.post_type;
            this.cnt_emoji = powerups.cnt_emoji;
            this.subreddit_ids = powerups.subreddit_ids;
        }
        
        public static String access$100(final Builder builder) {
            return builder.subscription_id;
        }
        
        public static String access$1000(final Builder builder) {
            return builder.post_type;
        }
        
        public static Integer access$1100(final Builder builder) {
            return builder.cnt_emoji;
        }
        
        public static String access$1200(final Builder builder) {
            return builder.subreddit_ids;
        }
        
        public static Integer access$200(final Builder builder) {
            return builder.count;
        }
        
        public static Integer access$300(final Builder builder) {
            return builder.free_count;
        }
        
        public static Integer access$400(final Builder builder) {
            return builder.paid_count;
        }
        
        public static Integer access$500(final Builder builder) {
            return builder.tier;
        }
        
        public static Integer access$600(final Builder builder) {
            return builder.current_subreddit_powerups;
        }
        
        public static Boolean access$700(final Builder builder) {
            return builder.is_grace_period;
        }
        
        public static Boolean access$800(final Builder builder) {
            return builder.automatic;
        }
        
        public static String access$900(final Builder builder) {
            return builder.benefit;
        }
        
        public Builder automatic(final Boolean automatic) {
            this.automatic = automatic;
            return this;
        }
        
        public Builder benefit(final String benefit) {
            this.benefit = benefit;
            return this;
        }
        
        public Powerups build() {
            return new Powerups(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder cnt_emoji(final Integer cnt_emoji) {
            this.cnt_emoji = cnt_emoji;
            return this;
        }
        
        public Builder count(final Integer count) {
            this.count = count;
            return this;
        }
        
        public Builder current_subreddit_powerups(final Integer current_subreddit_powerups) {
            this.current_subreddit_powerups = current_subreddit_powerups;
            return this;
        }
        
        public Builder free_count(final Integer free_count) {
            this.free_count = free_count;
            return this;
        }
        
        public Builder is_grace_period(final Boolean is_grace_period) {
            this.is_grace_period = is_grace_period;
            return this;
        }
        
        public Builder paid_count(final Integer paid_count) {
            this.paid_count = paid_count;
            return this;
        }
        
        public Builder post_type(final String post_type) {
            this.post_type = post_type;
            return this;
        }
        
        public void reset() {
            this.subscription_id = null;
            this.count = null;
            this.free_count = null;
            this.paid_count = null;
            this.tier = null;
            this.current_subreddit_powerups = null;
            this.is_grace_period = null;
            this.automatic = null;
            this.benefit = null;
            this.post_type = null;
            this.cnt_emoji = null;
            this.subreddit_ids = null;
        }
        
        public Builder subreddit_ids(final String subreddit_ids) {
            this.subreddit_ids = subreddit_ids;
            return this;
        }
        
        public Builder subscription_id(final String subscription_id) {
            this.subscription_id = subscription_id;
            return this;
        }
        
        public Builder tier(final Integer tier) {
            this.tier = tier;
            return this;
        }
    }
    
    public static final class PowerupsAdapter implements a<Powerups, Builder>
    {
        private PowerupsAdapter() {
        }
        
        public PowerupsAdapter(final Powerups$1 object) {
            this();
        }
        
        public Powerups read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Powerups read(final e e, final Builder builder) throws IOException {
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
                    case 12: {
                        if (a == 11) {
                            builder.subreddit_ids(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 8) {
                            builder.cnt_emoji(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.post_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.benefit(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.automatic(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.is_grace_period(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 8) {
                            builder.current_subreddit_powerups(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.tier(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.paid_count(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 8) {
                            builder.free_count(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 8) {
                            builder.count(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.subscription_id(e.F());
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
        
        public void write(final e e, final Powerups powerups) throws IOException {
            e.X();
            if (powerups.subscription_id != null) {
                e.O(1, (byte)11);
                e.W(powerups.subscription_id);
                e.P();
            }
            if (powerups.count != null) {
                e.O(2, (byte)8);
                aq2.a.x(powerups.count, e);
            }
            if (powerups.free_count != null) {
                e.O(3, (byte)8);
                aq2.a.x(powerups.free_count, e);
            }
            if (powerups.paid_count != null) {
                e.O(4, (byte)8);
                aq2.a.x(powerups.paid_count, e);
            }
            if (powerups.tier != null) {
                e.O(5, (byte)8);
                aq2.a.x(powerups.tier, e);
            }
            if (powerups.current_subreddit_powerups != null) {
                e.O(6, (byte)8);
                aq2.a.x(powerups.current_subreddit_powerups, e);
            }
            if (powerups.is_grace_period != null) {
                e.O(7, (byte)2);
                android.support.v4.media.a.A(powerups.is_grace_period, e);
            }
            if (powerups.automatic != null) {
                e.O(8, (byte)2);
                android.support.v4.media.a.A(powerups.automatic, e);
            }
            if (powerups.benefit != null) {
                e.O(9, (byte)11);
                e.W(powerups.benefit);
                e.P();
            }
            if (powerups.post_type != null) {
                e.O(10, (byte)11);
                e.W(powerups.post_type);
                e.P();
            }
            if (powerups.cnt_emoji != null) {
                e.O(11, (byte)8);
                aq2.a.x(powerups.cnt_emoji, e);
            }
            if (powerups.subreddit_ids != null) {
                e.O(12, (byte)11);
                e.W(powerups.subreddit_ids);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Powerups)o);
        }
    }
}
