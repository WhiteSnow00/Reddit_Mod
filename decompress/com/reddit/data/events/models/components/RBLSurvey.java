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

public final class RBLSurvey
{
    public static final a<RBLSurvey, Builder> ADAPTER;
    public final List<String> choices;
    public final List<String> choices_by_index;
    public final String impression_id;
    public final String platform;
    public final SurveyResponse responses;
    public final String survey_id;
    public final Long timestamp;
    public final String user_id;
    
    static {
        ADAPTER = (a)new RBLSurveyAdapter(null);
    }
    
    private RBLSurvey(final Builder builder) {
        this.survey_id = Builder.access$100(builder);
        this.impression_id = Builder.access$200(builder);
        this.responses = Builder.access$300(builder);
        this.timestamp = Builder.access$400(builder);
        this.platform = Builder.access$500(builder);
        this.user_id = Builder.access$600(builder);
        final List access$700 = Builder.access$700(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$700 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$700(builder));
        }
        this.choices_by_index = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$800(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$800(builder));
        }
        this.choices = unmodifiableList2;
    }
    
    public RBLSurvey(final Builder builder, final RBLSurvey$1 object) {
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
        if (!(o instanceof RBLSurvey)) {
            return false;
        }
        final RBLSurvey rblSurvey = (RBLSurvey)o;
        final String survey_id = this.survey_id;
        final String survey_id2 = rblSurvey.survey_id;
        if (survey_id == survey_id2 || (survey_id != null && survey_id.equals(survey_id2))) {
            final String impression_id = this.impression_id;
            final String impression_id2 = rblSurvey.impression_id;
            if (impression_id == impression_id2 || (impression_id != null && impression_id.equals(impression_id2))) {
                final SurveyResponse responses = this.responses;
                final SurveyResponse responses2 = rblSurvey.responses;
                if (responses == responses2 || (responses != null && responses.equals((Object)responses2))) {
                    final Long timestamp = this.timestamp;
                    final Long timestamp2 = rblSurvey.timestamp;
                    if (timestamp == timestamp2 || (timestamp != null && timestamp.equals(timestamp2))) {
                        final String platform = this.platform;
                        final String platform2 = rblSurvey.platform;
                        if (platform == platform2 || (platform != null && platform.equals(platform2))) {
                            final String user_id = this.user_id;
                            final String user_id2 = rblSurvey.user_id;
                            if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
                                final List<String> choices_by_index = this.choices_by_index;
                                final List<String> choices_by_index2 = rblSurvey.choices_by_index;
                                if (choices_by_index == choices_by_index2 || (choices_by_index != null && choices_by_index.equals(choices_by_index2))) {
                                    final List<String> choices = this.choices;
                                    final List<String> choices2 = rblSurvey.choices;
                                    boolean b2 = b;
                                    if (choices == choices2) {
                                        return b2;
                                    }
                                    if (choices != null && choices.equals(choices2)) {
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
        final String survey_id = this.survey_id;
        int hashCode = 0;
        int hashCode2;
        if (survey_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = survey_id.hashCode();
        }
        final String impression_id = this.impression_id;
        int hashCode3;
        if (impression_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = impression_id.hashCode();
        }
        final SurveyResponse responses = this.responses;
        int hashCode4;
        if (responses == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = responses.hashCode();
        }
        final Long timestamp = this.timestamp;
        int hashCode5;
        if (timestamp == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = timestamp.hashCode();
        }
        final String platform = this.platform;
        int hashCode6;
        if (platform == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = platform.hashCode();
        }
        final String user_id = this.user_id;
        int hashCode7;
        if (user_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = user_id.hashCode();
        }
        final List<String> choices_by_index = this.choices_by_index;
        int hashCode8;
        if (choices_by_index == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = choices_by_index.hashCode();
        }
        final List<String> choices = this.choices;
        if (choices != null) {
            hashCode = choices.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RBLSurvey{survey_id=");
        t.append(this.survey_id);
        t.append(", impression_id=");
        t.append(this.impression_id);
        t.append(", responses=");
        t.append(this.responses);
        t.append(", timestamp=");
        t.append(this.timestamp);
        t.append(", platform=");
        t.append(this.platform);
        t.append(", user_id=");
        t.append(this.user_id);
        t.append(", choices_by_index=");
        t.append(this.choices_by_index);
        t.append(", choices=");
        return a.s(t, (List)this.choices, "}");
    }
    
    public void write(final e e) throws IOException {
        RBLSurvey.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<RBLSurvey>
    {
        private List<String> choices;
        private List<String> choices_by_index;
        private String impression_id;
        private String platform;
        private SurveyResponse responses;
        private String survey_id;
        private Long timestamp;
        private String user_id;
        
        public Builder() {
        }
        
        public Builder(final RBLSurvey rblSurvey) {
            this.survey_id = rblSurvey.survey_id;
            this.impression_id = rblSurvey.impression_id;
            this.responses = rblSurvey.responses;
            this.timestamp = rblSurvey.timestamp;
            this.platform = rblSurvey.platform;
            this.user_id = rblSurvey.user_id;
            this.choices_by_index = rblSurvey.choices_by_index;
            this.choices = rblSurvey.choices;
        }
        
        public static String access$100(final Builder builder) {
            return builder.survey_id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.impression_id;
        }
        
        public static SurveyResponse access$300(final Builder builder) {
            return builder.responses;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.timestamp;
        }
        
        public static String access$500(final Builder builder) {
            return builder.platform;
        }
        
        public static String access$600(final Builder builder) {
            return builder.user_id;
        }
        
        public static List access$700(final Builder builder) {
            return builder.choices_by_index;
        }
        
        public static List access$800(final Builder builder) {
            return builder.choices;
        }
        
        public RBLSurvey build() {
            return new RBLSurvey(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder choices(final List<String> choices) {
            this.choices = choices;
            return this;
        }
        
        public Builder choices_by_index(final List<String> choices_by_index) {
            this.choices_by_index = choices_by_index;
            return this;
        }
        
        public Builder impression_id(final String impression_id) {
            this.impression_id = impression_id;
            return this;
        }
        
        public Builder platform(final String platform) {
            this.platform = platform;
            return this;
        }
        
        public void reset() {
            this.survey_id = null;
            this.impression_id = null;
            this.responses = null;
            this.timestamp = null;
            this.platform = null;
            this.user_id = null;
            this.choices_by_index = null;
            this.choices = null;
        }
        
        public Builder responses(final SurveyResponse responses) {
            this.responses = responses;
            return this;
        }
        
        public Builder survey_id(final String survey_id) {
            this.survey_id = survey_id;
            return this;
        }
        
        public Builder timestamp(final Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        
        public Builder user_id(final String user_id) {
            this.user_id = user_id;
            return this;
        }
    }
    
    public static final class RBLSurveyAdapter implements a<RBLSurvey, Builder>
    {
        private RBLSurveyAdapter() {
        }
        
        public RBLSurveyAdapter(final RBLSurvey$1 object) {
            this();
        }
        
        public RBLSurvey read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public RBLSurvey read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                int i = 0;
                final int n = 0;
                switch (b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int j = n; j < w.b; j = k.f(e, list, j, 1)) {}
                            e.x();
                            builder.choices((List<String>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 15) {
                            c w2;
                            ArrayList list2;
                            for (w2 = e.w(), list2 = new ArrayList(w2.b); i < w2.b; i = k.f(e, list2, i, 1)) {}
                            e.x();
                            builder.choices_by_index((List<String>)list2);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.user_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.platform(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 12) {
                            builder.responses((SurveyResponse)SurveyResponse.ADAPTER.read(e));
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.impression_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.survey_id(e.F());
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
        
        public void write(final e e, final RBLSurvey rblSurvey) throws IOException {
            e.X();
            if (rblSurvey.survey_id != null) {
                e.O(1, (byte)11);
                e.W(rblSurvey.survey_id);
                e.P();
            }
            if (rblSurvey.impression_id != null) {
                e.O(2, (byte)11);
                e.W(rblSurvey.impression_id);
                e.P();
            }
            if (rblSurvey.responses != null) {
                e.O(3, (byte)12);
                SurveyResponse.ADAPTER.write(e, (Object)rblSurvey.responses);
                e.P();
            }
            if (rblSurvey.timestamp != null) {
                e.O(4, (byte)10);
                k.w(rblSurvey.timestamp, e);
            }
            if (rblSurvey.platform != null) {
                e.O(5, (byte)11);
                e.W(rblSurvey.platform);
                e.P();
            }
            if (rblSurvey.user_id != null) {
                e.O(6, (byte)11);
                e.W(rblSurvey.user_id);
                e.P();
            }
            if (rblSurvey.choices_by_index != null) {
                e.O(7, (byte)15);
                e.U((byte)11, rblSurvey.choices_by_index.size());
                final Iterator<String> iterator = rblSurvey.choices_by_index.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (rblSurvey.choices != null) {
                e.O(8, (byte)15);
                e.U((byte)11, rblSurvey.choices.size());
                final Iterator<String> iterator2 = rblSurvey.choices.iterator();
                while (iterator2.hasNext()) {
                    e.W((String)iterator2.next());
                }
                e.V();
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (RBLSurvey)o);
        }
    }
}
