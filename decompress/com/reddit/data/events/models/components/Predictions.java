// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Predictions
{
    public static final a<Predictions, Builder> ADAPTER;
    public final Long end_timestamp;
    public final Integer post_cnt;
    public final String tournament_id;
    public final String tournament_state;
    public final String tournament_theme_id;
    public final String user_state;
    
    static {
        ADAPTER = (a)new PredictionsAdapter(null);
    }
    
    private Predictions(final Builder builder) {
        this.tournament_id = Builder.access$100(builder);
        this.post_cnt = Builder.access$200(builder);
        this.end_timestamp = Builder.access$300(builder);
        this.tournament_state = Builder.access$400(builder);
        this.user_state = Builder.access$500(builder);
        this.tournament_theme_id = Builder.access$600(builder);
    }
    
    public Predictions(final Builder builder, final Predictions$1 object) {
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
        if (!(o instanceof Predictions)) {
            return false;
        }
        final Predictions predictions = (Predictions)o;
        final String tournament_id = this.tournament_id;
        final String tournament_id2 = predictions.tournament_id;
        if (tournament_id == tournament_id2 || (tournament_id != null && tournament_id.equals(tournament_id2))) {
            final Integer post_cnt = this.post_cnt;
            final Integer post_cnt2 = predictions.post_cnt;
            if (post_cnt == post_cnt2 || (post_cnt != null && post_cnt.equals(post_cnt2))) {
                final Long end_timestamp = this.end_timestamp;
                final Long end_timestamp2 = predictions.end_timestamp;
                if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                    final String tournament_state = this.tournament_state;
                    final String tournament_state2 = predictions.tournament_state;
                    if (tournament_state == tournament_state2 || (tournament_state != null && tournament_state.equals(tournament_state2))) {
                        final String user_state = this.user_state;
                        final String user_state2 = predictions.user_state;
                        if (user_state == user_state2 || (user_state != null && user_state.equals(user_state2))) {
                            final String tournament_theme_id = this.tournament_theme_id;
                            final String tournament_theme_id2 = predictions.tournament_theme_id;
                            boolean b2 = b;
                            if (tournament_theme_id == tournament_theme_id2) {
                                return b2;
                            }
                            if (tournament_theme_id != null && tournament_theme_id.equals(tournament_theme_id2)) {
                                b2 = b;
                                return b2;
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
        final String tournament_id = this.tournament_id;
        int hashCode = 0;
        int hashCode2;
        if (tournament_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tournament_id.hashCode();
        }
        final Integer post_cnt = this.post_cnt;
        int hashCode3;
        if (post_cnt == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = post_cnt.hashCode();
        }
        final Long end_timestamp = this.end_timestamp;
        int hashCode4;
        if (end_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = end_timestamp.hashCode();
        }
        final String tournament_state = this.tournament_state;
        int hashCode5;
        if (tournament_state == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = tournament_state.hashCode();
        }
        final String user_state = this.user_state;
        int hashCode6;
        if (user_state == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = user_state.hashCode();
        }
        final String tournament_theme_id = this.tournament_theme_id;
        if (tournament_theme_id != null) {
            hashCode = tournament_theme_id.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Predictions{tournament_id=");
        t.append(this.tournament_id);
        t.append(", post_cnt=");
        t.append(this.post_cnt);
        t.append(", end_timestamp=");
        t.append(this.end_timestamp);
        t.append(", tournament_state=");
        t.append(this.tournament_state);
        t.append(", user_state=");
        t.append(this.user_state);
        t.append(", tournament_theme_id=");
        return ph0.a.f(t, this.tournament_theme_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Predictions.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Predictions>
    {
        private Long end_timestamp;
        private Integer post_cnt;
        private String tournament_id;
        private String tournament_state;
        private String tournament_theme_id;
        private String user_state;
        
        public Builder() {
        }
        
        public Builder(final Predictions predictions) {
            this.tournament_id = predictions.tournament_id;
            this.post_cnt = predictions.post_cnt;
            this.end_timestamp = predictions.end_timestamp;
            this.tournament_state = predictions.tournament_state;
            this.user_state = predictions.user_state;
            this.tournament_theme_id = predictions.tournament_theme_id;
        }
        
        public static String access$100(final Builder builder) {
            return builder.tournament_id;
        }
        
        public static Integer access$200(final Builder builder) {
            return builder.post_cnt;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.end_timestamp;
        }
        
        public static String access$400(final Builder builder) {
            return builder.tournament_state;
        }
        
        public static String access$500(final Builder builder) {
            return builder.user_state;
        }
        
        public static String access$600(final Builder builder) {
            return builder.tournament_theme_id;
        }
        
        public Predictions build() {
            return new Predictions(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder end_timestamp(final Long end_timestamp) {
            this.end_timestamp = end_timestamp;
            return this;
        }
        
        public Builder post_cnt(final Integer post_cnt) {
            this.post_cnt = post_cnt;
            return this;
        }
        
        public void reset() {
            this.tournament_id = null;
            this.post_cnt = null;
            this.end_timestamp = null;
            this.tournament_state = null;
            this.user_state = null;
            this.tournament_theme_id = null;
        }
        
        public Builder tournament_id(final String tournament_id) {
            this.tournament_id = tournament_id;
            return this;
        }
        
        public Builder tournament_state(final String tournament_state) {
            this.tournament_state = tournament_state;
            return this;
        }
        
        public Builder tournament_theme_id(final String tournament_theme_id) {
            this.tournament_theme_id = tournament_theme_id;
            return this;
        }
        
        public Builder user_state(final String user_state) {
            this.user_state = user_state;
            return this;
        }
    }
    
    public static final class PredictionsAdapter implements a<Predictions, Builder>
    {
        private PredictionsAdapter() {
        }
        
        public PredictionsAdapter(final Predictions$1 object) {
            this();
        }
        
        public Predictions read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Predictions read(final e e, final Builder builder) throws IOException {
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
                    case 6: {
                        if (a == 11) {
                            builder.tournament_theme_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.user_state(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.tournament_state(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.end_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 8) {
                            builder.post_cnt(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.tournament_id(e.F());
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
        
        public void write(final e e, final Predictions predictions) throws IOException {
            e.X();
            if (predictions.tournament_id != null) {
                e.O(1, (byte)11);
                e.W(predictions.tournament_id);
                e.P();
            }
            if (predictions.post_cnt != null) {
                e.O(2, (byte)8);
                aq2.a.x(predictions.post_cnt, e);
            }
            if (predictions.end_timestamp != null) {
                e.O(3, (byte)10);
                k.w(predictions.end_timestamp, e);
            }
            if (predictions.tournament_state != null) {
                e.O(4, (byte)11);
                e.W(predictions.tournament_state);
                e.P();
            }
            if (predictions.user_state != null) {
                e.O(5, (byte)11);
                e.W(predictions.user_state);
                e.P();
            }
            if (predictions.tournament_theme_id != null) {
                e.O(6, (byte)11);
                e.W(predictions.tournament_theme_id);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Predictions)o);
        }
    }
}
