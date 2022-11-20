// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Poll
{
    public static final a<Poll, Builder> ADAPTER;
    public final Long number_prediction_coins;
    public final Long number_prediction_tokens;
    public final List<String> options;
    public final Integer options_length;
    public final List<Integer> options_vote_totals;
    public final String type;
    public final String user_vote_text;
    public final Boolean vote_affects_score;
    public final String vote_affects_score_reason;
    
    static {
        ADAPTER = (a)new PollAdapter(null);
    }
    
    private Poll(final Builder builder) {
        this.options_length = Builder.access$100(builder);
        final List access$200 = Builder.access$200(builder);
        final List<Integer> list = null;
        List<String> unmodifiableList;
        if (access$200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.options = unmodifiableList;
        this.user_vote_text = Builder.access$300(builder);
        this.vote_affects_score = Builder.access$400(builder);
        this.vote_affects_score_reason = Builder.access$500(builder);
        List<Integer> unmodifiableList2;
        if (Builder.access$600(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends Integer>)Builder.access$600(builder));
        }
        this.options_vote_totals = unmodifiableList2;
        this.type = Builder.access$700(builder);
        this.number_prediction_coins = Builder.access$800(builder);
        this.number_prediction_tokens = Builder.access$900(builder);
    }
    
    public Poll(final Builder builder, final Poll$1 object) {
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
        if (!(o instanceof Poll)) {
            return false;
        }
        final Poll poll = (Poll)o;
        final Integer options_length = this.options_length;
        final Integer options_length2 = poll.options_length;
        if (options_length == options_length2 || (options_length != null && options_length.equals(options_length2))) {
            final List<String> options = this.options;
            final List<String> options2 = poll.options;
            if (options == options2 || (options != null && options.equals(options2))) {
                final String user_vote_text = this.user_vote_text;
                final String user_vote_text2 = poll.user_vote_text;
                if (user_vote_text == user_vote_text2 || (user_vote_text != null && user_vote_text.equals(user_vote_text2))) {
                    final Boolean vote_affects_score = this.vote_affects_score;
                    final Boolean vote_affects_score2 = poll.vote_affects_score;
                    if (vote_affects_score == vote_affects_score2 || (vote_affects_score != null && vote_affects_score.equals(vote_affects_score2))) {
                        final String vote_affects_score_reason = this.vote_affects_score_reason;
                        final String vote_affects_score_reason2 = poll.vote_affects_score_reason;
                        if (vote_affects_score_reason == vote_affects_score_reason2 || (vote_affects_score_reason != null && vote_affects_score_reason.equals(vote_affects_score_reason2))) {
                            final List<Integer> options_vote_totals = this.options_vote_totals;
                            final List<Integer> options_vote_totals2 = poll.options_vote_totals;
                            if (options_vote_totals == options_vote_totals2 || (options_vote_totals != null && options_vote_totals.equals(options_vote_totals2))) {
                                final String type = this.type;
                                final String type2 = poll.type;
                                if (type == type2 || (type != null && type.equals(type2))) {
                                    final Long number_prediction_coins = this.number_prediction_coins;
                                    final Long number_prediction_coins2 = poll.number_prediction_coins;
                                    if (number_prediction_coins == number_prediction_coins2 || (number_prediction_coins != null && number_prediction_coins.equals(number_prediction_coins2))) {
                                        final Long number_prediction_tokens = this.number_prediction_tokens;
                                        final Long number_prediction_tokens2 = poll.number_prediction_tokens;
                                        boolean b2 = b;
                                        if (number_prediction_tokens == number_prediction_tokens2) {
                                            return b2;
                                        }
                                        if (number_prediction_tokens != null && number_prediction_tokens.equals(number_prediction_tokens2)) {
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
        final Integer options_length = this.options_length;
        int hashCode = 0;
        int hashCode2;
        if (options_length == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = options_length.hashCode();
        }
        final List<String> options = this.options;
        int hashCode3;
        if (options == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = options.hashCode();
        }
        final String user_vote_text = this.user_vote_text;
        int hashCode4;
        if (user_vote_text == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = user_vote_text.hashCode();
        }
        final Boolean vote_affects_score = this.vote_affects_score;
        int hashCode5;
        if (vote_affects_score == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = vote_affects_score.hashCode();
        }
        final String vote_affects_score_reason = this.vote_affects_score_reason;
        int hashCode6;
        if (vote_affects_score_reason == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = vote_affects_score_reason.hashCode();
        }
        final List<Integer> options_vote_totals = this.options_vote_totals;
        int hashCode7;
        if (options_vote_totals == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = options_vote_totals.hashCode();
        }
        final String type = this.type;
        int hashCode8;
        if (type == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = type.hashCode();
        }
        final Long number_prediction_coins = this.number_prediction_coins;
        int hashCode9;
        if (number_prediction_coins == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = number_prediction_coins.hashCode();
        }
        final Long number_prediction_tokens = this.number_prediction_tokens;
        if (number_prediction_tokens != null) {
            hashCode = number_prediction_tokens.hashCode();
        }
        return (((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Poll{options_length=");
        t.append(this.options_length);
        t.append(", options=");
        t.append(this.options);
        t.append(", user_vote_text=");
        t.append(this.user_vote_text);
        t.append(", vote_affects_score=");
        t.append(this.vote_affects_score);
        t.append(", vote_affects_score_reason=");
        t.append(this.vote_affects_score_reason);
        t.append(", options_vote_totals=");
        t.append(this.options_vote_totals);
        t.append(", type=");
        t.append(this.type);
        t.append(", number_prediction_coins=");
        t.append(this.number_prediction_coins);
        t.append(", number_prediction_tokens=");
        return d.l(t, this.number_prediction_tokens, "}");
    }
    
    public void write(final e e) throws IOException {
        Poll.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Poll>
    {
        private Long number_prediction_coins;
        private Long number_prediction_tokens;
        private List<String> options;
        private Integer options_length;
        private List<Integer> options_vote_totals;
        private String type;
        private String user_vote_text;
        private Boolean vote_affects_score;
        private String vote_affects_score_reason;
        
        public Builder() {
        }
        
        public Builder(final Poll poll) {
            this.options_length = poll.options_length;
            this.options = poll.options;
            this.user_vote_text = poll.user_vote_text;
            this.vote_affects_score = poll.vote_affects_score;
            this.vote_affects_score_reason = poll.vote_affects_score_reason;
            this.options_vote_totals = poll.options_vote_totals;
            this.type = poll.type;
            this.number_prediction_coins = poll.number_prediction_coins;
            this.number_prediction_tokens = poll.number_prediction_tokens;
        }
        
        public static Integer access$100(final Builder builder) {
            return builder.options_length;
        }
        
        public static List access$200(final Builder builder) {
            return builder.options;
        }
        
        public static String access$300(final Builder builder) {
            return builder.user_vote_text;
        }
        
        public static Boolean access$400(final Builder builder) {
            return builder.vote_affects_score;
        }
        
        public static String access$500(final Builder builder) {
            return builder.vote_affects_score_reason;
        }
        
        public static List access$600(final Builder builder) {
            return builder.options_vote_totals;
        }
        
        public static String access$700(final Builder builder) {
            return builder.type;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.number_prediction_coins;
        }
        
        public static Long access$900(final Builder builder) {
            return builder.number_prediction_tokens;
        }
        
        public Poll build() {
            return new Poll(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder number_prediction_coins(final Long number_prediction_coins) {
            this.number_prediction_coins = number_prediction_coins;
            return this;
        }
        
        public Builder number_prediction_tokens(final Long number_prediction_tokens) {
            this.number_prediction_tokens = number_prediction_tokens;
            return this;
        }
        
        public Builder options(final List<String> options) {
            this.options = options;
            return this;
        }
        
        public Builder options_length(final Integer options_length) {
            this.options_length = options_length;
            return this;
        }
        
        public Builder options_vote_totals(final List<Integer> options_vote_totals) {
            this.options_vote_totals = options_vote_totals;
            return this;
        }
        
        public void reset() {
            this.options_length = null;
            this.options = null;
            this.user_vote_text = null;
            this.vote_affects_score = null;
            this.vote_affects_score_reason = null;
            this.options_vote_totals = null;
            this.type = null;
            this.number_prediction_coins = null;
            this.number_prediction_tokens = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder user_vote_text(final String user_vote_text) {
            this.user_vote_text = user_vote_text;
            return this;
        }
        
        public Builder vote_affects_score(final Boolean vote_affects_score) {
            this.vote_affects_score = vote_affects_score;
            return this;
        }
        
        public Builder vote_affects_score_reason(final String vote_affects_score_reason) {
            this.vote_affects_score_reason = vote_affects_score_reason;
            return this;
        }
    }
    
    public static final class PollAdapter implements a<Poll, Builder>
    {
        private PollAdapter() {
        }
        
        public PollAdapter(final Poll$1 object) {
            this();
        }
        
        public Poll read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Poll read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                int i = 0;
                switch (b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 10) {
                            builder.number_prediction_tokens(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.number_prediction_coins(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList<Integer>(w.b);
                            while (i < w.b) {
                                list.add(e.t());
                                ++i;
                            }
                            e.x();
                            builder.options_vote_totals((List<Integer>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.vote_affects_score_reason(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.vote_affects_score(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.user_vote_text(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = k.f(e, list2, j, 1)) {}
                            e.x();
                            builder.options((List<String>)list2);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 8) {
                            builder.options_length(e.t());
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
        
        public void write(final e e, final Poll poll) throws IOException {
            e.X();
            if (poll.options_length != null) {
                e.O(1, (byte)8);
                aq2.a.x(poll.options_length, e);
            }
            if (poll.options != null) {
                e.O(2, (byte)15);
                e.U((byte)11, poll.options.size());
                final Iterator<String> iterator = poll.options.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (poll.user_vote_text != null) {
                e.O(4, (byte)11);
                e.W(poll.user_vote_text);
                e.P();
            }
            if (poll.vote_affects_score != null) {
                e.O(5, (byte)2);
                android.support.v4.media.a.A(poll.vote_affects_score, e);
            }
            if (poll.vote_affects_score_reason != null) {
                e.O(6, (byte)11);
                e.W(poll.vote_affects_score_reason);
                e.P();
            }
            if (poll.options_vote_totals != null) {
                e.O(7, (byte)15);
                e.U((byte)8, poll.options_vote_totals.size());
                final Iterator<Integer> iterator2 = poll.options_vote_totals.iterator();
                while (iterator2.hasNext()) {
                    e.S((int)iterator2.next());
                }
                e.V();
                e.P();
            }
            if (poll.type != null) {
                e.O(8, (byte)11);
                e.W(poll.type);
                e.P();
            }
            if (poll.number_prediction_coins != null) {
                e.O(9, (byte)10);
                k.w(poll.number_prediction_coins, e);
            }
            if (poll.number_prediction_tokens != null) {
                e.O(10, (byte)10);
                k.w(poll.number_prediction_tokens, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Poll)o);
        }
    }
}
